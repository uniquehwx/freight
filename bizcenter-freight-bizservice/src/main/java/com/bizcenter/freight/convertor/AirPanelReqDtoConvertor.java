package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.air.childer.AirPanelEntity;
import com.bizcenter.freight.dto.req.AirPanelReqDto;
import org.mapstruct.Mapper;
/**
 * 板型表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirPanelReqDtoConvertor implements IConvertor<AirPanelReqDto,AirPanelEntity,String> {

}








