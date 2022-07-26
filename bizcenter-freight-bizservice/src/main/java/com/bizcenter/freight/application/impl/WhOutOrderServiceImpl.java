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
import com.bizcenter.freight.application.WhOutOrderService;
import com.bizcenter.freight.infrastructure.persistence.dao.WhOutOrderMapper;
import com.bizcenter.freight.infrastructure.persistence.po.WhOutOrderPo;
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
import com.bizcenter.freight.convertor.WhOutOrderReqDtoConvertor;
import com.bizcenter.freight.convertor.WhOutOrderResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.WhOutOrderReqDto;
import com.bizcenter.freight.dto.res.WhOutOrderResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("whOutOrderAppService")
@Transactional(rollbackFor = Exception.class)
public class WhOutOrderServiceImpl implements WhOutOrderService {

    @Autowired
    private WhOutOrderReqDtoConvertor whOutOrderReqDtoConvertor;

    @Autowired
    private WhOutOrderResDtoConvertor whOutOrderResDtoConvertor;

    private IPService<WhOutOrderPo> whOutOrderPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public WhOutOrderServiceImpl(WhOutOrderMapper whOutOrderMapper) {
        this.whOutOrderPoService = new BasePService(whOutOrderMapper);
    }



    @Override
    public WhOutOrderResDto save(WhOutOrderReqDto reqDto) {
        WhOutOrderPo po = whOutOrderReqDtoConvertor.dto2Po(reqDto);
        whOutOrderPoService.save(po);
        WhOutOrderResDto resDto = whOutOrderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return whOutOrderPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<WhOutOrderResDto> doPager(Map<String, Object> params) {
        Pager<WhOutOrderPo> poPager = whOutOrderPoService.queryPage(params, WhOutOrderPo.class);
        Pager<WhOutOrderResDto> resDtoPager = whOutOrderResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public WhOutOrderResDto selectOne(Long id) {
        WhOutOrderPo po = whOutOrderPoService.getById(id);
        WhOutOrderResDto resDto = whOutOrderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public WhOutOrderResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WhOutOrderPo::new, params);
        queryWrapper.last(" limit 1");
        WhOutOrderPo po = whOutOrderPoService.getOne(queryWrapper);
        WhOutOrderResDto resDto = whOutOrderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<WhOutOrderPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WhOutOrderPo::new, id, params);
        return whOutOrderPoService.update(new WhOutOrderPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, WhOutOrderReqDto reqDto) {
        WhOutOrderPo po = whOutOrderReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return whOutOrderPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, WhOutOrderReqDto reqDto) {
        UpdateWrapper<WhOutOrderPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = WhOutOrderReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WhOutOrderReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return whOutOrderPoService.update(new WhOutOrderPo(), updateWrapper);
    }

}