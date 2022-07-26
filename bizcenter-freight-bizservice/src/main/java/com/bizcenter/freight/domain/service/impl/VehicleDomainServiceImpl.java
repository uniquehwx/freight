package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.VehicleReqDtoConvertor;
import com.bizcenter.freight.convertor.VehicleResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.VehicleMapper;
import com.bizcenter.freight.infrastructure.persistence.po.VehiclePo;
import com.bizcenter.freight.domain.service.VehicleDomainService;
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
@Service("vehicleDomainService")
public class VehicleDomainServiceImpl implements VehicleDomainService{

    @Autowired
    private VehicleReqDtoConvertor vehicleReqDtoConvertor;

    @Autowired
    private VehicleResDtoConvertor vehicleResDtoConvertor;

    private IPService<VehiclePo> vehiclePoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public VehicleDomainServiceImpl(VehicleMapper vehicleMapper) {
        this.vehiclePoService = new BasePService(vehicleMapper);
    }
}