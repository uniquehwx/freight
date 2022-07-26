package com.bizcenter.freight.domain.model;

import com.bitsun.core.framwork.domain.model.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * 出库表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class WhOutOrderEntity  implements Entity<WhOutOrderEntity>{


        /**
         * ID int8
         */
        private Long id;
        /**
         * 更新人姓名 varchar
         */
        private String modifyUserName;
        /**
         * 更新人ID int8
         */
        private Long modifyUserId;
        /**
         * 创建人命名 varchar
         */
        private String createUserName;
        /**
         * 创建人ID int8
         */
        private Long createUserId;
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






