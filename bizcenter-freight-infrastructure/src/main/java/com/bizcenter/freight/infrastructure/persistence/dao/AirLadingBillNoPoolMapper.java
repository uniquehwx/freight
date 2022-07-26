package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.AirLadingBillNoPoolPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 提单号资源池表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface AirLadingBillNoPoolMapper extends BaseExtMapper<AirLadingBillNoPoolPo> {
	
}
