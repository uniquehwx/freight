//package com.bizcenter.freight.domain.service.impl;
//
//import com.bizcenter.freight.convertor.DriverVehicleReqDtoConvertor;
//import com.bizcenter.freight.convertor.DriverVehicleResDtoConvertor;
//import com.bitsun.core.common.persistence.BasePService;
//import com.bitsun.core.common.persistence.IPService;
//import com.bizcenter.freight.infrastructure.persistence.dao.DriverVehicleMapper;
//import com.bizcenter.freight.infrastructure.persistence.po.DriverVehiclePo;
//import com.bizcenter.freight.domain.service.DriverVehicleDomainService;
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
//@Service("driverVehicleDomainService")
//public class DriverVehicleDomainServiceImpl implements DriverVehicleDomainService{
//
//    @Autowired
//    private DriverVehicleReqDtoConvertor driverVehicleReqDtoConvertor;
//
//    @Autowired
//    private DriverVehicleResDtoConvertor driverVehicleResDtoConvertor;
//
//    private IPService<DriverVehiclePo> driverVehiclePoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public DriverVehicleDomainServiceImpl(DriverVehicleMapper driverVehicleMapper) {
//        this.driverVehiclePoService = new BasePService(driverVehicleMapper);
//    }
//}