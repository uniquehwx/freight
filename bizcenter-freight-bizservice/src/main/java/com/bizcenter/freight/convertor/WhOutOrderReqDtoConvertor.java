package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.WhOutOrderEntity;
import com.bizcenter.freight.dto.req.WhOutOrderReqDto;
import org.mapstruct.Mapper;
/**
 * 出库表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WhOutOrderReqDtoConvertor implements IConvertor<WhOutOrderReqDto,WhOutOrderEntity,String> {

}








