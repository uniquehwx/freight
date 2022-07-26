package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.OrderEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.OrderReqDto;
import com.bizcenter.freight.dto.res.OrderResDto;
import com.bizcenter.freight.infrastructure.persistence.po.OrderPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 订单
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class OrderResDtoConvertor implements IConvertor<OrderResDto,OrderEntity,OrderPo> {

    public  Pager<OrderResDto> convertPoPager2ResDtoPager(Pager<OrderPo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<OrderResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








