package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.WhOrderDetailEntity;
import com.bizcenter.freight.dto.req.WhOrderDetailReqDto;
import org.mapstruct.Mapper;
/**
 * 入库明细表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WhOrderDetailReqDtoConvertor implements IConvertor<WhOrderDetailReqDto,WhOrderDetailEntity,String> {

}








