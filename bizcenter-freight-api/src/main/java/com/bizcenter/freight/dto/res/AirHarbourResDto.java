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
 * 港口表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class AirHarbourResDto  implements IResponseDto{
    private static final long serialVersionUID = 1L;


    /**
     * ID int8
     */
    @ApiModelProperty(value = "ID")
    @JsonProperty(index = 0)
    private Long id;
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
     * 更新时间 timestamp
     */
    @ApiModelProperty(value = "更新时间")
    @JsonProperty(index = 120)
    private LocalDateTime modifyTime;
    /**
     * 更新人姓名 varchar
     */
    @ApiModelProperty(value = "更新人姓名")
    @JsonProperty(index = 130)
    private String modifyUserName;
    /**
     * 更新人中文姓名 varchar
     */
    @ApiModelProperty(value = "更新人中文姓名")
    @JsonProperty(index = 140)
    private String modifyRealName;
    /**
     * 更新人ID int8
     */
    @ApiModelProperty(value = "更新人ID")
    @JsonProperty(index = 150)
    private Long modifyUserId;
    /**
     * 创建时间 timestamp
     */
    @ApiModelProperty(value = "创建时间")
    @JsonProperty(index = 160)
    private LocalDateTime createTime;
    /**
     * 创建人命名 varchar
     */
    @ApiModelProperty(value = "创建人命名")
    @JsonProperty(index = 170)
    private String createUserName;
    /**
     * 创建人中文命名 varchar
     */
    @ApiModelProperty(value = "创建人中文命名")
    @JsonProperty(index = 180)
    private String createRealName;
    /**
     * 创建人ID int8
     */
    @ApiModelProperty(value = "创建人ID")
    @JsonProperty(index = 190)
    private Long createUserId;
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






