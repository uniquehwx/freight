package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.AirHarbourReqDtoConvertor;
import com.bizcenter.freight.convertor.AirHarbourResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.AirHarbourMapper;
import com.bizcenter.freight.infrastructure.persistence.po.AirHarbourPo;
import com.bizcenter.freight.domain.service.AirHarbourDomainService;
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
@Service("airHarbourDomainService")
public class AirHarbourDomainServiceImpl implements AirHarbourDomainService{

    @Autowired
    private AirHarbourReqDtoConvertor airHarbourReqDtoConvertor;

    @Autowired
    private AirHarbourResDtoConvertor airHarbourResDtoConvertor;

    private IPService<AirHarbourPo> airHarbourPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AirHarbourDomainServiceImpl(AirHarbourMapper airHarbourMapper) {
        this.airHarbourPoService = new BasePService(airHarbourMapper);
    }
}