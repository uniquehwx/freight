package com.bizcenter.freight.domain.model;

import com.bitsun.core.framwork.domain.model.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * 板型表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class AirPanelEntity  implements Entity<AirPanelEntity>{


        /**
         * ID int8
         */
        private Long id;
        /**
         * 航司代码 varchar
         */
        private String airCompanyCode;
        /**
         * 机型 varchar
         */
        private String model;
        /**
         * 板型代码 varchar
         */
        private String panelTypeCode;
        /**
         * 别称 varchar
         */
        private String altName;
        /**
         * 体积 varchar
         */
        private String cubicMeter;
        /**
         * 长 varchar
         */
        private String panelLong;
        /**
         * 宽 varchar
         */
        private String panelWide;
        /**
         * 高 varchar
         */
        private String panelHigh;
        /**
         * 板型尺寸 json
         */
        private String panelSize;
        /**
         * 限重 varchar
         */
        private String weightLimit;
        /**
         * 更新人姓名 varchar
         */
        private String modifyUserName;
        /**
         * 更新人中文姓名 varchar
         */
        private String modifyRealName;
        /**
         * 更新人ID int8
         */
        private Long modifyUserId;
        /**
         * 创建人命名 varchar
         */
        private String createUserName;
        /**
         * 创建人命名 varchar
         */
        private String createRealName;
        /**
         * 创建人ID int8
         */
        private Long createUserId;



}






