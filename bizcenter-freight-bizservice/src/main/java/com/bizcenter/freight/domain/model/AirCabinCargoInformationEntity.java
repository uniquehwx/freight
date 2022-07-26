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
 * 舱位产品信息表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class AirCabinCargoInformationEntity  implements Entity<AirCabinCargoInformationEntity>{


        /**
         * ID int8
         */
        private Long id;
        /**
         * 航班编码(关联他表) varchar
         */
        private String flightNo;
        /**
         * 航线产品代码 varchar
         */
        private String productNo;
        /**
         * 航司代码 varchar
         */
        private String airCompanyCode;
        /**
         * 航班号 varchar
         */
        private String flightCode;
        /**
         * 目的港代码 varchar
         */
        private String destinationPort;
        /**
         * 板类型 varchar
         */
        private String panelType;
        /**
         * 航线运营 varchar
         */
        private String flightService;
        /**
         * 航线操作 varchar
         */
        private String flightOperator;
        /**
         * 公司 varchar
         */
        private String company;
        /**
         * 部门 varchar
         */
        private String department;
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
         * 生效时间 timestamp
         */
        private LocalDateTime effectTime;
        /**
         * 失效时间 timestamp
         */
        private LocalDateTime invalidTime;
        /**
         * 合同罚金 numeric
         */
        private BigDecimal contractPenalty;



}






