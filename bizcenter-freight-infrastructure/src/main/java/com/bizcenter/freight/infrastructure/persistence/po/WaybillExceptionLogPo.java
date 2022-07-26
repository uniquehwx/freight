package com.bizcenter.freight.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bitsun.core.common.mybatis.handler.JsonTypeHandler;
import com.bitsun.core.framwork.infrastructure.persistence.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.io.Serializable;
import java.time.*;

/**
 * 运单异常信息记录表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_waybill_exception_log", resultMap = "waybillExceptionLogMap")
public class WaybillExceptionLogPo extends BasePo<WaybillExceptionLogPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public WaybillExceptionLogPo(){

    }
    public WaybillExceptionLogPo(Long id){
        this.id = id;
    }

    /**
     * 记录信息状态（10- 恢复正常，20-异常）） int2
     */
    private Integer statusKey;

    /**
     * 异常类型(0-延时提货，10-货物破损，20车辆故障，30 预计延误 ，40 无法联系交接方) int2
     */
    private Integer typeKey;

    /**
     * 运单状态id int8
     */
    private Long waybillStateId;

    /**
     * 异常上传图片 varchar
     */
    private String url;

    /**
     * 运单id int8
     */
    private Long waybillId;

    /**
     * 异常描述补充 varchar
     */
    private String remark;

    /**
     *  int8
     */
    private Long isvId;

    /**
     * 修改人名称 varchar
     */
    private String modifyRealName;

    /**
     * 创建人名称 varchar
     */
    private String createRealName;

}






