package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.WhOrderReqDtoConvertor;
import com.bizcenter.freight.convertor.WhOrderResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.WhOrderMapper;
import com.bizcenter.freight.infrastructure.persistence.po.WhOrderPo;
import com.bizcenter.freight.domain.service.WhOrderDomainService;
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
@Service("whOrderDomainService")
public class WhOrderDomainServiceImpl implements WhOrderDomainService{

    @Autowired
    private WhOrderReqDtoConvertor whOrderReqDtoConvertor;

    @Autowired
    private WhOrderResDtoConvertor whOrderResDtoConvertor;

    private IPService<WhOrderPo> whOrderPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public WhOrderDomainServiceImpl(WhOrderMapper whOrderMapper) {
        this.whOrderPoService = new BasePService(whOrderMapper);
    }
}