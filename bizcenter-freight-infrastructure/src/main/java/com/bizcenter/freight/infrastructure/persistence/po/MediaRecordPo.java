package com.bizcenter.freight.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bitsun.core.common.mybatis.handler.JsonTypeHandler;
import com.bitsun.core.framwork.infrastructure.persistence.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.io.Serializable;
import java.time.*;

/**
 * 媒体信息表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_media_record", resultMap = "mediaRecordMap")
public class MediaRecordPo extends BasePo<MediaRecordPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public MediaRecordPo(){

    }
    public MediaRecordPo(Long id){
        this.id = id;
    }

    /**
     * 图片地址 varchar
     */
    private String imgUrl;

    /**
     * 关联id int8
     */
    private Long refId;

    /**
     * 备注信息 varchar
     */
    private String remark;

    /**
     *  int8
     */
    private Long isvId;

    /**
     * 修改人名称 varchar
     */
    private String modifyRealName;

    /**
     * 创建人名称 varchar
     */
    private String createRealName;

    /**
     * 文件名称 varchar
     */
    private String fileName;

    /**
     * 类型 int8
     */
    private Long type;

    /**
     * 状态 int8
     */
    private Long status;

    /**
     * 扩展字段1 varchar
     */
    private String extData1;

    /**
     * 扩展字段2 varchar
     */
    private String extData2;

}






