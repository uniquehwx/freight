package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.TransportOrderEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.TransportOrderReqDto;
import com.bizcenter.freight.dto.res.TransportOrderResDto;
import com.bizcenter.freight.infrastructure.persistence.po.TransportOrderPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 陆运订单表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class TransportOrderReqDtoConvertor implements IConvertor<TransportOrderReqDto,TransportOrderEntity,TransportOrderPo> {

}








