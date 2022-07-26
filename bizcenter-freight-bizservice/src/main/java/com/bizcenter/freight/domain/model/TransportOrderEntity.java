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
 * 陆运订单表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class TransportOrderEntity  implements Entity<TransportOrderEntity>{


        /**
         * id int8
         */
        private Long id;
        /**
         * 订单号 varchar
         */
        private String orderNo;
        /**
         * 服务单类型状态（10：运输单  20:中转单服务单） int2
         */
        private Integer serviceType;
        /**
         * 体积(m³) numeric
         */
        private BigDecimal cube;
        /**
         * 件数 int4
         */
        private Integer packageNumber;
        /**
         * 毛重(kg) numeric
         */
        private BigDecimal roughWeight;
        /**
         * 尺寸(长*宽*高,单位cm) json
         */
        private String size;
        /**
         * 陆运单状态（10：未调度，20已调度，30已取消，40已完成，50异常中） int2
         */
        private Integer status;
        /**
         * 委托方联系人（多个 联系人姓名，联系方式，邮箱地址） json
         */
        private String principalContactPerson;
        /**
         * 业务类型（10:出口空运20:进口空运30:出口海运40:跨境陆运50:陆运） int2
         */
        private Integer businessTypes;
        /**
         * 委托方no varchar
         */
        private String delegateNo;
        /**
         * 期望送货时间 timestamp
         */
        private LocalDateTime deliveryTime;
        /**
         * 到货联系人 varchar
         */
        private String arrivalContactName;
        /**
         * 到货联系人电话 varchar
         */
        private String arrivalContactPhone;
        /**
         * 到货人省份 varchar
         */
        private String deliveryProvince;
        /**
         * 到货人城市 varchar
         */
        private String deliveryCity;
        /**
         * 到货人省市区 varchar
         */
        private String deliveryDistrict;
        /**
         * 到货人具体地址 varchar
         */
        private String deliveryAddress;
        /**
         * 期望提货时间 timestamp
         */
        private LocalDateTime takeDeliveryTime;
        /**
         * 提货人省份 varchar
         */
        private String takeDeliveryProvince;
        /**
         * 提货人城市 varchar
         */
        private String takeDeliveryCity;
        /**
         * 提货人市区 varchar
         */
        private String takeDeliveryDistrict;
        /**
         * 提货人具体地址 varchar
         */
        private String takeDeliveryAddress;
        /**
         * 提货联系人名称 varchar
         */
        private String contactName;
        /**
         * 提货联系人电话 varchar
         */
        private String contactPhone;
        /**
         * 补充货物提货卸货信息 json
         */
        private String cargoInformation;
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
         * 修改人名称 varchar
         */
        private String modifyRealName;
        /**
         * 创建人名称 varchar
         */
        private String createRealName;
        /**
         * 服务类型（0 自营业务   ，10： 空运服务 ） int2
         */
        private Integer externalServiceType;
        /**
         * 外部订单号 varchar
         */
        private String externalOrder;
        /**
         * 备注信息 varchar
         */
        private String remark;
        /**
         * 制定车辆类型（10:监管车 20:尾班车 30... ） int2
         */
        private Integer carType;



}






