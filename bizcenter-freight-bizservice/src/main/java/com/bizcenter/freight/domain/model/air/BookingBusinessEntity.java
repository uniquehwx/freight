package com.bizcenter.freight.domain.model.air;

import com.bitsun.core.framwork.domain.model.Entity;

import java.time.LocalDateTime;

import com.bizcenter.freight.domain.model.air.childer.AirLadingBillNoPoolEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * 订舱服务表  -- 聚合根信息
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class BookingBusinessEntity  implements Entity<BookingBusinessEntity>{


        /**
         * ID int8
         */
        private Long id;
        /**
         * 10 创建服务  20 完成服务  30服务取消 int2
         */
        private Integer status;
        /**
         * 订舱服务单号 varchar
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
//        /**
//         * 提单号 varchar
//         */
//        private String billLadingNo;
        /**
         * 提单号 varchar
         */
        private AirLadingBillNoPoolEntity billLadingNo;
        /**
         * 备注信息 varchar
         */
        private String remark;
        /**
         * 服务完成时间 timestamp
         */
        private LocalDateTime serviceCompletionTime;
        /**
         * 类型: 10自建 20空运订单 int4
         */
        private Integer type;
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



}






