package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.SecurityOrderPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 安检订单表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface SecurityOrderMapper extends BaseExtMapper<SecurityOrderPo> {
	
}
