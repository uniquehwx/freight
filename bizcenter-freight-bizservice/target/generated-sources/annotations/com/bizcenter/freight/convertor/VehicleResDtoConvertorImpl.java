package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.VehicleEntity;
import com.bizcenter.freight.dto.res.VehicleResDto;
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
public class VehicleResDtoConvertorImpl extends VehicleResDtoConvertor {

    @Override
    public VehicleEntity dto2Entity(VehicleResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        VehicleEntity vehicleEntity = new VehicleEntity();

        vehicleEntity.setId( arg0.getId() );
        vehicleEntity.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        vehicleEntity.setVehicleTypeCode( arg0.getVehicleTypeCode() );
        vehicleEntity.setRemark( arg0.getRemark() );
        vehicleEntity.setSize( arg0.getSize() );
        vehicleEntity.setAnnualVerification( arg0.getAnnualVerification() );
        vehicleEntity.setIdentifyUrl( arg0.getIdentifyUrl() );
        vehicleEntity.setIsInternalVehicle( arg0.getIsInternalVehicle() );
        vehicleEntity.setRegulationCar( arg0.getRegulationCar() );
        vehicleEntity.setInsurance( arg0.getInsurance() );
        vehicleEntity.setLoadWeight( arg0.getLoadWeight() );
        vehicleEntity.setDriverMessage( arg0.getDriverMessage() );
        vehicleEntity.setRegistrationTime( arg0.getRegistrationTime() );
        vehicleEntity.setModifyUserName( arg0.getModifyUserName() );
        vehicleEntity.setModifyUserId( arg0.getModifyUserId() );
        vehicleEntity.setCreateUserName( arg0.getCreateUserName() );
        vehicleEntity.setCreateUserId( arg0.getCreateUserId() );
        vehicleEntity.setIsvId( arg0.getIsvId() );
        vehicleEntity.setModifyRealName( arg0.getModifyRealName() );
        vehicleEntity.setCreateRealName( arg0.getCreateRealName() );
        vehicleEntity.setVehicleAge( arg0.getVehicleAge() );
        vehicleEntity.setRecentMileage( arg0.getRecentMileage() );
        vehicleEntity.setSupplierNo( arg0.getSupplierNo() );
        vehicleEntity.setVehicleStatus( arg0.getVehicleStatus() );
        vehicleEntity.setCurrentLocation( arg0.getCurrentLocation() );
        vehicleEntity.setModels( arg0.getModels() );

        return vehicleEntity;
    }

    @Override
    public String dto2Po(VehicleResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public VehicleResDto entity2Dto(VehicleEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        VehicleResDto vehicleResDto = new VehicleResDto();

        vehicleResDto.setId( arg0.getId() );
        vehicleResDto.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        vehicleResDto.setVehicleTypeCode( arg0.getVehicleTypeCode() );
        vehicleResDto.setRemark( arg0.getRemark() );
        vehicleResDto.setSize( arg0.getSize() );
        vehicleResDto.setAnnualVerification( arg0.getAnnualVerification() );
        vehicleResDto.setIdentifyUrl( arg0.getIdentifyUrl() );
        vehicleResDto.setIsInternalVehicle( arg0.getIsInternalVehicle() );
        vehicleResDto.setRegulationCar( arg0.getRegulationCar() );
        vehicleResDto.setInsurance( arg0.getInsurance() );
        vehicleResDto.setLoadWeight( arg0.getLoadWeight() );
        vehicleResDto.setDriverMessage( arg0.getDriverMessage() );
        vehicleResDto.setRegistrationTime( arg0.getRegistrationTime() );
        vehicleResDto.setModifyUserName( arg0.getModifyUserName() );
        vehicleResDto.setModifyUserId( arg0.getModifyUserId() );
        vehicleResDto.setCreateUserName( arg0.getCreateUserName() );
        vehicleResDto.setCreateUserId( arg0.getCreateUserId() );
        vehicleResDto.setIsvId( arg0.getIsvId() );
        vehicleResDto.setModifyRealName( arg0.getModifyRealName() );
        vehicleResDto.setCreateRealName( arg0.getCreateRealName() );
        vehicleResDto.setVehicleAge( arg0.getVehicleAge() );
        vehicleResDto.setRecentMileage( arg0.getRecentMileage() );
        vehicleResDto.setSupplierNo( arg0.getSupplierNo() );
        vehicleResDto.setVehicleStatus( arg0.getVehicleStatus() );
        vehicleResDto.setCurrentLocation( arg0.getCurrentLocation() );
        vehicleResDto.setModels( arg0.getModels() );

        return vehicleResDto;
    }

    @Override
    public VehicleResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        VehicleResDto vehicleResDto = new VehicleResDto();

        return vehicleResDto;
    }

    @Override
    public VehicleEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        VehicleEntity vehicleEntity = new VehicleEntity();

        return vehicleEntity;
    }

    @Override
    public String entity2Po(VehicleEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<VehicleEntity> dtoList2EntityList(List<VehicleResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<VehicleEntity> list = new ArrayList<VehicleEntity>( arg0.size() );
        for ( VehicleResDto vehicleResDto : arg0 ) {
            list.add( dto2Entity( vehicleResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<VehicleResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( VehicleResDto vehicleResDto : arg0 ) {
            list.add( dto2Po( vehicleResDto ) );
        }

        return list;
    }

    @Override
    public List<VehicleResDto> entityList2DtoList(List<VehicleEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<VehicleResDto> list = new ArrayList<VehicleResDto>( arg0.size() );
        for ( VehicleEntity vehicleEntity : arg0 ) {
            list.add( entity2Dto( vehicleEntity ) );
        }

        return list;
    }

    @Override
    public List<VehicleResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<VehicleResDto> list = new ArrayList<VehicleResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<VehicleEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<VehicleEntity> list = new ArrayList<VehicleEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<VehicleEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( VehicleEntity vehicleEntity : arg0 ) {
            list.add( entity2Po( vehicleEntity ) );
        }

        return list;
    }
}
