package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.WhOutOrderDetailEntity;
import com.bizcenter.freight.dto.res.WhOutOrderDetailResDto;
import org.mapstruct.Mapper;
/**
 * 出库明细表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WhOutOrderDetailResDtoConvertor implements IConvertor<WhOutOrderDetailResDto,WhOutOrderDetailEntity,String> {

    public  Pager<WhOutOrderDetailResDto> convertPoPager2ResDtoPager(Pager<String> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<WhOutOrderDetailResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








