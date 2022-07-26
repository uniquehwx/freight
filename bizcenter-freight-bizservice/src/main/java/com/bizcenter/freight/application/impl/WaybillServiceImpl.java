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
import com.bizcenter.freight.application.WaybillService;
import com.bizcenter.freight.infrastructure.persistence.dao.WaybillMapper;
import com.bizcenter.freight.infrastructure.persistence.po.WaybillPo;
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
import com.bizcenter.freight.convertor.WaybillReqDtoConvertor;
import com.bizcenter.freight.convertor.WaybillResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.WaybillReqDto;
import com.bizcenter.freight.dto.res.WaybillResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("waybillAppService")
@Transactional(rollbackFor = Exception.class)
public class WaybillServiceImpl implements WaybillService {

    @Autowired
    private WaybillReqDtoConvertor waybillReqDtoConvertor;

    @Autowired
    private WaybillResDtoConvertor waybillResDtoConvertor;

    private IPService<WaybillPo> waybillPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public WaybillServiceImpl(WaybillMapper waybillMapper) {
        this.waybillPoService = new BasePService(waybillMapper);
    }



    @Override
    public WaybillResDto save(WaybillReqDto reqDto) {
        WaybillPo po = waybillReqDtoConvertor.dto2Po(reqDto);
        waybillPoService.save(po);
        WaybillResDto resDto = waybillResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return waybillPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<WaybillResDto> doPager(Map<String, Object> params) {
        Pager<WaybillPo> poPager = waybillPoService.queryPage(params, WaybillPo.class);
        Pager<WaybillResDto> resDtoPager = waybillResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public WaybillResDto selectOne(Long id) {
        WaybillPo po = waybillPoService.getById(id);
        WaybillResDto resDto = waybillResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public WaybillResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WaybillPo::new, params);
        queryWrapper.last(" limit 1");
        WaybillPo po = waybillPoService.getOne(queryWrapper);
        WaybillResDto resDto = waybillResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<WaybillPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WaybillPo::new, id, params);
        return waybillPoService.update(new WaybillPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, WaybillReqDto reqDto) {
        WaybillPo po = waybillReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return waybillPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, WaybillReqDto reqDto) {
        UpdateWrapper<WaybillPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = WaybillReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WaybillReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return waybillPoService.update(new WaybillPo(), updateWrapper);
    }

}