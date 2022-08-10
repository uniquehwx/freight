package com.bizcenter.freight.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.bitsun.core.framwork.infrastructure.persistence.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * 空运订单扩展表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_order_serve_extend", resultMap = "orderServeExtendMap")
public class OrderServeExtendPo extends BasePo<OrderServeExtendPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public OrderServeExtendPo(){

    }
    public OrderServeExtendPo(Long id){
        this.id = id;
    }

    /**
     * 备注 varchar
     */
    private String remark;

    /**
     * 服务名称 varchar
     */
    private String serveName;

    /**
     * 服务类型（1:订舱  2:报关 3:提货 4:仓储 5:中转  6:打板 7:安检） int2
     */
    private Integer serveType;

    /**
     * 外部订单号 varchar
     */
    private String externalOrder;

    /**
     * 订单状态信息 ( 1 初始化 2 进行中  3 已取消 4 已完成) int2
     */
    private Integer status;

}






