package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirHarbourEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.AirHarbourReqDto;
import com.bizcenter.freight.dto.res.AirHarbourResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirHarbourPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 港口表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirHarbourResDtoConvertor implements IConvertor<AirHarbourResDto,AirHarbourEntity,AirHarbourPo> {

    public  Pager<AirHarbourResDto> convertPoPager2ResDtoPager(Pager<AirHarbourPo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<AirHarbourResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








