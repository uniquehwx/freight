package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOutOrderDetailEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.WhOutOrderDetailReqDto;
import com.bizcenter.freight.dto.res.WhOutOrderDetailResDto;
import com.bizcenter.freight.infrastructure.persistence.po.WhOutOrderDetailPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 出库明细表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WhOutOrderDetailReqDtoConvertor implements IConvertor<WhOutOrderDetailReqDto,WhOutOrderDetailEntity,WhOutOrderDetailPo> {

}








