package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.AirCompanyEntity;
import com.bizcenter.freight.dto.req.AirCompanyReqDto;
import org.mapstruct.Mapper;
/**
 * 航司表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirCompanyReqDtoConvertor implements IConvertor<AirCompanyReqDto,AirCompanyEntity,String> {

}








