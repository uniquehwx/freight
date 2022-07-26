package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WaybillEntity;
import com.bizcenter.freight.dto.req.WaybillReqDto;
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
public class WaybillReqDtoConvertorImpl extends WaybillReqDtoConvertor {

    @Override
    public WaybillEntity dto2Entity(WaybillReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillEntity waybillEntity = new WaybillEntity();

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
    public String dto2Po(WaybillReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public WaybillReqDto entity2Dto(WaybillEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillReqDto waybillReqDto = new WaybillReqDto();

        waybillReqDto.setOrderNo( arg0.getOrderNo() );
        waybillReqDto.setSupplierNo( arg0.getSupplierNo() );
        waybillReqDto.setDriverId( arg0.getDriverId() );
        waybillReqDto.setSpecificGoodsNumber( arg0.getSpecificGoodsNumber() );
        waybillReqDto.setSpecificGoodsVolume( arg0.getSpecificGoodsVolume() );
        waybillReqDto.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        waybillReqDto.setSpecificGoodsWeight( arg0.getSpecificGoodsWeight() );
        waybillReqDto.setStatusKey( arg0.getStatusKey() );
        waybillReqDto.setSize( arg0.getSize() );
        waybillReqDto.setAlongCargoData( arg0.getAlongCargoData() );
        waybillReqDto.setDelegateNo( arg0.getDelegateNo() );
        waybillReqDto.setExceptionStatus( arg0.getExceptionStatus() );
        waybillReqDto.setRemark( arg0.getRemark() );
        waybillReqDto.setExternalOrder( arg0.getExternalOrder() );
        waybillReqDto.setCreateRealName( arg0.getCreateRealName() );
        waybillReqDto.setModifyRealName( arg0.getModifyRealName() );
        waybillReqDto.setSpecialVehicleType( arg0.getSpecialVehicleType() );
        waybillReqDto.setVehicleType( arg0.getVehicleType() );
        waybillReqDto.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        waybillReqDto.setDriverMessage( arg0.getDriverMessage() );
        waybillReqDto.setLatestLocation( arg0.getLatestLocation() );
        waybillReqDto.setServiceType( arg0.getServiceType() );

        return waybillReqDto;
    }

    @Override
    public WaybillReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillReqDto waybillReqDto = new WaybillReqDto();

        return waybillReqDto;
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
    public List<WaybillEntity> dtoList2EntityList(List<WaybillReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillEntity> list = new ArrayList<WaybillEntity>( arg0.size() );
        for ( WaybillReqDto waybillReqDto : arg0 ) {
            list.add( dto2Entity( waybillReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<WaybillReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WaybillReqDto waybillReqDto : arg0 ) {
            list.add( dto2Po( waybillReqDto ) );
        }

        return list;
    }

    @Override
    public List<WaybillReqDto> entityList2DtoList(List<WaybillEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillReqDto> list = new ArrayList<WaybillReqDto>( arg0.size() );
        for ( WaybillEntity waybillEntity : arg0 ) {
            list.add( entity2Dto( waybillEntity ) );
        }

        return list;
    }

    @Override
    public List<WaybillReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillReqDto> list = new ArrayList<WaybillReqDto>( arg0.size() );
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
