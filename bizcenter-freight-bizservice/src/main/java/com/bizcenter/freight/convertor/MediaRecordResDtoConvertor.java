package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.domain.model.MediaRecordEntity;
import com.bizcenter.freight.dto.res.MediaRecordResDto;
import org.mapstruct.Mapper;
/**
 * 媒体信息表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class MediaRecordResDtoConvertor implements IConvertor<MediaRecordResDto,MediaRecordEntity,String> {

    public  Pager<MediaRecordResDto> convertPoPager2ResDtoPager(Pager<String> poPager) {
        if (poPager == null) {
            return null;
        }

        Pager<MediaRecordResDto> resDtoPager = new Pager();
        resDtoPager.setTotalCount(poPager.getTotalCount());
        resDtoPager.setPageSize(poPager.getPageSize());
        resDtoPager.setTotalPage(poPager.getTotalPage());
        resDtoPager.setCurrentPage(poPager.getCurrentPage());
        resDtoPager.setList(poList2DtoList(poPager.getList()));

        return resDtoPager;
    }
}








