package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.CustomsClearancePo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 报关表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface CustomsClearanceMapper extends BaseExtMapper<CustomsClearancePo> {
	
}
