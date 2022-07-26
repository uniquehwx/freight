package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOutOrderEntity;
import com.bizcenter.freight.dto.res.WhOutOrderResDto;
import com.bizcenter.freight.infrastructure.persistence.po.WhOutOrderPo;
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
public class WhOutOrderResDtoConvertorImpl extends WhOutOrderResDtoConvertor {

    @Override
    public WhOutOrderEntity dto2Entity(WhOutOrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderEntity whOutOrderEntity = new WhOutOrderEntity();

        whOutOrderEntity.setId( arg0.getId() );
        whOutOrderEntity.setModifyUserName( arg0.getModifyUserName() );
        whOutOrderEntity.setModifyUserId( arg0.getModifyUserId() );
        whOutOrderEntity.setCreateUserName( arg0.getCreateUserName() );
        whOutOrderEntity.setCreateUserId( arg0.getCreateUserId() );
        whOutOrderEntity.setIsvId( arg0.getIsvId() );
        whOutOrderEntity.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderEntity.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderEntity.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderEntity.setCustomerCode( arg0.getCustomerCode() );
        whOutOrderEntity.setWarehouseName( arg0.getWarehouseName() );
        whOutOrderEntity.setOutStorageTime( arg0.getOutStorageTime() );
        whOutOrderEntity.setStatus( arg0.getStatus() );
        whOutOrderEntity.setSyncStatus( arg0.getSyncStatus() );
        whOutOrderEntity.setRemark( arg0.getRemark() );
        whOutOrderEntity.setUserDef1( arg0.getUserDef1() );
        whOutOrderEntity.setUserDef2( arg0.getUserDef2() );
        whOutOrderEntity.setQuantity( arg0.getQuantity() );
        whOutOrderEntity.setActualQuantity( arg0.getActualQuantity() );
        whOutOrderEntity.setActualWeight( arg0.getActualWeight() );
        whOutOrderEntity.setActualVolume( arg0.getActualVolume() );
        whOutOrderEntity.setPartOrderNo( arg0.getPartOrderNo() );
        whOutOrderEntity.setCustomerName( arg0.getCustomerName() );
        whOutOrderEntity.setOrderSource( arg0.getOrderSource() );
        whOutOrderEntity.setWarehouseCode( arg0.getWarehouseCode() );
        whOutOrderEntity.setOutOrderNo( arg0.getOutOrderNo() );
        whOutOrderEntity.setType( arg0.getType() );
        whOutOrderEntity.setCustomerNo( arg0.getCustomerNo() );

        return whOutOrderEntity;
    }

    @Override
    public WhOutOrderPo dto2Po(WhOutOrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderPo whOutOrderPo = new WhOutOrderPo();

        whOutOrderPo.setId( arg0.getId() );
        whOutOrderPo.setCreateUserId( arg0.getCreateUserId() );
        whOutOrderPo.setCreateUserName( arg0.getCreateUserName() );
        whOutOrderPo.setCreateTime( arg0.getCreateTime() );
        whOutOrderPo.setModifyUserId( arg0.getModifyUserId() );
        whOutOrderPo.setModifyUserName( arg0.getModifyUserName() );
        whOutOrderPo.setModifyTime( arg0.getModifyTime() );
        whOutOrderPo.setIsvId( arg0.getIsvId() );
        whOutOrderPo.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderPo.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderPo.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderPo.setCustomerCode( arg0.getCustomerCode() );
        whOutOrderPo.setWarehouseName( arg0.getWarehouseName() );
        whOutOrderPo.setOutStorageTime( arg0.getOutStorageTime() );
        whOutOrderPo.setStatus( arg0.getStatus() );
        whOutOrderPo.setSyncStatus( arg0.getSyncStatus() );
        whOutOrderPo.setRemark( arg0.getRemark() );
        whOutOrderPo.setUserDef1( arg0.getUserDef1() );
        whOutOrderPo.setUserDef2( arg0.getUserDef2() );
        whOutOrderPo.setQuantity( arg0.getQuantity() );
        whOutOrderPo.setActualQuantity( arg0.getActualQuantity() );
        whOutOrderPo.setActualWeight( arg0.getActualWeight() );
        whOutOrderPo.setActualVolume( arg0.getActualVolume() );
        whOutOrderPo.setPartOrderNo( arg0.getPartOrderNo() );
        whOutOrderPo.setCustomerName( arg0.getCustomerName() );
        whOutOrderPo.setOrderSource( arg0.getOrderSource() );
        whOutOrderPo.setWarehouseCode( arg0.getWarehouseCode() );
        whOutOrderPo.setOutOrderNo( arg0.getOutOrderNo() );
        whOutOrderPo.setType( arg0.getType() );
        whOutOrderPo.setCustomerNo( arg0.getCustomerNo() );

        return whOutOrderPo;
    }

    @Override
    public WhOutOrderResDto entity2Dto(WhOutOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderResDto whOutOrderResDto = new WhOutOrderResDto();

        whOutOrderResDto.setId( arg0.getId() );
        whOutOrderResDto.setModifyUserName( arg0.getModifyUserName() );
        whOutOrderResDto.setModifyUserId( arg0.getModifyUserId() );
        whOutOrderResDto.setCreateUserName( arg0.getCreateUserName() );
        whOutOrderResDto.setCreateUserId( arg0.getCreateUserId() );
        whOutOrderResDto.setIsvId( arg0.getIsvId() );
        whOutOrderResDto.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderResDto.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderResDto.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderResDto.setCustomerCode( arg0.getCustomerCode() );
        whOutOrderResDto.setWarehouseName( arg0.getWarehouseName() );
        whOutOrderResDto.setOutStorageTime( arg0.getOutStorageTime() );
        whOutOrderResDto.setStatus( arg0.getStatus() );
        whOutOrderResDto.setSyncStatus( arg0.getSyncStatus() );
        whOutOrderResDto.setRemark( arg0.getRemark() );
        whOutOrderResDto.setUserDef1( arg0.getUserDef1() );
        whOutOrderResDto.setUserDef2( arg0.getUserDef2() );
        whOutOrderResDto.setQuantity( arg0.getQuantity() );
        whOutOrderResDto.setActualQuantity( arg0.getActualQuantity() );
        whOutOrderResDto.setActualWeight( arg0.getActualWeight() );
        whOutOrderResDto.setActualVolume( arg0.getActualVolume() );
        whOutOrderResDto.setPartOrderNo( arg0.getPartOrderNo() );
        whOutOrderResDto.setCustomerName( arg0.getCustomerName() );
        whOutOrderResDto.setOrderSource( arg0.getOrderSource() );
        whOutOrderResDto.setWarehouseCode( arg0.getWarehouseCode() );
        whOutOrderResDto.setOutOrderNo( arg0.getOutOrderNo() );
        whOutOrderResDto.setType( arg0.getType() );
        whOutOrderResDto.setCustomerNo( arg0.getCustomerNo() );

        return whOutOrderResDto;
    }

    @Override
    public WhOutOrderResDto po2Dto(WhOutOrderPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderResDto whOutOrderResDto = new WhOutOrderResDto();

        whOutOrderResDto.setId( arg0.getId() );
        whOutOrderResDto.setModifyTime( arg0.getModifyTime() );
        whOutOrderResDto.setModifyUserName( arg0.getModifyUserName() );
        whOutOrderResDto.setModifyUserId( arg0.getModifyUserId() );
        whOutOrderResDto.setCreateTime( arg0.getCreateTime() );
        whOutOrderResDto.setCreateUserName( arg0.getCreateUserName() );
        whOutOrderResDto.setCreateUserId( arg0.getCreateUserId() );
        whOutOrderResDto.setIsvId( arg0.getIsvId() );
        whOutOrderResDto.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderResDto.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderResDto.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderResDto.setCustomerCode( arg0.getCustomerCode() );
        whOutOrderResDto.setWarehouseName( arg0.getWarehouseName() );
        whOutOrderResDto.setOutStorageTime( arg0.getOutStorageTime() );
        whOutOrderResDto.setStatus( arg0.getStatus() );
        whOutOrderResDto.setSyncStatus( arg0.getSyncStatus() );
        whOutOrderResDto.setRemark( arg0.getRemark() );
        whOutOrderResDto.setUserDef1( arg0.getUserDef1() );
        whOutOrderResDto.setUserDef2( arg0.getUserDef2() );
        whOutOrderResDto.setQuantity( arg0.getQuantity() );
        whOutOrderResDto.setActualQuantity( arg0.getActualQuantity() );
        whOutOrderResDto.setActualWeight( arg0.getActualWeight() );
        whOutOrderResDto.setActualVolume( arg0.getActualVolume() );
        whOutOrderResDto.setPartOrderNo( arg0.getPartOrderNo() );
        whOutOrderResDto.setCustomerName( arg0.getCustomerName() );
        whOutOrderResDto.setOrderSource( arg0.getOrderSource() );
        whOutOrderResDto.setWarehouseCode( arg0.getWarehouseCode() );
        whOutOrderResDto.setOutOrderNo( arg0.getOutOrderNo() );
        whOutOrderResDto.setType( arg0.getType() );
        whOutOrderResDto.setCustomerNo( arg0.getCustomerNo() );

        return whOutOrderResDto;
    }

    @Override
    public WhOutOrderEntity po2Entity(WhOutOrderPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderEntity whOutOrderEntity = new WhOutOrderEntity();

        whOutOrderEntity.setId( arg0.getId() );
        whOutOrderEntity.setModifyUserName( arg0.getModifyUserName() );
        whOutOrderEntity.setModifyUserId( arg0.getModifyUserId() );
        whOutOrderEntity.setCreateUserName( arg0.getCreateUserName() );
        whOutOrderEntity.setCreateUserId( arg0.getCreateUserId() );
        whOutOrderEntity.setIsvId( arg0.getIsvId() );
        whOutOrderEntity.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderEntity.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderEntity.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderEntity.setCustomerCode( arg0.getCustomerCode() );
        whOutOrderEntity.setWarehouseName( arg0.getWarehouseName() );
        whOutOrderEntity.setOutStorageTime( arg0.getOutStorageTime() );
        whOutOrderEntity.setStatus( arg0.getStatus() );
        whOutOrderEntity.setSyncStatus( arg0.getSyncStatus() );
        whOutOrderEntity.setRemark( arg0.getRemark() );
        whOutOrderEntity.setUserDef1( arg0.getUserDef1() );
        whOutOrderEntity.setUserDef2( arg0.getUserDef2() );
        whOutOrderEntity.setQuantity( arg0.getQuantity() );
        whOutOrderEntity.setActualQuantity( arg0.getActualQuantity() );
        whOutOrderEntity.setActualWeight( arg0.getActualWeight() );
        whOutOrderEntity.setActualVolume( arg0.getActualVolume() );
        whOutOrderEntity.setPartOrderNo( arg0.getPartOrderNo() );
        whOutOrderEntity.setCustomerName( arg0.getCustomerName() );
        whOutOrderEntity.setOrderSource( arg0.getOrderSource() );
        whOutOrderEntity.setWarehouseCode( arg0.getWarehouseCode() );
        whOutOrderEntity.setOutOrderNo( arg0.getOutOrderNo() );
        whOutOrderEntity.setType( arg0.getType() );
        whOutOrderEntity.setCustomerNo( arg0.getCustomerNo() );

        return whOutOrderEntity;
    }

    @Override
    public WhOutOrderPo entity2Po(WhOutOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderPo whOutOrderPo = new WhOutOrderPo();

        whOutOrderPo.setId( arg0.getId() );
        whOutOrderPo.setCreateUserId( arg0.getCreateUserId() );
        whOutOrderPo.setCreateUserName( arg0.getCreateUserName() );
        whOutOrderPo.setModifyUserId( arg0.getModifyUserId() );
        whOutOrderPo.setModifyUserName( arg0.getModifyUserName() );
        whOutOrderPo.setIsvId( arg0.getIsvId() );
        whOutOrderPo.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderPo.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderPo.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderPo.setCustomerCode( arg0.getCustomerCode() );
        whOutOrderPo.setWarehouseName( arg0.getWarehouseName() );
        whOutOrderPo.setOutStorageTime( arg0.getOutStorageTime() );
        whOutOrderPo.setStatus( arg0.getStatus() );
        whOutOrderPo.setSyncStatus( arg0.getSyncStatus() );
        whOutOrderPo.setRemark( arg0.getRemark() );
        whOutOrderPo.setUserDef1( arg0.getUserDef1() );
        whOutOrderPo.setUserDef2( arg0.getUserDef2() );
        whOutOrderPo.setQuantity( arg0.getQuantity() );
        whOutOrderPo.setActualQuantity( arg0.getActualQuantity() );
        whOutOrderPo.setActualWeight( arg0.getActualWeight() );
        whOutOrderPo.setActualVolume( arg0.getActualVolume() );
        whOutOrderPo.setPartOrderNo( arg0.getPartOrderNo() );
        whOutOrderPo.setCustomerName( arg0.getCustomerName() );
        whOutOrderPo.setOrderSource( arg0.getOrderSource() );
        whOutOrderPo.setWarehouseCode( arg0.getWarehouseCode() );
        whOutOrderPo.setOutOrderNo( arg0.getOutOrderNo() );
        whOutOrderPo.setType( arg0.getType() );
        whOutOrderPo.setCustomerNo( arg0.getCustomerNo() );

        return whOutOrderPo;
    }

    @Override
    public List<WhOutOrderEntity> dtoList2EntityList(List<WhOutOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderEntity> list = new ArrayList<WhOutOrderEntity>( arg0.size() );
        for ( WhOutOrderResDto whOutOrderResDto : arg0 ) {
            list.add( dto2Entity( whOutOrderResDto ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderPo> dtoList2PoList(List<WhOutOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderPo> list = new ArrayList<WhOutOrderPo>( arg0.size() );
        for ( WhOutOrderResDto whOutOrderResDto : arg0 ) {
            list.add( dto2Po( whOutOrderResDto ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderResDto> entityList2DtoList(List<WhOutOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderResDto> list = new ArrayList<WhOutOrderResDto>( arg0.size() );
        for ( WhOutOrderEntity whOutOrderEntity : arg0 ) {
            list.add( entity2Dto( whOutOrderEntity ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderResDto> poList2DtoList(List<WhOutOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderResDto> list = new ArrayList<WhOutOrderResDto>( arg0.size() );
        for ( WhOutOrderPo whOutOrderPo : arg0 ) {
            list.add( po2Dto( whOutOrderPo ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderEntity> poList2EntityList(List<WhOutOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderEntity> list = new ArrayList<WhOutOrderEntity>( arg0.size() );
        for ( WhOutOrderPo whOutOrderPo : arg0 ) {
            list.add( po2Entity( whOutOrderPo ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderPo> entityList2PoList(List<WhOutOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderPo> list = new ArrayList<WhOutOrderPo>( arg0.size() );
        for ( WhOutOrderEntity whOutOrderEntity : arg0 ) {
            list.add( entity2Po( whOutOrderEntity ) );
        }

        return list;
    }
}
