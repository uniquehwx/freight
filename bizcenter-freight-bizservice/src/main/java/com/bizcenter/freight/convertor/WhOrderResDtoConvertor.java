package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOrderEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.WhOrderReqDto;
import com.bizcenter.freight.dto.res.WhOrderResDto;
import com.bizcenter.freight.infrastructure.persistence.po.WhOrderPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 仓库订单(入库单)表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WhOrderResDtoConvertor implements IConvertor<WhOrderResDto,WhOrderEntity,WhOrderPo> {

    public  Pager<WhOrderResDto> convertPoPager2ResDtoPager(Pager<WhOrderPo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<WhOrderResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








