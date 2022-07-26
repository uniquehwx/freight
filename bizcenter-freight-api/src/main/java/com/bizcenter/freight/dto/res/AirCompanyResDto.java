package com.bizcenter.freight.dto.res;

import com.bitsun.core.framwork.api.dto.IResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 航司表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class AirCompanyResDto  implements IResponseDto{
    private static final long serialVersionUID = 1L;


    /**
     * ID int8
     */
    @ApiModelProperty(value = "ID")
    @JsonProperty(index = 0)
    private Long id;
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
     * 更新时间 timestamp
     */
    @ApiModelProperty(value = "更新时间")
    @JsonProperty(index = 100)
    private LocalDateTime modifyTime;
    /**
     * 更新人姓名 varchar
     */
    @ApiModelProperty(value = "更新人姓名")
    @JsonProperty(index = 110)
    private String modifyUserName;
    /**
     * 更新人中文姓名 varchar
     */
    @ApiModelProperty(value = "更新人中文姓名")
    @JsonProperty(index = 120)
    private String modifyRealName;
    /**
     * 更新人ID int8
     */
    @ApiModelProperty(value = "更新人ID")
    @JsonProperty(index = 130)
    private Long modifyUserId;
    /**
     * 创建时间 timestamp
     */
    @ApiModelProperty(value = "创建时间")
    @JsonProperty(index = 140)
    private LocalDateTime createTime;
    /**
     * 创建人命名 varchar
     */
    @ApiModelProperty(value = "创建人命名")
    @JsonProperty(index = 150)
    private String createUserName;
    /**
     * 创建人中文命名 varchar
     */
    @ApiModelProperty(value = "创建人中文命名")
    @JsonProperty(index = 160)
    private String createRealName;
    /**
     * 创建人ID int8
     */
    @ApiModelProperty(value = "创建人ID")
    @JsonProperty(index = 170)
    private Long createUserId;
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






