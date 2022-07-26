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
 * 提单号资源池表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class AirLadingBillNoPoolReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 航司代码 varchar
     */
    @ApiModelProperty(value = "航司代码")
    @JsonProperty(index = 10)
    private String airCompanyCode;
    /**
     * 公司代码(提单起始号) varchar
     */
    @ApiModelProperty(value = "公司代码(提单起始号)")
    @JsonProperty(index = 20)
    private String companyCode;
    /**
     * 提单号 varchar
     */
    @ApiModelProperty(value = "提单号")
    @JsonProperty(index = 30)
    private String ladingBillNo;
    /**
     * 类型 varchar
     */
    @ApiModelProperty(value = "类型")
    @JsonProperty(index = 40)
    private String ladingBillType;
    /**
     * 使用状态: 10 未使用，20 使用中，30 已使用 , 40 已禁用 , 50 已作废 int2
     */
    @ApiModelProperty(value = "使用状态: 10 未使用，20 使用中，30 已使用 , 40 已禁用 , 50 已作废")
    @JsonProperty(index = 50)
    private Integer ladingBillNoStatusCode;
    /**
     * 颁发时间 timestamp
     */
    @ApiModelProperty(value = "颁发时间")
    @JsonProperty(index = 60)
    private LocalDateTime issuedAt;
    /**
     * 不早于 timestamp
     */
    @ApiModelProperty(value = "不早于")
    @JsonProperty(index = 70)
    private LocalDateTime notBefore;
    /**
     * 不晚于 timestamp
     */
    @ApiModelProperty(value = "不晚于")
    @JsonProperty(index = 80)
    private LocalDateTime notAfter;
    /**
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 90)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 100)
    private Long appId;
    /**
     * 更新人中文姓名 varchar
     */
    @ApiModelProperty(value = "更新人中文姓名")
    @JsonProperty(index = 130)
    private String modifyRealName;
    /**
     * 创建人中文命名 varchar
     */
    @ApiModelProperty(value = "创建人中文命名")
    @JsonProperty(index = 170)
    private String createRealName;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 200)
    private Long bg;
    /**
     * 状态码：0 提单号生成、1 绑定订单、2 订单完成、3 解绑订单、4 禁用、5 启用、6 作废 int2
     */
    @ApiModelProperty(value = "状态码：0 提单号生成、1 绑定订单、2 订单完成、3 解绑订单、4 禁用、5 启用、6 作废")
    @JsonProperty(index = 210)
    private Integer planningStatusCode;
    /**
     * 订单号 varchar
     */
    @ApiModelProperty(value = "订单号")
    @JsonProperty(index = 220)
    private String orderNo;

}






