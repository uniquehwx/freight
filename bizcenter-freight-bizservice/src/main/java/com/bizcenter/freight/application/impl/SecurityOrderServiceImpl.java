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
import com.bizcenter.freight.application.SecurityOrderService;
import com.bizcenter.freight.infrastructure.persistence.dao.SecurityOrderMapper;
import com.bizcenter.freight.infrastructure.persistence.po.SecurityOrderPo;
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
import com.bizcenter.freight.convertor.SecurityOrderReqDtoConvertor;
import com.bizcenter.freight.convertor.SecurityOrderResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.SecurityOrderReqDto;
import com.bizcenter.freight.dto.res.SecurityOrderResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("securityOrderAppService")
@Transactional(rollbackFor = Exception.class)
public class SecurityOrderServiceImpl implements SecurityOrderService {

    @Autowired
    private SecurityOrderReqDtoConvertor securityOrderReqDtoConvertor;

    @Autowired
    private SecurityOrderResDtoConvertor securityOrderResDtoConvertor;

    private IPService<SecurityOrderPo> securityOrderPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public SecurityOrderServiceImpl(SecurityOrderMapper securityOrderMapper) {
        this.securityOrderPoService = new BasePService(securityOrderMapper);
    }



    @Override
    public SecurityOrderResDto save(SecurityOrderReqDto reqDto) {
        SecurityOrderPo po = securityOrderReqDtoConvertor.dto2Po(reqDto);
        securityOrderPoService.save(po);
        SecurityOrderResDto resDto = securityOrderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return securityOrderPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<SecurityOrderResDto> doPager(Map<String, Object> params) {
        Pager<SecurityOrderPo> poPager = securityOrderPoService.queryPage(params, SecurityOrderPo.class);
        Pager<SecurityOrderResDto> resDtoPager = securityOrderResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public SecurityOrderResDto selectOne(Long id) {
        SecurityOrderPo po = securityOrderPoService.getById(id);
        SecurityOrderResDto resDto = securityOrderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public SecurityOrderResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(SecurityOrderPo::new, params);
        queryWrapper.last(" limit 1");
        SecurityOrderPo po = securityOrderPoService.getOne(queryWrapper);
        SecurityOrderResDto resDto = securityOrderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<SecurityOrderPo> updateWrapper = QueryParamUtils.updateWrapper4Map(SecurityOrderPo::new, id, params);
        return securityOrderPoService.update(new SecurityOrderPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, SecurityOrderReqDto reqDto) {
        SecurityOrderPo po = securityOrderReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return securityOrderPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, SecurityOrderReqDto reqDto) {
        UpdateWrapper<SecurityOrderPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = SecurityOrderReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), SecurityOrderReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return securityOrderPoService.update(new SecurityOrderPo(), updateWrapper);
    }

}