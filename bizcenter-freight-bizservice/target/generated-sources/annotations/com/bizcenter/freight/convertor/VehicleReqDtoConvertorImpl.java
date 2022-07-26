package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.VehicleEntity;
import com.bizcenter.freight.dto.req.VehicleReqDto;
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
public class VehicleReqDtoConvertorImpl extends VehicleReqDtoConvertor {

    @Override
    public VehicleEntity dto2Entity(VehicleReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        VehicleEntity vehicleEntity = new VehicleEntity();

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
    public String dto2Po(VehicleReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public VehicleReqDto entity2Dto(VehicleEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        VehicleReqDto vehicleReqDto = new VehicleReqDto();

        vehicleReqDto.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        vehicleReqDto.setVehicleTypeCode( arg0.getVehicleTypeCode() );
        vehicleReqDto.setRemark( arg0.getRemark() );
        vehicleReqDto.setSize( arg0.getSize() );
        vehicleReqDto.setAnnualVerification( arg0.getAnnualVerification() );
        vehicleReqDto.setIdentifyUrl( arg0.getIdentifyUrl() );
        vehicleReqDto.setIsInternalVehicle( arg0.getIsInternalVehicle() );
        vehicleReqDto.setRegulationCar( arg0.getRegulationCar() );
        vehicleReqDto.setInsurance( arg0.getInsurance() );
        vehicleReqDto.setLoadWeight( arg0.getLoadWeight() );
        vehicleReqDto.setDriverMessage( arg0.getDriverMessage() );
        vehicleReqDto.setRegistrationTime( arg0.getRegistrationTime() );
        vehicleReqDto.setIsvId( arg0.getIsvId() );
        vehicleReqDto.setModifyRealName( arg0.getModifyRealName() );
        vehicleReqDto.setCreateRealName( arg0.getCreateRealName() );
        vehicleReqDto.setVehicleAge( arg0.getVehicleAge() );
        vehicleReqDto.setRecentMileage( arg0.getRecentMileage() );
        vehicleReqDto.setSupplierNo( arg0.getSupplierNo() );
        vehicleReqDto.setVehicleStatus( arg0.getVehicleStatus() );
        vehicleReqDto.setCurrentLocation( arg0.getCurrentLocation() );
        vehicleReqDto.setModels( arg0.getModels() );

        return vehicleReqDto;
    }

    @Override
    public VehicleReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        VehicleReqDto vehicleReqDto = new VehicleReqDto();

        return vehicleReqDto;
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
    public List<VehicleEntity> dtoList2EntityList(List<VehicleReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<VehicleEntity> list = new ArrayList<VehicleEntity>( arg0.size() );
        for ( VehicleReqDto vehicleReqDto : arg0 ) {
            list.add( dto2Entity( vehicleReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<VehicleReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( VehicleReqDto vehicleReqDto : arg0 ) {
            list.add( dto2Po( vehicleReqDto ) );
        }

        return list;
    }

    @Override
    public List<VehicleReqDto> entityList2DtoList(List<VehicleEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<VehicleReqDto> list = new ArrayList<VehicleReqDto>( arg0.size() );
        for ( VehicleEntity vehicleEntity : arg0 ) {
            list.add( entity2Dto( vehicleEntity ) );
        }

        return list;
    }

    @Override
    public List<VehicleReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<VehicleReqDto> list = new ArrayList<VehicleReqDto>( arg0.size() );
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
