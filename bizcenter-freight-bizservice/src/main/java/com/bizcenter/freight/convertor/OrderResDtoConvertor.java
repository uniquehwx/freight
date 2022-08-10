package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.order.OrderEntity;
import com.bizcenter.freight.dto.res.OrderResDto;
import org.mapstruct.Mapper;
/**
 * 订单
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class OrderResDtoConvertor implements IConvertor<OrderResDto,OrderEntity,String> {

    public  Pager<OrderResDto> convertEntityPager2ResDtoPager(Pager<OrderEntity> eoPager) {
        if (eoPager == null) {
            return null;
        }

        Pager<OrderResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(eoPager.getTotalCount());
        resDtoPager.setPageSize(eoPager.getPageSize());
        resDtoPager.setTotalPage(eoPager.getTotalPage());
        resDtoPager.setCurrentPage(eoPager.getCurrentPage());
        resDtoPager.setList(entityList2DtoList(eoPager.getList()));

        return resDtoPager;
    }
}








