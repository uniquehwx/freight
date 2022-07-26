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
 * 出库明细表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_wh_out_order_detail", resultMap = "whOutOrderDetailMap")
public class WhOutOrderDetailPo extends BasePo<WhOutOrderDetailPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public WhOutOrderDetailPo(){

    }
    public WhOutOrderDetailPo(Long id){
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
     * 出库单id int8
     */
    private Long outOrderId;

    /**
     * 入仓号 varchar
     */
    private String inStorageNo;

    /**
     * 托盘号 varchar
     */
    private String trayNo;

    /**
     * 出库数量(件) int4
     */
    private Integer quantity;

    /**
     * 出库体积(立方米) numeric
     */
    private BigDecimal volume;

    /**
     * 出库毛重(kg) numeric
     */
    private BigDecimal weight;

    /**
     * 出库照片,多个照片用逗号隔开 bpchar
     */
    private String images;

    /**
     * 车牌号 varchar
     */
    private String licensePlateNumber;

    /**
     * 封条号 varchar
     */
    private String sealNo;

    /**
     * 司机名称 varchar
     */
    private String driverName;

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
     * 供应商 varchar
     */
    private String supplierNo;

    /**
     * 出库单号 varchar
     */
    private String outOrderNo;

}






