package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.air.AirCompanyEntity;
import com.bizcenter.freight.dto.res.AirCompanyResDto;
import org.mapstruct.Mapper;
/**
 * 航司表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirCompanyResDtoConvertor implements IConvertor<AirCompanyResDto,AirCompanyEntity,String> {

    public  Pager<AirCompanyResDto> convertEntityPager2ResDtoPager(Pager<AirCompanyEntity> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<AirCompanyResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(entityList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








