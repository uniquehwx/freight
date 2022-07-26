package com.bizcenter.freight.dto.res;

import com.bitsun.core.framwork.api.dto.IResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import com.bitsun.core.common.validator.JsonValid;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 派车表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class WaybillResDto  implements IResponseDto{
    private static final long serialVersionUID = 1L;


    /**
     * ID int8
     */
    @ApiModelProperty(value = "ID")
    @JsonProperty(index = 0)
    private Long id;
    /**
     * 订单no  varchar
     */
    @ApiModelProperty(value = "订单no ")
    @JsonProperty(index = 10)
    private String orderNo;
    /**
     * 供应商no varchar
     */
    @ApiModelProperty(value = "供应商no")
    @JsonProperty(index = 20)
    private String supplierNo;
    /**
     * 司机信息，多个司机，分割 int8
     */
    @ApiModelProperty(value = "司机信息，多个司机，分割")
    @JsonProperty(index = 30)
    private Long driverId;
    /**
     * 特定提取件数 int4
     */
    @ApiModelProperty(value = "特定提取件数")
    @JsonProperty(index = 40)
    private Integer specificGoodsNumber;
    /**
     * 特定待提取方数 numeric
     */
    @ApiModelProperty(value = "特定待提取方数")
    @JsonProperty(index = 50)
    private BigDecimal specificGoodsVolume;
    /**
     * 车牌号 varchar
     */
    @ApiModelProperty(value = "车牌号")
    @JsonProperty(index = 60)
    private String licensePlateNumber;
    /**
     * 特定提货重量 numeric
     */
    @ApiModelProperty(value = "特定提货重量")
    @JsonProperty(index = 70)
    private BigDecimal specificGoodsWeight;
    /**
     * 状态值（0:已取消 10 :待提货; 20:提货中; 30:已到达提货点;  40:已提货 50：到达卸货点；60：已卸货 ；） int2
     */
    @ApiModelProperty(value = "状态值（0:已取消 10 :待提货; 20:提货中; 30:已到达提货点;  40:已提货 50：到达卸货点；60：已卸货 ；）")
    @JsonProperty(index = 80)
    private Integer statusKey;
    /**
     * 尺寸长度cm*高度cm*宽度cm jsonb
     */
    @ApiModelProperty(value = "尺寸长度cm*高度cm*宽度cm")
    @JsonProperty(index = 90)
    @JsonValid
    private String size;
    /**
     * 是否有随货资料(1有 0 无) int2
     */
    @ApiModelProperty(value = "是否有随货资料(1有 0 无)")
    @JsonProperty(index = 100)
    private Integer alongCargoData;
    /**
     * 委托方 varchar
     */
    @ApiModelProperty(value = "委托方")
    @JsonProperty(index = 110)
    private String delegateNo;
    /**
     * 异常信息（10：正常 20：异常） int2
     */
    @ApiModelProperty(value = "异常信息（10：正常 20：异常）")
    @JsonProperty(index = 120)
    private Integer exceptionStatus;
    /**
     * 备注 varchar
     */
    @ApiModelProperty(value = "备注")
    @JsonProperty(index = 130)
    private String remark;
    /**
     * 外部订单号 varchar
     */
    @ApiModelProperty(value = "外部订单号")
    @JsonProperty(index = 140)
    private String externalOrder;
    /**
     * 更新时间 timestamp
     */
    @ApiModelProperty(value = "更新时间")
    @JsonProperty(index = 170)
    private LocalDateTime modifyTime;
    /**
     * 更新人姓名 varchar
     */
    @ApiModelProperty(value = "更新人姓名")
    @JsonProperty(index = 180)
    private String modifyUserName;
    /**
     * 更新人ID int8
     */
    @ApiModelProperty(value = "更新人ID")
    @JsonProperty(index = 190)
    private Long modifyUserId;
    /**
     * 创建时间 timestamp
     */
    @ApiModelProperty(value = "创建时间")
    @JsonProperty(index = 200)
    private LocalDateTime createTime;
    /**
     * 创建人命名 varchar
     */
    @ApiModelProperty(value = "创建人命名")
    @JsonProperty(index = 210)
    private String createUserName;
    /**
     * 创建人ID int8
     */
    @ApiModelProperty(value = "创建人ID")
    @JsonProperty(index = 220)
    private Long createUserId;
    /**
     * 创建人名称 varchar
     */
    @ApiModelProperty(value = "创建人名称")
    @JsonProperty(index = 240)
    private String createRealName;
    /**
     * 修改人名称 varchar
     */
    @ApiModelProperty(value = "修改人名称")
    @JsonProperty(index = 250)
    private String modifyRealName;
    /**
     * 特种车类型（10 危险品 20：冷藏车 30 ：气垫车 40:平板车） int2
     */
    @ApiModelProperty(value = "特种车类型（10 危险品 20：冷藏车 30 ：气垫车 40:平板车）")
    @JsonProperty(index = 260)
    private Integer specialVehicleType;
    /**
     * 车型（10:1.5T/0.6，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60:5T ,70: 8T,80 :10T,90:  12T,100 :20 尺柜,110:40尺柜 ,120 :40/50尺柜,130:13T ） int2
     */
    @ApiModelProperty(value = "车型（10:1.5T/0.6，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60:5T ,70: 8T,80 :10T,90:  12T,100 :20 尺柜,110:40尺柜 ,120 :40/50尺柜,130:13T ）")
    @JsonProperty(index = 270)
    private Integer vehicleType;
    /**
     * 期望提货时间 timestamp
     */
    @ApiModelProperty(value = "期望提货时间")
    @JsonProperty(index = 280)
    private LocalDateTime takeDeliveryTime;
    /**
     * 司机信息展示 jsonb
     */
    @ApiModelProperty(value = "司机信息展示")
    @JsonProperty(index = 290)
    @JsonValid
    private String driverMessage;
    /**
     * 当前最新位置 varchar
     */
    @ApiModelProperty(value = "当前最新位置")
    @JsonProperty(index = 300)
    private String latestLocation;
    /**
     * 服务单类型状态（10：运输单  20:中转单服务单） int2
     */
    @ApiModelProperty(value = "服务单类型状态（10：运输单  20:中转单服务单）")
    @JsonProperty(index = 310)
    private Integer serviceType;



}






