package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.TransportOrderPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 陆运订单表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface TransportOrderMapper extends BaseExtMapper<TransportOrderPo> {
	
}
