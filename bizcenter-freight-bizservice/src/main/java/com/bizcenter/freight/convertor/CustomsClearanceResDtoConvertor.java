package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.CustomsClearanceEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.CustomsClearanceReqDto;
import com.bizcenter.freight.dto.res.CustomsClearanceResDto;
import com.bizcenter.freight.infrastructure.persistence.po.CustomsClearancePo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 报关表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class CustomsClearanceResDtoConvertor implements IConvertor<CustomsClearanceResDto,CustomsClearanceEntity,CustomsClearancePo> {

    public  Pager<CustomsClearanceResDto> convertPoPager2ResDtoPager(Pager<CustomsClearancePo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<CustomsClearanceResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








