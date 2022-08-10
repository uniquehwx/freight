package com.bizcenter.freight.domain.model.air.childer;

import com.bitsun.core.framwork.domain.model.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * 航班表  的 子域  == 等同于舱位产品表 AirCabinCargoInformationEntity
 *
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class AirFlightPanelEntity implements Entity<AirFlightPanelEntity>{


        /**
         * ID int8
         */
        private Long id;

        /**
         * 更新人姓名 varchar
         */
        private String modifyUserName;
        /**
         * 更新人姓名 varchar
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
         * 航班编码(用于关联他表) varchar
         */
        private String flightNo;
        /**
         * 板数量 int4
         */
        private Integer amount;

        /**
         * 生效星期 varchar
         */
        private String weekDay;

        /**
         * 版型No varchar  这个关联板块信息
         */
        private String panelCode;

        /**
         * 生效时间 timestamp
         */
        private LocalDateTime startTime;
        /**
         * 截至时间 timestamp
         */
        private LocalDateTime endTime;


        /**
         * 版类型 varchar （1 合同板 2 临时板）
         */
        private String panelType;

        /**
         * 合同罚金 numeric
         */
        private BigDecimal contractPenalty;
//        /**
//         * 公司编码(用于关联他表) varchar
//         */
//        private String companyNo;
//        /**
//         * 航班编码(用于关联他表) varchar
//         */
//        private String flightNo;
//        /**
//         * 航司代码 varchar
//         */
//        private String airCompanyCode;
//        /**
//         * 货站 varchar
//         */
//        private String freightStation;
//        /**
//         * 始发港代码 varchar
//         */
//        private String departurePortCode;
//        /**
//         * 始发港 varchar
//         */
//        private String departurePort;
//        /**
//         * 目的港代码 varchar
//         */
//        private String destinationPortCode;
//        /**
//         * 目的港 varchar
//         */
//        private String destinationPort;
//        /**
//         * 航班号 varchar
//         */
//        private String flightCode;
//        /**
//         * 班期 varchar
//         */
//        private String schedule;
//        /**
//         * 起飞时刻ETD timestamp
//         */
//        private LocalDateTime departureTime;
//        /**
//         * 到达时刻ETA timestamp
//         */
//        private LocalDateTime arrivalTime;
//        /**
//         * 截单时刻 timestamp
//         */
//        private LocalDateTime closingTime;
//        /**
//         * 截单天数 varchar
//         */
//        private String closingDays;
//        /**
//         * 机型 varchar
//         */
//        private String model;
//        /**
//         * 飞机类型 varchar
//         */
//        private String planeType;



}






