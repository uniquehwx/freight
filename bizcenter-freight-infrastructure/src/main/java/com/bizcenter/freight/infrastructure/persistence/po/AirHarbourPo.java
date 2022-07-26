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
 * 港口表
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@TableName(value = "lc_air_harbour", resultMap = "airHarbourMap")
public class AirHarbourPo extends BasePo<AirHarbourPo> implements Serializable{
    private static final long serialVersionUID = 1L;

    public AirHarbourPo(){

    }
    public AirHarbourPo(Long id){
        this.id = id;
    }

    /**
     * 港口编码(用于关联他表) varchar
     */
    private String harbourNo;

    /**
     * 三字代码 varchar
     */
    private String harbourCode;

    /**
     * 机场名(中文) varchar
     */
    private String harbourCnName;

    /**
     * 机场名(英文) varchar
     */
    private String harbourUsName;

    /**
     * 国家(英文) varchar
     */
    private String country;

    /**
     * 国家代码 varchar
     */
    private String countryCode;

    /**
     * 城市(英文) varchar
     */
    private String city;

    /**
     * 城市代码 varchar
     */
    private String cityCode;

    /**
     * 洲 varchar
     */
    private String state;

    /**
     * 更新人中文姓名 varchar
     */
    private String modifyRealName;

    /**
     * 创建人中文命名 varchar
     */
    private String createRealName;

    /**
     * 省 varchar
     */
    private String province;

    /**
     * 省代码 varchar
     */
    private String provinceCode;

    /**
     * 经度 varchar
     */
    private String longitude;

    /**
     * 纬度 varchar
     */
    private String latitude;

}






