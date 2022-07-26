package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.AirCabinCargoInformationPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 舱位产品信息表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface AirCabinCargoInformationMapper extends BaseExtMapper<AirCabinCargoInformationPo> {
	
}
