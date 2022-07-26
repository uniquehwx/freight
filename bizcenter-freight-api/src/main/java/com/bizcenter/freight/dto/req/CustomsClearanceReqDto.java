package com.bizcenter.freight.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
    import com.bitsun.core.common.validator.In;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 报关表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class CustomsClearanceReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 10 创建服务  20 完成服务  30服务取消 int2
     */
    @ApiModelProperty(value = "10 创建服务  20 完成服务  30服务取消")
    @JsonProperty(index = 10)
    //todo: 请检查此属性的取值范围（可使用@In或@InOrNull来限定取值）
    @In(values={0,1})
    private Integer status;
    /**
     * 报关服务单号 varchar
     */
    @ApiModelProperty(value = "报关服务单号")
    @JsonProperty(index = 20)
    private String orderNo;
    /**
     * 客户订单号 varchar
     */
    @ApiModelProperty(value = "客户订单号")
    @JsonProperty(index = 30)
    private String customerNo;
    /**
     * 航班号 varchar
     */
    @ApiModelProperty(value = "航班号")
    @JsonProperty(index = 40)
    private String flightNumber;
    /**
     * 客户编码 varchar
     */
    @ApiModelProperty(value = "客户编码")
    @JsonProperty(index = 50)
    private String customerCode;
    /**
     * 客户名称 varchar
     */
    @ApiModelProperty(value = "客户名称")
    @JsonProperty(index = 60)
    private String customerName;
    /**
     * 财务组织编码 varchar
     */
    @ApiModelProperty(value = "财务组织编码")
    @JsonProperty(index = 70)
    private String financialOrgCode;
    /**
     * 行政组织编码 varchar
     */
    @ApiModelProperty(value = "行政组织编码")
    @JsonProperty(index = 80)
    private String departCode;
    /**
     * 增值服务单号 varchar
     */
    @ApiModelProperty(value = "增值服务单号")
    @JsonProperty(index = 90)
    private String addedServiceNo;
    /**
     * 业务类型 int2
     */
    @ApiModelProperty(value = "业务类型")
    @JsonProperty(index = 100)
    private Integer busType;
    /**
     * 订单来源 varchar
     */
    @ApiModelProperty(value = "订单来源")
    @JsonProperty(index = 110)
    private String orderSource;
    /**
     * 提单号 varchar
     */
    @ApiModelProperty(value = "提单号")
    @JsonProperty(index = 120)
    private String billlandingNo;
    /**
     * 备注信息 varchar
     */
    @ApiModelProperty(value = "备注信息")
    @JsonProperty(index = 130)
    private String remark;
    /**
     * 服务完成时间 timestamp
     */
    @ApiModelProperty(value = "服务完成时间")
    @JsonProperty(index = 140)
    private LocalDateTime serviceCompletionTime;
    /**
     * 用户自定义2 varchar
     */
    @ApiModelProperty(value = "用户自定义2")
    @JsonProperty(index = 150)
    private String userDef2;
    /**
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 160)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 170)
    private Long appId;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 250)
    private Long bg;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 260)
    private Long isvId;
    /**
     * 创建人名称 varchar
     */
    @ApiModelProperty(value = "创建人名称")
    @JsonProperty(index = 270)
    private String createRealName;
    /**
     * 修改人名称 varchar
     */
    @ApiModelProperty(value = "修改人名称")
    @JsonProperty(index = 280)
    private String modifyRealName;
    /**
     * 类型: 10自建 20空运订单 int4
     */
    @ApiModelProperty(value = "类型: 10自建 20空运订单")
    @JsonProperty(index = 290)
    private Integer type;
    /**
     * 客户财务部门 varchar
     */
    @ApiModelProperty(value = "客户财务部门")
    @JsonProperty(index = 300)
    private String orderSourceFinancial;
    /**
     * 创建人行政部门 varchar
     */
    @ApiModelProperty(value = "创建人行政部门")
    @JsonProperty(index = 310)
    private String initCreatDepart;
    /**
     * 空运主单号 varchar
     */
    @ApiModelProperty(value = "空运主单号")
    @JsonProperty(index = 320)
    private String mainOrderNo;

}






