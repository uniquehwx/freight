package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.OrderEntity;
import com.bizcenter.freight.dto.req.OrderReqDto;
import org.mapstruct.Mapper;
/**
 * 订单
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class OrderReqDtoConvertor implements IConvertor<OrderReqDto,OrderEntity,String> {

}








