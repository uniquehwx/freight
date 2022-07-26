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
import com.bizcenter.freight.application.WhOrderDetailService;
import com.bizcenter.freight.infrastructure.persistence.dao.WhOrderDetailMapper;
import com.bizcenter.freight.infrastructure.persistence.po.WhOrderDetailPo;
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
import com.bizcenter.freight.convertor.WhOrderDetailReqDtoConvertor;
import com.bizcenter.freight.convertor.WhOrderDetailResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.WhOrderDetailReqDto;
import com.bizcenter.freight.dto.res.WhOrderDetailResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("whOrderDetailAppService")
@Transactional(rollbackFor = Exception.class)
public class WhOrderDetailServiceImpl implements WhOrderDetailService {

    @Autowired
    private WhOrderDetailReqDtoConvertor whOrderDetailReqDtoConvertor;

    @Autowired
    private WhOrderDetailResDtoConvertor whOrderDetailResDtoConvertor;

    private IPService<WhOrderDetailPo> whOrderDetailPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public WhOrderDetailServiceImpl(WhOrderDetailMapper whOrderDetailMapper) {
        this.whOrderDetailPoService = new BasePService(whOrderDetailMapper);
    }



    @Override
    public WhOrderDetailResDto save(WhOrderDetailReqDto reqDto) {
        WhOrderDetailPo po = whOrderDetailReqDtoConvertor.dto2Po(reqDto);
        whOrderDetailPoService.save(po);
        WhOrderDetailResDto resDto = whOrderDetailResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return whOrderDetailPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<WhOrderDetailResDto> doPager(Map<String, Object> params) {
        Pager<WhOrderDetailPo> poPager = whOrderDetailPoService.queryPage(params, WhOrderDetailPo.class);
        Pager<WhOrderDetailResDto> resDtoPager = whOrderDetailResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public WhOrderDetailResDto selectOne(Long id) {
        WhOrderDetailPo po = whOrderDetailPoService.getById(id);
        WhOrderDetailResDto resDto = whOrderDetailResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public WhOrderDetailResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WhOrderDetailPo::new, params);
        queryWrapper.last(" limit 1");
        WhOrderDetailPo po = whOrderDetailPoService.getOne(queryWrapper);
        WhOrderDetailResDto resDto = whOrderDetailResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<WhOrderDetailPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WhOrderDetailPo::new, id, params);
        return whOrderDetailPoService.update(new WhOrderDetailPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, WhOrderDetailReqDto reqDto) {
        WhOrderDetailPo po = whOrderDetailReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return whOrderDetailPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, WhOrderDetailReqDto reqDto) {
        UpdateWrapper<WhOrderDetailPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = WhOrderDetailReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WhOrderDetailReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return whOrderDetailPoService.update(new WhOrderDetailPo(), updateWrapper);
    }

}