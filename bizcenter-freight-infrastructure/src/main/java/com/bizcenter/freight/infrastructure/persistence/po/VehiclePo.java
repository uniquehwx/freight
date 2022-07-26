package com.bizcenter.freight.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bitsun.core.common.mybatis.handler.JsonTypeHandler;
import com.bitsun.core.framwork.infrastructure.persistence.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.math.BigDecimal;
import java.io.Serializable;
import java.time.*;

/**
 * 车辆表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_vehicle", resultMap = "vehicleMap")
public class VehiclePo extends BasePo<VehiclePo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public VehiclePo(){

    }
    public VehiclePo(Long id){
        this.id = id;
    }

    /**
     * 车牌号 varchar
     */
    private String licensePlateNumber;

    /**
     * 10 重型箱式货车；20中型箱式货车 30轻型箱式货车40小型箱式货车 int2
     */
    private Integer vehicleTypeCode;

    /**
     * 备注 varchar
     */
    private String remark;

    /**
     * 外形尺寸 varchar
     */
    private String size;

    /**
     * 年审时间 timestamp
     */
    private LocalDateTime annualVerification;

    /**
     * 资格证图片 varchar
     */
    private String identifyUrl;

    /**
     * 是否是内部车辆(1:是 0否) int2
     */
    private Integer isInternalVehicle;

    /**
     * 监管车(1:是 0否) int2
     */
    private Integer regulationCar;

    /**
     * 车辆保险信息（保险公司，保险类型，保险期始，保险截至，保险险种） json
     */
    @TableField(typeHandler = JsonTypeHandler.class)
    private String insurance;

    /**
     * 核载重量 float8
     */
    private Double loadWeight;

    /**
     * 司机信息（包含司机id，司机姓名） jsonb
     */
    @TableField(typeHandler = JsonTypeHandler.class)
    private String driverMessage;

    /**
     * 登记时间 timestamp
     */
    private LocalDateTime registrationTime;

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

    /**
     * 车龄 int2
     */
    private Integer vehicleAge;

    /**
     * 当前行驶总里程(万公里) numeric
     */
    private BigDecimal recentMileage;

    /**
     * 供应商no int8
     */
    private Long supplierNo;

    /**
     * 车辆状态(10空闲;20运输) int2
     */
    private Integer vehicleStatus;

    /**
     * 当前位置 varchar
     */
    private String currentLocation;

    /**
     * 车型（10:1.5T，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60 5T ,70  8T,80 10T,90  12T,100  20 尺柜,110 40尺柜 ,12040/50尺柜 ） int2
     */
    private Integer models;

}






