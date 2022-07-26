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
 * 航班表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_air_flight", resultMap = "airFlightMap")
public class AirFlightPo extends BasePo<AirFlightPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public AirFlightPo(){

    }
    public AirFlightPo(Long id){
        this.id = id;
    }

    /**
     * 公司编码(用于关联他表) varchar
     */
    private String companyNo;

    /**
     * 航班编码(用于关联他表) varchar
     */
    private String flightNo;

    /**
     * 航司代码 varchar
     */
    private String airCompanyCode;

    /**
     * 货站 varchar
     */
    private String freightStation;

    /**
     * 始发港代码 varchar
     */
    private String departurePortCode;

    /**
     * 始发港 varchar
     */
    private String departurePort;

    /**
     * 目的港代码 varchar
     */
    private String destinationPortCode;

    /**
     * 目的港 varchar
     */
    private String destinationPort;

    /**
     * 航班号 varchar
     */
    private String flightCode;

    /**
     * 班期 varchar
     */
    private String schedule;

    /**
     * 起飞时刻ETD timestamp
     */
    private LocalDateTime departureTime;

    /**
     * 到达时刻ETA timestamp
     */
    private LocalDateTime arrivalTime;

    /**
     * 截单时刻 timestamp
     */
    private LocalDateTime closingTime;

    /**
     * 截单天数 varchar
     */
    private String closingDays;

    /**
     * 机型 varchar
     */
    private String model;

    /**
     * 飞机类型 varchar
     */
    private String planeType;

    /**
     * 更新人姓名 varchar
     */
    private String modifyRealName;

    /**
     * 创建人中文命名 varchar
     */
    private String createRealName;

}






