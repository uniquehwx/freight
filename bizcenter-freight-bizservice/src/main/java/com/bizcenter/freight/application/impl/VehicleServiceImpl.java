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
import com.bizcenter.freight.application.VehicleService;
import com.bizcenter.freight.infrastructure.persistence.dao.VehicleMapper;
import com.bizcenter.freight.infrastructure.persistence.po.VehiclePo;
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
import com.bizcenter.freight.convertor.VehicleReqDtoConvertor;
import com.bizcenter.freight.convertor.VehicleResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.VehicleReqDto;
import com.bizcenter.freight.dto.res.VehicleResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("vehicleAppService")
@Transactional(rollbackFor = Exception.class)
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleReqDtoConvertor vehicleReqDtoConvertor;

    @Autowired
    private VehicleResDtoConvertor vehicleResDtoConvertor;

    private IPService<VehiclePo> vehiclePoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public VehicleServiceImpl(VehicleMapper vehicleMapper) {
        this.vehiclePoService = new BasePService(vehicleMapper);
    }



    @Override
    public VehicleResDto save(VehicleReqDto reqDto) {
        VehiclePo po = vehicleReqDtoConvertor.dto2Po(reqDto);
        vehiclePoService.save(po);
        VehicleResDto resDto = vehicleResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return vehiclePoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<VehicleResDto> doPager(Map<String, Object> params) {
        Pager<VehiclePo> poPager = vehiclePoService.queryPage(params, VehiclePo.class);
        Pager<VehicleResDto> resDtoPager = vehicleResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public VehicleResDto selectOne(Long id) {
        VehiclePo po = vehiclePoService.getById(id);
        VehicleResDto resDto = vehicleResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public VehicleResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(VehiclePo::new, params);
        queryWrapper.last(" limit 1");
        VehiclePo po = vehiclePoService.getOne(queryWrapper);
        VehicleResDto resDto = vehicleResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<VehiclePo> updateWrapper = QueryParamUtils.updateWrapper4Map(VehiclePo::new, id, params);
        return vehiclePoService.update(new VehiclePo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, VehicleReqDto reqDto) {
        VehiclePo po = vehicleReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return vehiclePoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, VehicleReqDto reqDto) {
        UpdateWrapper<VehiclePo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = VehicleReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), VehicleReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return vehiclePoService.update(new VehiclePo(), updateWrapper);
    }

}