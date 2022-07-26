package com.bizcenter.freight.dto.res;

import com.bitsun.core.framwork.api.dto.IResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.bitsun.core.common.validator.JsonValid;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 车辆表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class VehicleResDto  implements IResponseDto{
    private static final long serialVersionUID = 1L;


    /**
     * ID int8
     */
    @ApiModelProperty(value = "ID")
    @JsonProperty(index = 0)
    private Long id;
    /**
     * 车牌号 varchar
     */
    @ApiModelProperty(value = "车牌号")
    @JsonProperty(index = 10)
    private String licensePlateNumber;
    /**
     * 10 重型箱式货车；20中型箱式货车 30轻型箱式货车40小型箱式货车 int2
     */
    @ApiModelProperty(value = "10 重型箱式货车；20中型箱式货车 30轻型箱式货车40小型箱式货车")
    @JsonProperty(index = 20)
    private Integer vehicleTypeCode;
    /**
     * 备注 varchar
     */
    @ApiModelProperty(value = "备注")
    @JsonProperty(index = 30)
    private String remark;
    /**
     * 外形尺寸 varchar
     */
    @ApiModelProperty(value = "外形尺寸")
    @JsonProperty(index = 40)
    private String size;
    /**
     * 年审时间 timestamp
     */
    @ApiModelProperty(value = "年审时间")
    @JsonProperty(index = 50)
    private LocalDateTime annualVerification;
    /**
     * 资格证图片 varchar
     */
    @ApiModelProperty(value = "资格证图片")
    @JsonProperty(index = 60)
    private String identifyUrl;
    /**
     * 是否是内部车辆(1:是 0否) int2
     */
    @ApiModelProperty(value = "是否是内部车辆(1:是 0否)")
    @JsonProperty(index = 70)
    private Integer isInternalVehicle;
    /**
     * 监管车(1:是 0否) int2
     */
    @ApiModelProperty(value = "监管车(1:是 0否)")
    @JsonProperty(index = 80)
    private Integer regulationCar;
    /**
     * 车辆保险信息（保险公司，保险类型，保险期始，保险截至，保险险种） json
     */
    @ApiModelProperty(value = "车辆保险信息（保险公司，保险类型，保险期始，保险截至，保险险种）")
    @JsonProperty(index = 90)
    @JsonValid
    private String insurance;
    /**
     * 核载重量 float8
     */
    @ApiModelProperty(value = "核载重量")
    @JsonProperty(index = 100)
    private Double loadWeight;
    /**
     * 司机信息（包含司机id，司机姓名） jsonb
     */
    @ApiModelProperty(value = "司机信息（包含司机id，司机姓名）")
    @JsonProperty(index = 110)
    @JsonValid
    private String driverMessage;
    /**
     * 登记时间 timestamp
     */
    @ApiModelProperty(value = "登记时间")
    @JsonProperty(index = 120)
    private LocalDateTime registrationTime;
    /**
     * 更新时间 timestamp
     */
    @ApiModelProperty(value = "更新时间")
    @JsonProperty(index = 150)
    private LocalDateTime modifyTime;
    /**
     * 更新人姓名 varchar
     */
    @ApiModelProperty(value = "更新人姓名")
    @JsonProperty(index = 160)
    private String modifyUserName;
    /**
     * 更新人ID int8
     */
    @ApiModelProperty(value = "更新人ID")
    @JsonProperty(index = 170)
    private Long modifyUserId;
    /**
     * 创建时间 timestamp
     */
    @ApiModelProperty(value = "创建时间")
    @JsonProperty(index = 180)
    private LocalDateTime createTime;
    /**
     * 创建人命名 varchar
     */
    @ApiModelProperty(value = "创建人命名")
    @JsonProperty(index = 190)
    private String createUserName;
    /**
     * 创建人ID int8
     */
    @ApiModelProperty(value = "创建人ID")
    @JsonProperty(index = 200)
    private Long createUserId;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 230)
    private Long isvId;
    /**
     * 修改人名称 varchar
     */
    @ApiModelProperty(value = "修改人名称")
    @JsonProperty(index = 240)
    private String modifyRealName;
    /**
     * 创建人名称 varchar
     */
    @ApiModelProperty(value = "创建人名称")
    @JsonProperty(index = 250)
    private String createRealName;
    /**
     * 车龄 int2
     */
    @ApiModelProperty(value = "车龄")
    @JsonProperty(index = 260)
    private Integer vehicleAge;
    /**
     * 当前行驶总里程(万公里) numeric
     */
    @ApiModelProperty(value = "当前行驶总里程(万公里)")
    @JsonProperty(index = 270)
    private BigDecimal recentMileage;
    /**
     * 供应商no int8
     */
    @ApiModelProperty(value = "供应商no")
    @JsonProperty(index = 280)
    private Long supplierNo;
    /**
     * 车辆状态(10空闲;20运输) int2
     */
    @ApiModelProperty(value = "车辆状态(10空闲;20运输)")
    @JsonProperty(index = 290)
    private Integer vehicleStatus;
    /**
     * 当前位置 varchar
     */
    @ApiModelProperty(value = "当前位置")
    @JsonProperty(index = 300)
    private String currentLocation;
    /**
     * 车型（10:1.5T，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60 5T ,70  8T,80 10T,90  12T,100  20 尺柜,110 40尺柜 ,12040/50尺柜 ） int2
     */
    @ApiModelProperty(value = "车型（10:1.5T，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60 5T ,70  8T,80 10T,90  12T,100  20 尺柜,110 40尺柜 ,12040/50尺柜 ）")
    @JsonProperty(index = 310)
    private Integer models;



}






