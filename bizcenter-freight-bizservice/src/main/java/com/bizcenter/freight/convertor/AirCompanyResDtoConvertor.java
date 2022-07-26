package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirCompanyEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.AirCompanyReqDto;
import com.bizcenter.freight.dto.res.AirCompanyResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirCompanyPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 航司表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirCompanyResDtoConvertor implements IConvertor<AirCompanyResDto,AirCompanyEntity,AirCompanyPo> {

    public  Pager<AirCompanyResDto> convertPoPager2ResDtoPager(Pager<AirCompanyPo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<AirCompanyResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








