package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.AirCabinCargoInformationEntity;
import com.bizcenter.freight.dto.req.AirCabinCargoInformationReqDto;
import org.mapstruct.Mapper;
/**
 * 舱位产品信息表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirCabinCargoInformationReqDtoConvertor implements IConvertor<AirCabinCargoInformationReqDto,AirCabinCargoInformationEntity,String> {

}








