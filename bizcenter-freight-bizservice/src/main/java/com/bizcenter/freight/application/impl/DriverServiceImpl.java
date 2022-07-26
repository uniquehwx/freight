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
import com.bizcenter.freight.application.DriverService;
import com.bizcenter.freight.infrastructure.persistence.dao.DriverMapper;
import com.bizcenter.freight.infrastructure.persistence.po.DriverPo;
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
import com.bizcenter.freight.convertor.DriverReqDtoConvertor;
import com.bizcenter.freight.convertor.DriverResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.DriverReqDto;
import com.bizcenter.freight.dto.res.DriverResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("driverAppService")
@Transactional(rollbackFor = Exception.class)
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverReqDtoConvertor driverReqDtoConvertor;

    @Autowired
    private DriverResDtoConvertor driverResDtoConvertor;

    private IPService<DriverPo> driverPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public DriverServiceImpl(DriverMapper driverMapper) {
        this.driverPoService = new BasePService(driverMapper);
    }



    @Override
    public DriverResDto save(DriverReqDto reqDto) {
        DriverPo po = driverReqDtoConvertor.dto2Po(reqDto);
        driverPoService.save(po);
        DriverResDto resDto = driverResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return driverPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<DriverResDto> doPager(Map<String, Object> params) {
        Pager<DriverPo> poPager = driverPoService.queryPage(params, DriverPo.class);
        Pager<DriverResDto> resDtoPager = driverResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public DriverResDto selectOne(Long id) {
        DriverPo po = driverPoService.getById(id);
        DriverResDto resDto = driverResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public DriverResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(DriverPo::new, params);
        queryWrapper.last(" limit 1");
        DriverPo po = driverPoService.getOne(queryWrapper);
        DriverResDto resDto = driverResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<DriverPo> updateWrapper = QueryParamUtils.updateWrapper4Map(DriverPo::new, id, params);
        return driverPoService.update(new DriverPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, DriverReqDto reqDto) {
        DriverPo po = driverReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return driverPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, DriverReqDto reqDto) {
        UpdateWrapper<DriverPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = DriverReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), DriverReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return driverPoService.update(new DriverPo(), updateWrapper);
    }

}