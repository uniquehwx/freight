package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.DriverVehicleEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.DriverVehicleReqDto;
import com.bizcenter.freight.dto.res.DriverVehicleResDto;
import com.bizcenter.freight.infrastructure.persistence.po.DriverVehiclePo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 司机车辆关联关系表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class DriverVehicleResDtoConvertor implements IConvertor<DriverVehicleResDto,DriverVehicleEntity,DriverVehiclePo> {

    public  Pager<DriverVehicleResDto> convertPoPager2ResDtoPager(Pager<DriverVehiclePo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<DriverVehicleResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








