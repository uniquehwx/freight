package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.PlayBoardOrderEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.PlayBoardOrderReqDto;
import com.bizcenter.freight.dto.res.PlayBoardOrderResDto;
import com.bizcenter.freight.infrastructure.persistence.po.PlayBoardOrderPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 打板订单表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class PlayBoardOrderResDtoConvertor implements IConvertor<PlayBoardOrderResDto,PlayBoardOrderEntity,PlayBoardOrderPo> {

    public  Pager<PlayBoardOrderResDto> convertPoPager2ResDtoPager(Pager<PlayBoardOrderPo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<PlayBoardOrderResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








