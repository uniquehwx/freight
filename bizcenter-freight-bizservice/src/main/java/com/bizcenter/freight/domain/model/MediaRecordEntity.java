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
 * 媒体信息表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class MediaRecordEntity  implements Entity<MediaRecordEntity>{


        /**
         *  id int8
         */
        private Long id;
        /**
         * 图片地址 varchar
         */
        private String imgUrl;
        /**
         * 关联id int8
         */
        private Long refId;
        /**
         * 备注信息 varchar
         */
        private String remark;
        /**
         * 更新人姓名 varchar
         */
        private String modifyUserName;
        /**
         * 更新人ID int8
         */
        private Long modifyUserId;
        /**
         * 创建人命名 varchar
         */
        private String createUserName;
        /**
         * 创建人ID int8
         */
        private Long createUserId;
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
         * 文件名称 varchar
         */
        private String fileName;
        /**
         * 类型 int8
         */
        private Long type;
        /**
         * 状态 int8
         */
        private Long status;
        /**
         * 扩展字段1 varchar
         */
        private String extData1;
        /**
         * 扩展字段2 varchar
         */
        private String extData2;



}






