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
 * 打板订单表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class PlayBoardOrderEntity  implements Entity<PlayBoardOrderEntity>{


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
         * 打板单号 varchar
         */
        private String playBoardNo;
        /**
         * 客户订单号 varchar
         */
        private String customerNo;
        /**
         * 航班号 varchar
         */
        private String flightNumber;
        /**
         * 客户编码 varchar
         */
        private String customerCode;
        /**
         * 客户名称 varchar
         */
        private String customerName;
        /**
         * 财务组织编码 varchar
         */
        private String financialOrgCode;
        /**
         * 财务组织名称 varchar
         */
        private String financialOrgName;
        /**
         * 客户联系人 varchar
         */
        private String customerContacts;
        /**
         * 客户联系电话 varchar
         */
        private String customerPhone;
        /**
         * 业务类型 int2
         */
        private Integer busType;
        /**
         * 重量(kg) numeric
         */
        private BigDecimal weight;
        /**
         * 体积(立方米) numeric
         */
        private BigDecimal volume;
        /**
         * 数量(件) int4
         */
        private Integer quantity;
        /**
         * 中文品名 varchar
         */
        private String zhName;
        /**
         * 货站 varchar
         */
        private String goodsStation;
        /**
         * 订单来源 varchar
         */
        private String orderSource;
        /**
         * 提单号 varchar
         */
        private String orderNo;
        /**
         * 入站时间 timestamp
         */
        private LocalDateTime inStationTime;
        /**
         * 打板时间 timestamp
         */
        private LocalDateTime playBoardTime;
        /**
         * 10待入站20已打板30已取消 int2
         */
        private Integer status;
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
         * 出港日期 timestamp
         */
        private LocalDateTime departureDate;
        /**
         * 类型: 10自建 20空运订单 int2
         */
        private Integer type;
        /**
         * (订单中心)订单号 varchar
         */
        private String orderOutNo;
        /**
         * 行政部门编码 varchar
         */
        private String departCode;
        /**
         * 客户财务部门 varchar
         */
        private String orderSourceFinancial;
        /**
         * 创建人行政部门 varchar
         */
        private String initCreatDepart;
        /**
         * 订舱单号 varchar
         */
        private String bookingBusinessNo;



}






