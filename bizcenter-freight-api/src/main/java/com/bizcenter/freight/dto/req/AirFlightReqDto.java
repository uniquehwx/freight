package com.bizcenter.freight.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 航班表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class AirFlightReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 公司编码(用于关联他表) varchar
     */
    @ApiModelProperty(value = "公司编码(用于关联他表)")
    @JsonProperty(index = 10)
    private String companyNo;
    /**
     * 航班编码(用于关联他表) varchar
     */
    @ApiModelProperty(value = "航班编码(用于关联他表)")
    @JsonProperty(index = 20)
    private String flightNo;
    /**
     * 航司代码 varchar
     */
    @ApiModelProperty(value = "航司代码")
    @JsonProperty(index = 30)
    private String airCompanyCode;
    /**
     * 货站 varchar
     */
    @ApiModelProperty(value = "货站")
    @JsonProperty(index = 40)
    private String freightStation;
    /**
     * 始发港代码 varchar
     */
    @ApiModelProperty(value = "始发港代码")
    @JsonProperty(index = 50)
    private String departurePortCode;
    /**
     * 始发港 varchar
     */
    @ApiModelProperty(value = "始发港")
    @JsonProperty(index = 60)
    private String departurePort;
    /**
     * 目的港代码 varchar
     */
    @ApiModelProperty(value = "目的港代码")
    @JsonProperty(index = 70)
    private String destinationPortCode;
    /**
     * 目的港 varchar
     */
    @ApiModelProperty(value = "目的港")
    @JsonProperty(index = 80)
    private String destinationPort;
    /**
     * 航班号 varchar
     */
    @ApiModelProperty(value = "航班号")
    @JsonProperty(index = 90)
    private String flightCode;
    /**
     * 班期 varchar
     */
    @ApiModelProperty(value = "班期")
    @JsonProperty(index = 100)
    private String schedule;
    /**
     * 起飞时刻ETD timestamp
     */
    @ApiModelProperty(value = "起飞时刻ETD")
    @JsonProperty(index = 110)
    private LocalDateTime departureTime;
    /**
     * 到达时刻ETA timestamp
     */
    @ApiModelProperty(value = "到达时刻ETA")
    @JsonProperty(index = 120)
    private LocalDateTime arrivalTime;
    /**
     * 截单时刻 timestamp
     */
    @ApiModelProperty(value = "截单时刻")
    @JsonProperty(index = 130)
    private LocalDateTime closingTime;
    /**
     * 截单天数 varchar
     */
    @ApiModelProperty(value = "截单天数")
    @JsonProperty(index = 140)
    private String closingDays;
    /**
     * 机型 varchar
     */
    @ApiModelProperty(value = "机型")
    @JsonProperty(index = 150)
    private String model;
    /**
     * 飞机类型 varchar
     */
    @ApiModelProperty(value = "飞机类型")
    @JsonProperty(index = 160)
    private String planeType;
    /**
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 170)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 180)
    private Long appId;
    /**
     * 更新人姓名 varchar
     */
    @ApiModelProperty(value = "更新人姓名")
    @JsonProperty(index = 210)
    private String modifyRealName;
    /**
     * 创建人中文命名 varchar
     */
    @ApiModelProperty(value = "创建人中文命名")
    @JsonProperty(index = 250)
    private String createRealName;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 280)
    private Long bg;

}






