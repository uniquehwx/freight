package com.bizcenter.freight.dto.res;

import com.bitsun.core.framwork.api.dto.IResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import com.bitsun.core.common.validator.In;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 订舱服务表 
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class BookingBusinessResDto  implements IResponseDto{
    private static final long serialVersionUID = 1L;


    /**
     * ID int8
     */
    @ApiModelProperty(value = "ID")
    @JsonProperty(index = 0)
    private Long id;
    /**
     * 10 创建服务  20 完成服务  30服务取消 int2
     */
    @ApiModelProperty(value = "10 创建服务  20 完成服务  30服务取消")
    @JsonProperty(index = 10)
    private Integer status;
    /**
     * 订舱服务单号 varchar
     */
    @ApiModelProperty(value = "订舱服务单号")
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
    private String billLadingNo;
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
     * 类型: 10自建 20空运订单 int4
     */
    @ApiModelProperty(value = "类型: 10自建 20空运订单")
    @JsonProperty(index = 150)
    private Integer type;
    /**
     * 客户财务部门 varchar
     */
    @ApiModelProperty(value = "客户财务部门")
    @JsonProperty(index = 160)
    private String orderSourceFinancial;
    /**
     * 创建人行政部门 varchar
     */
    @ApiModelProperty(value = "创建人行政部门")
    @JsonProperty(index = 170)
    private String initCreatDepart;
    /**
     * 更新时间 timestamp
     */
    @ApiModelProperty(value = "更新时间")
    @JsonProperty(index = 200)
    private LocalDateTime modifyTime;
    /**
     * 更新人姓名 varchar
     */
    @ApiModelProperty(value = "更新人姓名")
    @JsonProperty(index = 210)
    private String modifyUserName;
    /**
     * 更新人ID int8
     */
    @ApiModelProperty(value = "更新人ID")
    @JsonProperty(index = 220)
    private Long modifyUserId;
    /**
     * 创建时间 timestamp
     */
    @ApiModelProperty(value = "创建时间")
    @JsonProperty(index = 230)
    private LocalDateTime createTime;
    /**
     * 创建人命名 varchar
     */
    @ApiModelProperty(value = "创建人命名")
    @JsonProperty(index = 240)
    private String createUserName;
    /**
     * 创建人ID int8
     */
    @ApiModelProperty(value = "创建人ID")
    @JsonProperty(index = 250)
    private Long createUserId;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 280)
    private Long isvId;
    /**
     * 创建人名称 varchar
     */
    @ApiModelProperty(value = "创建人名称")
    @JsonProperty(index = 290)
    private String createRealName;
    /**
     * 修改人名称 varchar
     */
    @ApiModelProperty(value = "修改人名称")
    @JsonProperty(index = 300)
    private String modifyRealName;



}






