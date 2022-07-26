package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.MediaRecordEntity;
import com.google.common.collect.Lists;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.MediaRecordReqDto;
import com.bizcenter.freight.dto.res.MediaRecordResDto;
import com.bizcenter.freight.infrastructure.persistence.po.MediaRecordPo;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.bitsun.core.common.convertor.IConvertor;
/**
 * 媒体信息表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class MediaRecordResDtoConvertor implements IConvertor<MediaRecordResDto,MediaRecordEntity,MediaRecordPo> {

    public  Pager<MediaRecordResDto> convertPoPager2ResDtoPager(Pager<MediaRecordPo> poPager) {
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








