//package com.bizcenter.freight.domain.service.impl;
//
//import com.bizcenter.freight.convertor.WhOutOrderReqDtoConvertor;
//import com.bizcenter.freight.convertor.WhOutOrderResDtoConvertor;
//import com.bitsun.core.common.persistence.BasePService;
//import com.bitsun.core.common.persistence.IPService;
//import com.bizcenter.freight.infrastructure.persistence.dao.WhOutOrderMapper;
//import com.bizcenter.freight.infrastructure.persistence.po.WhOutOrderPo;
//import com.bizcenter.freight.domain.service.WhOutOrderDomainService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * @Author: Felix Woo （junfengwstar@gmail.com）
// * @Date: 2019-09-20 19:40
// * @Version: 1.0
// * @Description:
// */
//@Slf4j
//@Service("whOutOrderDomainService")
//public class WhOutOrderDomainServiceImpl implements WhOutOrderDomainService{
//
//    @Autowired
//    private WhOutOrderReqDtoConvertor whOutOrderReqDtoConvertor;
//
//    @Autowired
//    private WhOutOrderResDtoConvertor whOutOrderResDtoConvertor;
//
//    private IPService<WhOutOrderPo> whOutOrderPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public WhOutOrderDomainServiceImpl(WhOutOrderMapper whOutOrderMapper) {
//        this.whOutOrderPoService = new BasePService(whOutOrderMapper);
//    }
//}