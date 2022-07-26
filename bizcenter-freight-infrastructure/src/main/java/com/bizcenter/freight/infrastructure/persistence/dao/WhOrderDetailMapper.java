package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.WhOrderDetailPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 入库明细表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface WhOrderDetailMapper extends BaseExtMapper<WhOrderDetailPo> {
	
}
