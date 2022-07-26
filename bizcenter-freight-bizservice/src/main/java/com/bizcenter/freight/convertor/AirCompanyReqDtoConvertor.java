package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirCompanyEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.AirCompanyReqDto;
import com.bizcenter.freight.dto.res.AirCompanyResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirCompanyPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 航司表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirCompanyReqDtoConvertor implements IConvertor<AirCompanyReqDto,AirCompanyEntity,AirCompanyPo> {

}








