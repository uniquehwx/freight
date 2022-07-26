package com.bizcenter.freight.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.bitsun.core.common.validator.JsonValid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 板型表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class AirPanelReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 航司代码 varchar
     */
    @ApiModelProperty(value = "航司代码")
    @JsonProperty(index = 10)
    private String airCompanyCode;
    /**
     * 机型 varchar
     */
    @ApiModelProperty(value = "机型")
    @JsonProperty(index = 20)
    private String model;
    /**
     * 板型代码 varchar
     */
    @ApiModelProperty(value = "板型代码")
    @JsonProperty(index = 30)
    private String panelTypeCode;
    /**
     * 别称 varchar
     */
    @ApiModelProperty(value = "别称")
    @JsonProperty(index = 40)
    private String altName;
    /**
     * 体积 varchar
     */
    @ApiModelProperty(value = "体积")
    @JsonProperty(index = 50)
    private String cubicMeter;
    /**
     * 长 varchar
     */
    @ApiModelProperty(value = "长")
    @JsonProperty(index = 60)
    private String panelLong;
    /**
     * 宽 varchar
     */
    @ApiModelProperty(value = "宽")
    @JsonProperty(index = 70)
    private String panelWide;
    /**
     * 高 varchar
     */
    @ApiModelProperty(value = "高")
    @JsonProperty(index = 80)
    private String panelHigh;
    /**
     * 板型尺寸 json
     */
    @ApiModelProperty(value = "板型尺寸")
    @JsonProperty(index = 90)
    @JsonValid
    private String panelSize;
    /**
     * 限重 varchar
     */
    @ApiModelProperty(value = "限重")
    @JsonProperty(index = 100)
    private String weightLimit;
    /**
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 110)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 120)
    private Long appId;
    /**
     * 更新人中文姓名 varchar
     */
    @ApiModelProperty(value = "更新人中文姓名")
    @JsonProperty(index = 150)
    private String modifyRealName;
    /**
     * 创建人命名 varchar
     */
    @ApiModelProperty(value = "创建人命名")
    @JsonProperty(index = 190)
    private String createRealName;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 220)
    private Long bg;

}






