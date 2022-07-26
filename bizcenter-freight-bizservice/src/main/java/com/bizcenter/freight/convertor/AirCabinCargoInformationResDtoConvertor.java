package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirCabinCargoInformationEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.AirCabinCargoInformationReqDto;
import com.bizcenter.freight.dto.res.AirCabinCargoInformationResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirCabinCargoInformationPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 舱位产品信息表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirCabinCargoInformationResDtoConvertor implements IConvertor<AirCabinCargoInformationResDto,AirCabinCargoInformationEntity,AirCabinCargoInformationPo> {

    public  Pager<AirCabinCargoInformationResDto> convertPoPager2ResDtoPager(Pager<AirCabinCargoInformationPo> poPager) {
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








