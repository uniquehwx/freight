//package com.bizcenter.freight.domain.service.impl;
//
//import com.bizcenter.freight.convertor.AirCompanyReqDtoConvertor;
//import com.bizcenter.freight.convertor.AirCompanyResDtoConvertor;
//import com.bitsun.core.common.persistence.BasePService;
//import com.bitsun.core.common.persistence.IPService;
//import com.bizcenter.freight.infrastructure.persistence.dao.AirCompanyMapper;
//import com.bizcenter.freight.infrastructure.persistence.po.AirCompanyPo;
//import com.bizcenter.freight.domain.service.AirCompanyDomainService;
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
//@Service("airCompanyDomainService")
//public class AirCompanyDomainServiceImpl implements AirCompanyDomainService{
//
//    @Autowired
//    private AirCompanyReqDtoConvertor airCompanyReqDtoConvertor;
//
//    @Autowired
//    private AirCompanyResDtoConvertor airCompanyResDtoConvertor;
//
//    private IPService<AirCompanyPo> airCompanyPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public AirCompanyDomainServiceImpl(AirCompanyMapper airCompanyMapper) {
//        this.airCompanyPoService = new BasePService(airCompanyMapper);
//    }
//}