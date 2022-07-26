package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.SecurityOrderEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.SecurityOrderReqDto;
import com.bizcenter.freight.dto.res.SecurityOrderResDto;
import com.bizcenter.freight.infrastructure.persistence.po.SecurityOrderPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 安检订单表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class SecurityOrderReqDtoConvertor implements IConvertor<SecurityOrderReqDto,SecurityOrderEntity,SecurityOrderPo> {

}








