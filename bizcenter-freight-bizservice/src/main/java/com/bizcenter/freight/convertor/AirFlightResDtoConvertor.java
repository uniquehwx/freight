package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.air.AirFlightEntity;
import com.bizcenter.freight.dto.res.AirFlightResDto;
import org.mapstruct.Mapper;
/**
 * 航班表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirFlightResDtoConvertor implements IConvertor<AirFlightResDto,AirFlightEntity,String> {

    public  Pager<AirFlightResDto> convertPoPager2ResDtoPager(Pager<String> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<AirFlightResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








