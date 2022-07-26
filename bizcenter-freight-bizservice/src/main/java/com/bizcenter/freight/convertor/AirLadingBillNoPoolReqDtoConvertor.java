package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirLadingBillNoPoolEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.AirLadingBillNoPoolReqDto;
import com.bizcenter.freight.dto.res.AirLadingBillNoPoolResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirLadingBillNoPoolPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 提单号资源池表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirLadingBillNoPoolReqDtoConvertor implements IConvertor<AirLadingBillNoPoolReqDto,AirLadingBillNoPoolEntity,AirLadingBillNoPoolPo> {

}








