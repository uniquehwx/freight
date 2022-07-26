package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.SecurityOrderEntity;
import com.bizcenter.freight.dto.req.SecurityOrderReqDto;
import org.mapstruct.Mapper;
/**
 * 安检订单表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class SecurityOrderReqDtoConvertor implements IConvertor<SecurityOrderReqDto,SecurityOrderEntity,String> {

}








