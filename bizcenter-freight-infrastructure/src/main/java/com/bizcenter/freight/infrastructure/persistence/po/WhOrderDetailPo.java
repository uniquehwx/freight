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
 * 入库明细表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_wh_order_detail", resultMap = "whOrderDetailMap")
public class WhOrderDetailPo extends BasePo<WhOrderDetailPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public WhOrderDetailPo(){

    }
    public WhOrderDetailPo(Long id){
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
     * 托盘号 varchar
     */
    private String trayNo;

    /**
     * 入库数量(件) int4
     */
    private Integer quantity;

    /**
     * 入库体积(立方米) numeric
     */
    private BigDecimal volume;

    /**
     * 入库毛重(kg) numeric
     */
    private BigDecimal weight;

    /**
     * 入库照片,多个照片用逗号隔开 varchar
     */
    private String images;

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
     * 状态，10正常，20已冻结，30待出库，40已出库 int2
     */
    private Integer status;

}






