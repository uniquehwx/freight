package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.BookingBusinessPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 订舱服务表 
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface BookingBusinessMapper extends BaseExtMapper<BookingBusinessPo> {
	
}
