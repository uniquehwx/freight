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
 * 板型表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_air_panel", resultMap = "airPanelMap")
public class AirPanelPo extends BasePo<AirPanelPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public AirPanelPo(){

    }
    public AirPanelPo(Long id){
        this.id = id;
    }

    /**
     * 航司代码 varchar
     */
    private String airCompanyCode;

    /**
     * 机型 varchar
     */
    private String model;

    /**
     * 板型代码 varchar
     */
    private String panelTypeCode;

    /**
     * 别称 varchar
     */
    private String altName;

    /**
     * 体积 varchar
     */
    private String cubicMeter;

    /**
     * 长 varchar
     */
    private String panelLong;

    /**
     * 宽 varchar
     */
    private String panelWide;

    /**
     * 高 varchar
     */
    private String panelHigh;

    /**
     * 板型尺寸 json
     */
    @TableField(typeHandler = JsonTypeHandler.class)
    private String panelSize;

    /**
     * 限重 varchar
     */
    private String weightLimit;

    /**
     * 更新人中文姓名 varchar
     */
    private String modifyRealName;

    /**
     * 创建人命名 varchar
     */
    private String createRealName;

}






