package com.bizcenter.freight.application.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.google.common.base.CaseFormat;
import com.bitsun.core.common.exception.AppException;
import com.bitsun.core.common.exception.ErrorCode;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.persistence.QueryParamUtils;
import com.bizcenter.freight.application.DriverVehicleService;
import com.bizcenter.freight.infrastructure.persistence.dao.DriverVehicleMapper;
import com.bizcenter.freight.infrastructure.persistence.po.DriverVehiclePo;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bizcenter.freight.convertor.DriverVehicleReqDtoConvertor;
import com.bizcenter.freight.convertor.DriverVehicleResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.DriverVehicleReqDto;
import com.bizcenter.freight.dto.res.DriverVehicleResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("driverVehicleAppService")
@Transactional(rollbackFor = Exception.class)
public class DriverVehicleServiceImpl implements DriverVehicleService {

    @Autowired
    private DriverVehicleReqDtoConvertor driverVehicleReqDtoConvertor;

    @Autowired
    private DriverVehicleResDtoConvertor driverVehicleResDtoConvertor;

    private IPService<DriverVehiclePo> driverVehiclePoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public DriverVehicleServiceImpl(DriverVehicleMapper driverVehicleMapper) {
        this.driverVehiclePoService = new BasePService(driverVehicleMapper);
    }



    @Override
    public DriverVehicleResDto save(DriverVehicleReqDto reqDto) {
        DriverVehiclePo po = driverVehicleReqDtoConvertor.dto2Po(reqDto);
        driverVehiclePoService.save(po);
        DriverVehicleResDto resDto = driverVehicleResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return driverVehiclePoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<DriverVehicleResDto> doPager(Map<String, Object> params) {
        Pager<DriverVehiclePo> poPager = driverVehiclePoService.queryPage(params, DriverVehiclePo.class);
        Pager<DriverVehicleResDto> resDtoPager = driverVehicleResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public DriverVehicleResDto selectOne(Long id) {
        DriverVehiclePo po = driverVehiclePoService.getById(id);
        DriverVehicleResDto resDto = driverVehicleResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public DriverVehicleResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(DriverVehiclePo::new, params);
        queryWrapper.last(" limit 1");
        DriverVehiclePo po = driverVehiclePoService.getOne(queryWrapper);
        DriverVehicleResDto resDto = driverVehicleResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<DriverVehiclePo> updateWrapper = QueryParamUtils.updateWrapper4Map(DriverVehiclePo::new, id, params);
        return driverVehiclePoService.update(new DriverVehiclePo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, DriverVehicleReqDto reqDto) {
        DriverVehiclePo po = driverVehicleReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return driverVehiclePoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, DriverVehicleReqDto reqDto) {
        UpdateWrapper<DriverVehiclePo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = DriverVehicleReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), DriverVehicleReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return driverVehiclePoService.update(new DriverVehiclePo(), updateWrapper);
    }

}