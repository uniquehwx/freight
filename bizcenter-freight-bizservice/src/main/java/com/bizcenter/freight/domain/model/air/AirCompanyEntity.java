package com.bizcenter.freight.domain.model.air;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.framwork.domain.model.Entity;
import com.bizcenter.freight.domain.model.air.childer.AirPanelEntity;
import com.bizcenter.freight.domain.model.order.OrderEntity;
import com.bizcenter.freight.domain.repository.AirCompanyRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;


/**
 * 航司表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class AirCompanyEntity  implements Entity<AirCompanyEntity>{


        /**
         * ID int8
         */
        private Long id;
        /**
         * 公司编码(用于关联他表) varchar
         */
        private String companyNo;
        /**
         * 航司代码 varchar
         */
        private String airCompanyCode;
        /**
         * 公司名称 varchar
         */
        private String companyName;
        /**
         * 提单前缀 varchar
         */
        private String companyCode;
        /**
         * 提单打印抬头 varchar
         */
        private String landingBillInvoiceTitle;
        /**
         * 备注 varchar
         */
        private String issuingCar;
        /**
         * IATAcode varchar
         */
        private String iataCode;
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
         * 供应商编码 varchar
         */
        private String supplierCode;
        /**
         * 供应商名称 varchar
         */
        private String supplierName;
        /**
         * AccountNo varchar
         */
        private String accountNo;

        /**
         * 版型信息 entity
         */
        private List<AirPanelEntity> airPanelList;

        // action

        public static Pager<AirCompanyEntity> doPager(AirCompanyRepository airCompanyRepository, Map<String, Object> params) {
                return   airCompanyRepository.doPager(params);
        }


        public AirCompanyEntity insert(AirCompanyRepository airCompanyRepository) {
                // 通过仓储层进行处理
                Entity entity = airCompanyRepository.insert(this);
                return (AirCompanyEntity) entity;
        }

        public static List<AirCompanyEntity>  batchInsert(AirCompanyRepository airCompanyRepository,List<AirCompanyEntity> list) {
                // 通过仓储层进行处理
                List<AirCompanyEntity> entityList = airCompanyRepository.batchInsert(list);
                return entityList;
        }

        public static boolean  deleteByIds(AirCompanyRepository airCompanyRepository,String ids) {
                // 通过仓储层进行处理
                return airCompanyRepository.deleteByIds(ids);
        }


        public static AirCompanyEntity selectOne(AirCompanyRepository airCompanyRepository,Long id){
                Entity entity = airCompanyRepository.selectByPrimaryKey(id);
                return (AirCompanyEntity) entity;
        }


        public boolean updateProps(AirCompanyRepository airCompanyRepository) {

                return airCompanyRepository.updateSingle(this);
        }
}






