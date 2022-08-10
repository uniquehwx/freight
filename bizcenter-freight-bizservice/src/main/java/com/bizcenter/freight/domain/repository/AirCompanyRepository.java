package com.bizcenter.freight.domain.repository;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.framwork.domain.repository.IRepository;
import com.bizcenter.freight.domain.model.air.AirCompanyEntity;
import com.bizcenter.freight.domain.model.order.OrderEntity;

import java.util.List;
import java.util.Map;

/**
 * 航司表 service 接口
 * @author: hwx
 * @email: 745011692@qq.com
 */
public interface AirCompanyRepository extends IRepository{


    Pager<AirCompanyEntity> doPager(Map<String, Object> params) ;

    List<AirCompanyEntity> batchInsert(List<AirCompanyEntity> list);

    boolean deleteByIds(String ids);

    boolean updateSingle(AirCompanyEntity airCompanyEntity);
}