package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.DriverVehicleEntity;
import com.bizcenter.freight.dto.req.DriverVehicleReqDto;
import org.mapstruct.Mapper;
/**
 * 司机车辆关联关系表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class DriverVehicleReqDtoConvertor implements IConvertor<DriverVehicleReqDto,DriverVehicleEntity,String> {

}








