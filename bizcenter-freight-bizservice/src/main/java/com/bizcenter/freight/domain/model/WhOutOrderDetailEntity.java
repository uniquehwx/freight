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
 * 出库明细表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class WhOutOrderDetailEntity  implements Entity<WhOutOrderDetailEntity>{


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






