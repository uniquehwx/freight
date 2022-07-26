package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.WhOrderPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 仓库订单(入库单)表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface WhOrderMapper extends BaseExtMapper<WhOrderPo> {
	
}
