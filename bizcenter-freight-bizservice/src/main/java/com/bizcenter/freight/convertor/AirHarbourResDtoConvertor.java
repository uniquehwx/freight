package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.AirHarbourEntity;
import com.bizcenter.freight.dto.res.AirHarbourResDto;
import org.mapstruct.Mapper;
/**
 * 港口表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirHarbourResDtoConvertor implements IConvertor<AirHarbourResDto,AirHarbourEntity,String> {

    public  Pager<AirHarbourResDto> convertPoPager2ResDtoPager(Pager<String> poPager) {
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








