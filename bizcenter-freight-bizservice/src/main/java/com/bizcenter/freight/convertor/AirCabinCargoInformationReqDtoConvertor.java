package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirCabinCargoInformationEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.AirCabinCargoInformationReqDto;
import com.bizcenter.freight.dto.res.AirCabinCargoInformationResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirCabinCargoInformationPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 舱位产品信息表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirCabinCargoInformationReqDtoConvertor implements IConvertor<AirCabinCargoInformationReqDto,AirCabinCargoInformationEntity,AirCabinCargoInformationPo> {

}








