package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOutOrderEntity;
import com.bizcenter.freight.dto.req.WhOutOrderReqDto;
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
public class WhOutOrderReqDtoConvertorImpl extends WhOutOrderReqDtoConvertor {

    @Override
    public WhOutOrderEntity dto2Entity(WhOutOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderEntity whOutOrderEntity = new WhOutOrderEntity();

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
    public String dto2Po(WhOutOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public WhOutOrderReqDto entity2Dto(WhOutOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderReqDto whOutOrderReqDto = new WhOutOrderReqDto();

        whOutOrderReqDto.setIsvId( arg0.getIsvId() );
        whOutOrderReqDto.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderReqDto.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderReqDto.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderReqDto.setCustomerCode( arg0.getCustomerCode() );
        whOutOrderReqDto.setWarehouseName( arg0.getWarehouseName() );
        whOutOrderReqDto.setOutStorageTime( arg0.getOutStorageTime() );
        whOutOrderReqDto.setStatus( arg0.getStatus() );
        whOutOrderReqDto.setSyncStatus( arg0.getSyncStatus() );
        whOutOrderReqDto.setRemark( arg0.getRemark() );
        whOutOrderReqDto.setUserDef1( arg0.getUserDef1() );
        whOutOrderReqDto.setUserDef2( arg0.getUserDef2() );
        whOutOrderReqDto.setQuantity( arg0.getQuantity() );
        whOutOrderReqDto.setActualQuantity( arg0.getActualQuantity() );
        whOutOrderReqDto.setActualWeight( arg0.getActualWeight() );
        whOutOrderReqDto.setActualVolume( arg0.getActualVolume() );
        whOutOrderReqDto.setPartOrderNo( arg0.getPartOrderNo() );
        whOutOrderReqDto.setCustomerName( arg0.getCustomerName() );
        whOutOrderReqDto.setOrderSource( arg0.getOrderSource() );
        whOutOrderReqDto.setWarehouseCode( arg0.getWarehouseCode() );
        whOutOrderReqDto.setOutOrderNo( arg0.getOutOrderNo() );
        whOutOrderReqDto.setType( arg0.getType() );
        whOutOrderReqDto.setCustomerNo( arg0.getCustomerNo() );

        return whOutOrderReqDto;
    }

    @Override
    public WhOutOrderReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderReqDto whOutOrderReqDto = new WhOutOrderReqDto();

        return whOutOrderReqDto;
    }

    @Override
    public WhOutOrderEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderEntity whOutOrderEntity = new WhOutOrderEntity();

        return whOutOrderEntity;
    }

    @Override
    public String entity2Po(WhOutOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<WhOutOrderEntity> dtoList2EntityList(List<WhOutOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderEntity> list = new ArrayList<WhOutOrderEntity>( arg0.size() );
        for ( WhOutOrderReqDto whOutOrderReqDto : arg0 ) {
            list.add( dto2Entity( whOutOrderReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<WhOutOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WhOutOrderReqDto whOutOrderReqDto : arg0 ) {
            list.add( dto2Po( whOutOrderReqDto ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderReqDto> entityList2DtoList(List<WhOutOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderReqDto> list = new ArrayList<WhOutOrderReqDto>( arg0.size() );
        for ( WhOutOrderEntity whOutOrderEntity : arg0 ) {
            list.add( entity2Dto( whOutOrderEntity ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderReqDto> list = new ArrayList<WhOutOrderReqDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderEntity> list = new ArrayList<WhOutOrderEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<WhOutOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WhOutOrderEntity whOutOrderEntity : arg0 ) {
            list.add( entity2Po( whOutOrderEntity ) );
        }

        return list;
    }
}
