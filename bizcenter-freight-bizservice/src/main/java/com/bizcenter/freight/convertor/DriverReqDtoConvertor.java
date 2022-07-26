package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.DriverEntity;
import com.bizcenter.freight.dto.req.DriverReqDto;
import org.mapstruct.Mapper;
/**
 * 司机表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class DriverReqDtoConvertor implements IConvertor<DriverReqDto,DriverEntity,String> {

}








