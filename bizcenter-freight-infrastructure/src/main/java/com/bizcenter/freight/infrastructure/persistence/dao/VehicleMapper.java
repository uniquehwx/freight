package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.VehiclePo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 车辆表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface VehicleMapper extends BaseExtMapper<VehiclePo> {
	
}
