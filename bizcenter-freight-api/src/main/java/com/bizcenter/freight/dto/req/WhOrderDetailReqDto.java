package com.bizcenter.freight.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
    import com.bitsun.core.common.validator.In;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 入库明细表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class WhOrderDetailReqDto implements Serializable{
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
     * 入仓号 varchar
     */
    @ApiModelProperty(value = "入仓号")
    @JsonProperty(index = 140)
    private String inStorageNo;
    /**
     * 托盘号 varchar
     */
    @ApiModelProperty(value = "托盘号")
    @JsonProperty(index = 150)
    private String trayNo;
    /**
     * 入库数量(件) int4
     */
    @ApiModelProperty(value = "入库数量(件)")
    @JsonProperty(index = 160)
    private Integer quantity;
    /**
     * 入库体积(立方米) numeric
     */
    @ApiModelProperty(value = "入库体积(立方米)")
    @JsonProperty(index = 170)
    private BigDecimal volume;
    /**
     * 入库毛重(kg) numeric
     */
    @ApiModelProperty(value = "入库毛重(kg)")
    @JsonProperty(index = 180)
    private BigDecimal weight;
    /**
     * 入库照片,多个照片用逗号隔开 varchar
     */
    @ApiModelProperty(value = "入库照片,多个照片用逗号隔开")
    @JsonProperty(index = 190)
    private String images;
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
     * 状态，10正常，20已冻结，30待出库，40已出库 int2
     */
    @ApiModelProperty(value = "状态，10正常，20已冻结，30待出库，40已出库")
    @JsonProperty(index = 230)
    //todo: 请检查此属性的取值范围（可使用@In或@InOrNull来限定取值）
    @In(values={0,1})
    private Integer status;

}






