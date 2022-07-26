package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.WhOrderEntity;
import com.bizcenter.freight.dto.req.WhOrderReqDto;
import org.mapstruct.Mapper;
/**
 * 仓库订单(入库单)表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WhOrderReqDtoConvertor implements IConvertor<WhOrderReqDto,WhOrderEntity,String> {

}








