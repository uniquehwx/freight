package com.bizcenter.freight.domain.model;

import com.bitsun.core.framwork.domain.model.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * 仓库订单(入库单)表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class WhOrderEntity  implements Entity<WhOrderEntity>{


        /**
         * ID int8
         */
        private Long id;
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
         * 创建人名称 varchar
         */
        private String createRealName;
        /**
         * 修改人名称 varchar
         */
        private String modifyRealName;
        /**
         * 入库单号 varchar
         */
        private String inStorageNo;
        /**
         * 客户订单号 varchar
         */
        private String customerNo;
        /**
         * 客户编码 varchar
         */
        private String customerCode;
        /**
         * 客户联系人 varchar
         */
        private String customerContacts;
        /**
         * 联系电话 varchar
         */
        private String customerPhone;
        /**
         * 业务类型 int4
         */
        private Integer busType;
        /**
         * 重量(kg) numeric
         */
        private BigDecimal weight;
        /**
         * 体积(立方米) numeric
         */
        private BigDecimal volume;
        /**
         * 数量(件) int4
         */
        private Integer quantity;
        /**
         * 中文品名 varchar
         */
        private String zhName;
        /**
         * 实际重量(kg) numeric
         */
        private BigDecimal actualWeight;
        /**
         * 实际数量(件) int4
         */
        private Integer actualQuantity;
        /**
         * 实际体积(立方米) numeric
         */
        private BigDecimal actualVolume;
        /**
         * 实际体积重 numeric
         */
        private BigDecimal actualVolumeWeight;
        /**
         * 尺寸(长宽高) json
         */
        private String size;
        /**
         * 随货资料(10:有，20无) int2
         */
        private Integer accompanyData;
        /**
         * 提单号 varchar
         */
        private String orderNo;
        /**
         * 10待入库20已入库30待出库40部分出库50已出库60已取消 int2
         */
        private Integer status;
        /**
         * 单证上传时间 timestamp
         */
        private LocalDateTime imageUploadTime;
        /**
         * 入库时间 timestamp
         */
        private LocalDateTime inStorageTime;
        /**
         * 报关审结时间 timestamp
         */
        private LocalDateTime customsCheckTime;
        /**
         * 出库时间 timestamp
         */
        private LocalDateTime outStorageTime;
        /**
         * 订单流转 varchar
         */
        private String orderSource;
        /**
         * 业务员 varchar
         */
        private String saleUser;
        /**
         * 客服 varchar
         */
        private String serviceUser;
        /**
         * 货物损坏情况 varchar
         */
        private String goodsDamageInfo;
        /**
         * 仓库名称 varchar
         */
        private String warehouseName;
        /**
         * 货站 varchar
         */
        private String goodsStation;
        /**
         * 同步状态(10未同步，20已下发，30已同步) int2
         */
        private Integer syncStatus;
        /**
         * 出港日期 timestamp
         */
        private LocalDateTime departTime;
        /**
         * 备注 varchar
         */
        private String remark;
        /**
         * 用户自定义1 varchar
         */
        private String userDef1;
        /**
         * 用户自定义2 varchar
         */
        private String userDef2;
        /**
         * 客户名称 varchar
         */
        private String customerName;
        /**
         * 类型,10普通订单,20批次订单 int4
         */
        private Integer type;
        /**
         * 入库单号 varchar
         */
        private String inOrderNo;
        /**
         * 仓库编码 varchar
         */
        private String warehouseCode;
        /**
         * 财务组织编码 varchar
         */
        private String financialOrgCode;
        /**
         * 计费重量(kg) numeric
         */
        private BigDecimal billingWeight;
        /**
         * 空运主单号 varchar
         */
        private String mainOrderNo;
        /**
         * 入仓号 varchar
         */
        private String inWarehouseNo;
        /**
         * 客户财务部门 varchar
         */
        private String orderSourceFinancial;
        /**
         * 创建人行政部门 varchar
         */
        private String initCreatDepart;
        /**
         * 自己行政部门信息 varchar
         */
        private String departCode;
        /**
         * 预计入仓时间 timestamp
         */
        private LocalDateTime estimatedTimeWarehouse;
        /**
         * 服务类型(0:自建，10:空运) int2
         */
        private Integer externalServiceType;
        /**
         * 合并单号 varchar
         */
        private String mergeOrderNo;



}






