package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.OrderPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 订单
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface OrderMapper extends BaseExtMapper<OrderPo> {
	
}
