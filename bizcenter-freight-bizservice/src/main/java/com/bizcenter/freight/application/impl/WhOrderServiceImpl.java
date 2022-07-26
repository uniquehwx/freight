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
import com.bizcenter.freight.application.WhOrderService;
import com.bizcenter.freight.infrastructure.persistence.dao.WhOrderMapper;
import com.bizcenter.freight.infrastructure.persistence.po.WhOrderPo;
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
import com.bizcenter.freight.convertor.WhOrderReqDtoConvertor;
import com.bizcenter.freight.convertor.WhOrderResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.WhOrderReqDto;
import com.bizcenter.freight.dto.res.WhOrderResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("whOrderAppService")
@Transactional(rollbackFor = Exception.class)
public class WhOrderServiceImpl implements WhOrderService {

    @Autowired
    private WhOrderReqDtoConvertor whOrderReqDtoConvertor;

    @Autowired
    private WhOrderResDtoConvertor whOrderResDtoConvertor;

    private IPService<WhOrderPo> whOrderPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public WhOrderServiceImpl(WhOrderMapper whOrderMapper) {
        this.whOrderPoService = new BasePService(whOrderMapper);
    }



    @Override
    public WhOrderResDto save(WhOrderReqDto reqDto) {
        WhOrderPo po = whOrderReqDtoConvertor.dto2Po(reqDto);
        whOrderPoService.save(po);
        WhOrderResDto resDto = whOrderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return whOrderPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<WhOrderResDto> doPager(Map<String, Object> params) {
        Pager<WhOrderPo> poPager = whOrderPoService.queryPage(params, WhOrderPo.class);
        Pager<WhOrderResDto> resDtoPager = whOrderResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public WhOrderResDto selectOne(Long id) {
        WhOrderPo po = whOrderPoService.getById(id);
        WhOrderResDto resDto = whOrderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public WhOrderResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WhOrderPo::new, params);
        queryWrapper.last(" limit 1");
        WhOrderPo po = whOrderPoService.getOne(queryWrapper);
        WhOrderResDto resDto = whOrderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<WhOrderPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WhOrderPo::new, id, params);
        return whOrderPoService.update(new WhOrderPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, WhOrderReqDto reqDto) {
        WhOrderPo po = whOrderReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return whOrderPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, WhOrderReqDto reqDto) {
        UpdateWrapper<WhOrderPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = WhOrderReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WhOrderReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return whOrderPoService.update(new WhOrderPo(), updateWrapper);
    }

}