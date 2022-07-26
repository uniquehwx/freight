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
 * 订单
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_order", resultMap = "orderMap")
public class OrderPo extends BasePo<OrderPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public OrderPo(){

    }
    public OrderPo(Long id){
        this.id = id;
    }

    /**
     * 订单号 varchar
     */
    private String orderNo;

    /**
     * 交易类型(1-航空订单，5-地面操作订单) int4
     */
    private Integer tradeType;

    /**
     * 客户编码 varchar
     */
    private String customerCode;

    /**
     * 委托方联系人 varchar
     */
    private String clientName;

    /**
     * 委托方联系人电话 varchar
     */
    private String clinetPhone;

    /**
     * 父单单号 varchar
     */
    private String outOrderNo;

    /**
     * 单据类型(1-主订单，2-子订单) int4
     */
    private Integer orderType;

    /**
     * 交易状态 int4
     */
    private Integer tradeStatus;

    /**
     * 供应商编码 varchar
     */
    private String supllierCode;

    /**
     * 始发地编码 varchar
     */
    private String startPointCode;

    /**
     * 目的地编码 varchar
     */
    private String endPointCode;

    /**
     * 备注 varchar
     */
    private String remark;

    /**
     * 扩展信息 jsonb
     */
    @TableField(typeHandler = JsonTypeHandler.class)
    private String extData;

    /**
     * 业务类型 int4
     */
    private Integer businessType;

    /**
     * 订单完成时间 timestamp
     */
    private LocalDateTime completionTime;

    /**
     * 业务员 varchar
     */
    private String salesClerkCode;

}






