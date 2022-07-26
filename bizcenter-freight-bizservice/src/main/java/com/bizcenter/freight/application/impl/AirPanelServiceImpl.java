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
import com.bizcenter.freight.application.AirPanelService;
import com.bizcenter.freight.infrastructure.persistence.dao.AirPanelMapper;
import com.bizcenter.freight.infrastructure.persistence.po.AirPanelPo;
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
import com.bizcenter.freight.convertor.AirPanelReqDtoConvertor;
import com.bizcenter.freight.convertor.AirPanelResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.AirPanelReqDto;
import com.bizcenter.freight.dto.res.AirPanelResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("airPanelAppService")
@Transactional(rollbackFor = Exception.class)
public class AirPanelServiceImpl implements AirPanelService {

    @Autowired
    private AirPanelReqDtoConvertor airPanelReqDtoConvertor;

    @Autowired
    private AirPanelResDtoConvertor airPanelResDtoConvertor;

    private IPService<AirPanelPo> airPanelPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AirPanelServiceImpl(AirPanelMapper airPanelMapper) {
        this.airPanelPoService = new BasePService(airPanelMapper);
    }



    @Override
    public AirPanelResDto save(AirPanelReqDto reqDto) {
        AirPanelPo po = airPanelReqDtoConvertor.dto2Po(reqDto);
        airPanelPoService.save(po);
        AirPanelResDto resDto = airPanelResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return airPanelPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<AirPanelResDto> doPager(Map<String, Object> params) {
        Pager<AirPanelPo> poPager = airPanelPoService.queryPage(params, AirPanelPo.class);
        Pager<AirPanelResDto> resDtoPager = airPanelResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public AirPanelResDto selectOne(Long id) {
        AirPanelPo po = airPanelPoService.getById(id);
        AirPanelResDto resDto = airPanelResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public AirPanelResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(AirPanelPo::new, params);
        queryWrapper.last(" limit 1");
        AirPanelPo po = airPanelPoService.getOne(queryWrapper);
        AirPanelResDto resDto = airPanelResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<AirPanelPo> updateWrapper = QueryParamUtils.updateWrapper4Map(AirPanelPo::new, id, params);
        return airPanelPoService.update(new AirPanelPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, AirPanelReqDto reqDto) {
        AirPanelPo po = airPanelReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return airPanelPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, AirPanelReqDto reqDto) {
        UpdateWrapper<AirPanelPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = AirPanelReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), AirPanelReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return airPanelPoService.update(new AirPanelPo(), updateWrapper);
    }

}