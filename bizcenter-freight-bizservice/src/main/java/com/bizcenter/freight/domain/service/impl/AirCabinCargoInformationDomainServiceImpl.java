package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.AirCabinCargoInformationReqDtoConvertor;
import com.bizcenter.freight.convertor.AirCabinCargoInformationResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.AirCabinCargoInformationMapper;
import com.bizcenter.freight.infrastructure.persistence.po.AirCabinCargoInformationPo;
import com.bizcenter.freight.domain.service.AirCabinCargoInformationDomainService;
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
@Service("airCabinCargoInformationDomainService")
public class AirCabinCargoInformationDomainServiceImpl implements AirCabinCargoInformationDomainService{

    @Autowired
    private AirCabinCargoInformationReqDtoConvertor airCabinCargoInformationReqDtoConvertor;

    @Autowired
    private AirCabinCargoInformationResDtoConvertor airCabinCargoInformationResDtoConvertor;

    private IPService<AirCabinCargoInformationPo> airCabinCargoInformationPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AirCabinCargoInformationDomainServiceImpl(AirCabinCargoInformationMapper airCabinCargoInformationMapper) {
        this.airCabinCargoInformationPoService = new BasePService(airCabinCargoInformationMapper);
    }
}