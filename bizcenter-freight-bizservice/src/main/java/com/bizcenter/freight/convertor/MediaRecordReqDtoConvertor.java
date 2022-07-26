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
public abstract class MediaRecordReqDtoConvertor implements IConvertor<MediaRecordReqDto,MediaRecordEntity,MediaRecordPo> {

}








