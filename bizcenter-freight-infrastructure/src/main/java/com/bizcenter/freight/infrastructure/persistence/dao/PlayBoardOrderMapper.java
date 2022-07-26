package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.PlayBoardOrderPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 打板订单表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface PlayBoardOrderMapper extends BaseExtMapper<PlayBoardOrderPo> {
	
}
