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
 * 派车表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class WaybillEntity  implements Entity<WaybillEntity>{


        /**
         * ID int8
         */
        private Long id;
        /**
         * 订单no  varchar
         */
        private String orderNo;
        /**
         * 供应商no varchar
         */
        private String supplierNo;
        /**
         * 司机信息，多个司机，分割 int8
         */
        private Long driverId;
        /**
         * 特定提取件数 int4
         */
        private Integer specificGoodsNumber;
        /**
         * 特定待提取方数 numeric
         */
        private BigDecimal specificGoodsVolume;
        /**
         * 车牌号 varchar
         */
        private String licensePlateNumber;
        /**
         * 特定提货重量 numeric
         */
        private BigDecimal specificGoodsWeight;
        /**
         * 状态值（0:已取消 10 :待提货; 20:提货中; 30:已到达提货点;  40:已提货 50：到达卸货点；60：已卸货 ；） int2
         */
        private Integer statusKey;
        /**
         * 尺寸长度cm*高度cm*宽度cm jsonb
         */
        private String size;
        /**
         * 是否有随货资料(1有 0 无) int2
         */
        private Integer alongCargoData;
        /**
         * 委托方 varchar
         */
        private String delegateNo;
        /**
         * 异常信息（10：正常 20：异常） int2
         */
        private Integer exceptionStatus;
        /**
         * 备注 varchar
         */
        private String remark;
        /**
         * 外部订单号 varchar
         */
        private String externalOrder;
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
         * 创建人名称 varchar
         */
        private String createRealName;
        /**
         * 修改人名称 varchar
         */
        private String modifyRealName;
        /**
         * 特种车类型（10 危险品 20：冷藏车 30 ：气垫车 40:平板车） int2
         */
        private Integer specialVehicleType;
        /**
         * 车型（10:1.5T/0.6，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60:5T ,70: 8T,80 :10T,90:  12T,100 :20 尺柜,110:40尺柜 ,120 :40/50尺柜,130:13T ） int2
         */
        private Integer vehicleType;
        /**
         * 期望提货时间 timestamp
         */
        private LocalDateTime takeDeliveryTime;
        /**
         * 司机信息展示 jsonb
         */
        private String driverMessage;
        /**
         * 当前最新位置 varchar
         */
        private String latestLocation;
        /**
         * 服务单类型状态（10：运输单  20:中转单服务单） int2
         */
        private Integer serviceType;



}






