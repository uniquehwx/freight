package com.bizcenter.freight.convertor;

import com.bitsun.core.common.convertor.IConvertor;
import com.bizcenter.freight.domain.model.PlayBoardOrderEntity;
import com.bizcenter.freight.dto.req.PlayBoardOrderReqDto;
import org.mapstruct.Mapper;
/**
 * 打板订单表
 * @author: hwx
 * @email: 745011692@qq.com
 */

@Mapper(componentModel="spring")
public abstract class PlayBoardOrderReqDtoConvertor implements IConvertor<PlayBoardOrderReqDto,PlayBoardOrderEntity,String> {

}








