package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirPanelEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.AirPanelReqDto;
import com.bizcenter.freight.dto.res.AirPanelResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirPanelPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 板型表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirPanelReqDtoConvertor implements IConvertor<AirPanelReqDto,AirPanelEntity,AirPanelPo> {

}








