package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.DriverEntity;
import com.bizcenter.freight.dto.res.DriverResDto;
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
public class DriverResDtoConvertorImpl extends DriverResDtoConvertor {

    @Override
    public DriverEntity dto2Entity(DriverResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverEntity driverEntity = new DriverEntity();

        driverEntity.setId( arg0.getId() );
        driverEntity.setDriverName( arg0.getDriverName() );
        driverEntity.setDriverMobileNo( arg0.getDriverMobileNo() );
        driverEntity.setRemark( arg0.getRemark() );
        driverEntity.setSupplierNo( arg0.getSupplierNo() );
        driverEntity.setLicenseNumber( arg0.getLicenseNumber() );
        driverEntity.setIdFrontImgUrl( arg0.getIdFrontImgUrl() );
        driverEntity.setIdBackImgUrl( arg0.getIdBackImgUrl() );
        driverEntity.setDriveFrontImgUrl( arg0.getDriveFrontImgUrl() );
        driverEntity.setDriveBackImgUrl( arg0.getDriveBackImgUrl() );
        driverEntity.setDriverType( arg0.getDriverType() );
        driverEntity.setDriverDeadline( arg0.getDriverDeadline() );
        driverEntity.setQualificationsNo( arg0.getQualificationsNo() );
        driverEntity.setQualificationType( arg0.getQualificationType() );
        driverEntity.setQualificationUrl( arg0.getQualificationUrl() );
        driverEntity.setDriveGrade( arg0.getDriveGrade() );
        driverEntity.setDriverNo( arg0.getDriverNo() );
        driverEntity.setIsInternalDriver( arg0.getIsInternalDriver() );
        driverEntity.setWorkingState( arg0.getWorkingState() );
        driverEntity.setModifyUserName( arg0.getModifyUserName() );
        driverEntity.setModifyUserId( arg0.getModifyUserId() );
        driverEntity.setCreateUserName( arg0.getCreateUserName() );
        driverEntity.setCreateUserId( arg0.getCreateUserId() );
        driverEntity.setIsvId( arg0.getIsvId() );
        driverEntity.setCreateRealName( arg0.getCreateRealName() );
        driverEntity.setModifyRealName( arg0.getModifyRealName() );
        driverEntity.setSex( arg0.getSex() );
        driverEntity.setQualificationDeadline( arg0.getQualificationDeadline() );
        driverEntity.setEntryTime( arg0.getEntryTime() );
        driverEntity.setVehicleMessage( arg0.getVehicleMessage() );

        return driverEntity;
    }

    @Override
    public String dto2Po(DriverResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public DriverResDto entity2Dto(DriverEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverResDto driverResDto = new DriverResDto();

        driverResDto.setId( arg0.getId() );
        driverResDto.setDriverName( arg0.getDriverName() );
        driverResDto.setDriverMobileNo( arg0.getDriverMobileNo() );
        driverResDto.setRemark( arg0.getRemark() );
        driverResDto.setSupplierNo( arg0.getSupplierNo() );
        driverResDto.setLicenseNumber( arg0.getLicenseNumber() );
        driverResDto.setIdFrontImgUrl( arg0.getIdFrontImgUrl() );
        driverResDto.setIdBackImgUrl( arg0.getIdBackImgUrl() );
        driverResDto.setDriveFrontImgUrl( arg0.getDriveFrontImgUrl() );
        driverResDto.setDriveBackImgUrl( arg0.getDriveBackImgUrl() );
        driverResDto.setDriverType( arg0.getDriverType() );
        driverResDto.setDriverDeadline( arg0.getDriverDeadline() );
        driverResDto.setQualificationsNo( arg0.getQualificationsNo() );
        driverResDto.setQualificationType( arg0.getQualificationType() );
        driverResDto.setQualificationUrl( arg0.getQualificationUrl() );
        driverResDto.setDriveGrade( arg0.getDriveGrade() );
        driverResDto.setDriverNo( arg0.getDriverNo() );
        driverResDto.setIsInternalDriver( arg0.getIsInternalDriver() );
        driverResDto.setWorkingState( arg0.getWorkingState() );
        driverResDto.setModifyUserName( arg0.getModifyUserName() );
        driverResDto.setModifyUserId( arg0.getModifyUserId() );
        driverResDto.setCreateUserName( arg0.getCreateUserName() );
        driverResDto.setCreateUserId( arg0.getCreateUserId() );
        driverResDto.setIsvId( arg0.getIsvId() );
        driverResDto.setCreateRealName( arg0.getCreateRealName() );
        driverResDto.setModifyRealName( arg0.getModifyRealName() );
        driverResDto.setSex( arg0.getSex() );
        driverResDto.setQualificationDeadline( arg0.getQualificationDeadline() );
        driverResDto.setEntryTime( arg0.getEntryTime() );
        driverResDto.setVehicleMessage( arg0.getVehicleMessage() );

        return driverResDto;
    }

    @Override
    public DriverResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverResDto driverResDto = new DriverResDto();

        return driverResDto;
    }

    @Override
    public DriverEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverEntity driverEntity = new DriverEntity();

        return driverEntity;
    }

    @Override
    public String entity2Po(DriverEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<DriverEntity> dtoList2EntityList(List<DriverResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverEntity> list = new ArrayList<DriverEntity>( arg0.size() );
        for ( DriverResDto driverResDto : arg0 ) {
            list.add( dto2Entity( driverResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<DriverResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( DriverResDto driverResDto : arg0 ) {
            list.add( dto2Po( driverResDto ) );
        }

        return list;
    }

    @Override
    public List<DriverResDto> entityList2DtoList(List<DriverEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverResDto> list = new ArrayList<DriverResDto>( arg0.size() );
        for ( DriverEntity driverEntity : arg0 ) {
            list.add( entity2Dto( driverEntity ) );
        }

        return list;
    }

    @Override
    public List<DriverResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverResDto> list = new ArrayList<DriverResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<DriverEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverEntity> list = new ArrayList<DriverEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<DriverEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( DriverEntity driverEntity : arg0 ) {
            list.add( entity2Po( driverEntity ) );
        }

        return list;
    }
}
