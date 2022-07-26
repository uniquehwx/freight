package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.VehicleEntity;
import com.bizcenter.freight.dto.req.VehicleReqDto;
import org.mapstruct.Mapper;
/**
 * 车辆表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class VehicleReqDtoConvertor implements IConvertor<VehicleReqDto,VehicleEntity,String> {

}








