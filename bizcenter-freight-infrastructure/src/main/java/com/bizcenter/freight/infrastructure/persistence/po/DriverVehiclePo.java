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
 * 司机车辆关联关系表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_driver_vehicle", resultMap = "driverVehicleMap")
public class DriverVehiclePo extends BasePo<DriverVehiclePo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public DriverVehiclePo(){

    }
    public DriverVehiclePo(Long id){
        this.id = id;
    }

    /**
     * 司机no varchar
     */
    private String driverNo;

    /**
     * 车辆no varchar
     */
    private String vehicleNo;

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

}






