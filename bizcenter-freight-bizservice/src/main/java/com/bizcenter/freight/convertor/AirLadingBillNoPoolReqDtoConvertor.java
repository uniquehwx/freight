package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.AirLadingBillNoPoolEntity;
import com.bizcenter.freight.dto.req.AirLadingBillNoPoolReqDto;
import org.mapstruct.Mapper;
/**
 * 提单号资源池表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirLadingBillNoPoolReqDtoConvertor implements IConvertor<AirLadingBillNoPoolReqDto,AirLadingBillNoPoolEntity,String> {

}








