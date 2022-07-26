package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.DriverEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.DriverReqDto;
import com.bizcenter.freight.dto.res.DriverResDto;
import com.bizcenter.freight.infrastructure.persistence.po.DriverPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 司机表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class DriverReqDtoConvertor implements IConvertor<DriverReqDto,DriverEntity,DriverPo> {

}








