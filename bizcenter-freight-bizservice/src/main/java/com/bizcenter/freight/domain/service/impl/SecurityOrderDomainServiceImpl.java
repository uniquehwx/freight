//package com.bizcenter.freight.domain.service.impl;
//
//import com.bizcenter.freight.convertor.SecurityOrderReqDtoConvertor;
//import com.bizcenter.freight.convertor.SecurityOrderResDtoConvertor;
//import com.bitsun.core.common.persistence.BasePService;
//import com.bitsun.core.common.persistence.IPService;
//import com.bizcenter.freight.infrastructure.persistence.dao.SecurityOrderMapper;
//import com.bizcenter.freight.infrastructure.persistence.po.SecurityOrderPo;
//import com.bizcenter.freight.domain.service.SecurityOrderDomainService;
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
//@Service("securityOrderDomainService")
//public class SecurityOrderDomainServiceImpl implements SecurityOrderDomainService{
//
//    @Autowired
//    private SecurityOrderReqDtoConvertor securityOrderReqDtoConvertor;
//
//    @Autowired
//    private SecurityOrderResDtoConvertor securityOrderResDtoConvertor;
//
//    private IPService<SecurityOrderPo> securityOrderPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public SecurityOrderDomainServiceImpl(SecurityOrderMapper securityOrderMapper) {
//        this.securityOrderPoService = new BasePService(securityOrderMapper);
//    }
//}