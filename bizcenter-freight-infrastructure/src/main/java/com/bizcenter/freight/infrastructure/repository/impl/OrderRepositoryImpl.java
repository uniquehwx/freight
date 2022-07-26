package com.bizcenter.freight.infrastructure.repository.impl;

import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bitsun.core.framwork.domain.model.Entity;
import com.bizcenter.freight.domain.repository.OrderRepository;
import com.bizcenter.freight.infrastructure.persistence.dao.OrderMapper;
import com.bizcenter.freight.infrastructure.persistence.po.OrderPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @author: hwx
 * @since: 1.0.0
 */
@Slf4j
//@Service("orderRepositoryImpl")
@Component("orderRepositoryImpl")
@Transactional(rollbackFor = Exception.class)
public class OrderRepositoryImpl implements OrderRepository{

    private IPService<OrderPo> orderPoIPService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public OrderRepositoryImpl(OrderMapper orderMapper) {
        this.orderPoIPService = new BasePService(orderMapper);
    }


    @Override
    public int deleteByPrimaryKey(Long id) {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return orderPoService.removeByIds(idLongList);

        return  orderPoIPService.removeById(id)==true?1:0;
    }

    @Override
    public Entity insert(Entity entity) {
        return null;
    }

    @Override
    public Entity insertSelective(Entity entity) {
        return null;
    }

    @Override
    public Entity selectByPrimaryKey(Long primaryKey) {
        return null;
    }

    @Override
    public int deleteByPrimaryKeys(String ids) {
        return 0;
    }

    @Override
    public boolean updateProps(Long id, Entity entity) {
        return false;
    }

    @Override
    public boolean updateAllProps(Long id, Entity entity) {
        return false;
    }

    @Override
    public boolean updateProps(Long id, Map params) {
        return false;
    }

    @Override
    public Entity selectOne(Map params) {
        return null;
    }
}
