//package com.bizcenter.freight.domain.service.impl;
//
//import com.bizcenter.freight.convertor.CustomsClearanceReqDtoConvertor;
//import com.bizcenter.freight.convertor.CustomsClearanceResDtoConvertor;
//import com.bitsun.core.common.persistence.BasePService;
//import com.bitsun.core.common.persistence.IPService;
//import com.bizcenter.freight.infrastructure.persistence.dao.CustomsClearanceMapper;
//import com.bizcenter.freight.infrastructure.persistence.po.CustomsClearancePo;
//import com.bizcenter.freight.domain.service.CustomsClearanceDomainService;
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
//@Service("customsClearanceDomainService")
//public class CustomsClearanceDomainServiceImpl implements CustomsClearanceDomainService{
//
//    @Autowired
//    private CustomsClearanceReqDtoConvertor customsClearanceReqDtoConvertor;
//
//    @Autowired
//    private CustomsClearanceResDtoConvertor customsClearanceResDtoConvertor;
//
//    private IPService<CustomsClearancePo> customsClearancePoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public CustomsClearanceDomainServiceImpl(CustomsClearanceMapper customsClearanceMapper) {
//        this.customsClearancePoService = new BasePService(customsClearanceMapper);
//    }
//}