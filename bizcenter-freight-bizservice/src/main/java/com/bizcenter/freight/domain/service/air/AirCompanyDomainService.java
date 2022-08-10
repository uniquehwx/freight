package com.bizcenter.freight.domain.service.air;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.air.AirCompanyEntity;

import java.util.List;
import java.util.Map;

/**
 * @Author: Felix Woo （junfengwstar@gmail.com）
 * @Date: 2019-09-20 19:40
 * @Version: 1.0
 * @Description:
 */
public interface AirCompanyDomainService{

    AirCompanyEntity save(AirCompanyEntity req);


    List<AirCompanyEntity> addList(List<AirCompanyEntity> entityList) ;

    boolean deleteByIds(String ids) ;

    Pager<AirCompanyEntity> doPager(Map<String, Object> params) ;

    AirCompanyEntity selectOne(Long id);

    boolean updateProps(AirCompanyEntity req);
}