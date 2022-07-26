package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.MediaRecordService;
import com.bizcenter.freight.convertor.MediaRecordReqDtoConvertor;
import com.bizcenter.freight.convertor.MediaRecordResDtoConvertor;
import com.bizcenter.freight.dto.req.MediaRecordReqDto;
import com.bizcenter.freight.dto.res.MediaRecordResDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
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

//    private IPService<MediaRecordPo> mediaRecordPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public MediaRecordServiceImpl(MediaRecordMapper mediaRecordMapper) {
//        this.mediaRecordPoService = new BasePService(mediaRecordMapper);
//    }



    @Override
    public MediaRecordResDto save(MediaRecordReqDto reqDto) {
//        MediaRecordPo po = mediaRecordReqDtoConvertor.dto2Po(reqDto);
//        mediaRecordPoService.save(po);
//        MediaRecordResDto resDto = mediaRecordResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return mediaRecordPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<MediaRecordResDto> doPager(Map<String, Object> params) {
//        Pager<MediaRecordPo> poPager = mediaRecordPoService.queryPage(params, MediaRecordPo.class);
//        Pager<MediaRecordResDto> resDtoPager = mediaRecordResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public MediaRecordResDto selectOne(Long id) {
//        MediaRecordPo po = mediaRecordPoService.getById(id);
//        MediaRecordResDto resDto = mediaRecordResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public MediaRecordResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(MediaRecordPo::new, params);
//        queryWrapper.last(" limit 1");
//        MediaRecordPo po = mediaRecordPoService.getOne(queryWrapper);
//        MediaRecordResDto resDto = mediaRecordResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<MediaRecordPo> updateWrapper = QueryParamUtils.updateWrapper4Map(MediaRecordPo::new, id, params);
//        return mediaRecordPoService.update(new MediaRecordPo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, MediaRecordReqDto reqDto) {
//        MediaRecordPo po = mediaRecordReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return mediaRecordPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, MediaRecordReqDto reqDto) {
//        UpdateWrapper<MediaRecordPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = MediaRecordReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), MediaRecordReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return mediaRecordPoService.update(new MediaRecordPo(), updateWrapper);
        return  true;
    }

}