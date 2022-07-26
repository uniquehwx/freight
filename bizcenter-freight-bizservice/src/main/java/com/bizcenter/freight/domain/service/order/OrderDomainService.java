package com.bizcenter.freight.domain.service.order;

import com.bizcenter.freight.domain.model.OrderEntity;

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
    void addOrder(OrderEntity orderEntity);

    /**
     * 修改订单信息
     */
    void update();


}