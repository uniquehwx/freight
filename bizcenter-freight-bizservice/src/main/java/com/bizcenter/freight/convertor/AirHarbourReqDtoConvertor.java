package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.AirHarbourEntity;
import com.bizcenter.freight.dto.req.AirHarbourReqDto;
import org.mapstruct.Mapper;
/**
 * 港口表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirHarbourReqDtoConvertor implements IConvertor<AirHarbourReqDto,AirHarbourEntity,String> {

}








