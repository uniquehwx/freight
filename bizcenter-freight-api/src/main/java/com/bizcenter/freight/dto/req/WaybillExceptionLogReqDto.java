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
 * 运单异常信息记录表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Validated
@Data
@ApiModel
public class WaybillExceptionLogReqDto implements Serializable{
    private static final long serialVersionUID = 1L;

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
     * 租户ID int8
     */
    @ApiModelProperty(value = "租户ID")
    @JsonProperty(index = 70)
    private Long tenantId;
    /**
     * 应用ID int8
     */
    @ApiModelProperty(value = "应用ID")
    @JsonProperty(index = 80)
    private Long appId;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 160)
    private Long isvId;
    /**
     *  int8
     */
    @ApiModelProperty(value = "")
    @JsonProperty(index = 170)
    private Long bg;
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






