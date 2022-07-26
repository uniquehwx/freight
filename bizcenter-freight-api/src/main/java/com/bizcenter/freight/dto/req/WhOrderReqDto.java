package com.bizcenter.freight.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.bitsun.core.common.validator.JsonValid;
    import com.bitsun.core.common.validator.In;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 仓库订单(入库单)表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class WhOrderReqDto implements Serializable{
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
     * 入库单号 varchar
     */
    @ApiModelProperty(value = "入库单号")
    @JsonProperty(index = 140)
    private String inStorageNo;
    /**
     * 客户订单号 varchar
     */
    @ApiModelProperty(value = "客户订单号")
    @JsonProperty(index = 150)
    private String customerNo;
    /**
     * 客户编码 varchar
     */
    @ApiModelProperty(value = "客户编码")
    @JsonProperty(index = 160)
    private String customerCode;
    /**
     * 客户联系人 varchar
     */
    @ApiModelProperty(value = "客户联系人")
    @JsonProperty(index = 170)
    private String customerContacts;
    /**
     * 联系电话 varchar
     */
    @ApiModelProperty(value = "联系电话")
    @JsonProperty(index = 180)
    private String customerPhone;
    /**
     * 业务类型 int4
     */
    @ApiModelProperty(value = "业务类型")
    @JsonProperty(index = 190)
    private Integer busType;
    /**
     * 重量(kg) numeric
     */
    @ApiModelProperty(value = "重量(kg)")
    @JsonProperty(index = 200)
    private BigDecimal weight;
    /**
     * 体积(立方米) numeric
     */
    @ApiModelProperty(value = "体积(立方米)")
    @JsonProperty(index = 210)
    private BigDecimal volume;
    /**
     * 数量(件) int4
     */
    @ApiModelProperty(value = "数量(件)")
    @JsonProperty(index = 220)
    private Integer quantity;
    /**
     * 中文品名 varchar
     */
    @ApiModelProperty(value = "中文品名")
    @JsonProperty(index = 230)
    private String zhName;
    /**
     * 实际重量(kg) numeric
     */
    @ApiModelProperty(value = "实际重量(kg)")
    @JsonProperty(index = 240)
    private BigDecimal actualWeight;
    /**
     * 实际数量(件) int4
     */
    @ApiModelProperty(value = "实际数量(件)")
    @JsonProperty(index = 250)
    private Integer actualQuantity;
    /**
     * 实际体积(立方米) numeric
     */
    @ApiModelProperty(value = "实际体积(立方米)")
    @JsonProperty(index = 260)
    private BigDecimal actualVolume;
    /**
     * 实际体积重 numeric
     */
    @ApiModelProperty(value = "实际体积重")
    @JsonProperty(index = 270)
    private BigDecimal actualVolumeWeight;
    /**
     * 尺寸(长宽高) json
     */
    @ApiModelProperty(value = "尺寸(长宽高)")
    @JsonProperty(index = 280)
    @JsonValid
    private String size;
    /**
     * 随货资料(10:有，20无) int2
     */
    @ApiModelProperty(value = "随货资料(10:有，20无)")
    @JsonProperty(index = 290)
    private Integer accompanyData;
    /**
     * 提单号 varchar
     */
    @ApiModelProperty(value = "提单号")
    @JsonProperty(index = 300)
    private String orderNo;
    /**
     * 10待入库20已入库30待出库40部分出库50已出库60已取消 int2
     */
    @ApiModelProperty(value = "10待入库20已入库30待出库40部分出库50已出库60已取消")
    @JsonProperty(index = 310)
    //todo: 请检查此属性的取值范围（可使用@In或@InOrNull来限定取值）
    @In(values={0,1})
    private Integer status;
    /**
     * 单证上传时间 timestamp
     */
    @ApiModelProperty(value = "单证上传时间")
    @JsonProperty(index = 320)
    private LocalDateTime imageUploadTime;
    /**
     * 入库时间 timestamp
     */
    @ApiModelProperty(value = "入库时间")
    @JsonProperty(index = 330)
    private LocalDateTime inStorageTime;
    /**
     * 报关审结时间 timestamp
     */
    @ApiModelProperty(value = "报关审结时间")
    @JsonProperty(index = 340)
    private LocalDateTime customsCheckTime;
    /**
     * 出库时间 timestamp
     */
    @ApiModelProperty(value = "出库时间")
    @JsonProperty(index = 350)
    private LocalDateTime outStorageTime;
    /**
     * 订单流转 varchar
     */
    @ApiModelProperty(value = "订单流转")
    @JsonProperty(index = 360)
    private String orderSource;
    /**
     * 业务员 varchar
     */
    @ApiModelProperty(value = "业务员")
    @JsonProperty(index = 370)
    private String saleUser;
    /**
     * 客服 varchar
     */
    @ApiModelProperty(value = "客服")
    @JsonProperty(index = 380)
    private String serviceUser;
    /**
     * 货物损坏情况 varchar
     */
    @ApiModelProperty(value = "货物损坏情况")
    @JsonProperty(index = 390)
    private String goodsDamageInfo;
    /**
     * 仓库名称 varchar
     */
    @ApiModelProperty(value = "仓库名称")
    @JsonProperty(index = 400)
    private String warehouseName;
    /**
     * 货站 varchar
     */
    @ApiModelProperty(value = "货站")
    @JsonProperty(index = 410)
    private String goodsStation;
    /**
     * 同步状态(10未同步，20已下发，30已同步) int2
     */
    @ApiModelProperty(value = "同步状态(10未同步，20已下发，30已同步)")
    @JsonProperty(index = 420)
    private Integer syncStatus;
    /**
     * 出港日期 timestamp
     */
    @ApiModelProperty(value = "出港日期")
    @JsonProperty(index = 430)
    private LocalDateTime departTime;
    /**
     * 备注 varchar
     */
    @ApiModelProperty(value = "备注")
    @JsonProperty(index = 440)
    private String remark;
    /**
     * 用户自定义1 varchar
     */
    @ApiModelProperty(value = "用户自定义1")
    @JsonProperty(index = 450)
    private String userDef1;
    /**
     * 用户自定义2 varchar
     */
    @ApiModelProperty(value = "用户自定义2")
    @JsonProperty(index = 460)
    private String userDef2;
    /**
     * 客户名称 varchar
     */
    @ApiModelProperty(value = "客户名称")
    @JsonProperty(index = 470)
    private String customerName;
    /**
     * 类型,10普通订单,20批次订单 int4
     */
    @ApiModelProperty(value = "类型,10普通订单,20批次订单")
    @JsonProperty(index = 480)
    private Integer type;
    /**
     * 入库单号 varchar
     */
    @ApiModelProperty(value = "入库单号")
    @JsonProperty(index = 490)
    private String inOrderNo;
    /**
     * 仓库编码 varchar
     */
    @ApiModelProperty(value = "仓库编码")
    @JsonProperty(index = 500)
    private String warehouseCode;
    /**
     * 财务组织编码 varchar
     */
    @ApiModelProperty(value = "财务组织编码")
    @JsonProperty(index = 510)
    private String financialOrgCode;
    /**
     * 计费重量(kg) numeric
     */
    @ApiModelProperty(value = "计费重量(kg)")
    @JsonProperty(index = 520)
    private BigDecimal billingWeight;
    /**
     * 空运主单号 varchar
     */
    @ApiModelProperty(value = "空运主单号")
    @JsonProperty(index = 530)
    private String mainOrderNo;
    /**
     * 入仓号 varchar
     */
    @ApiModelProperty(value = "入仓号")
    @JsonProperty(index = 540)
    private String inWarehouseNo;
    /**
     * 客户财务部门 varchar
     */
    @ApiModelProperty(value = "客户财务部门")
    @JsonProperty(index = 550)
    private String orderSourceFinancial;
    /**
     * 创建人行政部门 varchar
     */
    @ApiModelProperty(value = "创建人行政部门")
    @JsonProperty(index = 560)
    private String initCreatDepart;
    /**
     * 自己行政部门信息 varchar
     */
    @ApiModelProperty(value = "自己行政部门信息")
    @JsonProperty(index = 570)
    private String departCode;
    /**
     * 预计入仓时间 timestamp
     */
    @ApiModelProperty(value = "预计入仓时间")
    @JsonProperty(index = 580)
    private LocalDateTime estimatedTimeWarehouse;
    /**
     * 服务类型(0:自建，10:空运) int2
     */
    @ApiModelProperty(value = "服务类型(0:自建，10:空运)")
    @JsonProperty(index = 590)
    private Integer externalServiceType;
    /**
     * 合并单号 varchar
     */
    @ApiModelProperty(value = "合并单号")
    @JsonProperty(index = 600)
    private String mergeOrderNo;

}






