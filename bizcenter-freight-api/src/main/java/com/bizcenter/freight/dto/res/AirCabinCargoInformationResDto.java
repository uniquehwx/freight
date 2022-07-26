package com.bizcenter.freight.dto.res;

import com.bitsun.core.framwork.api.dto.IResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 舱位产品信息表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class AirCabinCargoInformationResDto  implements IResponseDto{
    private static final long serialVersionUID = 1L;


    /**
     * ID int8
     */
    @ApiModelProperty(value = "ID")
    @JsonProperty(index = 0)
    private Long id;
    /**
     * 航班编码(关联他表) varchar
     */
    @ApiModelProperty(value = "航班编码(关联他表)")
    @JsonProperty(index = 10)
    private String flightNo;
    /**
     * 航线产品代码 varchar
     */
    @ApiModelProperty(value = "航线产品代码")
    @JsonProperty(index = 20)
    private String productNo;
    /**
     * 航司代码 varchar
     */
    @ApiModelProperty(value = "航司代码")
    @JsonProperty(index = 30)
    private String airCompanyCode;
    /**
     * 航班号 varchar
     */
    @ApiModelProperty(value = "航班号")
    @JsonProperty(index = 40)
    private String flightCode;
    /**
     * 目的港代码 varchar
     */
    @ApiModelProperty(value = "目的港代码")
    @JsonProperty(index = 50)
    private String destinationPort;
    /**
     * 板类型 varchar
     */
    @ApiModelProperty(value = "板类型")
    @JsonProperty(index = 60)
    private String panelType;
    /**
     * 航线运营 varchar
     */
    @ApiModelProperty(value = "航线运营")
    @JsonProperty(index = 70)
    private String flightService;
    /**
     * 航线操作 varchar
     */
    @ApiModelProperty(value = "航线操作")
    @JsonProperty(index = 80)
    private String flightOperator;
    /**
     * 公司 varchar
     */
    @ApiModelProperty(value = "公司")
    @JsonProperty(index = 90)
    private String company;
    /**
     * 部门 varchar
     */
    @ApiModelProperty(value = "部门")
    @JsonProperty(index = 100)
    private String department;
    /**
     * 更新时间 timestamp
     */
    @ApiModelProperty(value = "更新时间")
    @JsonProperty(index = 130)
    private LocalDateTime modifyTime;
    /**
     * 更新人姓名 varchar
     */
    @ApiModelProperty(value = "更新人姓名")
    @JsonProperty(index = 140)
    private String modifyUserName;
    /**
     * 更新人中文姓名 varchar
     */
    @ApiModelProperty(value = "更新人中文姓名")
    @JsonProperty(index = 150)
    private String modifyRealName;
    /**
     * 更新人ID int8
     */
    @ApiModelProperty(value = "更新人ID")
    @JsonProperty(index = 160)
    private Long modifyUserId;
    /**
     * 创建时间 timestamp
     */
    @ApiModelProperty(value = "创建时间")
    @JsonProperty(index = 170)
    private LocalDateTime createTime;
    /**
     * 创建人命名 varchar
     */
    @ApiModelProperty(value = "创建人命名")
    @JsonProperty(index = 180)
    private String createUserName;
    /**
     * 创建人中文命名 varchar
     */
    @ApiModelProperty(value = "创建人中文命名")
    @JsonProperty(index = 190)
    private String createRealName;
    /**
     * 创建人ID int8
     */
    @ApiModelProperty(value = "创建人ID")
    @JsonProperty(index = 200)
    private Long createUserId;
    /**
     * 生效时间 timestamp
     */
    @ApiModelProperty(value = "生效时间")
    @JsonProperty(index = 230)
    private LocalDateTime effectTime;
    /**
     * 失效时间 timestamp
     */
    @ApiModelProperty(value = "失效时间")
    @JsonProperty(index = 240)
    private LocalDateTime invalidTime;
    /**
     * 合同罚金 numeric
     */
    @ApiModelProperty(value = "合同罚金")
    @JsonProperty(index = 250)
    private BigDecimal contractPenalty;



}






