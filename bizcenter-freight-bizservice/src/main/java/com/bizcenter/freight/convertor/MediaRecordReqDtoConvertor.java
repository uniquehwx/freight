package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.MediaRecordEntity;
import com.bizcenter.freight.dto.req.MediaRecordReqDto;
import org.mapstruct.Mapper;
/**
 * 媒体信息表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class MediaRecordReqDtoConvertor implements IConvertor<MediaRecordReqDto,MediaRecordEntity,String> {

}








