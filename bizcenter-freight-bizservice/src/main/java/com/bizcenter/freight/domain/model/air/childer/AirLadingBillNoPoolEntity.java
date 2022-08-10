package com.bizcenter.freight.domain.model.air.childer;

import com.bitsun.core.framwork.domain.model.Entity;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * 提单号资源池表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class AirLadingBillNoPoolEntity  implements Entity<AirLadingBillNoPoolEntity>{


        /**
         * ID int8
         */
        private Long id;
        /**
         * 航司代码 varchar
         */
        private String airCompanyCode;
        /**
         * 公司代码(提单起始号) varchar
         */
        private String companyCode;
        /**
         * 提单号 varchar
         */
        private String ladingBillNo;
        /**
         * 类型 varchar
         */
        private String ladingBillType;
        /**
         * 使用状态: 10 未使用，20 使用中，30 已使用 , 40 已禁用 , 50 已作废 int2
         */
        private Integer ladingBillNoStatusCode;
        /**
         * 颁发时间 timestamp
         */
        private LocalDateTime issuedAt;
        /**
         * 不早于 timestamp
         */
        private LocalDateTime notBefore;
        /**
         * 不晚于 timestamp
         */
        private LocalDateTime notAfter;
        /**
         * 更新人姓名 varchar
         */
        private String modifyUserName;
        /**
         * 更新人中文姓名 varchar
         */
        private String modifyRealName;
        /**
         * 更新人ID int8
         */
        private Long modifyUserId;
        /**
         * 创建人命名 varchar
         */
        private String createUserName;
        /**
         * 创建人中文命名 varchar
         */
        private String createRealName;
        /**
         * 创建人ID int8
         */
        private Long createUserId;
        /**
         * 状态码：0 提单号生成、1 绑定订单、2 订单完成、3 解绑订单、4 禁用、5 启用、6 作废 int2
         */
        private Integer planningStatusCode;
        /**
         * 订单号 varchar
         */
        private String orderNo;



}






