package com.bizcenter.freight.domain.model.order.childer;

import com.bitsun.core.framwork.domain.model.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * 空运订单扩展表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class OrderServeExtendEntity implements Entity<OrderServeExtendEntity> {


        /**
         * 主键id int8
         */
        private Long id;
        /**
         * 备注 varchar
         */
        private String remark;
        /**
         * 创建者id int8
         */
        private Long createUserId;
        /**
         * 创建者姓名 varchar
         */
        private String createUserName;
        /**
         * 修改人id int8
         */
        private Long modifyUserId;
        /**
         * 修改人名称 varchar
         */
        private String modifyUserName;
        /**
         * 服务名称 varchar
         */
        private String serveName;
        /**
         * 服务类型（1:订舱  2:报关 3:提货 4:仓储 5:中转  6:打板 7:安检） int2
         */
        private Integer serveType;
        /**
         * 外部订单号 varchar
         */
        private String externalOrder;
        /**
         * 订单状态信息 ( 1 初始化 2 进行中  3 已取消 4 已完成) int2
         */
        private Integer status;



}






