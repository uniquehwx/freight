package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.AirLadingBillNoPoolReqDtoConvertor;
import com.bizcenter.freight.convertor.AirLadingBillNoPoolResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.AirLadingBillNoPoolMapper;
import com.bizcenter.freight.infrastructure.persistence.po.AirLadingBillNoPoolPo;
import com.bizcenter.freight.domain.service.AirLadingBillNoPoolDomainService;
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
@Service("airLadingBillNoPoolDomainService")
public class AirLadingBillNoPoolDomainServiceImpl implements AirLadingBillNoPoolDomainService{

    @Autowired
    private AirLadingBillNoPoolReqDtoConvertor airLadingBillNoPoolReqDtoConvertor;

    @Autowired
    private AirLadingBillNoPoolResDtoConvertor airLadingBillNoPoolResDtoConvertor;

    private IPService<AirLadingBillNoPoolPo> airLadingBillNoPoolPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AirLadingBillNoPoolDomainServiceImpl(AirLadingBillNoPoolMapper airLadingBillNoPoolMapper) {
        this.airLadingBillNoPoolPoService = new BasePService(airLadingBillNoPoolMapper);
    }
}