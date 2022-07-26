package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.WhOrderDetailReqDtoConvertor;
import com.bizcenter.freight.convertor.WhOrderDetailResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.WhOrderDetailMapper;
import com.bizcenter.freight.infrastructure.persistence.po.WhOrderDetailPo;
import com.bizcenter.freight.domain.service.WhOrderDetailDomainService;
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
@Service("whOrderDetailDomainService")
public class WhOrderDetailDomainServiceImpl implements WhOrderDetailDomainService{

    @Autowired
    private WhOrderDetailReqDtoConvertor whOrderDetailReqDtoConvertor;

    @Autowired
    private WhOrderDetailResDtoConvertor whOrderDetailResDtoConvertor;

    private IPService<WhOrderDetailPo> whOrderDetailPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public WhOrderDetailDomainServiceImpl(WhOrderDetailMapper whOrderDetailMapper) {
        this.whOrderDetailPoService = new BasePService(whOrderDetailMapper);
    }
}