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
 * 运单异常信息记录表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel
public class WaybillExceptionLogResDto  implements IResponseDto{
    private static final long serialVersionUID = 1L;


    /**
     * ID int8
     */
    @ApiModelProperty(value = "ID")
    @JsonProperty(index = 0)
    private Long id;
    /**
     * 记录信息状态（10- 恢复正常，20-异常）） int2
     */
    @ApiModelProperty(value = "记录信息状态（10- 恢复正常，20-异常））")
    @JsonProperty(index = 10)
    private Integer statusKey;
    /**
     * 异常类型(0-延时提货，10-货物破损，20车辆故障，30 预计延误 ，40 无法联系交接方) int2
     */
    @ApiModelProperty(value = "异常类型(0-延时提货，10-货物破损，20车辆故障，30 预计延误 ，40 无法联系交接方)")
    @JsonProperty(index = 20)
    private Integer typeKey;
    /**
     * 运单状态id int8
     */
    @ApiModelProperty(value = "运单状态id")
    @JsonProperty(index = 30)
    private Long waybillStateId;
    /**
     * 异常上传图片 varchar
     */
    @ApiModelProperty(value = "异常上传图片")
    @JsonProperty(index = 40)
    private String url;
    /**
     * 运单id int8
     */
    @ApiModelProperty(value = "运单id")
    @JsonProperty(index = 50)
    private Long waybillId;
    /**
     * 异常描述补充 varchar
     */
    @ApiModelProperty(value = "异常描述补充")
    @JsonProperty(index = 60)
    private String remark;
    /**
     * 更新时间 timestamp
     */
    @ApiModelProperty(value = "更新时间")
    @JsonProperty(index = 90)
    private LocalDateTime modifyTime;
    /**
     * 更新人姓名 varchar
     */
    @ApiModelProperty(value = "更新人姓名")
    @JsonProperty(index = 100)
    private String modifyUserName;
    /**
     * 更新人ID int8
     */
    @ApiModelProperty(value = "更新人ID")
    @JsonProperty(index = 110)
    private Long modifyUserId;
    /**
     * 创建时间 timestamp
     */
    @ApiModelProperty(value = "创建时间")
    @JsonProperty(index = 120)
    private LocalDateTime createTime;
    /**
     * 创建人命名 varchar
     */
    @ApiModelProperty(value = "创建人命名")
    @JsonProperty(index = 130)
    private String createUserName;
    /**
     * 创建人ID int8
     */
    @ApiModelProperty(value = "创建人ID")
    @JsonProperty(index = 140)
    private Long createUserId;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 160)
    private Long isvId;
    /**
     * 修改人名称 varchar
     */
    @ApiModelProperty(value = "修改人名称")
    @JsonProperty(index = 180)
    private String modifyRealName;
    /**
     * 创建人名称 varchar
     */
    @ApiModelProperty(value = "创建人名称")
    @JsonProperty(index = 190)
    private String createRealName;



}






