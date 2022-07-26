package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirPanelEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.AirPanelReqDto;
import com.bizcenter.freight.dto.res.AirPanelResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirPanelPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 板型表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirPanelResDtoConvertor implements IConvertor<AirPanelResDto,AirPanelEntity,AirPanelPo> {

    public  Pager<AirPanelResDto> convertPoPager2ResDtoPager(Pager<AirPanelPo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<AirPanelResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








