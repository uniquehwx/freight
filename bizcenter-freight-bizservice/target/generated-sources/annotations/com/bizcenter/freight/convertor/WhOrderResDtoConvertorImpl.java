package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOrderEntity;
import com.bizcenter.freight.dto.res.WhOrderResDto;
import com.bizcenter.freight.infrastructure.persistence.po.WhOrderPo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-22T17:21:59+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class WhOrderResDtoConvertorImpl extends WhOrderResDtoConvertor {

    @Override
    public WhOrderEntity dto2Entity(WhOrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderEntity whOrderEntity = new WhOrderEntity();

        whOrderEntity.setId( arg0.getId() );
        whOrderEntity.setModifyUserName( arg0.getModifyUserName() );
        whOrderEntity.setModifyUserId( arg0.getModifyUserId() );
        whOrderEntity.setCreateUserName( arg0.getCreateUserName() );
        whOrderEntity.setCreateUserId( arg0.getCreateUserId() );
        whOrderEntity.setIsvId( arg0.getIsvId() );
        whOrderEntity.setCreateRealName( arg0.getCreateRealName() );
        whOrderEntity.setModifyRealName( arg0.getModifyRealName() );
        whOrderEntity.setInStorageNo( arg0.getInStorageNo() );
        whOrderEntity.setCustomerNo( arg0.getCustomerNo() );
        whOrderEntity.setCustomerCode( arg0.getCustomerCode() );
        whOrderEntity.setCustomerContacts( arg0.getCustomerContacts() );
        whOrderEntity.setCustomerPhone( arg0.getCustomerPhone() );
        whOrderEntity.setBusType( arg0.getBusType() );
        whOrderEntity.setWeight( arg0.getWeight() );
        whOrderEntity.setVolume( arg0.getVolume() );
        whOrderEntity.setQuantity( arg0.getQuantity() );
        whOrderEntity.setZhName( arg0.getZhName() );
        whOrderEntity.setActualWeight( arg0.getActualWeight() );
        whOrderEntity.setActualQuantity( arg0.getActualQuantity() );
        whOrderEntity.setActualVolume( arg0.getActualVolume() );
        whOrderEntity.setActualVolumeWeight( arg0.getActualVolumeWeight() );
        whOrderEntity.setSize( arg0.getSize() );
        whOrderEntity.setAccompanyData( arg0.getAccompanyData() );
        whOrderEntity.setOrderNo( arg0.getOrderNo() );
        whOrderEntity.setStatus( arg0.getStatus() );
        whOrderEntity.setImageUploadTime( arg0.getImageUploadTime() );
        whOrderEntity.setInStorageTime( arg0.getInStorageTime() );
        whOrderEntity.setCustomsCheckTime( arg0.getCustomsCheckTime() );
        whOrderEntity.setOutStorageTime( arg0.getOutStorageTime() );
        whOrderEntity.setOrderSource( arg0.getOrderSource() );
        whOrderEntity.setSaleUser( arg0.getSaleUser() );
        whOrderEntity.setServiceUser( arg0.getServiceUser() );
        whOrderEntity.setGoodsDamageInfo( arg0.getGoodsDamageInfo() );
        whOrderEntity.setWarehouseName( arg0.getWarehouseName() );
        whOrderEntity.setGoodsStation( arg0.getGoodsStation() );
        whOrderEntity.setSyncStatus( arg0.getSyncStatus() );
        whOrderEntity.setDepartTime( arg0.getDepartTime() );
        whOrderEntity.setRemark( arg0.getRemark() );
        whOrderEntity.setUserDef1( arg0.getUserDef1() );
        whOrderEntity.setUserDef2( arg0.getUserDef2() );
        whOrderEntity.setCustomerName( arg0.getCustomerName() );
        whOrderEntity.setType( arg0.getType() );
        whOrderEntity.setInOrderNo( arg0.getInOrderNo() );
        whOrderEntity.setWarehouseCode( arg0.getWarehouseCode() );
        whOrderEntity.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        whOrderEntity.setBillingWeight( arg0.getBillingWeight() );
        whOrderEntity.setMainOrderNo( arg0.getMainOrderNo() );
        whOrderEntity.setInWarehouseNo( arg0.getInWarehouseNo() );
        whOrderEntity.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        whOrderEntity.setInitCreatDepart( arg0.getInitCreatDepart() );
        whOrderEntity.setDepartCode( arg0.getDepartCode() );
        whOrderEntity.setEstimatedTimeWarehouse( arg0.getEstimatedTimeWarehouse() );
        whOrderEntity.setExternalServiceType( arg0.getExternalServiceType() );
        whOrderEntity.setMergeOrderNo( arg0.getMergeOrderNo() );

        return whOrderEntity;
    }

    @Override
    public WhOrderPo dto2Po(WhOrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderPo whOrderPo = new WhOrderPo();

        whOrderPo.setId( arg0.getId() );
        whOrderPo.setCreateUserId( arg0.getCreateUserId() );
        whOrderPo.setCreateUserName( arg0.getCreateUserName() );
        whOrderPo.setCreateTime( arg0.getCreateTime() );
        whOrderPo.setModifyUserId( arg0.getModifyUserId() );
        whOrderPo.setModifyUserName( arg0.getModifyUserName() );
        whOrderPo.setModifyTime( arg0.getModifyTime() );
        whOrderPo.setIsvId( arg0.getIsvId() );
        whOrderPo.setCreateRealName( arg0.getCreateRealName() );
        whOrderPo.setModifyRealName( arg0.getModifyRealName() );
        whOrderPo.setInStorageNo( arg0.getInStorageNo() );
        whOrderPo.setCustomerNo( arg0.getCustomerNo() );
        whOrderPo.setCustomerCode( arg0.getCustomerCode() );
        whOrderPo.setCustomerContacts( arg0.getCustomerContacts() );
        whOrderPo.setCustomerPhone( arg0.getCustomerPhone() );
        whOrderPo.setBusType( arg0.getBusType() );
        whOrderPo.setWeight( arg0.getWeight() );
        whOrderPo.setVolume( arg0.getVolume() );
        whOrderPo.setQuantity( arg0.getQuantity() );
        whOrderPo.setZhName( arg0.getZhName() );
        whOrderPo.setActualWeight( arg0.getActualWeight() );
        whOrderPo.setActualQuantity( arg0.getActualQuantity() );
        whOrderPo.setActualVolume( arg0.getActualVolume() );
        whOrderPo.setActualVolumeWeight( arg0.getActualVolumeWeight() );
        whOrderPo.setSize( arg0.getSize() );
        whOrderPo.setAccompanyData( arg0.getAccompanyData() );
        whOrderPo.setOrderNo( arg0.getOrderNo() );
        whOrderPo.setStatus( arg0.getStatus() );
        whOrderPo.setImageUploadTime( arg0.getImageUploadTime() );
        whOrderPo.setInStorageTime( arg0.getInStorageTime() );
        whOrderPo.setCustomsCheckTime( arg0.getCustomsCheckTime() );
        whOrderPo.setOutStorageTime( arg0.getOutStorageTime() );
        whOrderPo.setOrderSource( arg0.getOrderSource() );
        whOrderPo.setSaleUser( arg0.getSaleUser() );
        whOrderPo.setServiceUser( arg0.getServiceUser() );
        whOrderPo.setGoodsDamageInfo( arg0.getGoodsDamageInfo() );
        whOrderPo.setWarehouseName( arg0.getWarehouseName() );
        whOrderPo.setGoodsStation( arg0.getGoodsStation() );
        whOrderPo.setSyncStatus( arg0.getSyncStatus() );
        whOrderPo.setDepartTime( arg0.getDepartTime() );
        whOrderPo.setRemark( arg0.getRemark() );
        whOrderPo.setUserDef1( arg0.getUserDef1() );
        whOrderPo.setUserDef2( arg0.getUserDef2() );
        whOrderPo.setCustomerName( arg0.getCustomerName() );
        whOrderPo.setType( arg0.getType() );
        whOrderPo.setInOrderNo( arg0.getInOrderNo() );
        whOrderPo.setWarehouseCode( arg0.getWarehouseCode() );
        whOrderPo.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        whOrderPo.setBillingWeight( arg0.getBillingWeight() );
        whOrderPo.setMainOrderNo( arg0.getMainOrderNo() );
        whOrderPo.setInWarehouseNo( arg0.getInWarehouseNo() );
        whOrderPo.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        whOrderPo.setInitCreatDepart( arg0.getInitCreatDepart() );
        whOrderPo.setDepartCode( arg0.getDepartCode() );
        whOrderPo.setEstimatedTimeWarehouse( arg0.getEstimatedTimeWarehouse() );
        whOrderPo.setExternalServiceType( arg0.getExternalServiceType() );
        whOrderPo.setMergeOrderNo( arg0.getMergeOrderNo() );

        return whOrderPo;
    }

    @Override
    public WhOrderResDto entity2Dto(WhOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderResDto whOrderResDto = new WhOrderResDto();

        whOrderResDto.setId( arg0.getId() );
        whOrderResDto.setModifyUserName( arg0.getModifyUserName() );
        whOrderResDto.setModifyUserId( arg0.getModifyUserId() );
        whOrderResDto.setCreateUserName( arg0.getCreateUserName() );
        whOrderResDto.setCreateUserId( arg0.getCreateUserId() );
        whOrderResDto.setIsvId( arg0.getIsvId() );
        whOrderResDto.setCreateRealName( arg0.getCreateRealName() );
        whOrderResDto.setModifyRealName( arg0.getModifyRealName() );
        whOrderResDto.setInStorageNo( arg0.getInStorageNo() );
        whOrderResDto.setCustomerNo( arg0.getCustomerNo() );
        whOrderResDto.setCustomerCode( arg0.getCustomerCode() );
        whOrderResDto.setCustomerContacts( arg0.getCustomerContacts() );
        whOrderResDto.setCustomerPhone( arg0.getCustomerPhone() );
        whOrderResDto.setBusType( arg0.getBusType() );
        whOrderResDto.setWeight( arg0.getWeight() );
        whOrderResDto.setVolume( arg0.getVolume() );
        whOrderResDto.setQuantity( arg0.getQuantity() );
        whOrderResDto.setZhName( arg0.getZhName() );
        whOrderResDto.setActualWeight( arg0.getActualWeight() );
        whOrderResDto.setActualQuantity( arg0.getActualQuantity() );
        whOrderResDto.setActualVolume( arg0.getActualVolume() );
        whOrderResDto.setActualVolumeWeight( arg0.getActualVolumeWeight() );
        whOrderResDto.setSize( arg0.getSize() );
        whOrderResDto.setAccompanyData( arg0.getAccompanyData() );
        whOrderResDto.setOrderNo( arg0.getOrderNo() );
        whOrderResDto.setStatus( arg0.getStatus() );
        whOrderResDto.setImageUploadTime( arg0.getImageUploadTime() );
        whOrderResDto.setInStorageTime( arg0.getInStorageTime() );
        whOrderResDto.setCustomsCheckTime( arg0.getCustomsCheckTime() );
        whOrderResDto.setOutStorageTime( arg0.getOutStorageTime() );
        whOrderResDto.setOrderSource( arg0.getOrderSource() );
        whOrderResDto.setSaleUser( arg0.getSaleUser() );
        whOrderResDto.setServiceUser( arg0.getServiceUser() );
        whOrderResDto.setGoodsDamageInfo( arg0.getGoodsDamageInfo() );
        whOrderResDto.setWarehouseName( arg0.getWarehouseName() );
        whOrderResDto.setGoodsStation( arg0.getGoodsStation() );
        whOrderResDto.setSyncStatus( arg0.getSyncStatus() );
        whOrderResDto.setDepartTime( arg0.getDepartTime() );
        whOrderResDto.setRemark( arg0.getRemark() );
        whOrderResDto.setUserDef1( arg0.getUserDef1() );
        whOrderResDto.setUserDef2( arg0.getUserDef2() );
        whOrderResDto.setCustomerName( arg0.getCustomerName() );
        whOrderResDto.setType( arg0.getType() );
        whOrderResDto.setInOrderNo( arg0.getInOrderNo() );
        whOrderResDto.setWarehouseCode( arg0.getWarehouseCode() );
        whOrderResDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        whOrderResDto.setBillingWeight( arg0.getBillingWeight() );
        whOrderResDto.setMainOrderNo( arg0.getMainOrderNo() );
        whOrderResDto.setInWarehouseNo( arg0.getInWarehouseNo() );
        whOrderResDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        whOrderResDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        whOrderResDto.setDepartCode( arg0.getDepartCode() );
        whOrderResDto.setEstimatedTimeWarehouse( arg0.getEstimatedTimeWarehouse() );
        whOrderResDto.setExternalServiceType( arg0.getExternalServiceType() );
        whOrderResDto.setMergeOrderNo( arg0.getMergeOrderNo() );

        return whOrderResDto;
    }

    @Override
    public WhOrderResDto po2Dto(WhOrderPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderResDto whOrderResDto = new WhOrderResDto();

        whOrderResDto.setId( arg0.getId() );
        whOrderResDto.setModifyTime( arg0.getModifyTime() );
        whOrderResDto.setModifyUserName( arg0.getModifyUserName() );
        whOrderResDto.setModifyUserId( arg0.getModifyUserId() );
        whOrderResDto.setCreateTime( arg0.getCreateTime() );
        whOrderResDto.setCreateUserName( arg0.getCreateUserName() );
        whOrderResDto.setCreateUserId( arg0.getCreateUserId() );
        whOrderResDto.setIsvId( arg0.getIsvId() );
        whOrderResDto.setCreateRealName( arg0.getCreateRealName() );
        whOrderResDto.setModifyRealName( arg0.getModifyRealName() );
        whOrderResDto.setInStorageNo( arg0.getInStorageNo() );
        whOrderResDto.setCustomerNo( arg0.getCustomerNo() );
        whOrderResDto.setCustomerCode( arg0.getCustomerCode() );
        whOrderResDto.setCustomerContacts( arg0.getCustomerContacts() );
        whOrderResDto.setCustomerPhone( arg0.getCustomerPhone() );
        whOrderResDto.setBusType( arg0.getBusType() );
        whOrderResDto.setWeight( arg0.getWeight() );
        whOrderResDto.setVolume( arg0.getVolume() );
        whOrderResDto.setQuantity( arg0.getQuantity() );
        whOrderResDto.setZhName( arg0.getZhName() );
        whOrderResDto.setActualWeight( arg0.getActualWeight() );
        whOrderResDto.setActualQuantity( arg0.getActualQuantity() );
        whOrderResDto.setActualVolume( arg0.getActualVolume() );
        whOrderResDto.setActualVolumeWeight( arg0.getActualVolumeWeight() );
        whOrderResDto.setSize( arg0.getSize() );
        whOrderResDto.setAccompanyData( arg0.getAccompanyData() );
        whOrderResDto.setOrderNo( arg0.getOrderNo() );
        whOrderResDto.setStatus( arg0.getStatus() );
        whOrderResDto.setImageUploadTime( arg0.getImageUploadTime() );
        whOrderResDto.setInStorageTime( arg0.getInStorageTime() );
        whOrderResDto.setCustomsCheckTime( arg0.getCustomsCheckTime() );
        whOrderResDto.setOutStorageTime( arg0.getOutStorageTime() );
        whOrderResDto.setOrderSource( arg0.getOrderSource() );
        whOrderResDto.setSaleUser( arg0.getSaleUser() );
        whOrderResDto.setServiceUser( arg0.getServiceUser() );
        whOrderResDto.setGoodsDamageInfo( arg0.getGoodsDamageInfo() );
        whOrderResDto.setWarehouseName( arg0.getWarehouseName() );
        whOrderResDto.setGoodsStation( arg0.getGoodsStation() );
        whOrderResDto.setSyncStatus( arg0.getSyncStatus() );
        whOrderResDto.setDepartTime( arg0.getDepartTime() );
        whOrderResDto.setRemark( arg0.getRemark() );
        whOrderResDto.setUserDef1( arg0.getUserDef1() );
        whOrderResDto.setUserDef2( arg0.getUserDef2() );
        whOrderResDto.setCustomerName( arg0.getCustomerName() );
        whOrderResDto.setType( arg0.getType() );
        whOrderResDto.setInOrderNo( arg0.getInOrderNo() );
        whOrderResDto.setWarehouseCode( arg0.getWarehouseCode() );
        whOrderResDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        whOrderResDto.setBillingWeight( arg0.getBillingWeight() );
        whOrderResDto.setMainOrderNo( arg0.getMainOrderNo() );
        whOrderResDto.setInWarehouseNo( arg0.getInWarehouseNo() );
        whOrderResDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        whOrderResDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        whOrderResDto.setDepartCode( arg0.getDepartCode() );
        whOrderResDto.setEstimatedTimeWarehouse( arg0.getEstimatedTimeWarehouse() );
        whOrderResDto.setExternalServiceType( arg0.getExternalServiceType() );
        whOrderResDto.setMergeOrderNo( arg0.getMergeOrderNo() );

        return whOrderResDto;
    }

    @Override
    public WhOrderEntity po2Entity(WhOrderPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderEntity whOrderEntity = new WhOrderEntity();

        whOrderEntity.setId( arg0.getId() );
        whOrderEntity.setModifyUserName( arg0.getModifyUserName() );
        whOrderEntity.setModifyUserId( arg0.getModifyUserId() );
        whOrderEntity.setCreateUserName( arg0.getCreateUserName() );
        whOrderEntity.setCreateUserId( arg0.getCreateUserId() );
        whOrderEntity.setIsvId( arg0.getIsvId() );
        whOrderEntity.setCreateRealName( arg0.getCreateRealName() );
        whOrderEntity.setModifyRealName( arg0.getModifyRealName() );
        whOrderEntity.setInStorageNo( arg0.getInStorageNo() );
        whOrderEntity.setCustomerNo( arg0.getCustomerNo() );
        whOrderEntity.setCustomerCode( arg0.getCustomerCode() );
        whOrderEntity.setCustomerContacts( arg0.getCustomerContacts() );
        whOrderEntity.setCustomerPhone( arg0.getCustomerPhone() );
        whOrderEntity.setBusType( arg0.getBusType() );
        whOrderEntity.setWeight( arg0.getWeight() );
        whOrderEntity.setVolume( arg0.getVolume() );
        whOrderEntity.setQuantity( arg0.getQuantity() );
        whOrderEntity.setZhName( arg0.getZhName() );
        whOrderEntity.setActualWeight( arg0.getActualWeight() );
        whOrderEntity.setActualQuantity( arg0.getActualQuantity() );
        whOrderEntity.setActualVolume( arg0.getActualVolume() );
        whOrderEntity.setActualVolumeWeight( arg0.getActualVolumeWeight() );
        whOrderEntity.setSize( arg0.getSize() );
        whOrderEntity.setAccompanyData( arg0.getAccompanyData() );
        whOrderEntity.setOrderNo( arg0.getOrderNo() );
        whOrderEntity.setStatus( arg0.getStatus() );
        whOrderEntity.setImageUploadTime( arg0.getImageUploadTime() );
        whOrderEntity.setInStorageTime( arg0.getInStorageTime() );
        whOrderEntity.setCustomsCheckTime( arg0.getCustomsCheckTime() );
        whOrderEntity.setOutStorageTime( arg0.getOutStorageTime() );
        whOrderEntity.setOrderSource( arg0.getOrderSource() );
        whOrderEntity.setSaleUser( arg0.getSaleUser() );
        whOrderEntity.setServiceUser( arg0.getServiceUser() );
        whOrderEntity.setGoodsDamageInfo( arg0.getGoodsDamageInfo() );
        whOrderEntity.setWarehouseName( arg0.getWarehouseName() );
        whOrderEntity.setGoodsStation( arg0.getGoodsStation() );
        whOrderEntity.setSyncStatus( arg0.getSyncStatus() );
        whOrderEntity.setDepartTime( arg0.getDepartTime() );
        whOrderEntity.setRemark( arg0.getRemark() );
        whOrderEntity.setUserDef1( arg0.getUserDef1() );
        whOrderEntity.setUserDef2( arg0.getUserDef2() );
        whOrderEntity.setCustomerName( arg0.getCustomerName() );
        whOrderEntity.setType( arg0.getType() );
        whOrderEntity.setInOrderNo( arg0.getInOrderNo() );
        whOrderEntity.setWarehouseCode( arg0.getWarehouseCode() );
        whOrderEntity.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        whOrderEntity.setBillingWeight( arg0.getBillingWeight() );
        whOrderEntity.setMainOrderNo( arg0.getMainOrderNo() );
        whOrderEntity.setInWarehouseNo( arg0.getInWarehouseNo() );
        whOrderEntity.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        whOrderEntity.setInitCreatDepart( arg0.getInitCreatDepart() );
        whOrderEntity.setDepartCode( arg0.getDepartCode() );
        whOrderEntity.setEstimatedTimeWarehouse( arg0.getEstimatedTimeWarehouse() );
        whOrderEntity.setExternalServiceType( arg0.getExternalServiceType() );
        whOrderEntity.setMergeOrderNo( arg0.getMergeOrderNo() );

        return whOrderEntity;
    }

    @Override
    public WhOrderPo entity2Po(WhOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderPo whOrderPo = new WhOrderPo();

        whOrderPo.setId( arg0.getId() );
        whOrderPo.setCreateUserId( arg0.getCreateUserId() );
        whOrderPo.setCreateUserName( arg0.getCreateUserName() );
        whOrderPo.setModifyUserId( arg0.getModifyUserId() );
        whOrderPo.setModifyUserName( arg0.getModifyUserName() );
        whOrderPo.setIsvId( arg0.getIsvId() );
        whOrderPo.setCreateRealName( arg0.getCreateRealName() );
        whOrderPo.setModifyRealName( arg0.getModifyRealName() );
        whOrderPo.setInStorageNo( arg0.getInStorageNo() );
        whOrderPo.setCustomerNo( arg0.getCustomerNo() );
        whOrderPo.setCustomerCode( arg0.getCustomerCode() );
        whOrderPo.setCustomerContacts( arg0.getCustomerContacts() );
        whOrderPo.setCustomerPhone( arg0.getCustomerPhone() );
        whOrderPo.setBusType( arg0.getBusType() );
        whOrderPo.setWeight( arg0.getWeight() );
        whOrderPo.setVolume( arg0.getVolume() );
        whOrderPo.setQuantity( arg0.getQuantity() );
        whOrderPo.setZhName( arg0.getZhName() );
        whOrderPo.setActualWeight( arg0.getActualWeight() );
        whOrderPo.setActualQuantity( arg0.getActualQuantity() );
        whOrderPo.setActualVolume( arg0.getActualVolume() );
        whOrderPo.setActualVolumeWeight( arg0.getActualVolumeWeight() );
        whOrderPo.setSize( arg0.getSize() );
        whOrderPo.setAccompanyData( arg0.getAccompanyData() );
        whOrderPo.setOrderNo( arg0.getOrderNo() );
        whOrderPo.setStatus( arg0.getStatus() );
        whOrderPo.setImageUploadTime( arg0.getImageUploadTime() );
        whOrderPo.setInStorageTime( arg0.getInStorageTime() );
        whOrderPo.setCustomsCheckTime( arg0.getCustomsCheckTime() );
        whOrderPo.setOutStorageTime( arg0.getOutStorageTime() );
        whOrderPo.setOrderSource( arg0.getOrderSource() );
        whOrderPo.setSaleUser( arg0.getSaleUser() );
        whOrderPo.setServiceUser( arg0.getServiceUser() );
        whOrderPo.setGoodsDamageInfo( arg0.getGoodsDamageInfo() );
        whOrderPo.setWarehouseName( arg0.getWarehouseName() );
        whOrderPo.setGoodsStation( arg0.getGoodsStation() );
        whOrderPo.setSyncStatus( arg0.getSyncStatus() );
        whOrderPo.setDepartTime( arg0.getDepartTime() );
        whOrderPo.setRemark( arg0.getRemark() );
        whOrderPo.setUserDef1( arg0.getUserDef1() );
        whOrderPo.setUserDef2( arg0.getUserDef2() );
        whOrderPo.setCustomerName( arg0.getCustomerName() );
        whOrderPo.setType( arg0.getType() );
        whOrderPo.setInOrderNo( arg0.getInOrderNo() );
        whOrderPo.setWarehouseCode( arg0.getWarehouseCode() );
        whOrderPo.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        whOrderPo.setBillingWeight( arg0.getBillingWeight() );
        whOrderPo.setMainOrderNo( arg0.getMainOrderNo() );
        whOrderPo.setInWarehouseNo( arg0.getInWarehouseNo() );
        whOrderPo.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        whOrderPo.setInitCreatDepart( arg0.getInitCreatDepart() );
        whOrderPo.setDepartCode( arg0.getDepartCode() );
        whOrderPo.setEstimatedTimeWarehouse( arg0.getEstimatedTimeWarehouse() );
        whOrderPo.setExternalServiceType( arg0.getExternalServiceType() );
        whOrderPo.setMergeOrderNo( arg0.getMergeOrderNo() );

        return whOrderPo;
    }

    @Override
    public List<WhOrderEntity> dtoList2EntityList(List<WhOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderEntity> list = new ArrayList<WhOrderEntity>( arg0.size() );
        for ( WhOrderResDto whOrderResDto : arg0 ) {
            list.add( dto2Entity( whOrderResDto ) );
        }

        return list;
    }

    @Override
    public List<WhOrderPo> dtoList2PoList(List<WhOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderPo> list = new ArrayList<WhOrderPo>( arg0.size() );
        for ( WhOrderResDto whOrderResDto : arg0 ) {
            list.add( dto2Po( whOrderResDto ) );
        }

        return list;
    }

    @Override
    public List<WhOrderResDto> entityList2DtoList(List<WhOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderResDto> list = new ArrayList<WhOrderResDto>( arg0.size() );
        for ( WhOrderEntity whOrderEntity : arg0 ) {
            list.add( entity2Dto( whOrderEntity ) );
        }

        return list;
    }

    @Override
    public List<WhOrderResDto> poList2DtoList(List<WhOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderResDto> list = new ArrayList<WhOrderResDto>( arg0.size() );
        for ( WhOrderPo whOrderPo : arg0 ) {
            list.add( po2Dto( whOrderPo ) );
        }

        return list;
    }

    @Override
    public List<WhOrderEntity> poList2EntityList(List<WhOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderEntity> list = new ArrayList<WhOrderEntity>( arg0.size() );
        for ( WhOrderPo whOrderPo : arg0 ) {
            list.add( po2Entity( whOrderPo ) );
        }

        return list;
    }

    @Override
    public List<WhOrderPo> entityList2PoList(List<WhOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderPo> list = new ArrayList<WhOrderPo>( arg0.size() );
        for ( WhOrderEntity whOrderEntity : arg0 ) {
            list.add( entity2Po( whOrderEntity ) );
        }

        return list;
    }
}
