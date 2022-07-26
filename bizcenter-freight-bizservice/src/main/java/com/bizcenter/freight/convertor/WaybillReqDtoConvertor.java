package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.WaybillEntity;
import com.bizcenter.freight.dto.req.WaybillReqDto;
import org.mapstruct.Mapper;
/**
 * 派车表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WaybillReqDtoConvertor implements IConvertor<WaybillReqDto,WaybillEntity,String> {

}








