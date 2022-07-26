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
 * 运单异常信息记录表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class WaybillExceptionLogEntity  implements Entity<WaybillExceptionLogEntity>{


        /**
         * ID int8
         */
        private Long id;
        /**
         * 记录信息状态（10- 恢复正常，20-异常）） int2
         */
        private Integer statusKey;
        /**
         * 异常类型(0-延时提货，10-货物破损，20车辆故障，30 预计延误 ，40 无法联系交接方) int2
         */
        private Integer typeKey;
        /**
         * 运单状态id int8
         */
        private Long waybillStateId;
        /**
         * 异常上传图片 varchar
         */
        private String url;
        /**
         * 运单id int8
         */
        private Long waybillId;
        /**
         * 异常描述补充 varchar
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



}






