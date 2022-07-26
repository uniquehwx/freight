package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirFlightEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.AirFlightReqDto;
import com.bizcenter.freight.dto.res.AirFlightResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirFlightPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 航班表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirFlightReqDtoConvertor implements IConvertor<AirFlightReqDto,AirFlightEntity,AirFlightPo> {

}








