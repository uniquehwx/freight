package com.bizcenter.freight.domain.service.order;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.order.OrderEntity;

import java.util.Map;

/**
 * @Author: Felix Woo （junfengwstar@gmail.com）
 * @Date: 2019-09-20 19:40
 * @Version: 1.0
 * @Description:
 */
public interface OrderDomainService{

    /**
     * 创建订单信息
     */
    OrderEntity  addOrder(OrderEntity orderEntity);

    /**
     * 修改订单信息
     */
    boolean update(OrderEntity orderEntity);

    /**
     * 查看订单详情信息
     * @param id
     * @return
     */
    OrderEntity selectOne(Long id) ;

    Pager<OrderEntity> doPager(Map<String, Object> params);
}