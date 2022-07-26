package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOutOrderEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.WhOutOrderReqDto;
import com.bizcenter.freight.dto.res.WhOutOrderResDto;
import com.bizcenter.freight.infrastructure.persistence.po.WhOutOrderPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 出库表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WhOutOrderReqDtoConvertor implements IConvertor<WhOutOrderReqDto,WhOutOrderEntity,WhOutOrderPo> {

}








