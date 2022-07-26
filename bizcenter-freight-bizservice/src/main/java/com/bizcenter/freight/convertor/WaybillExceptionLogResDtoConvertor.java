package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.WaybillExceptionLogEntity;
import com.bizcenter.freight.dto.res.WaybillExceptionLogResDto;
import org.mapstruct.Mapper;
/**
 * 运单异常信息记录表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WaybillExceptionLogResDtoConvertor implements IConvertor<WaybillExceptionLogResDto,WaybillExceptionLogEntity,String> {

    public  Pager<WaybillExceptionLogResDto> convertPoPager2ResDtoPager(Pager<String> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<WaybillExceptionLogResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








