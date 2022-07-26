//package com.bizcenter.freight.domain.service.impl;
//
//import com.bizcenter.freight.convertor.WaybillExceptionLogReqDtoConvertor;
//import com.bizcenter.freight.convertor.WaybillExceptionLogResDtoConvertor;
//import com.bitsun.core.common.persistence.BasePService;
//import com.bitsun.core.common.persistence.IPService;
//import com.bizcenter.freight.infrastructure.persistence.dao.WaybillExceptionLogMapper;
//import com.bizcenter.freight.infrastructure.persistence.po.WaybillExceptionLogPo;
//import com.bizcenter.freight.domain.service.WaybillExceptionLogDomainService;
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
//@Service("waybillExceptionLogDomainService")
//public class WaybillExceptionLogDomainServiceImpl implements WaybillExceptionLogDomainService{
//
//    @Autowired
//    private WaybillExceptionLogReqDtoConvertor waybillExceptionLogReqDtoConvertor;
//
//    @Autowired
//    private WaybillExceptionLogResDtoConvertor waybillExceptionLogResDtoConvertor;
//
//    private IPService<WaybillExceptionLogPo> waybillExceptionLogPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public WaybillExceptionLogDomainServiceImpl(WaybillExceptionLogMapper waybillExceptionLogMapper) {
//        this.waybillExceptionLogPoService = new BasePService(waybillExceptionLogMapper);
//    }
//}