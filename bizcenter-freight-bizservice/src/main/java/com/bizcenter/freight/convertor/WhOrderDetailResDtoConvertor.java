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
public abstract class WhOrderDetailResDtoConvertor implements IConvertor<WhOrderDetailResDto,WhOrderDetailEntity,WhOrderDetailPo> {

    public  Pager<WhOrderDetailResDto> convertPoPager2ResDtoPager(Pager<WhOrderDetailPo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<WhOrderDetailResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








