package com.bizcenter.freight.constants;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;


@Data
public class TradeConstants {

    //交易类型
    public static class TradeType {

        //空运订单
        public static final Integer AIR_ORDER = 1;

        //地面操作订单
        public static final Integer GROUND_ORDER = 5;

        //订舱服务单(虚拟交易类型)
        public static final Integer BOOKING = RecordType.BOOKING;

        //提货服务单(虚拟交易类型)
        public static final Integer DELIVERY = RecordType.DELIVERY;

        //仓储服务单(虚拟交易类型)
        public static final Integer STOCK = RecordType.STOCK;

        //中转服务单(虚拟交易类型)
        public static final Integer TRANSFER = RecordType.TRANSFER;

        //货站安检服务单(虚拟交易类型)
        public static final Integer CHECK = RecordType.CHECK;

        //预配发送服务单(虚拟交易类型)
        public static final Integer SEND = RecordType.SEND;

        //清关派送服务单(虚拟交易类型)
        public static final Integer CLEARANCE = RecordType.CLEARANCE;

    }

    //状态流转对应事件
    public static class TradeAction {


//        //确认订单
//        public static final Integer CONFIRM = 5;
//        //支付订单
//        public static final Integer PAY = 20;

        //主订单状态流对应事件
        //提交订单
        public static final Integer SUBMIT = 30;
        //确认订舱
        public static final Integer CONFIRM_BOOKING = 35;
        //补录
        public static final Integer RECORDING = 40;
        //出提单
        public static final Integer BILL_LADING = 45;
        //交单
        public static final Integer DELIVER_ORDER = 50;

        //订舱服务,提货服务，仓储服务状态流对应事件
        //暂存->待服务
        public static final  Integer TO_SERVICE_WAITING = 1;
        //待服务->服务中状态
        public static final  Integer TO_SERVICE_DOING = 5;
        //服务中->服务已完成状态
        public static final  Integer TO_SERVICE_FINISH = 10;
        //取消订单
        //待服务->服务取消、服务中->异常结束、服务已完成->异常结束
        public static final Integer CANCEL = -1;
        //手动修改订单状态
        //待服务->服务已完成
//        public static final Integer SERVICE_WAITING_TO_SERVICE_FINISH = 10;


    }

    /**
     * 单据编码生成规则
     */
    public static class Prefix{
        //主订单号
        public static final String MAIN_ORDER = "KY";
        //子订单号
        public static final String CHILD_ORDER = "F";
        //服务编码前缀
        public static final String SERVICE_CODE = "S";
        //订舱服务编码
        public static final String BOOKING = "001";
        //提货服务编码
        public static final String DELIVERY = "002";
        //仓储服务编码
        public static final String STOCK = "003";
        //中转服务编码
        public static final String TRANSFER = "004";
        //货站安检服务编码
        public static final String CHECK = "005";
        //预配发送服务编码
        public static final String SEND = "006";
        //清关派送服务编码
        public static final String CLEARANCE = "007";
    }

    /**
     * 单据&虚拟交易类型
     */
    public static class RecordType{
        //主订单
        public static final Integer MAIN_ORDER = 1;
        //子订单
        public static final Integer CHILD_ORDER = 2;
        //订舱服务单
        public static final Integer BOOKING = 1000;
        //提货服务单
        public static final Integer DELIVERY = 2000;
        //仓储服务单
        public static final Integer STOCK = 3000;
        //中转服务单
        public static final Integer TRANSFER = 4000;
        //货站安检服务单
        public static final Integer CHECK = 5000;
        //预配发送服务单
        public static final Integer SEND = 6000;
        //清关派送服务单
        public static final Integer CLEARANCE =7000;

    }

    /**
     * 货物信息节点类型
     */
    public static class CargoPoint{
        //预计
        public static final Integer PLAN = 10;
        //入仓
        public static final Integer IN_HOUSE = 20;
        //提单时
        public static final Integer BEFORE_BOARDING = 30;
    }

    //订单类型
    public static class Type{
        //主订单
        public static final Integer MAIN_ORDER = 1;
        //子订单
        public static final Integer SUB_ORDER = 2;
        //服务单据
        public static final Integer SERVICE_ORDER = 3;
    }

    /**
     * 服务具项
     */
    public static class ServiceItemType{

        //打托
        public static final Integer DA_TUO = 10;
        //拆托
        public static final Integer CHAI_TUO = 20;
        //加重
        public static final Integer JIA_ZHONG = 30;
        //分拣
        public static final Integer SORTED = 40;
        //改标
        public static final Integer BID_MODIFY = 50;

    }
    /**
     * 特殊货物
     */
        public static class SpecialCargo{
        //锂电池
        public static final Integer LI_BATTERY = 10;
        //危险品
        public static final Integer DANGER_CARGO = 20;
        //鲜活
        public static final Integer  XIAN_HUO = 30;
        //枪械
        public static final Integer  FIREARMS = 40;
    }

    public static class RatioInfo{
        //体积重比例
        public static  final String WEIGHT_RATIO = "166.66";

    }

    /**
     * 用车单服务类型
     */
    public static class TransportServiceType {
        //服务单类型（0 :提单 ，10：中转单  20:非空运服务单）

        public static final Integer DELIVERY = 0;

        public static final Integer TRANSFER = 10;

        public static final Integer NOT_AIR = 20;

    }

    // 交易状态
    public static class TradeStatus {

        //交易取消正常关闭(创建订单后关闭)
        public static final Integer TRADE_CLOSE = -1;
        //主订单虚拟出的暂存状态
        public static final Integer STAGING = 25;
        //主订单提交后，待订舱状态
        public static final  Integer BOOKING_WAITING = 30;
        //主订单确定定舱后，为待补录状态
        public static final  Integer RECORDING_WAITING = 35;
        //补录完成后，为待出提单状态
        public static final  Integer BILL_LADING_WAITING = 40;
        //已出提单
        public static final  Integer BILL_LADED = 45;
        //已交单
        public static final  Integer DELIVERED_ORDERED = 50;
        //待审核
        public static final Integer APPROVING_WAITING = 55;
        //异常结束——已作废
        public static final Integer EXCEPTION_FINISH = 60;
        //子订单完成状态
        public static final Integer CHILD_FINISH = 150;
        //子订单已合成主订单
        public static final Integer COMPOSE_ORDER = 160;

        //有效的状态
        public static final List<Integer> ACTIVE_ORDER_LIST = Lists.newArrayList(STAGING,
                BOOKING_WAITING,
                RECORDING_WAITING,
                BILL_LADING_WAITING,
                BILL_LADED,
                DELIVERED_ORDERED,
                APPROVING_WAITING,
                CHILD_FINISH);

        public static final List<Integer> CANCEL_ORDER_LIST = Lists.newArrayList(STAGING,
                RECORDING_WAITING,
                BILL_LADING_WAITING,
                BILL_LADED,
                APPROVING_WAITING,
                CHILD_FINISH,
                COMPOSE_ORDER);
        /**
         * 可发布订舱体积信息的订单状态
         */
        public static final List<Integer> PUBLISH_STATUS_LIST = Lists.newArrayList(STAGING,
                RECORDING_WAITING,
                BILL_LADING_WAITING,
                BILL_LADED,
                DELIVERED_ORDERED,
                EXCEPTION_FINISH
        );
    }



    //服务状态
    public static class ServiceStatus {

        //服务取消
        public static final Integer SERVICE_CANCEL= -1;
        //服务暂存
        public static final Integer SERVICE_INIT= 0;
        //待服务
        public static final Integer SERVICE_WAITING = 1;
        //服务中
        public static final Integer SERVICE_DOING = 5;
        //服务完成
        public static final Integer SERVICE_FINISH = 10;
        //异常结束
        public static final Integer SERVICE_EXCEPTION_FINISH = 15;

    }

}
