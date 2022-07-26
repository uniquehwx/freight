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
 * 出库表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class WhOutOrderResDto  implements IResponseDto{
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
     * 入仓号 varchar
     */
    @ApiModelProperty(value = "入仓号")
    @JsonProperty(index = 140)
    private String inStorageNo;
    /**
     * 客户编码 varchar
     */
    @ApiModelProperty(value = "客户编码")
    @JsonProperty(index = 150)
    private String customerCode;
    /**
     * 仓库名称 varchar
     */
    @ApiModelProperty(value = "仓库名称")
    @JsonProperty(index = 160)
    private String warehouseName;
    /**
     * 出库时间 timestamp
     */
    @ApiModelProperty(value = "出库时间")
    @JsonProperty(index = 170)
    private LocalDateTime outStorageTime;
    /**
     * 状态30待出库40部分出库50已出库60已取消 int2
     */
    @ApiModelProperty(value = "状态30待出库40部分出库50已出库60已取消")
    @JsonProperty(index = 180)
    private Integer status;
    /**
     * 同步状态(10未同步，20已下发，30已回传) int2
     */
    @ApiModelProperty(value = "同步状态(10未同步，20已下发，30已回传)")
    @JsonProperty(index = 190)
    private Integer syncStatus;
    /**
     * 备注 varchar
     */
    @ApiModelProperty(value = "备注")
    @JsonProperty(index = 200)
    private String remark;
    /**
     * 用户自定义1 varchar
     */
    @ApiModelProperty(value = "用户自定义1")
    @JsonProperty(index = 210)
    private String userDef1;
    /**
     * 用户自定义2 varchar
     */
    @ApiModelProperty(value = "用户自定义2")
    @JsonProperty(index = 220)
    private String userDef2;
    /**
     * 数量 int4
     */
    @ApiModelProperty(value = "数量")
    @JsonProperty(index = 230)
    private Integer quantity;
    /**
     * 实际数量 int4
     */
    @ApiModelProperty(value = "实际数量")
    @JsonProperty(index = 240)
    private Integer actualQuantity;
    /**
     * 实际重量 numeric
     */
    @ApiModelProperty(value = "实际重量")
    @JsonProperty(index = 250)
    private BigDecimal actualWeight;
    /**
     * 实际体积 numeric
     */
    @ApiModelProperty(value = "实际体积")
    @JsonProperty(index = 260)
    private BigDecimal actualVolume;
    /**
     * 分单号 varchar
     */
    @ApiModelProperty(value = "分单号")
    @JsonProperty(index = 270)
    private String partOrderNo;
    /**
     * 客户名称 varchar
     */
    @ApiModelProperty(value = "客户名称")
    @JsonProperty(index = 280)
    private String customerName;
    /**
     * 订单流转 varchar
     */
    @ApiModelProperty(value = "订单流转")
    @JsonProperty(index = 290)
    private String orderSource;
    /**
     * 仓库编码 varchar
     */
    @ApiModelProperty(value = "仓库编码")
    @JsonProperty(index = 300)
    private String warehouseCode;
    /**
     * 出库单号 varchar
     */
    @ApiModelProperty(value = "出库单号")
    @JsonProperty(index = 310)
    private String outOrderNo;
    /**
     * 出库单类型，10出库，20锁定 int2
     */
    @ApiModelProperty(value = "出库单类型，10出库，20锁定")
    @JsonProperty(index = 320)
    private Integer type;
    /**
     * 客户订单号 varchar
     */
    @ApiModelProperty(value = "客户订单号")
    @JsonProperty(index = 330)
    private String customerNo;



}






