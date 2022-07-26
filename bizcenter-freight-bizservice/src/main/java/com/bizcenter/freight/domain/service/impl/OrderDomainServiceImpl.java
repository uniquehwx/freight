package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.OrderReqDtoConvertor;
import com.bizcenter.freight.convertor.OrderResDtoConvertor;
import com.bizcenter.freight.domain.model.OrderEntity;
import com.bizcenter.freight.domain.repository.OrderRepository;
import com.bizcenter.freight.domain.service.order.OrderDomainService;
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
@Service("orderDomainService")
public class OrderDomainServiceImpl implements OrderDomainService{

    @Autowired
    private OrderReqDtoConvertor orderReqDtoConvertor;

    @Autowired
    private OrderResDtoConvertor orderResDtoConvertor;


    @Autowired
    private OrderRepository orderRepository;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public OrderDomainServiceImpl(OrderMapper orderMapper) {
//        this.orderPoService = new BasePService(orderMapper);
//    }

    @Override
    public void addOrder(OrderEntity orderEntity) {
        orderEntity.saveSelf(orderRepository);

    }

    @Override
    public void update() {

    }
}