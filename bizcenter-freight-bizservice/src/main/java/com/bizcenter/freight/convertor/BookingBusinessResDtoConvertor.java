package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.BookingBusinessEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.BookingBusinessReqDto;
import com.bizcenter.freight.dto.res.BookingBusinessResDto;
import com.bizcenter.freight.infrastructure.persistence.po.BookingBusinessPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 订舱服务表 
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class BookingBusinessResDtoConvertor implements IConvertor<BookingBusinessResDto,BookingBusinessEntity,BookingBusinessPo> {

    public  Pager<BookingBusinessResDto> convertPoPager2ResDtoPager(Pager<BookingBusinessPo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<BookingBusinessResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








