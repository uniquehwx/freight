package com.bizcenter.freight.domain.model.order;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.framwork.domain.model.Entity;
import com.bizcenter.freight.domain.model.order.childer.OrderServeExtendEntity;
import com.bizcenter.freight.domain.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;


/**
 * 订单
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class OrderEntity  implements Entity<OrderEntity>{


        /**
         * 主键id int8
         */
        private Long id;
        /**
         * 订单号 varchar
         */
        private String orderNo;
        /**
         * 交易类型(1-航空订单，5-地面操作订单) int4
         */
        private Integer tradeType;
        /**
         * 客户编码 varchar
         */
        private String customerCode;
        /**
         * 委托方联系人 varchar
         */
        private String clientName;
        /**
         * 委托方联系人电话 varchar
         */
        private String clintPhone;
        /**
         * 父单单号 varchar
         */
        private String outOrderNo;
        /**
         * 单据类型(1-主订单，2-子订单) int4
         */
        private Integer orderType;
        /**
         * 交易状态 int4
         */
        private Integer tradeStatus;
        /**
         * 供应商编码 varchar
         */
        private String supplierCode;
        /**
         * 始发地编码 varchar
         */
        private String startPointCode;
        /**
         * 目的地编码 varchar
         */
        private String endPointCode;
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
         * 扩展信息 jsonb
         */
        private String extData;
        /**
         * 业务类型 int4
         */
        private Integer businessType;
        /**
         * 订单完成时间 timestamp
         */
        private LocalDateTime completionTime;
        /**
         * 业务员 varchar
         */
        private String salesClerkCode;

        /**
         * 扩展服务 varchar
         */
        private List<OrderServeExtendEntity> extendService;


        // action

        public static Pager<OrderEntity> doPager(OrderRepository orderRepository, Map<String, Object> params) {
              return   orderRepository.doPager(params);
        }


        public OrderEntity insert(OrderRepository orderRepository) {
                // 通过仓储层进行处理
                Entity entity = orderRepository.insert(this);
                return (OrderEntity) entity;
        }

        public static OrderEntity selectOne(OrderRepository orderRepository,Long id){
                Entity entity = orderRepository.selectByPrimaryKey(id);
                return (OrderEntity) entity;
        }

        public boolean updateSingle(OrderRepository orderRepository) {
               return orderRepository.updateOrder(this);
        }
}






