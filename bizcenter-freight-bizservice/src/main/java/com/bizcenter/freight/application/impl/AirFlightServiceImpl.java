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
import com.bizcenter.freight.application.AirFlightService;
import com.bizcenter.freight.infrastructure.persistence.dao.AirFlightMapper;
import com.bizcenter.freight.infrastructure.persistence.po.AirFlightPo;
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
import com.bizcenter.freight.convertor.AirFlightReqDtoConvertor;
import com.bizcenter.freight.convertor.AirFlightResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.AirFlightReqDto;
import com.bizcenter.freight.dto.res.AirFlightResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("airFlightAppService")
@Transactional(rollbackFor = Exception.class)
public class AirFlightServiceImpl implements AirFlightService {

    @Autowired
    private AirFlightReqDtoConvertor airFlightReqDtoConvertor;

    @Autowired
    private AirFlightResDtoConvertor airFlightResDtoConvertor;

    private IPService<AirFlightPo> airFlightPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AirFlightServiceImpl(AirFlightMapper airFlightMapper) {
        this.airFlightPoService = new BasePService(airFlightMapper);
    }



    @Override
    public AirFlightResDto save(AirFlightReqDto reqDto) {
        AirFlightPo po = airFlightReqDtoConvertor.dto2Po(reqDto);
        airFlightPoService.save(po);
        AirFlightResDto resDto = airFlightResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return airFlightPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<AirFlightResDto> doPager(Map<String, Object> params) {
        Pager<AirFlightPo> poPager = airFlightPoService.queryPage(params, AirFlightPo.class);
        Pager<AirFlightResDto> resDtoPager = airFlightResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public AirFlightResDto selectOne(Long id) {
        AirFlightPo po = airFlightPoService.getById(id);
        AirFlightResDto resDto = airFlightResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public AirFlightResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(AirFlightPo::new, params);
        queryWrapper.last(" limit 1");
        AirFlightPo po = airFlightPoService.getOne(queryWrapper);
        AirFlightResDto resDto = airFlightResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<AirFlightPo> updateWrapper = QueryParamUtils.updateWrapper4Map(AirFlightPo::new, id, params);
        return airFlightPoService.update(new AirFlightPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, AirFlightReqDto reqDto) {
        AirFlightPo po = airFlightReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return airFlightPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, AirFlightReqDto reqDto) {
        UpdateWrapper<AirFlightPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = AirFlightReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), AirFlightReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return airFlightPoService.update(new AirFlightPo(), updateWrapper);
    }

}