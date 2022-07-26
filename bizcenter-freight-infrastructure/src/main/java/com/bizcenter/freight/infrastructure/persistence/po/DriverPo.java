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
 * 司机表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_driver", resultMap = "driverMap")
public class DriverPo extends BasePo<DriverPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public DriverPo(){

    }
    public DriverPo(Long id){
        this.id = id;
    }

    /**
     * 司机姓名 varchar
     */
    private String driverName;

    /**
     * 手机号 varchar
     */
    private String driverMobileNo;

    /**
     * 备注 varchar
     */
    private String remark;

    /**
     * 供应商no varchar
     */
    private String supplierNo;

    /**
     * 身份证/驾驶证号 varchar
     */
    private String licenseNumber;

    /**
     * 身份证正面照 varchar
     */
    private String idFrontImgUrl;

    /**
     * 身份证背面照 varchar
     */
    private String idBackImgUrl;

    /**
     * 驾驶证正面照url varchar
     */
    private String driveFrontImgUrl;

    /**
     * 驾驶证背面照url varchar
     */
    private String driveBackImgUrl;

    /**
     * 准驾车型 varchar
     */
    private String driverType;

    /**
     * 驾驶证期限 timestamp
     */
    private LocalDateTime driverDeadline;

    /**
     * 从业资格号 varchar
     */
    private String qualificationsNo;

    /**
     * 从业类别(10：危险品运输，20 ：货物运输，30 ：客车运输) int2
     */
    private Integer qualificationType;

    /**
     * 资格证照片 varchar
     */
    private String qualificationUrl;

    /**
     * 当前驾驶分数 int8
     */
    private Long driveGrade;

    /**
     * 驾驶员no varchar
     */
    private String driverNo;

    /**
     *  是否是内部员工 1是 0否 int2
     */
    private Integer isInternalDriver;

    /**
     * 10:正常 20 休假 30 已离职 int2
     */
    private Integer workingState;

    /**
     *  int8
     */
    private Long isvId;

    /**
     * 创建人名称 varchar
     */
    private String createRealName;

    /**
     * 修改人名称 varchar
     */
    private String modifyRealName;

    /**
     * 10男,20女 int2
     */
    private Integer sex;

    /**
     * 资质证有效期 timestamp
     */
    private LocalDateTime qualificationDeadline;

    /**
     * 入职日期 timestamp
     */
    private LocalDateTime entryTime;

    /**
     * 默认车辆信息（车辆id,车辆车牌号） jsonb
     */
    @TableField(typeHandler = JsonTypeHandler.class)
    private String vehicleMessage;

}






