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
 * 订舱服务表 
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_booking_business", resultMap = "bookingBusinessMap")
public class BookingBusinessPo extends BasePo<BookingBusinessPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public BookingBusinessPo(){

    }
    public BookingBusinessPo(Long id){
        this.id = id;
    }

    /**
     * 10 创建服务  20 完成服务  30服务取消 int2
     */
    private Integer status;

    /**
     * 订舱服务单号 varchar
     */
    private String orderNo;

    /**
     * 客户订单号 varchar
     */
    private String customerNo;

    /**
     * 航班号 varchar
     */
    private String flightNumber;

    /**
     * 客户编码 varchar
     */
    private String customerCode;

    /**
     * 客户名称 varchar
     */
    private String customerName;

    /**
     * 财务组织编码 varchar
     */
    private String financialOrgCode;

    /**
     * 行政组织编码 varchar
     */
    private String departCode;

    /**
     * 增值服务单号 varchar
     */
    private String addedServiceNo;

    /**
     * 业务类型 int2
     */
    private Integer busType;

    /**
     * 订单来源 varchar
     */
    private String orderSource;

    /**
     * 提单号 varchar
     */
    private String billLadingNo;

    /**
     * 备注信息 varchar
     */
    private String remark;

    /**
     * 服务完成时间 timestamp
     */
    private LocalDateTime serviceCompletionTime;

    /**
     * 类型: 10自建 20空运订单 int4
     */
    private Integer type;

    /**
     * 客户财务部门 varchar
     */
    private String orderSourceFinancial;

    /**
     * 创建人行政部门 varchar
     */
    private String initCreatDepart;

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






