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
 * 航司表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_air_company", resultMap = "airCompanyMap")
public class AirCompanyPo extends BasePo<AirCompanyPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public AirCompanyPo(){

    }
    public AirCompanyPo(Long id){
        this.id = id;
    }

    /**
     * 公司编码(用于关联他表) varchar
     */
    private String companyNo;

    /**
     * 航司代码 varchar
     */
    private String airCompanyCode;

    /**
     * 公司名称 varchar
     */
    private String companyName;

    /**
     * 提单前缀 varchar
     */
    private String companyCode;

    /**
     * 提单打印抬头 varchar
     */
    private String landingBillInvoiceTitle;

    /**
     * 备注 varchar
     */
    private String issuingCar;

    /**
     * IATAcode varchar
     */
    private String iataCode;

    /**
     * 更新人中文姓名 varchar
     */
    private String modifyRealName;

    /**
     * 创建人中文命名 varchar
     */
    private String createRealName;

    /**
     * 供应商编码 varchar
     */
    private String supplierCode;

    /**
     * 供应商名称 varchar
     */
    private String supplierName;

    /**
     * AccountNo varchar
     */
    private String accountNo;

}






