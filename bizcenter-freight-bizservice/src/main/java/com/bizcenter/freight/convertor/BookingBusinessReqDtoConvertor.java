package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.BookingBusinessEntity;
import com.bizcenter.freight.dto.req.BookingBusinessReqDto;
import org.mapstruct.Mapper;
/**
 * 订舱服务表 
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class BookingBusinessReqDtoConvertor implements IConvertor<BookingBusinessReqDto,BookingBusinessEntity,String> {

}








