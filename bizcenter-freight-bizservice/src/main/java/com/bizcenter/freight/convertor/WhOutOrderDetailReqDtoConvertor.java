package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.WhOutOrderDetailEntity;
import com.bizcenter.freight.dto.req.WhOutOrderDetailReqDto;
import org.mapstruct.Mapper;
/**
 * 出库明细表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WhOutOrderDetailReqDtoConvertor implements IConvertor<WhOutOrderDetailReqDto,WhOutOrderDetailEntity,String> {

}








