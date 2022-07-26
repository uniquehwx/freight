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
import com.bizcenter.freight.application.WhOutOrderDetailService;
import com.bizcenter.freight.infrastructure.persistence.dao.WhOutOrderDetailMapper;
import com.bizcenter.freight.infrastructure.persistence.po.WhOutOrderDetailPo;
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
import com.bizcenter.freight.convertor.WhOutOrderDetailReqDtoConvertor;
import com.bizcenter.freight.convertor.WhOutOrderDetailResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.WhOutOrderDetailReqDto;
import com.bizcenter.freight.dto.res.WhOutOrderDetailResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("whOutOrderDetailAppService")
@Transactional(rollbackFor = Exception.class)
public class WhOutOrderDetailServiceImpl implements WhOutOrderDetailService {

    @Autowired
    private WhOutOrderDetailReqDtoConvertor whOutOrderDetailReqDtoConvertor;

    @Autowired
    private WhOutOrderDetailResDtoConvertor whOutOrderDetailResDtoConvertor;

    private IPService<WhOutOrderDetailPo> whOutOrderDetailPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public WhOutOrderDetailServiceImpl(WhOutOrderDetailMapper whOutOrderDetailMapper) {
        this.whOutOrderDetailPoService = new BasePService(whOutOrderDetailMapper);
    }



    @Override
    public WhOutOrderDetailResDto save(WhOutOrderDetailReqDto reqDto) {
        WhOutOrderDetailPo po = whOutOrderDetailReqDtoConvertor.dto2Po(reqDto);
        whOutOrderDetailPoService.save(po);
        WhOutOrderDetailResDto resDto = whOutOrderDetailResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return whOutOrderDetailPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<WhOutOrderDetailResDto> doPager(Map<String, Object> params) {
        Pager<WhOutOrderDetailPo> poPager = whOutOrderDetailPoService.queryPage(params, WhOutOrderDetailPo.class);
        Pager<WhOutOrderDetailResDto> resDtoPager = whOutOrderDetailResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public WhOutOrderDetailResDto selectOne(Long id) {
        WhOutOrderDetailPo po = whOutOrderDetailPoService.getById(id);
        WhOutOrderDetailResDto resDto = whOutOrderDetailResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public WhOutOrderDetailResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WhOutOrderDetailPo::new, params);
        queryWrapper.last(" limit 1");
        WhOutOrderDetailPo po = whOutOrderDetailPoService.getOne(queryWrapper);
        WhOutOrderDetailResDto resDto = whOutOrderDetailResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<WhOutOrderDetailPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WhOutOrderDetailPo::new, id, params);
        return whOutOrderDetailPoService.update(new WhOutOrderDetailPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, WhOutOrderDetailReqDto reqDto) {
        WhOutOrderDetailPo po = whOutOrderDetailReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return whOutOrderDetailPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, WhOutOrderDetailReqDto reqDto) {
        UpdateWrapper<WhOutOrderDetailPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = WhOutOrderDetailReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WhOutOrderDetailReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return whOutOrderDetailPoService.update(new WhOutOrderDetailPo(), updateWrapper);
    }

}