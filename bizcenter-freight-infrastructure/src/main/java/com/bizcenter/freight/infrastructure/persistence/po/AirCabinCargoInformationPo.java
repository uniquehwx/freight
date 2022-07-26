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
 * 舱位产品信息表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_air_cabin_cargo_information", resultMap = "airCabinCargoInformationMap")
public class AirCabinCargoInformationPo extends BasePo<AirCabinCargoInformationPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public AirCabinCargoInformationPo(){

    }
    public AirCabinCargoInformationPo(Long id){
        this.id = id;
    }

    /**
     * 航班编码(关联他表) varchar
     */
    private String flightNo;

    /**
     * 航线产品代码 varchar
     */
    private String productNo;

    /**
     * 航司代码 varchar
     */
    private String airCompanyCode;

    /**
     * 航班号 varchar
     */
    private String flightCode;

    /**
     * 目的港代码 varchar
     */
    private String destinationPort;

    /**
     * 板类型 varchar
     */
    private String panelType;

    /**
     * 航线运营 varchar
     */
    private String flightService;

    /**
     * 航线操作 varchar
     */
    private String flightOperator;

    /**
     * 公司 varchar
     */
    private String company;

    /**
     * 部门 varchar
     */
    private String department;

    /**
     * 更新人中文姓名 varchar
     */
    private String modifyRealName;

    /**
     * 创建人中文命名 varchar
     */
    private String createRealName;

    /**
     * 生效时间 timestamp
     */
    private LocalDateTime effectTime;

    /**
     * 失效时间 timestamp
     */
    private LocalDateTime invalidTime;

    /**
     * 合同罚金 numeric
     */
    private BigDecimal contractPenalty;

}






