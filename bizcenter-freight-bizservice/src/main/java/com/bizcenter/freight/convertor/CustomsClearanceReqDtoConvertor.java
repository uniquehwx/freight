package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.CustomsClearanceEntity;
import com.bizcenter.freight.dto.req.CustomsClearanceReqDto;
import org.mapstruct.Mapper;
/**
 * 报关表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class CustomsClearanceReqDtoConvertor implements IConvertor<CustomsClearanceReqDto,CustomsClearanceEntity,String> {

}








