package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.TransportOrderReqDtoConvertor;
import com.bizcenter.freight.convertor.TransportOrderResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.TransportOrderMapper;
import com.bizcenter.freight.infrastructure.persistence.po.TransportOrderPo;
import com.bizcenter.freight.domain.service.TransportOrderDomainService;
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
@Service("transportOrderDomainService")
public class TransportOrderDomainServiceImpl implements TransportOrderDomainService{

    @Autowired
    private TransportOrderReqDtoConvertor transportOrderReqDtoConvertor;

    @Autowired
    private TransportOrderResDtoConvertor transportOrderResDtoConvertor;

    private IPService<TransportOrderPo> transportOrderPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public TransportOrderDomainServiceImpl(TransportOrderMapper transportOrderMapper) {
        this.transportOrderPoService = new BasePService(transportOrderMapper);
    }
}