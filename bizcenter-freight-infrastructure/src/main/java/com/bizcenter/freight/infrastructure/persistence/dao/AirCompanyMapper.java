package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.AirCompanyPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 航司表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface AirCompanyMapper extends BaseExtMapper<AirCompanyPo> {
	
}
