package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.WhOutOrderDetailPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 出库明细表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface WhOutOrderDetailMapper extends BaseExtMapper<WhOutOrderDetailPo> {
	
}
