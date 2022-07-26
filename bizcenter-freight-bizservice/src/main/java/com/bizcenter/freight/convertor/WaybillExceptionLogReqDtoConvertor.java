package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.WaybillExceptionLogEntity;
import com.bizcenter.freight.dto.req.WaybillExceptionLogReqDto;
import org.mapstruct.Mapper;
/**
 * 运单异常信息记录表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WaybillExceptionLogReqDtoConvertor implements IConvertor<WaybillExceptionLogReqDto,WaybillExceptionLogEntity,String> {

}








