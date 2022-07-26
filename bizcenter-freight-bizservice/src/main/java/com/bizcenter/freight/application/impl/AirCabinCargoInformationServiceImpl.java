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
import com.bizcenter.freight.application.AirCabinCargoInformationService;
import com.bizcenter.freight.infrastructure.persistence.dao.AirCabinCargoInformationMapper;
import com.bizcenter.freight.infrastructure.persistence.po.AirCabinCargoInformationPo;
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
import com.bizcenter.freight.convertor.AirCabinCargoInformationReqDtoConvertor;
import com.bizcenter.freight.convertor.AirCabinCargoInformationResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.AirCabinCargoInformationReqDto;
import com.bizcenter.freight.dto.res.AirCabinCargoInformationResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("airCabinCargoInformationAppService")
@Transactional(rollbackFor = Exception.class)
public class AirCabinCargoInformationServiceImpl implements AirCabinCargoInformationService {

    @Autowired
    private AirCabinCargoInformationReqDtoConvertor airCabinCargoInformationReqDtoConvertor;

    @Autowired
    private AirCabinCargoInformationResDtoConvertor airCabinCargoInformationResDtoConvertor;

    private IPService<AirCabinCargoInformationPo> airCabinCargoInformationPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AirCabinCargoInformationServiceImpl(AirCabinCargoInformationMapper airCabinCargoInformationMapper) {
        this.airCabinCargoInformationPoService = new BasePService(airCabinCargoInformationMapper);
    }



    @Override
    public AirCabinCargoInformationResDto save(AirCabinCargoInformationReqDto reqDto) {
        AirCabinCargoInformationPo po = airCabinCargoInformationReqDtoConvertor.dto2Po(reqDto);
        airCabinCargoInformationPoService.save(po);
        AirCabinCargoInformationResDto resDto = airCabinCargoInformationResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return airCabinCargoInformationPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<AirCabinCargoInformationResDto> doPager(Map<String, Object> params) {
        Pager<AirCabinCargoInformationPo> poPager = airCabinCargoInformationPoService.queryPage(params, AirCabinCargoInformationPo.class);
        Pager<AirCabinCargoInformationResDto> resDtoPager = airCabinCargoInformationResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public AirCabinCargoInformationResDto selectOne(Long id) {
        AirCabinCargoInformationPo po = airCabinCargoInformationPoService.getById(id);
        AirCabinCargoInformationResDto resDto = airCabinCargoInformationResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public AirCabinCargoInformationResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(AirCabinCargoInformationPo::new, params);
        queryWrapper.last(" limit 1");
        AirCabinCargoInformationPo po = airCabinCargoInformationPoService.getOne(queryWrapper);
        AirCabinCargoInformationResDto resDto = airCabinCargoInformationResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<AirCabinCargoInformationPo> updateWrapper = QueryParamUtils.updateWrapper4Map(AirCabinCargoInformationPo::new, id, params);
        return airCabinCargoInformationPoService.update(new AirCabinCargoInformationPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, AirCabinCargoInformationReqDto reqDto) {
        AirCabinCargoInformationPo po = airCabinCargoInformationReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return airCabinCargoInformationPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, AirCabinCargoInformationReqDto reqDto) {
        UpdateWrapper<AirCabinCargoInformationPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = AirCabinCargoInformationReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), AirCabinCargoInformationReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return airCabinCargoInformationPoService.update(new AirCabinCargoInformationPo(), updateWrapper);
    }

}