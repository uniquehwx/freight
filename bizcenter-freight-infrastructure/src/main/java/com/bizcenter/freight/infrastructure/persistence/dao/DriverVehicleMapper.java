package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.DriverVehiclePo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 司机车辆关联关系表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface DriverVehicleMapper extends BaseExtMapper<DriverVehiclePo> {
	
}
