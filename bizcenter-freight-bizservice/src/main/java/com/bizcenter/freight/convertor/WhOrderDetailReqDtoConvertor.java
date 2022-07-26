package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOrderDetailEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.WhOrderDetailReqDto;
import com.bizcenter.freight.dto.res.WhOrderDetailResDto;
import com.bizcenter.freight.infrastructure.persistence.po.WhOrderDetailPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 入库明细表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WhOrderDetailReqDtoConvertor implements IConvertor<WhOrderDetailReqDto,WhOrderDetailEntity,WhOrderDetailPo> {

}








