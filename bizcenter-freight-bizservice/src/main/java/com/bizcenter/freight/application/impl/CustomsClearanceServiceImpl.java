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
import com.bizcenter.freight.application.CustomsClearanceService;
import com.bizcenter.freight.infrastructure.persistence.dao.CustomsClearanceMapper;
import com.bizcenter.freight.infrastructure.persistence.po.CustomsClearancePo;
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
import com.bizcenter.freight.convertor.CustomsClearanceReqDtoConvertor;
import com.bizcenter.freight.convertor.CustomsClearanceResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.CustomsClearanceReqDto;
import com.bizcenter.freight.dto.res.CustomsClearanceResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("customsClearanceAppService")
@Transactional(rollbackFor = Exception.class)
public class CustomsClearanceServiceImpl implements CustomsClearanceService {

    @Autowired
    private CustomsClearanceReqDtoConvertor customsClearanceReqDtoConvertor;

    @Autowired
    private CustomsClearanceResDtoConvertor customsClearanceResDtoConvertor;

    private IPService<CustomsClearancePo> customsClearancePoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public CustomsClearanceServiceImpl(CustomsClearanceMapper customsClearanceMapper) {
        this.customsClearancePoService = new BasePService(customsClearanceMapper);
    }



    @Override
    public CustomsClearanceResDto save(CustomsClearanceReqDto reqDto) {
        CustomsClearancePo po = customsClearanceReqDtoConvertor.dto2Po(reqDto);
        customsClearancePoService.save(po);
        CustomsClearanceResDto resDto = customsClearanceResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return customsClearancePoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<CustomsClearanceResDto> doPager(Map<String, Object> params) {
        Pager<CustomsClearancePo> poPager = customsClearancePoService.queryPage(params, CustomsClearancePo.class);
        Pager<CustomsClearanceResDto> resDtoPager = customsClearanceResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public CustomsClearanceResDto selectOne(Long id) {
        CustomsClearancePo po = customsClearancePoService.getById(id);
        CustomsClearanceResDto resDto = customsClearanceResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public CustomsClearanceResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(CustomsClearancePo::new, params);
        queryWrapper.last(" limit 1");
        CustomsClearancePo po = customsClearancePoService.getOne(queryWrapper);
        CustomsClearanceResDto resDto = customsClearanceResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<CustomsClearancePo> updateWrapper = QueryParamUtils.updateWrapper4Map(CustomsClearancePo::new, id, params);
        return customsClearancePoService.update(new CustomsClearancePo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, CustomsClearanceReqDto reqDto) {
        CustomsClearancePo po = customsClearanceReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return customsClearancePoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, CustomsClearanceReqDto reqDto) {
        UpdateWrapper<CustomsClearancePo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = CustomsClearanceReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), CustomsClearanceReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return customsClearancePoService.update(new CustomsClearancePo(), updateWrapper);
    }

}