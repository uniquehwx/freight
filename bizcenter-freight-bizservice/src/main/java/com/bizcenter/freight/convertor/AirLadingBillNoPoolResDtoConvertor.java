package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirLadingBillNoPoolEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.AirLadingBillNoPoolReqDto;
import com.bizcenter.freight.dto.res.AirLadingBillNoPoolResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirLadingBillNoPoolPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 提单号资源池表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirLadingBillNoPoolResDtoConvertor implements IConvertor<AirLadingBillNoPoolResDto,AirLadingBillNoPoolEntity,AirLadingBillNoPoolPo> {

    public  Pager<AirLadingBillNoPoolResDto> convertPoPager2ResDtoPager(Pager<AirLadingBillNoPoolPo> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<AirLadingBillNoPoolResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








