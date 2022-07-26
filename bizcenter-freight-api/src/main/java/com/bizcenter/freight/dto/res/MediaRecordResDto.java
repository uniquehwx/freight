package com.bizcenter.freight.dto.res;

import com.bitsun.core.framwork.api.dto.IResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import com.bitsun.core.common.validator.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * 媒体信息表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class MediaRecordResDto  implements IResponseDto{
    private static final long serialVersionUID = 1L;


    /**
     *  id int8
     */
    @ApiModelProperty(value = " id")
    @JsonProperty(index = 0)
    private Long id;
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
     * 更新时间 timestamp
     */
    @ApiModelProperty(value = "更新时间")
    @JsonProperty(index = 60)
    private LocalDateTime modifyTime;
    /**
     * 更新人姓名 varchar
     */
    @ApiModelProperty(value = "更新人姓名")
    @JsonProperty(index = 70)
    private String modifyUserName;
    /**
     * 更新人ID int8
     */
    @ApiModelProperty(value = "更新人ID")
    @JsonProperty(index = 80)
    private Long modifyUserId;
    /**
     * 创建时间 timestamp
     */
    @ApiModelProperty(value = "创建时间")
    @JsonProperty(index = 90)
    private LocalDateTime createTime;
    /**
     * 创建人命名 varchar
     */
    @ApiModelProperty(value = "创建人命名")
    @JsonProperty(index = 100)
    private String createUserName;
    /**
     * 创建人ID int8
     */
    @ApiModelProperty(value = "创建人ID")
    @JsonProperty(index = 110)
    private Long createUserId;
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






