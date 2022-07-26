package com.bizcenter.freight.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 航司表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class AirCompanyReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 公司编码(用于关联他表) varchar
     */
    @ApiModelProperty(value = "公司编码(用于关联他表)")
    @JsonProperty(index = 10)
    private String companyNo;
    /**
     * 航司代码 varchar
     */
    @ApiModelProperty(value = "航司代码")
    @JsonProperty(index = 20)
    private String airCompanyCode;
    /**
     * 公司名称 varchar
     */
    @ApiModelProperty(value = "公司名称")
    @JsonProperty(index = 30)
    private String companyName;
    /**
     * 提单前缀 varchar
     */
    @ApiModelProperty(value = "提单前缀")
    @JsonProperty(index = 40)
    private String companyCode;
    /**
     * 提单打印抬头 varchar
     */
    @ApiModelProperty(value = "提单打印抬头")
    @JsonProperty(index = 50)
    private String landingBillInvoiceTitle;
    /**
     * 备注 varchar
     */
    @ApiModelProperty(value = "备注")
    @JsonProperty(index = 60)
    private String issuingCar;
    /**
     * IATAcode varchar
     */
    @ApiModelProperty(value = "IATAcode")
    @JsonProperty(index = 70)
    private String iataCode;
    /**
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 80)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 90)
    private Long appId;
    /**
     * 更新人中文姓名 varchar
     */
    @ApiModelProperty(value = "更新人中文姓名")
    @JsonProperty(index = 120)
    private String modifyRealName;
    /**
     * 创建人中文命名 varchar
     */
    @ApiModelProperty(value = "创建人中文命名")
    @JsonProperty(index = 160)
    private String createRealName;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 190)
    private Long bg;
    /**
     * 供应商编码 varchar
     */
    @ApiModelProperty(value = "供应商编码")
    @JsonProperty(index = 200)
    private String supplierCode;
    /**
     * 供应商名称 varchar
     */
    @ApiModelProperty(value = "供应商名称")
    @JsonProperty(index = 210)
    private String supplierName;
    /**
     * AccountNo varchar
     */
    @ApiModelProperty(value = "AccountNo")
    @JsonProperty(index = 220)
    private String accountNo;

}






