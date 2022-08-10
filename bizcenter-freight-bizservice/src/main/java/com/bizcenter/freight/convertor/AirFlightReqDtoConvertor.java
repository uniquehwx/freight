package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.air.AirFlightEntity;
import com.bizcenter.freight.dto.req.AirFlightReqDto;
import org.mapstruct.Mapper;
/**
 * 航班表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirFlightReqDtoConvertor implements IConvertor<AirFlightReqDto,AirFlightEntity,String> {

}








