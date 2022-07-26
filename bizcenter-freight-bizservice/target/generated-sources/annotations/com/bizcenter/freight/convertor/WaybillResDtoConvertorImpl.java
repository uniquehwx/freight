package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WaybillEntity;
import com.bizcenter.freight.dto.res.WaybillResDto;
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
public class WaybillResDtoConvertorImpl extends WaybillResDtoConvertor {

    @Override
    public WaybillEntity dto2Entity(WaybillResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillEntity waybillEntity = new WaybillEntity();

        waybillEntity.setId( arg0.getId() );
        waybillEntity.setOrderNo( arg0.getOrderNo() );
        waybillEntity.setSupplierNo( arg0.getSupplierNo() );
        waybillEntity.setDriverId( arg0.getDriverId() );
        waybillEntity.setSpecificGoodsNumber( arg0.getSpecificGoodsNumber() );
        waybillEntity.setSpecificGoodsVolume( arg0.getSpecificGoodsVolume() );
        waybillEntity.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        waybillEntity.setSpecificGoodsWeight( arg0.getSpecificGoodsWeight() );
        waybillEntity.setStatusKey( arg0.getStatusKey() );
        waybillEntity.setSize( arg0.getSize() );
        waybillEntity.setAlongCargoData( arg0.getAlongCargoData() );
        waybillEntity.setDelegateNo( arg0.getDelegateNo() );
        waybillEntity.setExceptionStatus( arg0.getExceptionStatus() );
        waybillEntity.setRemark( arg0.getRemark() );
        waybillEntity.setExternalOrder( arg0.getExternalOrder() );
        waybillEntity.setModifyUserName( arg0.getModifyUserName() );
        waybillEntity.setModifyUserId( arg0.getModifyUserId() );
        waybillEntity.setCreateUserName( arg0.getCreateUserName() );
        waybillEntity.setCreateUserId( arg0.getCreateUserId() );
        waybillEntity.setCreateRealName( arg0.getCreateRealName() );
        waybillEntity.setModifyRealName( arg0.getModifyRealName() );
        waybillEntity.setSpecialVehicleType( arg0.getSpecialVehicleType() );
        waybillEntity.setVehicleType( arg0.getVehicleType() );
        waybillEntity.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        waybillEntity.setDriverMessage( arg0.getDriverMessage() );
        waybillEntity.setLatestLocation( arg0.getLatestLocation() );
        waybillEntity.setServiceType( arg0.getServiceType() );

        return waybillEntity;
    }

    @Override
    public String dto2Po(WaybillResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public WaybillResDto entity2Dto(WaybillEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillResDto waybillResDto = new WaybillResDto();

        waybillResDto.setId( arg0.getId() );
        waybillResDto.setOrderNo( arg0.getOrderNo() );
        waybillResDto.setSupplierNo( arg0.getSupplierNo() );
        waybillResDto.setDriverId( arg0.getDriverId() );
        waybillResDto.setSpecificGoodsNumber( arg0.getSpecificGoodsNumber() );
        waybillResDto.setSpecificGoodsVolume( arg0.getSpecificGoodsVolume() );
        waybillResDto.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        waybillResDto.setSpecificGoodsWeight( arg0.getSpecificGoodsWeight() );
        waybillResDto.setStatusKey( arg0.getStatusKey() );
        waybillResDto.setSize( arg0.getSize() );
        waybillResDto.setAlongCargoData( arg0.getAlongCargoData() );
        waybillResDto.setDelegateNo( arg0.getDelegateNo() );
        waybillResDto.setExceptionStatus( arg0.getExceptionStatus() );
        waybillResDto.setRemark( arg0.getRemark() );
        waybillResDto.setExternalOrder( arg0.getExternalOrder() );
        waybillResDto.setModifyUserName( arg0.getModifyUserName() );
        waybillResDto.setModifyUserId( arg0.getModifyUserId() );
        waybillResDto.setCreateUserName( arg0.getCreateUserName() );
        waybillResDto.setCreateUserId( arg0.getCreateUserId() );
        waybillResDto.setCreateRealName( arg0.getCreateRealName() );
        waybillResDto.setModifyRealName( arg0.getModifyRealName() );
        waybillResDto.setSpecialVehicleType( arg0.getSpecialVehicleType() );
        waybillResDto.setVehicleType( arg0.getVehicleType() );
        waybillResDto.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        waybillResDto.setDriverMessage( arg0.getDriverMessage() );
        waybillResDto.setLatestLocation( arg0.getLatestLocation() );
        waybillResDto.setServiceType( arg0.getServiceType() );

        return waybillResDto;
    }

    @Override
    public WaybillResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillResDto waybillResDto = new WaybillResDto();

        return waybillResDto;
    }

    @Override
    public WaybillEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillEntity waybillEntity = new WaybillEntity();

        return waybillEntity;
    }

    @Override
    public String entity2Po(WaybillEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<WaybillEntity> dtoList2EntityList(List<WaybillResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillEntity> list = new ArrayList<WaybillEntity>( arg0.size() );
        for ( WaybillResDto waybillResDto : arg0 ) {
            list.add( dto2Entity( waybillResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<WaybillResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WaybillResDto waybillResDto : arg0 ) {
            list.add( dto2Po( waybillResDto ) );
        }

        return list;
    }

    @Override
    public List<WaybillResDto> entityList2DtoList(List<WaybillEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillResDto> list = new ArrayList<WaybillResDto>( arg0.size() );
        for ( WaybillEntity waybillEntity : arg0 ) {
            list.add( entity2Dto( waybillEntity ) );
        }

        return list;
    }

    @Override
    public List<WaybillResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillResDto> list = new ArrayList<WaybillResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<WaybillEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillEntity> list = new ArrayList<WaybillEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<WaybillEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WaybillEntity waybillEntity : arg0 ) {
            list.add( entity2Po( waybillEntity ) );
        }

        return list;
    }
}
