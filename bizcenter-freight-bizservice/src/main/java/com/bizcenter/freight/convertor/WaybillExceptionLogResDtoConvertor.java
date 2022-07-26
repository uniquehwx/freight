package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WaybillExceptionLogEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.WaybillExceptionLogReqDto;
import com.bizcenter.freight.dto.res.WaybillExceptionLogResDto;
import com.bizcenter.freight.infrastructure.persistence.po.WaybillExceptionLogPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 运单异常信息记录表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class WaybillExceptionLogResDtoConvertor implements IConvertor<WaybillExceptionLogResDto,WaybillExceptionLogEntity,WaybillExceptionLogPo> {

    public  Pager<WaybillExceptionLogResDto> convertPoPager2ResDtoPager(Pager<WaybillExceptionLogPo> poPager) {
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








