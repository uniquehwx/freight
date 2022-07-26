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
 * 港口表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class AirHarbourReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 港口编码(用于关联他表) varchar
     */
    @ApiModelProperty(value = "港口编码(用于关联他表)")
    @JsonProperty(index = 10)
    private String harbourNo;
    /**
     * 三字代码 varchar
     */
    @ApiModelProperty(value = "三字代码")
    @JsonProperty(index = 20)
    private String harbourCode;
    /**
     * 机场名(中文) varchar
     */
    @ApiModelProperty(value = "机场名(中文)")
    @JsonProperty(index = 30)
    private String harbourCnName;
    /**
     * 机场名(英文) varchar
     */
    @ApiModelProperty(value = "机场名(英文)")
    @JsonProperty(index = 40)
    private String harbourUsName;
    /**
     * 国家(英文) varchar
     */
    @ApiModelProperty(value = "国家(英文)")
    @JsonProperty(index = 50)
    private String country;
    /**
     * 国家代码 varchar
     */
    @ApiModelProperty(value = "国家代码")
    @JsonProperty(index = 60)
    private String countryCode;
    /**
     * 城市(英文) varchar
     */
    @ApiModelProperty(value = "城市(英文)")
    @JsonProperty(index = 70)
    private String city;
    /**
     * 城市代码 varchar
     */
    @ApiModelProperty(value = "城市代码")
    @JsonProperty(index = 80)
    private String cityCode;
    /**
     * 洲 varchar
     */
    @ApiModelProperty(value = "洲")
    @JsonProperty(index = 90)
    private String state;
    /**
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 100)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 110)
    private Long appId;
    /**
     * 更新人中文姓名 varchar
     */
    @ApiModelProperty(value = "更新人中文姓名")
    @JsonProperty(index = 140)
    private String modifyRealName;
    /**
     * 创建人中文命名 varchar
     */
    @ApiModelProperty(value = "创建人中文命名")
    @JsonProperty(index = 180)
    private String createRealName;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 210)
    private Long bg;
    /**
     * 省 varchar
     */
    @ApiModelProperty(value = "省")
    @JsonProperty(index = 220)
    private String province;
    /**
     * 省代码 varchar
     */
    @ApiModelProperty(value = "省代码")
    @JsonProperty(index = 230)
    private String provinceCode;
    /**
     * 经度 varchar
     */
    @ApiModelProperty(value = "经度")
    @JsonProperty(index = 240)
    private String longitude;
    /**
     * 纬度 varchar
     */
    @ApiModelProperty(value = "纬度")
    @JsonProperty(index = 250)
    private String latitude;

}






