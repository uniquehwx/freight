package com.bizcenter.freight.domain.service.impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.util.BizCenterNoWorker;
import com.bizcenter.freight.convertor.OrderReqDtoConvertor;
import com.bizcenter.freight.convertor.OrderResDtoConvertor;
import com.bizcenter.freight.domain.model.order.OrderEntity;
import com.bizcenter.freight.domain.repository.OrderRepository;
import com.bizcenter.freight.domain.service.order.OrderDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @Author: Felix Woo （junfengwstar@gmail.com）
 * @Date: 2019-09-20 19:40
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@Service("orderDomainService")
@Transactional
public class OrderDomainServiceImpl implements OrderDomainService{

    @Autowired
    private OrderReqDtoConvertor orderReqDtoConvertor;

    @Autowired
    private OrderResDtoConvertor orderResDtoConvertor;


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private  BizCenterNoWorker bizCenterNoWorker;

    @Value("${air.order.bizCode:air}")
    private String airOrderBizCode;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public OrderDomainServiceImpl(OrderMapper orderMapper) {
//        this.orderPoService = new BasePService(orderMapper);
//    }

    @Override
    public OrderEntity addOrder(OrderEntity orderEntity) {
        String nextCode = bizCenterNoWorker.nextCode(airOrderBizCode);
        orderEntity.setOrderNo(nextCode);
        if (CollectionUtils.isNotEmpty(orderEntity.getExtendService())){
            orderEntity.getExtendService().forEach(t->t.setExternalOrder(nextCode));
        }
        return orderEntity.insert(orderRepository);
    }

    @Override
    public boolean update(OrderEntity orderEntity) {
        boolean res =  orderEntity.updateSingle(orderRepository);
        return res;
    }


    @Override
    public OrderEntity selectOne(Long id) {
        OrderEntity entity = OrderEntity.selectOne(orderRepository, id);
        return entity;
    }

    @Override
    public Pager<OrderEntity> doPager(Map<String, Object> params) {

        return OrderEntity.doPager(orderRepository,params);
    }
}