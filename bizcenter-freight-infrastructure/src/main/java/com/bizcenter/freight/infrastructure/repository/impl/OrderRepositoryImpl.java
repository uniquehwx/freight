package com.bizcenter.freight.infrastructure.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.framwork.domain.model.Entity;
import com.bizcenter.freight.domain.model.order.OrderEntity;
import com.bizcenter.freight.domain.model.order.childer.OrderServeExtendEntity;
import com.bizcenter.freight.domain.repository.OrderRepository;
import com.bizcenter.freight.infrastructure.persistence.convertor.order.OrderEntityConvertor;
import com.bizcenter.freight.infrastructure.persistence.convertor.order.OrderServeEntityConvertor;
import com.bizcenter.freight.infrastructure.persistence.dao.OrderMapper;
import com.bizcenter.freight.infrastructure.persistence.dao.OrderServerExtendMapper;
import com.bizcenter.freight.infrastructure.persistence.po.OrderPo;
import com.bizcenter.freight.infrastructure.persistence.po.OrderServeExtendPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author: hwx
 * @since: 1.0.0
 */
@Slf4j
@Component("orderRepositoryImpl")
@Transactional(rollbackFor = Exception.class)
public class OrderRepositoryImpl implements OrderRepository{

    @Autowired
    private OrderEntityConvertor orderEntityConvertor;

    @Autowired
    private OrderServeEntityConvertor serveEntityConvertor;

    private IPService<OrderPo> orderPoIPService;

    private IPService<OrderServeExtendPo> extendPoIPService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public OrderRepositoryImpl(OrderMapper orderMapper, OrderServerExtendMapper orderServerExtendMapper) {
        this.orderPoIPService = new BasePService(orderMapper);
        this.extendPoIPService = new BasePService(orderServerExtendMapper);
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
        if (Objects.isNull(entity)){
            return null;
        }
        OrderEntity orderEntity = (OrderEntity) entity;
        List<OrderServeExtendEntity> extendServiceEntity = orderEntity.getExtendService();
        OrderPo orderPo = orderEntityConvertor.entity2Po(orderEntity);
        orderPoIPService.save(orderPo);
        OrderEntity res = orderEntityConvertor.po2Entity(orderPo);

        // 进行转换处理即可
        if (CollectionUtils.isNotEmpty(extendServiceEntity)){
            List<OrderServeExtendPo> orderServeExtendPos = serveEntityConvertor.entityList2PoList(extendServiceEntity);
            extendPoIPService.saveBatch(orderServeExtendPos);
            List<OrderServeExtendEntity> orderServeExtendEntities = serveEntityConvertor.poList2EntityList(orderServeExtendPos);
            res.setExtendService(orderServeExtendEntities);
        }

        return res;
    }

    @Override
    public Entity insertSelective(Entity entity) {
        return null;
    }

    @Override
    public Entity selectByPrimaryKey(Long primaryKey) {
//        primaryKey
        OrderPo orderPo = orderPoIPService.getById(primaryKey);
        OrderEntity res = orderEntityConvertor.po2Entity(orderPo);
        if (Objects.nonNull(res)&& StringUtils.isNotBlank(res.getOrderNo())){
            String orderNo = res.getOrderNo();
            QueryWrapper<OrderServeExtendPo> ew = new QueryWrapper();
            ew.lambda().eq(OrderServeExtendPo::getExternalOrder,orderNo);
//            MapUtils.build("qp--eq",orderNo);
            List<OrderServeExtendPo> poList = extendPoIPService.list(ew);
            List<OrderServeExtendEntity> orderServeExtendEntities = serveEntityConvertor.poList2EntityList(poList);
            res.setExtendService(orderServeExtendEntities);
        }
        return res;
    }

    @Override
    public boolean updateOrder(OrderEntity entity) {
//        OrderEntity orderEntity = (OrderEntity) entity;
        OrderPo orderPo = orderEntityConvertor.entity2Po(entity);

        return   orderPoIPService.updateById(orderPo);
    }

    @Override
    public Pager doPager(Map params) {
        return orderPoIPService.queryPage(params,OrderPo.class);
    }

    @Override
    public int deleteByPrimaryKeys(String ids) {
        return 0;
    }



    @Override
    public boolean updateProps(Long id, Entity entity) {
//       entity
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
