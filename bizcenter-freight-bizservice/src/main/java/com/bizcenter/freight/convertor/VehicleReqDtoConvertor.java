package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.VehicleEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.VehicleReqDto;
import com.bizcenter.freight.dto.res.VehicleResDto;
import com.bizcenter.freight.infrastructure.persistence.po.VehiclePo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 车辆表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class VehicleReqDtoConvertor implements IConvertor<VehicleReqDto,VehicleEntity,VehiclePo> {

}








