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
import com.bizcenter.freight.application.WaybillExceptionLogService;
import com.bizcenter.freight.infrastructure.persistence.dao.WaybillExceptionLogMapper;
import com.bizcenter.freight.infrastructure.persistence.po.WaybillExceptionLogPo;
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
import com.bizcenter.freight.convertor.WaybillExceptionLogReqDtoConvertor;
import com.bizcenter.freight.convertor.WaybillExceptionLogResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.WaybillExceptionLogReqDto;
import com.bizcenter.freight.dto.res.WaybillExceptionLogResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("waybillExceptionLogAppService")
@Transactional(rollbackFor = Exception.class)
public class WaybillExceptionLogServiceImpl implements WaybillExceptionLogService {

    @Autowired
    private WaybillExceptionLogReqDtoConvertor waybillExceptionLogReqDtoConvertor;

    @Autowired
    private WaybillExceptionLogResDtoConvertor waybillExceptionLogResDtoConvertor;

    private IPService<WaybillExceptionLogPo> waybillExceptionLogPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public WaybillExceptionLogServiceImpl(WaybillExceptionLogMapper waybillExceptionLogMapper) {
        this.waybillExceptionLogPoService = new BasePService(waybillExceptionLogMapper);
    }



    @Override
    public WaybillExceptionLogResDto save(WaybillExceptionLogReqDto reqDto) {
        WaybillExceptionLogPo po = waybillExceptionLogReqDtoConvertor.dto2Po(reqDto);
        waybillExceptionLogPoService.save(po);
        WaybillExceptionLogResDto resDto = waybillExceptionLogResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return waybillExceptionLogPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<WaybillExceptionLogResDto> doPager(Map<String, Object> params) {
        Pager<WaybillExceptionLogPo> poPager = waybillExceptionLogPoService.queryPage(params, WaybillExceptionLogPo.class);
        Pager<WaybillExceptionLogResDto> resDtoPager = waybillExceptionLogResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public WaybillExceptionLogResDto selectOne(Long id) {
        WaybillExceptionLogPo po = waybillExceptionLogPoService.getById(id);
        WaybillExceptionLogResDto resDto = waybillExceptionLogResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public WaybillExceptionLogResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WaybillExceptionLogPo::new, params);
        queryWrapper.last(" limit 1");
        WaybillExceptionLogPo po = waybillExceptionLogPoService.getOne(queryWrapper);
        WaybillExceptionLogResDto resDto = waybillExceptionLogResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<WaybillExceptionLogPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WaybillExceptionLogPo::new, id, params);
        return waybillExceptionLogPoService.update(new WaybillExceptionLogPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, WaybillExceptionLogReqDto reqDto) {
        WaybillExceptionLogPo po = waybillExceptionLogReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return waybillExceptionLogPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, WaybillExceptionLogReqDto reqDto) {
        UpdateWrapper<WaybillExceptionLogPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = WaybillExceptionLogReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WaybillExceptionLogReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return waybillExceptionLogPoService.update(new WaybillExceptionLogPo(), updateWrapper);
    }

}