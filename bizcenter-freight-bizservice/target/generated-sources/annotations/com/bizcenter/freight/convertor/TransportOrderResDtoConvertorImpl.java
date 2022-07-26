package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.TransportOrderEntity;
import com.bizcenter.freight.dto.res.TransportOrderResDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-26T16:50:54+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class TransportOrderResDtoConvertorImpl extends TransportOrderResDtoConvertor {

    @Override
    public TransportOrderEntity dto2Entity(TransportOrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TransportOrderEntity transportOrderEntity = new TransportOrderEntity();

        transportOrderEntity.setId( arg0.getId() );
        transportOrderEntity.setOrderNo( arg0.getOrderNo() );
        transportOrderEntity.setServiceType( arg0.getServiceType() );
        transportOrderEntity.setCube( arg0.getCube() );
        transportOrderEntity.setPackageNumber( arg0.getPackageNumber() );
        transportOrderEntity.setRoughWeight( arg0.getRoughWeight() );
        transportOrderEntity.setSize( arg0.getSize() );
        transportOrderEntity.setStatus( arg0.getStatus() );
        transportOrderEntity.setPrincipalContactPerson( arg0.getPrincipalContactPerson() );
        transportOrderEntity.setBusinessTypes( arg0.getBusinessTypes() );
        transportOrderEntity.setDelegateNo( arg0.getDelegateNo() );
        transportOrderEntity.setDeliveryTime( arg0.getDeliveryTime() );
        transportOrderEntity.setArrivalContactName( arg0.getArrivalContactName() );
        transportOrderEntity.setArrivalContactPhone( arg0.getArrivalContactPhone() );
        transportOrderEntity.setDeliveryProvince( arg0.getDeliveryProvince() );
        transportOrderEntity.setDeliveryCity( arg0.getDeliveryCity() );
        transportOrderEntity.setDeliveryDistrict( arg0.getDeliveryDistrict() );
        transportOrderEntity.setDeliveryAddress( arg0.getDeliveryAddress() );
        transportOrderEntity.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        transportOrderEntity.setTakeDeliveryProvince( arg0.getTakeDeliveryProvince() );
        transportOrderEntity.setTakeDeliveryCity( arg0.getTakeDeliveryCity() );
        transportOrderEntity.setTakeDeliveryDistrict( arg0.getTakeDeliveryDistrict() );
        transportOrderEntity.setTakeDeliveryAddress( arg0.getTakeDeliveryAddress() );
        transportOrderEntity.setContactName( arg0.getContactName() );
        transportOrderEntity.setContactPhone( arg0.getContactPhone() );
        transportOrderEntity.setCargoInformation( arg0.getCargoInformation() );
        transportOrderEntity.setModifyUserName( arg0.getModifyUserName() );
        transportOrderEntity.setModifyUserId( arg0.getModifyUserId() );
        transportOrderEntity.setCreateUserName( arg0.getCreateUserName() );
        transportOrderEntity.setCreateUserId( arg0.getCreateUserId() );
        transportOrderEntity.setModifyRealName( arg0.getModifyRealName() );
        transportOrderEntity.setCreateRealName( arg0.getCreateRealName() );
        transportOrderEntity.setExternalServiceType( arg0.getExternalServiceType() );
        transportOrderEntity.setExternalOrder( arg0.getExternalOrder() );
        transportOrderEntity.setRemark( arg0.getRemark() );
        transportOrderEntity.setCarType( arg0.getCarType() );

        return transportOrderEntity;
    }

    @Override
    public String dto2Po(TransportOrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public TransportOrderResDto entity2Dto(TransportOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TransportOrderResDto transportOrderResDto = new TransportOrderResDto();

        transportOrderResDto.setId( arg0.getId() );
        transportOrderResDto.setOrderNo( arg0.getOrderNo() );
        transportOrderResDto.setServiceType( arg0.getServiceType() );
        transportOrderResDto.setCube( arg0.getCube() );
        transportOrderResDto.setPackageNumber( arg0.getPackageNumber() );
        transportOrderResDto.setRoughWeight( arg0.getRoughWeight() );
        transportOrderResDto.setSize( arg0.getSize() );
        transportOrderResDto.setStatus( arg0.getStatus() );
        transportOrderResDto.setPrincipalContactPerson( arg0.getPrincipalContactPerson() );
        transportOrderResDto.setBusinessTypes( arg0.getBusinessTypes() );
        transportOrderResDto.setDelegateNo( arg0.getDelegateNo() );
        transportOrderResDto.setDeliveryTime( arg0.getDeliveryTime() );
        transportOrderResDto.setArrivalContactName( arg0.getArrivalContactName() );
        transportOrderResDto.setArrivalContactPhone( arg0.getArrivalContactPhone() );
        transportOrderResDto.setDeliveryProvince( arg0.getDeliveryProvince() );
        transportOrderResDto.setDeliveryCity( arg0.getDeliveryCity() );
        transportOrderResDto.setDeliveryDistrict( arg0.getDeliveryDistrict() );
        transportOrderResDto.setDeliveryAddress( arg0.getDeliveryAddress() );
        transportOrderResDto.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        transportOrderResDto.setTakeDeliveryProvince( arg0.getTakeDeliveryProvince() );
        transportOrderResDto.setTakeDeliveryCity( arg0.getTakeDeliveryCity() );
        transportOrderResDto.setTakeDeliveryDistrict( arg0.getTakeDeliveryDistrict() );
        transportOrderResDto.setTakeDeliveryAddress( arg0.getTakeDeliveryAddress() );
        transportOrderResDto.setContactName( arg0.getContactName() );
        transportOrderResDto.setContactPhone( arg0.getContactPhone() );
        transportOrderResDto.setCargoInformation( arg0.getCargoInformation() );
        transportOrderResDto.setModifyUserName( arg0.getModifyUserName() );
        transportOrderResDto.setModifyUserId( arg0.getModifyUserId() );
        transportOrderResDto.setCreateUserName( arg0.getCreateUserName() );
        transportOrderResDto.setCreateUserId( arg0.getCreateUserId() );
        transportOrderResDto.setModifyRealName( arg0.getModifyRealName() );
        transportOrderResDto.setCreateRealName( arg0.getCreateRealName() );
        transportOrderResDto.setExternalServiceType( arg0.getExternalServiceType() );
        transportOrderResDto.setExternalOrder( arg0.getExternalOrder() );
        transportOrderResDto.setRemark( arg0.getRemark() );
        transportOrderResDto.setCarType( arg0.getCarType() );

        return transportOrderResDto;
    }

    @Override
    public TransportOrderResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TransportOrderResDto transportOrderResDto = new TransportOrderResDto();

        return transportOrderResDto;
    }

    @Override
    public TransportOrderEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TransportOrderEntity transportOrderEntity = new TransportOrderEntity();

        return transportOrderEntity;
    }

    @Override
    public String entity2Po(TransportOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<TransportOrderEntity> dtoList2EntityList(List<TransportOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransportOrderEntity> list = new ArrayList<TransportOrderEntity>( arg0.size() );
        for ( TransportOrderResDto transportOrderResDto : arg0 ) {
            list.add( dto2Entity( transportOrderResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<TransportOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( TransportOrderResDto transportOrderResDto : arg0 ) {
            list.add( dto2Po( transportOrderResDto ) );
        }

        return list;
    }

    @Override
    public List<TransportOrderResDto> entityList2DtoList(List<TransportOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransportOrderResDto> list = new ArrayList<TransportOrderResDto>( arg0.size() );
        for ( TransportOrderEntity transportOrderEntity : arg0 ) {
            list.add( entity2Dto( transportOrderEntity ) );
        }

        return list;
    }

    @Override
    public List<TransportOrderResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransportOrderResDto> list = new ArrayList<TransportOrderResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<TransportOrderEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransportOrderEntity> list = new ArrayList<TransportOrderEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<TransportOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( TransportOrderEntity transportOrderEntity : arg0 ) {
            list.add( entity2Po( transportOrderEntity ) );
        }

        return list;
    }
}
