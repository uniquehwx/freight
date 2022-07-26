package com.bizcenter.freight.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 出库明细表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class WhOutOrderDetailReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 10)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 20)
    private Long appId;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 100)
    private Long bg;
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
     * 出库单id int8
     */
    @ApiModelProperty(value = "出库单id")
    @JsonProperty(index = 140)
    private Long outOrderId;
    /**
     * 入仓号 varchar
     */
    @ApiModelProperty(value = "入仓号")
    @JsonProperty(index = 150)
    private String inStorageNo;
    /**
     * 托盘号 varchar
     */
    @ApiModelProperty(value = "托盘号")
    @JsonProperty(index = 160)
    private String trayNo;
    /**
     * 出库数量(件) int4
     */
    @ApiModelProperty(value = "出库数量(件)")
    @JsonProperty(index = 170)
    private Integer quantity;
    /**
     * 出库体积(立方米) numeric
     */
    @ApiModelProperty(value = "出库体积(立方米)")
    @JsonProperty(index = 180)
    private BigDecimal volume;
    /**
     * 出库毛重(kg) numeric
     */
    @ApiModelProperty(value = "出库毛重(kg)")
    @JsonProperty(index = 190)
    private BigDecimal weight;
    /**
     * 出库照片,多个照片用逗号隔开 bpchar
     */
    @ApiModelProperty(value = "出库照片,多个照片用逗号隔开")
    @JsonProperty(index = 200)
    private String images;
    /**
     * 车牌号 varchar
     */
    @ApiModelProperty(value = "车牌号")
    @JsonProperty(index = 210)
    private String licensePlateNumber;
    /**
     * 封条号 varchar
     */
    @ApiModelProperty(value = "封条号")
    @JsonProperty(index = 220)
    private String sealNo;
    /**
     * 司机名称 varchar
     */
    @ApiModelProperty(value = "司机名称")
    @JsonProperty(index = 230)
    private String driverName;
    /**
     * 备注 varchar
     */
    @ApiModelProperty(value = "备注")
    @JsonProperty(index = 240)
    private String remark;
    /**
     * 用户自定义1 varchar
     */
    @ApiModelProperty(value = "用户自定义1")
    @JsonProperty(index = 250)
    private String userDef1;
    /**
     * 用户自定义2 varchar
     */
    @ApiModelProperty(value = "用户自定义2")
    @JsonProperty(index = 260)
    private String userDef2;
    /**
     * 供应商 varchar
     */
    @ApiModelProperty(value = "供应商")
    @JsonProperty(index = 270)
    private String supplierNo;
    /**
     * 出库单号 varchar
     */
    @ApiModelProperty(value = "出库单号")
    @JsonProperty(index = 280)
    private String outOrderNo;

}






