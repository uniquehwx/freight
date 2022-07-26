package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.AirFlightPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 航班表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface AirFlightMapper extends BaseExtMapper<AirFlightPo> {
	
}
