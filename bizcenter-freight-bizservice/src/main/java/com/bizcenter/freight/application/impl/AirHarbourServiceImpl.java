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
import com.bizcenter.freight.application.AirHarbourService;
import com.bizcenter.freight.infrastructure.persistence.dao.AirHarbourMapper;
import com.bizcenter.freight.infrastructure.persistence.po.AirHarbourPo;
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
import com.bizcenter.freight.convertor.AirHarbourReqDtoConvertor;
import com.bizcenter.freight.convertor.AirHarbourResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.AirHarbourReqDto;
import com.bizcenter.freight.dto.res.AirHarbourResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("airHarbourAppService")
@Transactional(rollbackFor = Exception.class)
public class AirHarbourServiceImpl implements AirHarbourService {

    @Autowired
    private AirHarbourReqDtoConvertor airHarbourReqDtoConvertor;

    @Autowired
    private AirHarbourResDtoConvertor airHarbourResDtoConvertor;

    private IPService<AirHarbourPo> airHarbourPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AirHarbourServiceImpl(AirHarbourMapper airHarbourMapper) {
        this.airHarbourPoService = new BasePService(airHarbourMapper);
    }



    @Override
    public AirHarbourResDto save(AirHarbourReqDto reqDto) {
        AirHarbourPo po = airHarbourReqDtoConvertor.dto2Po(reqDto);
        airHarbourPoService.save(po);
        AirHarbourResDto resDto = airHarbourResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return airHarbourPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<AirHarbourResDto> doPager(Map<String, Object> params) {
        Pager<AirHarbourPo> poPager = airHarbourPoService.queryPage(params, AirHarbourPo.class);
        Pager<AirHarbourResDto> resDtoPager = airHarbourResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public AirHarbourResDto selectOne(Long id) {
        AirHarbourPo po = airHarbourPoService.getById(id);
        AirHarbourResDto resDto = airHarbourResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public AirHarbourResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(AirHarbourPo::new, params);
        queryWrapper.last(" limit 1");
        AirHarbourPo po = airHarbourPoService.getOne(queryWrapper);
        AirHarbourResDto resDto = airHarbourResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<AirHarbourPo> updateWrapper = QueryParamUtils.updateWrapper4Map(AirHarbourPo::new, id, params);
        return airHarbourPoService.update(new AirHarbourPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, AirHarbourReqDto reqDto) {
        AirHarbourPo po = airHarbourReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return airHarbourPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, AirHarbourReqDto reqDto) {
        UpdateWrapper<AirHarbourPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = AirHarbourReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), AirHarbourReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return airHarbourPoService.update(new AirHarbourPo(), updateWrapper);
    }

}