package com.bizcenter.freight.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.bitsun.core.common.validator.JsonValid;
    import com.bitsun.core.common.validator.In;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 陆运订单表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class TransportOrderReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 订单号 varchar
     */
    @ApiModelProperty(value = "订单号")
    @JsonProperty(index = 10)
    private String orderNo;
    /**
     * 服务单类型状态（10：运输单  20:中转单服务单） int2
     */
    @ApiModelProperty(value = "服务单类型状态（10：运输单  20:中转单服务单）")
    @JsonProperty(index = 20)
    private Integer serviceType;
    /**
     * 体积(m³) numeric
     */
    @ApiModelProperty(value = "体积(m³)")
    @JsonProperty(index = 30)
    private BigDecimal cube;
    /**
     * 件数 int4
     */
    @ApiModelProperty(value = "件数")
    @JsonProperty(index = 40)
    private Integer packageNumber;
    /**
     * 毛重(kg) numeric
     */
    @ApiModelProperty(value = "毛重(kg)")
    @JsonProperty(index = 50)
    private BigDecimal roughWeight;
    /**
     * 尺寸(长*宽*高,单位cm) json
     */
    @ApiModelProperty(value = "尺寸(长*宽*高,单位cm)")
    @JsonProperty(index = 60)
    @JsonValid
    private String size;
    /**
     * 陆运单状态（10：未调度，20已调度，30已取消，40已完成，50异常中） int2
     */
    @ApiModelProperty(value = "陆运单状态（10：未调度，20已调度，30已取消，40已完成，50异常中）")
    @JsonProperty(index = 70)
    //todo: 请检查此属性的取值范围（可使用@In或@InOrNull来限定取值）
    @In(values={0,1})
    private Integer status;
    /**
     * 委托方联系人（多个 联系人姓名，联系方式，邮箱地址） json
     */
    @ApiModelProperty(value = "委托方联系人（多个 联系人姓名，联系方式，邮箱地址）")
    @JsonProperty(index = 80)
    @JsonValid
    private String principalContactPerson;
    /**
     * 业务类型（10:出口空运20:进口空运30:出口海运40:跨境陆运50:陆运） int2
     */
    @ApiModelProperty(value = "业务类型（10:出口空运20:进口空运30:出口海运40:跨境陆运50:陆运）")
    @JsonProperty(index = 90)
    private Integer businessTypes;
    /**
     * 委托方no varchar
     */
    @ApiModelProperty(value = "委托方no")
    @JsonProperty(index = 100)
    private String delegateNo;
    /**
     * 期望送货时间 timestamp
     */
    @ApiModelProperty(value = "期望送货时间")
    @JsonProperty(index = 110)
    private LocalDateTime deliveryTime;
    /**
     * 到货联系人 varchar
     */
    @ApiModelProperty(value = "到货联系人")
    @JsonProperty(index = 120)
    private String arrivalContactName;
    /**
     * 到货联系人电话 varchar
     */
    @ApiModelProperty(value = "到货联系人电话")
    @JsonProperty(index = 130)
    private String arrivalContactPhone;
    /**
     * 到货人省份 varchar
     */
    @ApiModelProperty(value = "到货人省份")
    @JsonProperty(index = 140)
    private String deliveryProvince;
    /**
     * 到货人城市 varchar
     */
    @ApiModelProperty(value = "到货人城市")
    @JsonProperty(index = 150)
    private String deliveryCity;
    /**
     * 到货人省市区 varchar
     */
    @ApiModelProperty(value = "到货人省市区")
    @JsonProperty(index = 160)
    private String deliveryDistrict;
    /**
     * 到货人具体地址 varchar
     */
    @ApiModelProperty(value = "到货人具体地址")
    @JsonProperty(index = 170)
    private String deliveryAddress;
    /**
     * 期望提货时间 timestamp
     */
    @ApiModelProperty(value = "期望提货时间")
    @JsonProperty(index = 180)
    private LocalDateTime takeDeliveryTime;
    /**
     * 提货人省份 varchar
     */
    @ApiModelProperty(value = "提货人省份")
    @JsonProperty(index = 190)
    private String takeDeliveryProvince;
    /**
     * 提货人城市 varchar
     */
    @ApiModelProperty(value = "提货人城市")
    @JsonProperty(index = 200)
    private String takeDeliveryCity;
    /**
     * 提货人市区 varchar
     */
    @ApiModelProperty(value = "提货人市区")
    @JsonProperty(index = 210)
    private String takeDeliveryDistrict;
    /**
     * 提货人具体地址 varchar
     */
    @ApiModelProperty(value = "提货人具体地址")
    @JsonProperty(index = 220)
    private String takeDeliveryAddress;
    /**
     * 提货联系人名称 varchar
     */
    @ApiModelProperty(value = "提货联系人名称")
    @JsonProperty(index = 230)
    private String contactName;
    /**
     * 提货联系人电话 varchar
     */
    @ApiModelProperty(value = "提货联系人电话")
    @JsonProperty(index = 240)
    private String contactPhone;
    /**
     * 补充货物提货卸货信息 json
     */
    @ApiModelProperty(value = "补充货物提货卸货信息")
    @JsonProperty(index = 250)
    @JsonValid
    private String cargoInformation;
    /**
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 260)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 270)
    private Long appId;
    /**
     * 修改人名称 varchar
     */
    @ApiModelProperty(value = "修改人名称")
    @JsonProperty(index = 350)
    private String modifyRealName;
    /**
     * 创建人名称 varchar
     */
    @ApiModelProperty(value = "创建人名称")
    @JsonProperty(index = 360)
    private String createRealName;
    /**
     * 服务类型（0 自营业务   ，10： 空运服务 ） int2
     */
    @ApiModelProperty(value = "服务类型（0 自营业务   ，10： 空运服务 ）")
    @JsonProperty(index = 370)
    private Integer externalServiceType;
    /**
     * 外部订单号 varchar
     */
    @ApiModelProperty(value = "外部订单号")
    @JsonProperty(index = 380)
    private String externalOrder;
    /**
     * 备注信息 varchar
     */
    @ApiModelProperty(value = "备注信息")
    @JsonProperty(index = 390)
    private String remark;
    /**
     * 制定车辆类型（10:监管车 20:尾班车 30... ） int2
     */
    @ApiModelProperty(value = "制定车辆类型（10:监管车 20:尾班车 30... ）")
    @JsonProperty(index = 400)
    private Integer carType;

}






