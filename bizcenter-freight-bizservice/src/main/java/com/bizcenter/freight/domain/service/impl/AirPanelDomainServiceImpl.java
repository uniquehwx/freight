//package com.bizcenter.freight.domain.service.impl;
//
//import com.bizcenter.freight.convertor.AirPanelReqDtoConvertor;
//import com.bizcenter.freight.convertor.AirPanelResDtoConvertor;
//import com.bitsun.core.common.persistence.BasePService;
//import com.bitsun.core.common.persistence.IPService;
//import com.bizcenter.freight.infrastructure.persistence.dao.AirPanelMapper;
//import com.bizcenter.freight.infrastructure.persistence.po.AirPanelPo;
//import com.bizcenter.freight.domain.service.AirPanelDomainService;
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
//@Service("airPanelDomainService")
//public class AirPanelDomainServiceImpl implements AirPanelDomainService{
//
//    @Autowired
//    private AirPanelReqDtoConvertor airPanelReqDtoConvertor;
//
//    @Autowired
//    private AirPanelResDtoConvertor airPanelResDtoConvertor;
//
//    private IPService<AirPanelPo> airPanelPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public AirPanelDomainServiceImpl(AirPanelMapper airPanelMapper) {
//        this.airPanelPoService = new BasePService(airPanelMapper);
//    }
//}