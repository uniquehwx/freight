package com.bizcenter.freight.dto.res;

import com.bitsun.core.framwork.api.dto.IResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.bitsun.core.common.validator.In;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 安检订单表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class SecurityOrderResDto  implements IResponseDto{
    private static final long serialVersionUID = 1L;


    /**
     * ID int8
     */
    @ApiModelProperty(value = "ID")
    @JsonProperty(index = 0)
    private Long id;
    /**
     * 更新时间 timestamp
     */
    @ApiModelProperty(value = "更新时间")
    @JsonProperty(index = 30)
    private LocalDateTime modifyTime;
    /**
     * 更新人姓名 varchar
     */
    @ApiModelProperty(value = "更新人姓名")
    @JsonProperty(index = 40)
    private String modifyUserName;
    /**
     * 更新人ID int8
     */
    @ApiModelProperty(value = "更新人ID")
    @JsonProperty(index = 50)
    private Long modifyUserId;
    /**
     * 创建时间 timestamp
     */
    @ApiModelProperty(value = "创建时间")
    @JsonProperty(index = 60)
    private LocalDateTime createTime;
    /**
     * 创建人命名 varchar
     */
    @ApiModelProperty(value = "创建人命名")
    @JsonProperty(index = 70)
    private String createUserName;
    /**
     * 创建人ID int8
     */
    @ApiModelProperty(value = "创建人ID")
    @JsonProperty(index = 80)
    private Long createUserId;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 110)
    private Long isvId;
    /**
     * 创建人名称 varchar
     */
    @ApiModelProperty(value = "创建人名称")
    @JsonProperty(index = 120)
    private String createRealName;
    /**
     * 修改人名称 varchar
     */
    @ApiModelProperty(value = "修改人名称")
    @JsonProperty(index = 130)
    private String modifyRealName;
    /**
     * 打板单号 varchar
     */
    @ApiModelProperty(value = "打板单号")
    @JsonProperty(index = 140)
    private String playBoardNo;
    /**
     * 客户订单号 varchar
     */
    @ApiModelProperty(value = "客户订单号")
    @JsonProperty(index = 150)
    private String customerNo;
    /**
     * 航班号 varchar
     */
    @ApiModelProperty(value = "航班号")
    @JsonProperty(index = 160)
    private String flightNumber;
    /**
     * 客户编码 varchar
     */
    @ApiModelProperty(value = "客户编码")
    @JsonProperty(index = 170)
    private String customerCode;
    /**
     * 客户名称 varchar
     */
    @ApiModelProperty(value = "客户名称")
    @JsonProperty(index = 180)
    private String customerName;
    /**
     * 财务组织编码 varchar
     */
    @ApiModelProperty(value = "财务组织编码")
    @JsonProperty(index = 190)
    private String financialOrgCode;
    /**
     * 财务组织名称 varchar
     */
    @ApiModelProperty(value = "财务组织名称")
    @JsonProperty(index = 200)
    private String financialOrgName;
    /**
     * 客户联系人 varchar
     */
    @ApiModelProperty(value = "客户联系人")
    @JsonProperty(index = 210)
    private String customerContacts;
    /**
     * 客户联系电话 varchar
     */
    @ApiModelProperty(value = "客户联系电话")
    @JsonProperty(index = 220)
    private String customerPhone;
    /**
     * 业务类型 int2
     */
    @ApiModelProperty(value = "业务类型")
    @JsonProperty(index = 230)
    private Integer busType;
    /**
     * 重量(kg) numeric
     */
    @ApiModelProperty(value = "重量(kg)")
    @JsonProperty(index = 240)
    private BigDecimal weight;
    /**
     * 体积(立方米) numeric
     */
    @ApiModelProperty(value = "体积(立方米)")
    @JsonProperty(index = 250)
    private BigDecimal volume;
    /**
     * 数量(件) int4
     */
    @ApiModelProperty(value = "数量(件)")
    @JsonProperty(index = 260)
    private Integer quantity;
    /**
     * 中文品名 varchar
     */
    @ApiModelProperty(value = "中文品名")
    @JsonProperty(index = 270)
    private String zhName;
    /**
     * 货站 varchar
     */
    @ApiModelProperty(value = "货站")
    @JsonProperty(index = 280)
    private String goodsStation;
    /**
     * 订单来源 varchar
     */
    @ApiModelProperty(value = "订单来源")
    @JsonProperty(index = 290)
    private String orderSource;
    /**
     * 提单号 varchar
     */
    @ApiModelProperty(value = "提单号")
    @JsonProperty(index = 300)
    private String orderNo;
    /**
     * 入站时间 timestamp
     */
    @ApiModelProperty(value = "入站时间")
    @JsonProperty(index = 310)
    private LocalDateTime inStationTime;
    /**
     * 打板时间 timestamp
     */
    @ApiModelProperty(value = "打板时间")
    @JsonProperty(index = 320)
    private LocalDateTime playBoardTime;
    /**
     * 10待入站20已打板30已取消 int2
     */
    @ApiModelProperty(value = "10待入站20已打板30已取消")
    @JsonProperty(index = 330)
    private Integer status;
    /**
     * 备注 varchar
     */
    @ApiModelProperty(value = "备注")
    @JsonProperty(index = 340)
    private String remark;
    /**
     * 用户自定义1 varchar
     */
    @ApiModelProperty(value = "用户自定义1")
    @JsonProperty(index = 350)
    private String userDef1;
    /**
     * 用户自定义2 varchar
     */
    @ApiModelProperty(value = "用户自定义2")
    @JsonProperty(index = 360)
    private String userDef2;
    /**
     * 出港日期 timestamp
     */
    @ApiModelProperty(value = "出港日期")
    @JsonProperty(index = 370)
    private LocalDateTime departureDate;
    /**
     * 类型: 10自建 20空运订单 int2
     */
    @ApiModelProperty(value = "类型: 10自建 20空运订单")
    @JsonProperty(index = 380)
    private Integer type;
    /**
     * (订单中心)订单号 varchar
     */
    @ApiModelProperty(value = "(订单中心)订单号")
    @JsonProperty(index = 390)
    private String orderOutNo;
    /**
     * 行政部门编码 varchar
     */
    @ApiModelProperty(value = "行政部门编码")
    @JsonProperty(index = 400)
    private String departCode;
    /**
     * 客户财务部门 varchar
     */
    @ApiModelProperty(value = "客户财务部门")
    @JsonProperty(index = 410)
    private String orderSourceFinancial;
    /**
     * 创建人行政部门 varchar
     */
    @ApiModelProperty(value = "创建人行政部门")
    @JsonProperty(index = 420)
    private String initCreatDepart;
    /**
     * 订舱单号 varchar
     */
    @ApiModelProperty(value = "订舱单号")
    @JsonProperty(index = 430)
    private String bookingBusinessNo;



}






