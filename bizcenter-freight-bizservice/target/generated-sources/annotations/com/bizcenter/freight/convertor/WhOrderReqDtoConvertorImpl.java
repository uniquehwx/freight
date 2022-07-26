package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOrderEntity;
import com.bizcenter.freight.dto.req.WhOrderReqDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-26T16:50:55+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class WhOrderReqDtoConvertorImpl extends WhOrderReqDtoConvertor {

    @Override
    public WhOrderEntity dto2Entity(WhOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderEntity whOrderEntity = new WhOrderEntity();

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
    public String dto2Po(WhOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public WhOrderReqDto entity2Dto(WhOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderReqDto whOrderReqDto = new WhOrderReqDto();

        whOrderReqDto.setIsvId( arg0.getIsvId() );
        whOrderReqDto.setCreateRealName( arg0.getCreateRealName() );
        whOrderReqDto.setModifyRealName( arg0.getModifyRealName() );
        whOrderReqDto.setInStorageNo( arg0.getInStorageNo() );
        whOrderReqDto.setCustomerNo( arg0.getCustomerNo() );
        whOrderReqDto.setCustomerCode( arg0.getCustomerCode() );
        whOrderReqDto.setCustomerContacts( arg0.getCustomerContacts() );
        whOrderReqDto.setCustomerPhone( arg0.getCustomerPhone() );
        whOrderReqDto.setBusType( arg0.getBusType() );
        whOrderReqDto.setWeight( arg0.getWeight() );
        whOrderReqDto.setVolume( arg0.getVolume() );
        whOrderReqDto.setQuantity( arg0.getQuantity() );
        whOrderReqDto.setZhName( arg0.getZhName() );
        whOrderReqDto.setActualWeight( arg0.getActualWeight() );
        whOrderReqDto.setActualQuantity( arg0.getActualQuantity() );
        whOrderReqDto.setActualVolume( arg0.getActualVolume() );
        whOrderReqDto.setActualVolumeWeight( arg0.getActualVolumeWeight() );
        whOrderReqDto.setSize( arg0.getSize() );
        whOrderReqDto.setAccompanyData( arg0.getAccompanyData() );
        whOrderReqDto.setOrderNo( arg0.getOrderNo() );
        whOrderReqDto.setStatus( arg0.getStatus() );
        whOrderReqDto.setImageUploadTime( arg0.getImageUploadTime() );
        whOrderReqDto.setInStorageTime( arg0.getInStorageTime() );
        whOrderReqDto.setCustomsCheckTime( arg0.getCustomsCheckTime() );
        whOrderReqDto.setOutStorageTime( arg0.getOutStorageTime() );
        whOrderReqDto.setOrderSource( arg0.getOrderSource() );
        whOrderReqDto.setSaleUser( arg0.getSaleUser() );
        whOrderReqDto.setServiceUser( arg0.getServiceUser() );
        whOrderReqDto.setGoodsDamageInfo( arg0.getGoodsDamageInfo() );
        whOrderReqDto.setWarehouseName( arg0.getWarehouseName() );
        whOrderReqDto.setGoodsStation( arg0.getGoodsStation() );
        whOrderReqDto.setSyncStatus( arg0.getSyncStatus() );
        whOrderReqDto.setDepartTime( arg0.getDepartTime() );
        whOrderReqDto.setRemark( arg0.getRemark() );
        whOrderReqDto.setUserDef1( arg0.getUserDef1() );
        whOrderReqDto.setUserDef2( arg0.getUserDef2() );
        whOrderReqDto.setCustomerName( arg0.getCustomerName() );
        whOrderReqDto.setType( arg0.getType() );
        whOrderReqDto.setInOrderNo( arg0.getInOrderNo() );
        whOrderReqDto.setWarehouseCode( arg0.getWarehouseCode() );
        whOrderReqDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        whOrderReqDto.setBillingWeight( arg0.getBillingWeight() );
        whOrderReqDto.setMainOrderNo( arg0.getMainOrderNo() );
        whOrderReqDto.setInWarehouseNo( arg0.getInWarehouseNo() );
        whOrderReqDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        whOrderReqDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        whOrderReqDto.setDepartCode( arg0.getDepartCode() );
        whOrderReqDto.setEstimatedTimeWarehouse( arg0.getEstimatedTimeWarehouse() );
        whOrderReqDto.setExternalServiceType( arg0.getExternalServiceType() );
        whOrderReqDto.setMergeOrderNo( arg0.getMergeOrderNo() );

        return whOrderReqDto;
    }

    @Override
    public WhOrderReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderReqDto whOrderReqDto = new WhOrderReqDto();

        return whOrderReqDto;
    }

    @Override
    public WhOrderEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderEntity whOrderEntity = new WhOrderEntity();

        return whOrderEntity;
    }

    @Override
    public String entity2Po(WhOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<WhOrderEntity> dtoList2EntityList(List<WhOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderEntity> list = new ArrayList<WhOrderEntity>( arg0.size() );
        for ( WhOrderReqDto whOrderReqDto : arg0 ) {
            list.add( dto2Entity( whOrderReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<WhOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WhOrderReqDto whOrderReqDto : arg0 ) {
            list.add( dto2Po( whOrderReqDto ) );
        }

        return list;
    }

    @Override
    public List<WhOrderReqDto> entityList2DtoList(List<WhOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderReqDto> list = new ArrayList<WhOrderReqDto>( arg0.size() );
        for ( WhOrderEntity whOrderEntity : arg0 ) {
            list.add( entity2Dto( whOrderEntity ) );
        }

        return list;
    }

    @Override
    public List<WhOrderReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderReqDto> list = new ArrayList<WhOrderReqDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<WhOrderEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderEntity> list = new ArrayList<WhOrderEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<WhOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WhOrderEntity whOrderEntity : arg0 ) {
            list.add( entity2Po( whOrderEntity ) );
        }

        return list;
    }
}
