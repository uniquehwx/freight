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
 * 提单号资源池表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_air_lading_bill_no_pool", resultMap = "airLadingBillNoPoolMap")
public class AirLadingBillNoPoolPo extends BasePo<AirLadingBillNoPoolPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public AirLadingBillNoPoolPo(){

    }
    public AirLadingBillNoPoolPo(Long id){
        this.id = id;
    }

    /**
     * 航司代码 varchar
     */
    private String airCompanyCode;

    /**
     * 公司代码(提单起始号) varchar
     */
    private String companyCode;

    /**
     * 提单号 varchar
     */
    private String ladingBillNo;

    /**
     * 类型 varchar
     */
    private String ladingBillType;

    /**
     * 使用状态: 10 未使用，20 使用中，30 已使用 , 40 已禁用 , 50 已作废 int2
     */
    private Integer ladingBillNoStatusCode;

    /**
     * 颁发时间 timestamp
     */
    private LocalDateTime issuedAt;

    /**
     * 不早于 timestamp
     */
    private LocalDateTime notBefore;

    /**
     * 不晚于 timestamp
     */
    private LocalDateTime notAfter;

    /**
     * 更新人中文姓名 varchar
     */
    private String modifyRealName;

    /**
     * 创建人中文命名 varchar
     */
    private String createRealName;

    /**
     * 状态码：0 提单号生成、1 绑定订单、2 订单完成、3 解绑订单、4 禁用、5 启用、6 作废 int2
     */
    private Integer planningStatusCode;

    /**
     * 订单号 varchar
     */
    private String orderNo;

}






