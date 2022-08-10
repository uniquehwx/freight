package com.bizcenter.freight.infrastructure.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.framwork.domain.model.Entity;
import com.bizcenter.freight.domain.model.air.AirCompanyEntity;
import com.bizcenter.freight.domain.model.order.OrderEntity;
import com.bizcenter.freight.domain.model.order.childer.OrderServeExtendEntity;
import com.bizcenter.freight.domain.repository.AirCompanyRepository;
import com.bizcenter.freight.domain.repository.OrderRepository;
import com.bizcenter.freight.infrastructure.persistence.convertor.order.OrderEntityConvertor;
import com.bizcenter.freight.infrastructure.persistence.convertor.order.OrderServeEntityConvertor;
import com.bizcenter.freight.infrastructure.persistence.dao.AirCompanyMapper;
import com.bizcenter.freight.infrastructure.persistence.dao.OrderMapper;
import com.bizcenter.freight.infrastructure.persistence.dao.OrderServerExtendMapper;
import com.bizcenter.freight.infrastructure.persistence.po.AirCompanyPo;
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
public class AirCompanyRepositoryImpl implements AirCompanyRepository {

//    @Autowired
//    private OrderEntityConvertor orderEntityConvertor;
//
//    @Autowired
//    private OrderServeEntityConvertor serveEntityConvertor;

    private IPService<AirCompanyPo> airCompanyPoIPService;

//    private IPService<OrderServeExtendPo> extendPoIPService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AirCompanyRepositoryImpl(AirCompanyMapper airCompanyMapper) {
        this.airCompanyPoIPService = new BasePService(airCompanyMapper);
//        this.extendPoIPService = new BasePService(orderServerExtendMapper);
    }


    @Override
    public int deleteByPrimaryKey(Long aLong) {
        return 0;
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
    public Entity selectByPrimaryKey(Long aLong) {
        return null;
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

    @Override
    public Pager<AirCompanyEntity> doPager(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<AirCompanyEntity> batchInsert(List<AirCompanyEntity> list) {
        return null;
    }

    @Override
    public boolean deleteByIds(String ids) {
        return false;
    }

    @Override
    public boolean updateSingle(AirCompanyEntity airCompanyEntity) {
        return false;
    }
}
