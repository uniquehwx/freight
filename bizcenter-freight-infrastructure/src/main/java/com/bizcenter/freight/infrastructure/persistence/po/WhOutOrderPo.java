package com.bizcenter.freight.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bitsun.core.common.mybatis.handler.JsonTypeHandler;
import com.bitsun.core.framwork.infrastructure.persistence.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.math.BigDecimal;
import java.io.Serializable;
import java.time.*;

/**
 * 出库表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_wh_out_order", resultMap = "whOutOrderMap")
public class WhOutOrderPo extends BasePo<WhOutOrderPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public WhOutOrderPo(){

    }
    public WhOutOrderPo(Long id){
        this.id = id;
    }

    /**
     *  int8
     */
    private Long isvId;

    /**
     * 创建人名称 varchar
     */
    private String createRealName;

    /**
     * 修改人名称 varchar
     */
    private String modifyRealName;

    /**
     * 入仓号 varchar
     */
    private String inStorageNo;

    /**
     * 客户编码 varchar
     */
    private String customerCode;

    /**
     * 仓库名称 varchar
     */
    private String warehouseName;

    /**
     * 出库时间 timestamp
     */
    private LocalDateTime outStorageTime;

    /**
     * 状态30待出库40部分出库50已出库60已取消 int2
     */
    private Integer status;

    /**
     * 同步状态(10未同步，20已下发，30已回传) int2
     */
    private Integer syncStatus;

    /**
     * 备注 varchar
     */
    private String remark;

    /**
     * 用户自定义1 varchar
     */
    private String userDef1;

    /**
     * 用户自定义2 varchar
     */
    private String userDef2;

    /**
     * 数量 int4
     */
    private Integer quantity;

    /**
     * 实际数量 int4
     */
    private Integer actualQuantity;

    /**
     * 实际重量 numeric
     */
    private BigDecimal actualWeight;

    /**
     * 实际体积 numeric
     */
    private BigDecimal actualVolume;

    /**
     * 分单号 varchar
     */
    private String partOrderNo;

    /**
     * 客户名称 varchar
     */
    private String customerName;

    /**
     * 订单流转 varchar
     */
    private String orderSource;

    /**
     * 仓库编码 varchar
     */
    private String warehouseCode;

    /**
     * 出库单号 varchar
     */
    private String outOrderNo;

    /**
     * 出库单类型，10出库，20锁定 int2
     */
    private Integer type;

    /**
     * 客户订单号 varchar
     */
    private String customerNo;

}






