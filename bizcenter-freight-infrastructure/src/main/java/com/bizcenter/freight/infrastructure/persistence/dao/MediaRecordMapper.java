package com.bizcenter.freight.infrastructure.persistence.dao;

import com.bizcenter.freight.infrastructure.persistence.po.MediaRecordPo;
import com.bitsun.core.framwork.infrastructure.persistence.dao.BaseExtMapper;
import org.apache.ibatis.annotations.Mapper;

 /**
   * 媒体信息表
   * @author: hwx
   * @email: 745011692@qq.com
   */
@Mapper
public interface MediaRecordMapper extends BaseExtMapper<MediaRecordPo> {
	
}
