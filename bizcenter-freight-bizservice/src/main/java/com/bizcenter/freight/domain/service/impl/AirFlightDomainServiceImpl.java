package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.AirFlightReqDtoConvertor;
import com.bizcenter.freight.convertor.AirFlightResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.AirFlightMapper;
import com.bizcenter.freight.infrastructure.persistence.po.AirFlightPo;
import com.bizcenter.freight.domain.service.AirFlightDomainService;
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
@Service("airFlightDomainService")
public class AirFlightDomainServiceImpl implements AirFlightDomainService{

    @Autowired
    private AirFlightReqDtoConvertor airFlightReqDtoConvertor;

    @Autowired
    private AirFlightResDtoConvertor airFlightResDtoConvertor;

    private IPService<AirFlightPo> airFlightPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AirFlightDomainServiceImpl(AirFlightMapper airFlightMapper) {
        this.airFlightPoService = new BasePService(airFlightMapper);
    }
}