//package com.bizcenter.freight.domain.service.impl;
//
//import com.bizcenter.freight.convertor.WhOutOrderDetailReqDtoConvertor;
//import com.bizcenter.freight.convertor.WhOutOrderDetailResDtoConvertor;
//import com.bitsun.core.common.persistence.BasePService;
//import com.bitsun.core.common.persistence.IPService;
//import com.bizcenter.freight.infrastructure.persistence.dao.WhOutOrderDetailMapper;
//import com.bizcenter.freight.infrastructure.persistence.po.WhOutOrderDetailPo;
//import com.bizcenter.freight.domain.service.WhOutOrderDetailDomainService;
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
//@Service("whOutOrderDetailDomainService")
//public class WhOutOrderDetailDomainServiceImpl implements WhOutOrderDetailDomainService{
//
//    @Autowired
//    private WhOutOrderDetailReqDtoConvertor whOutOrderDetailReqDtoConvertor;
//
//    @Autowired
//    private WhOutOrderDetailResDtoConvertor whOutOrderDetailResDtoConvertor;
//
//    private IPService<WhOutOrderDetailPo> whOutOrderDetailPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public WhOutOrderDetailDomainServiceImpl(WhOutOrderDetailMapper whOutOrderDetailMapper) {
//        this.whOutOrderDetailPoService = new BasePService(whOutOrderDetailMapper);
//    }
//}