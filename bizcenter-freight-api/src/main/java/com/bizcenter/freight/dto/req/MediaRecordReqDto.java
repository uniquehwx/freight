package com.bizcenter.freight.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
    import com.bitsun.core.common.validator.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 媒体信息表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class MediaRecordReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 图片地址 varchar
     */
    @ApiModelProperty(value = "图片地址")
    @JsonProperty(index = 10)
    private String imgUrl;
    /**
     * 关联id int8
     */
    @ApiModelProperty(value = "关联id")
    @JsonProperty(index = 20)
    private Long refId;
    /**
     * 备注信息 varchar
     */
    @ApiModelProperty(value = "备注信息")
    @JsonProperty(index = 30)
    private String remark;
    /**
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 40)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 50)
    private Long appId;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 130)
    private Long bg;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 140)
    private Long isvId;
    /**
     * 修改人名称 varchar
     */
    @ApiModelProperty(value = "修改人名称")
    @JsonProperty(index = 150)
    private String modifyRealName;
    /**
     * 创建人名称 varchar
     */
    @ApiModelProperty(value = "创建人名称")
    @JsonProperty(index = 160)
    private String createRealName;
    /**
     * 文件名称 varchar
     */
    @ApiModelProperty(value = "文件名称")
    @JsonProperty(index = 170)
    private String fileName;
    /**
     * 类型 int8
     */
    @ApiModelProperty(value = "类型")
    @JsonProperty(index = 180)
    private Long type;
    /**
     * 状态 int8
     */
    @ApiModelProperty(value = "状态")
    @JsonProperty(index = 190)
    //todo: 请检查此属性的取值范围（可使用@In或@InOrNull来限定取值）
    @In(values={0,1})
    private Long status;
    /**
     * 扩展字段1 varchar
     */
    @ApiModelProperty(value = "扩展字段1")
    @JsonProperty(index = 200)
    private String extData1;
    /**
     * 扩展字段2 varchar
     */
    @ApiModelProperty(value = "扩展字段2")
    @JsonProperty(index = 210)
    private String extData2;

}






