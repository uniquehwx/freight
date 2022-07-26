package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.AirCabinCargoInformationEntity;
import com.bizcenter.freight.dto.res.AirCabinCargoInformationResDto;
import org.mapstruct.Mapper;
/**
 * 舱位产品信息表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirCabinCargoInformationResDtoConvertor implements IConvertor<AirCabinCargoInformationResDto,AirCabinCargoInformationEntity,String> {

    public  Pager<AirCabinCargoInformationResDto> convertPoPager2ResDtoPager(Pager<String> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<AirCabinCargoInformationResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








