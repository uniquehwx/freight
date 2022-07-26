package com.bizcenter.freight.dto.res;

import com.bitsun.core.framwork.api.dto.IResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import com.bitsun.core.common.validator.JsonValid;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 订单
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class OrderResDto  implements IResponseDto{
    private static final long serialVersionUID = 1L;


    /**
     * 主键id int8
     */
    @ApiModelProperty(value = "主键id")
    @JsonProperty(index = 0)
    private Long id;
    /**
     * 订单号 varchar
     */
    @ApiModelProperty(value = "订单号")
    @JsonProperty(index = 10)
    private String orderNo;
    /**
     * 交易类型(1-航空订单，5-地面操作订单) int4
     */
    @ApiModelProperty(value = "交易类型(1-航空订单，5-地面操作订单)")
    @JsonProperty(index = 20)
    private Integer tradeType;
    /**
     * 客户编码 varchar
     */
    @ApiModelProperty(value = "客户编码")
    @JsonProperty(index = 30)
    private String customerCode;
    /**
     * 委托方联系人 varchar
     */
    @ApiModelProperty(value = "委托方联系人")
    @JsonProperty(index = 40)
    private String clientName;
    /**
     * 委托方联系人电话 varchar
     */
    @ApiModelProperty(value = "委托方联系人电话")
    @JsonProperty(index = 50)
    private String clinetPhone;
    /**
     * 父单单号 varchar
     */
    @ApiModelProperty(value = "父单单号")
    @JsonProperty(index = 60)
    private String outOrderNo;
    /**
     * 单据类型(1-主订单，2-子订单) int4
     */
    @ApiModelProperty(value = "单据类型(1-主订单，2-子订单)")
    @JsonProperty(index = 70)
    private Integer orderType;
    /**
     * 交易状态 int4
     */
    @ApiModelProperty(value = "交易状态")
    @JsonProperty(index = 80)
    private Integer tradeStatus;
    /**
     * 供应商编码 varchar
     */
    @ApiModelProperty(value = "供应商编码")
    @JsonProperty(index = 90)
    private String supllierCode;
    /**
     * 始发地编码 varchar
     */
    @ApiModelProperty(value = "始发地编码")
    @JsonProperty(index = 100)
    private String startPointCode;
    /**
     * 目的地编码 varchar
     */
    @ApiModelProperty(value = "目的地编码")
    @JsonProperty(index = 110)
    private String endPointCode;
    /**
     * 备注 varchar
     */
    @ApiModelProperty(value = "备注")
    @JsonProperty(index = 120)
    private String remark;
    /**
     * 创建者id int8
     */
    @ApiModelProperty(value = "创建者id")
    @JsonProperty(index = 160)
    private Long createUserId;
    /**
     * 创建者姓名 varchar
     */
    @ApiModelProperty(value = "创建者姓名")
    @JsonProperty(index = 170)
    private String createUserName;
    /**
     * 创建时间 timestamp
     */
    @ApiModelProperty(value = "创建时间")
    @JsonProperty(index = 180)
    private LocalDateTime createTime;
    /**
     * 修改人id int8
     */
    @ApiModelProperty(value = "修改人id")
    @JsonProperty(index = 190)
    private Long modifyUserId;
    /**
     * 修改人名称 varchar
     */
    @ApiModelProperty(value = "修改人名称")
    @JsonProperty(index = 200)
    private String modifyUserName;
    /**
     * 修改时间 timestamp
     */
    @ApiModelProperty(value = "修改时间")
    @JsonProperty(index = 210)
    private LocalDateTime modifyTime;
    /**
     * 扩展信息 jsonb
     */
    @ApiModelProperty(value = "扩展信息")
    @JsonProperty(index = 220)
    @JsonValid
    private String extData;
    /**
     * 业务类型 int4
     */
    @ApiModelProperty(value = "业务类型")
    @JsonProperty(index = 230)
    private Integer businessType;
    /**
     * 订单完成时间 timestamp
     */
    @ApiModelProperty(value = "订单完成时间")
    @JsonProperty(index = 240)
    private LocalDateTime completionTime;
    /**
     * 业务员 varchar
     */
    @ApiModelProperty(value = "业务员")
    @JsonProperty(index = 250)
    private String salesClerkCode;



}






