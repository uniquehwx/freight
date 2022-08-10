package com.bizcenter.freight.infrastructure.persistence.convertor.order;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.order.childer.OrderServeExtendEntity;
import com.bizcenter.freight.infrastructure.persistence.convertor.IEntityConverter;
import com.bizcenter.freight.infrastructure.persistence.po.OrderServeExtendPo;
import org.mapstruct.Mapper;

/**
 *
 * @author: hwx
 */

@Mapper(componentModel="spring")
public abstract class OrderServeEntityConvertor implements IEntityConverter<OrderServeExtendPo, OrderServeExtendEntity> {

        public Pager<OrderServeExtendEntity> convertPoPager2EntityPager(Pager<OrderServeExtendPo> poPager) {
            if (poPager == null) {
                return null;
            }
            Pager<OrderServeExtendEntity> entityPager = new Pager();
            entityPager.setTotalCount(poPager.getTotalCount());
            entityPager.setPageSize(poPager.getPageSize());
            entityPager.setTotalPage(poPager.getTotalPage());
            entityPager.setCurrentPage(poPager.getCurrentPage());
            entityPager.setList(poList2EntityList(poPager.getList()));
            return entityPager;
        }
}








