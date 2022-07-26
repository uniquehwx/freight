package com.bizcenter.freight.domain.model;

import com.bitsun.core.framwork.domain.model.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * 报关表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class CustomsClearanceEntity  implements Entity<CustomsClearanceEntity>{


        /**
         * ID int8
         */
        private Long id;
        /**
         * 10 创建服务  20 完成服务  30服务取消 int2
         */
        private Integer status;
        /**
         * 报关服务单号 varchar
         */
        private String orderNo;
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
         * 行政组织编码 varchar
         */
        private String departCode;
        /**
         * 增值服务单号 varchar
         */
        private String addedServiceNo;
        /**
         * 业务类型 int2
         */
        private Integer busType;
        /**
         * 订单来源 varchar
         */
        private String orderSource;
        /**
         * 提单号 varchar
         */
        private String billlandingNo;
        /**
         * 备注信息 varchar
         */
        private String remark;
        /**
         * 服务完成时间 timestamp
         */
        private LocalDateTime serviceCompletionTime;
        /**
         * 用户自定义2 varchar
         */
        private String userDef2;
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
         * 类型: 10自建 20空运订单 int4
         */
        private Integer type;
        /**
         * 客户财务部门 varchar
         */
        private String orderSourceFinancial;
        /**
         * 创建人行政部门 varchar
         */
        private String initCreatDepart;
        /**
         * 空运主单号 varchar
         */
        private String mainOrderNo;



}






