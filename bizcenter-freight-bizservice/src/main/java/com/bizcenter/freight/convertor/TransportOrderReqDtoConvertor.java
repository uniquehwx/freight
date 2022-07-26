package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.TransportOrderEntity;
import com.bizcenter.freight.dto.req.TransportOrderReqDto;
import org.mapstruct.Mapper;
/**
 * 陆运订单表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class TransportOrderReqDtoConvertor implements IConvertor<TransportOrderReqDto,TransportOrderEntity,String> {

}








