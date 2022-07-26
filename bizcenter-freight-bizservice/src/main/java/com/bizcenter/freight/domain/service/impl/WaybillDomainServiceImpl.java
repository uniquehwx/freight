//package com.bizcenter.freight.domain.service.impl;
//
//import com.bizcenter.freight.convertor.WaybillReqDtoConvertor;
//import com.bizcenter.freight.convertor.WaybillResDtoConvertor;
//import com.bitsun.core.common.persistence.BasePService;
//import com.bitsun.core.common.persistence.IPService;
//import com.bizcenter.freight.infrastructure.persistence.dao.WaybillMapper;
//import com.bizcenter.freight.infrastructure.persistence.po.WaybillPo;
//import com.bizcenter.freight.domain.service.WaybillDomainService;
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
//@Service("waybillDomainService")
//public class WaybillDomainServiceImpl implements WaybillDomainService{
//
//    @Autowired
//    private WaybillReqDtoConvertor waybillReqDtoConvertor;
//
//    @Autowired
//    private WaybillResDtoConvertor waybillResDtoConvertor;
//
//    private IPService<WaybillPo> waybillPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public WaybillDomainServiceImpl(WaybillMapper waybillMapper) {
//        this.waybillPoService = new BasePService(waybillMapper);
//    }
//}