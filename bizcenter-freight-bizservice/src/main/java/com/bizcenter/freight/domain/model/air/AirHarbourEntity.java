package com.bizcenter.freight.domain.model.air;

import com.bitsun.core.framwork.domain.model.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * 港口表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class AirHarbourEntity  implements Entity<AirHarbourEntity>{


        /**
         * ID int8
         */
        private Long id;
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
         * 创建人中文命名 varchar
         */
        private String createRealName;
        /**
         * 创建人ID int8
         */
        private Long createUserId;
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






