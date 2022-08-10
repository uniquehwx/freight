package com.bizcenter.freight.infrastructure.persistence.convertor.order;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.order.OrderEntity;
import com.bizcenter.freight.infrastructure.persistence.convertor.IEntityConverter;
import com.bizcenter.freight.infrastructure.persistence.po.OrderPo;
import org.mapstruct.Mapper;

/**
 *
 * @author: hwx
 */

@Mapper(componentModel="spring")
public abstract class OrderEntityConvertor implements IEntityConverter<OrderPo, OrderEntity> {

        public Pager<OrderEntity> convertPoPager2EntityPager(Pager<OrderPo> poPager) {
            if (poPager == null) {
                return null;
            }
            Pager<OrderEntity> entityPager = new Pager();
            entityPager.setTotalCount(poPager.getTotalCount());
            entityPager.setPageSize(poPager.getPageSize());
            entityPager.setTotalPage(poPager.getTotalPage());
            entityPager.setCurrentPage(poPager.getCurrentPage());
            entityPager.setList(poList2EntityList(poPager.getList()));
            return entityPager;
        }
}








