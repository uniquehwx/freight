package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WaybillEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.WaybillReqDto;
import com.bizcenter.freight.dto.res.WaybillResDto;
import com.bizcenter.freight.infrastructure.persistence.po.WaybillPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 派车表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WaybillReqDtoConvertor implements IConvertor<WaybillReqDto,WaybillEntity,WaybillPo> {

}








