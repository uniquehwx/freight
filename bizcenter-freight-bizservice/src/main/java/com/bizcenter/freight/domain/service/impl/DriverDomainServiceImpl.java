package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.DriverReqDtoConvertor;
import com.bizcenter.freight.convertor.DriverResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.DriverMapper;
import com.bizcenter.freight.infrastructure.persistence.po.DriverPo;
import com.bizcenter.freight.domain.service.DriverDomainService;
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
@Service("driverDomainService")
public class DriverDomainServiceImpl implements DriverDomainService{

    @Autowired
    private DriverReqDtoConvertor driverReqDtoConvertor;

    @Autowired
    private DriverResDtoConvertor driverResDtoConvertor;

    private IPService<DriverPo> driverPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public DriverDomainServiceImpl(DriverMapper driverMapper) {
        this.driverPoService = new BasePService(driverMapper);
    }
}