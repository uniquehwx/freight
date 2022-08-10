package com.bizcenter.freight.domain.service.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.air.AirCompanyEntity;
import com.bizcenter.freight.domain.repository.AirCompanyRepository;
import com.bizcenter.freight.domain.service.air.AirCompanyDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Felix Woo （junfengwstar@gmail.com）
 * @Date: 2019-09-20 19:40
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@Service("airCompanyDomainService")
public class AirCompanyDomainServiceImpl implements AirCompanyDomainService {

    @Autowired
    private AirCompanyRepository airCompanyRepository;

//    @Autowired
//    private BizCenterNoWorker bizCenterNoWorker;

//    @Value("${air.order.bizCode:air}")
//    private String airOrderBizCode;

    @Override
    public AirCompanyEntity save(AirCompanyEntity req) {
        AirCompanyEntity insert = req.insert(airCompanyRepository);
        return insert;
    }

    @Override
    public List<AirCompanyEntity> addList(List<AirCompanyEntity> entityList) {
        List<AirCompanyEntity> companyEntities = AirCompanyEntity.batchInsert(airCompanyRepository, entityList);
        return companyEntities;
    }

    @Override
    public boolean deleteByIds(String ids) {

        return AirCompanyEntity.deleteByIds(airCompanyRepository,ids);
    }

    @Override
    public Pager<AirCompanyEntity> doPager(Map<String, Object> params) {

        return AirCompanyEntity.doPager(airCompanyRepository,params);
    }

    @Override
    public AirCompanyEntity selectOne(Long id) {
        return AirCompanyEntity.selectOne(airCompanyRepository,id);
    }

    @Override
    public boolean updateProps(AirCompanyEntity req) {
        return req.updateProps(airCompanyRepository);
    }

}