package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.DriverEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.DriverReqDto;
import com.bizcenter.freight.dto.res.DriverResDto;
import com.bizcenter.freight.infrastructure.persistence.po.DriverPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 司机表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class DriverResDtoConvertor implements IConvertor<DriverResDto,DriverEntity,DriverPo> {

    public  Pager<DriverResDto> convertPoPager2ResDtoPager(Pager<DriverPo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<DriverResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








