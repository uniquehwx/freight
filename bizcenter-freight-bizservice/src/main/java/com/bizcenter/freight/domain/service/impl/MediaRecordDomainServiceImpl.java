package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.MediaRecordReqDtoConvertor;
import com.bizcenter.freight.convertor.MediaRecordResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.MediaRecordMapper;
import com.bizcenter.freight.infrastructure.persistence.po.MediaRecordPo;
import com.bizcenter.freight.domain.service.MediaRecordDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Felix Woo （junfengwstar@gmail.com）
 * @Date: 2019-09-20 19:40
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@Service("mediaRecordDomainService")
public class MediaRecordDomainServiceImpl implements MediaRecordDomainService{

    @Autowired
    private MediaRecordReqDtoConvertor mediaRecordReqDtoConvertor;

    @Autowired
    private MediaRecordResDtoConvertor mediaRecordResDtoConvertor;

    private IPService<MediaRecordPo> mediaRecordPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public MediaRecordDomainServiceImpl(MediaRecordMapper mediaRecordMapper) {
        this.mediaRecordPoService = new BasePService(mediaRecordMapper);
    }
}