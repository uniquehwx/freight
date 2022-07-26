package com.bizcenter.freight.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import com.bitsun.core.common.validator.JsonValid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 司机表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class DriverReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 司机姓名 varchar
     */
    @ApiModelProperty(value = "司机姓名")
    @JsonProperty(index = 10)
    private String driverName;
    /**
     * 手机号 varchar
     */
    @ApiModelProperty(value = "手机号")
    @JsonProperty(index = 20)
    private String driverMobileNo;
    /**
     * 备注 varchar
     */
    @ApiModelProperty(value = "备注")
    @JsonProperty(index = 30)
    private String remark;
    /**
     * 供应商no varchar
     */
    @ApiModelProperty(value = "供应商no")
    @JsonProperty(index = 40)
    private String supplierNo;
    /**
     * 身份证/驾驶证号 varchar
     */
    @ApiModelProperty(value = "身份证/驾驶证号")
    @JsonProperty(index = 50)
    private String licenseNumber;
    /**
     * 身份证正面照 varchar
     */
    @ApiModelProperty(value = "身份证正面照")
    @JsonProperty(index = 60)
    private String idFrontImgUrl;
    /**
     * 身份证背面照 varchar
     */
    @ApiModelProperty(value = "身份证背面照")
    @JsonProperty(index = 70)
    private String idBackImgUrl;
    /**
     * 驾驶证正面照url varchar
     */
    @ApiModelProperty(value = "驾驶证正面照url")
    @JsonProperty(index = 80)
    private String driveFrontImgUrl;
    /**
     * 驾驶证背面照url varchar
     */
    @ApiModelProperty(value = "驾驶证背面照url")
    @JsonProperty(index = 90)
    private String driveBackImgUrl;
    /**
     * 准驾车型 varchar
     */
    @ApiModelProperty(value = "准驾车型")
    @JsonProperty(index = 100)
    private String driverType;
    /**
     * 驾驶证期限 timestamp
     */
    @ApiModelProperty(value = "驾驶证期限")
    @JsonProperty(index = 110)
    private LocalDateTime driverDeadline;
    /**
     * 从业资格号 varchar
     */
    @ApiModelProperty(value = "从业资格号")
    @JsonProperty(index = 120)
    private String qualificationsNo;
    /**
     * 从业类别(10：危险品运输，20 ：货物运输，30 ：客车运输) int2
     */
    @ApiModelProperty(value = "从业类别(10：危险品运输，20 ：货物运输，30 ：客车运输)")
    @JsonProperty(index = 130)
    private Integer qualificationType;
    /**
     * 资格证照片 varchar
     */
    @ApiModelProperty(value = "资格证照片")
    @JsonProperty(index = 140)
    private String qualificationUrl;
    /**
     * 当前驾驶分数 int8
     */
    @ApiModelProperty(value = "当前驾驶分数")
    @JsonProperty(index = 150)
    private Long driveGrade;
    /**
     * 驾驶员no varchar
     */
    @ApiModelProperty(value = "驾驶员no")
    @JsonProperty(index = 160)
    private String driverNo;
    /**
     *  是否是内部员工 1是 0否 int2
     */
    @ApiModelProperty(value = " 是否是内部员工 1是 0否")
    @JsonProperty(index = 170)
    private Integer isInternalDriver;
    /**
     * 10:正常 20 休假 30 已离职 int2
     */
    @ApiModelProperty(value = "10:正常 20 休假 30 已离职")
    @JsonProperty(index = 180)
    private Integer workingState;
    /**
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 190)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 200)
    private Long appId;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 280)
    private Long bg;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 290)
    private Long isvId;
    /**
     * 创建人名称 varchar
     */
    @ApiModelProperty(value = "创建人名称")
    @JsonProperty(index = 300)
    private String createRealName;
    /**
     * 修改人名称 varchar
     */
    @ApiModelProperty(value = "修改人名称")
    @JsonProperty(index = 310)
    private String modifyRealName;
    /**
     * 10男,20女 int2
     */
    @ApiModelProperty(value = "10男,20女")
    @JsonProperty(index = 320)
    private Integer sex;
    /**
     * 资质证有效期 timestamp
     */
    @ApiModelProperty(value = "资质证有效期")
    @JsonProperty(index = 330)
    private LocalDateTime qualificationDeadline;
    /**
     * 入职日期 timestamp
     */
    @ApiModelProperty(value = "入职日期")
    @JsonProperty(index = 340)
    private LocalDateTime entryTime;
    /**
     * 默认车辆信息（车辆id,车辆车牌号） jsonb
     */
    @ApiModelProperty(value = "默认车辆信息（车辆id,车辆车牌号）")
    @JsonProperty(index = 350)
    @JsonValid
    private String vehicleMessage;

}






