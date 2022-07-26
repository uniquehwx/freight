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
import com.bizcenter.freight.application.MediaRecordService;
import com.bizcenter.freight.infrastructure.persistence.dao.MediaRecordMapper;
import com.bizcenter.freight.infrastructure.persistence.po.MediaRecordPo;
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
import com.bizcenter.freight.convertor.MediaRecordReqDtoConvertor;
import com.bizcenter.freight.convertor.MediaRecordResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.MediaRecordReqDto;
import com.bizcenter.freight.dto.res.MediaRecordResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("mediaRecordAppService")
@Transactional(rollbackFor = Exception.class)
public class MediaRecordServiceImpl implements MediaRecordService {

    @Autowired
    private MediaRecordReqDtoConvertor mediaRecordReqDtoConvertor;

    @Autowired
    private MediaRecordResDtoConvertor mediaRecordResDtoConvertor;

    private IPService<MediaRecordPo> mediaRecordPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public MediaRecordServiceImpl(MediaRecordMapper mediaRecordMapper) {
        this.mediaRecordPoService = new BasePService(mediaRecordMapper);
    }



    @Override
    public MediaRecordResDto save(MediaRecordReqDto reqDto) {
        MediaRecordPo po = mediaRecordReqDtoConvertor.dto2Po(reqDto);
        mediaRecordPoService.save(po);
        MediaRecordResDto resDto = mediaRecordResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return mediaRecordPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<MediaRecordResDto> doPager(Map<String, Object> params) {
        Pager<MediaRecordPo> poPager = mediaRecordPoService.queryPage(params, MediaRecordPo.class);
        Pager<MediaRecordResDto> resDtoPager = mediaRecordResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public MediaRecordResDto selectOne(Long id) {
        MediaRecordPo po = mediaRecordPoService.getById(id);
        MediaRecordResDto resDto = mediaRecordResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public MediaRecordResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(MediaRecordPo::new, params);
        queryWrapper.last(" limit 1");
        MediaRecordPo po = mediaRecordPoService.getOne(queryWrapper);
        MediaRecordResDto resDto = mediaRecordResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<MediaRecordPo> updateWrapper = QueryParamUtils.updateWrapper4Map(MediaRecordPo::new, id, params);
        return mediaRecordPoService.update(new MediaRecordPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, MediaRecordReqDto reqDto) {
        MediaRecordPo po = mediaRecordReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return mediaRecordPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, MediaRecordReqDto reqDto) {
        UpdateWrapper<MediaRecordPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = MediaRecordReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), MediaRecordReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return mediaRecordPoService.update(new MediaRecordPo(), updateWrapper);
    }

}