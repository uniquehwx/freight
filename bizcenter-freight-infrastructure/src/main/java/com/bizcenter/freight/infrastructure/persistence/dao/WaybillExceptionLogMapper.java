package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.WaybillExceptionLogPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 运单异常信息记录表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface WaybillExceptionLogMapper extends BaseExtMapper<WaybillExceptionLogPo> {
	
}
