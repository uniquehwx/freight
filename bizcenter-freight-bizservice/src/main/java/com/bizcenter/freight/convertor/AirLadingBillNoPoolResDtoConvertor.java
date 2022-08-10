package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.air.childer.AirLadingBillNoPoolEntity;
import com.bizcenter.freight.dto.res.AirLadingBillNoPoolResDto;
import org.mapstruct.Mapper;
/**
 * 提单号资源池表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class AirLadingBillNoPoolResDtoConvertor implements IConvertor<AirLadingBillNoPoolResDto,AirLadingBillNoPoolEntity,String> {

    public  Pager<AirLadingBillNoPoolResDto> convertPoPager2ResDtoPager(Pager<String> poPager) {
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








