package com.bizcenter.freight.domain.repository;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.framwork.domain.repository.IRepository;
import com.bizcenter.freight.domain.model.order.OrderEntity;

import java.util.Map;

/**
 * 订单 service 接口
 * @author: hwx
 * @email: 745011692@qq.com
 */
public interface OrderRepository extends IRepository{


    boolean updateOrder(OrderEntity orderEntity);

    Pager<OrderEntity> doPager(Map<String, Object> params);
}