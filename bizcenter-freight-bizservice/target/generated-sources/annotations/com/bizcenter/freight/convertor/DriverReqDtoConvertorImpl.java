package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.DriverEntity;
import com.bizcenter.freight.dto.req.DriverReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.DriverPo;
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
public class DriverReqDtoConvertorImpl extends DriverReqDtoConvertor {

    @Override
    public DriverEntity dto2Entity(DriverReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverEntity driverEntity = new DriverEntity();

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
    public DriverPo dto2Po(DriverReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverPo driverPo = new DriverPo();

        driverPo.setAppId( arg0.getAppId() );
        driverPo.setTenantId( arg0.getTenantId() );
        driverPo.setDriverName( arg0.getDriverName() );
        driverPo.setDriverMobileNo( arg0.getDriverMobileNo() );
        driverPo.setRemark( arg0.getRemark() );
        driverPo.setSupplierNo( arg0.getSupplierNo() );
        driverPo.setLicenseNumber( arg0.getLicenseNumber() );
        driverPo.setIdFrontImgUrl( arg0.getIdFrontImgUrl() );
        driverPo.setIdBackImgUrl( arg0.getIdBackImgUrl() );
        driverPo.setDriveFrontImgUrl( arg0.getDriveFrontImgUrl() );
        driverPo.setDriveBackImgUrl( arg0.getDriveBackImgUrl() );
        driverPo.setDriverType( arg0.getDriverType() );
        driverPo.setDriverDeadline( arg0.getDriverDeadline() );
        driverPo.setQualificationsNo( arg0.getQualificationsNo() );
        driverPo.setQualificationType( arg0.getQualificationType() );
        driverPo.setQualificationUrl( arg0.getQualificationUrl() );
        driverPo.setDriveGrade( arg0.getDriveGrade() );
        driverPo.setDriverNo( arg0.getDriverNo() );
        driverPo.setIsInternalDriver( arg0.getIsInternalDriver() );
        driverPo.setWorkingState( arg0.getWorkingState() );
        driverPo.setIsvId( arg0.getIsvId() );
        driverPo.setCreateRealName( arg0.getCreateRealName() );
        driverPo.setModifyRealName( arg0.getModifyRealName() );
        driverPo.setSex( arg0.getSex() );
        driverPo.setQualificationDeadline( arg0.getQualificationDeadline() );
        driverPo.setEntryTime( arg0.getEntryTime() );
        driverPo.setVehicleMessage( arg0.getVehicleMessage() );

        return driverPo;
    }

    @Override
    public DriverReqDto entity2Dto(DriverEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverReqDto driverReqDto = new DriverReqDto();

        driverReqDto.setDriverName( arg0.getDriverName() );
        driverReqDto.setDriverMobileNo( arg0.getDriverMobileNo() );
        driverReqDto.setRemark( arg0.getRemark() );
        driverReqDto.setSupplierNo( arg0.getSupplierNo() );
        driverReqDto.setLicenseNumber( arg0.getLicenseNumber() );
        driverReqDto.setIdFrontImgUrl( arg0.getIdFrontImgUrl() );
        driverReqDto.setIdBackImgUrl( arg0.getIdBackImgUrl() );
        driverReqDto.setDriveFrontImgUrl( arg0.getDriveFrontImgUrl() );
        driverReqDto.setDriveBackImgUrl( arg0.getDriveBackImgUrl() );
        driverReqDto.setDriverType( arg0.getDriverType() );
        driverReqDto.setDriverDeadline( arg0.getDriverDeadline() );
        driverReqDto.setQualificationsNo( arg0.getQualificationsNo() );
        driverReqDto.setQualificationType( arg0.getQualificationType() );
        driverReqDto.setQualificationUrl( arg0.getQualificationUrl() );
        driverReqDto.setDriveGrade( arg0.getDriveGrade() );
        driverReqDto.setDriverNo( arg0.getDriverNo() );
        driverReqDto.setIsInternalDriver( arg0.getIsInternalDriver() );
        driverReqDto.setWorkingState( arg0.getWorkingState() );
        driverReqDto.setIsvId( arg0.getIsvId() );
        driverReqDto.setCreateRealName( arg0.getCreateRealName() );
        driverReqDto.setModifyRealName( arg0.getModifyRealName() );
        driverReqDto.setSex( arg0.getSex() );
        driverReqDto.setQualificationDeadline( arg0.getQualificationDeadline() );
        driverReqDto.setEntryTime( arg0.getEntryTime() );
        driverReqDto.setVehicleMessage( arg0.getVehicleMessage() );

        return driverReqDto;
    }

    @Override
    public DriverReqDto po2Dto(DriverPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverReqDto driverReqDto = new DriverReqDto();

        driverReqDto.setDriverName( arg0.getDriverName() );
        driverReqDto.setDriverMobileNo( arg0.getDriverMobileNo() );
        driverReqDto.setRemark( arg0.getRemark() );
        driverReqDto.setSupplierNo( arg0.getSupplierNo() );
        driverReqDto.setLicenseNumber( arg0.getLicenseNumber() );
        driverReqDto.setIdFrontImgUrl( arg0.getIdFrontImgUrl() );
        driverReqDto.setIdBackImgUrl( arg0.getIdBackImgUrl() );
        driverReqDto.setDriveFrontImgUrl( arg0.getDriveFrontImgUrl() );
        driverReqDto.setDriveBackImgUrl( arg0.getDriveBackImgUrl() );
        driverReqDto.setDriverType( arg0.getDriverType() );
        driverReqDto.setDriverDeadline( arg0.getDriverDeadline() );
        driverReqDto.setQualificationsNo( arg0.getQualificationsNo() );
        driverReqDto.setQualificationType( arg0.getQualificationType() );
        driverReqDto.setQualificationUrl( arg0.getQualificationUrl() );
        driverReqDto.setDriveGrade( arg0.getDriveGrade() );
        driverReqDto.setDriverNo( arg0.getDriverNo() );
        driverReqDto.setIsInternalDriver( arg0.getIsInternalDriver() );
        driverReqDto.setWorkingState( arg0.getWorkingState() );
        driverReqDto.setTenantId( arg0.getTenantId() );
        driverReqDto.setAppId( arg0.getAppId() );
        driverReqDto.setIsvId( arg0.getIsvId() );
        driverReqDto.setCreateRealName( arg0.getCreateRealName() );
        driverReqDto.setModifyRealName( arg0.getModifyRealName() );
        driverReqDto.setSex( arg0.getSex() );
        driverReqDto.setQualificationDeadline( arg0.getQualificationDeadline() );
        driverReqDto.setEntryTime( arg0.getEntryTime() );
        driverReqDto.setVehicleMessage( arg0.getVehicleMessage() );

        return driverReqDto;
    }

    @Override
    public DriverEntity po2Entity(DriverPo arg0) {
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
    public DriverPo entity2Po(DriverEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverPo driverPo = new DriverPo();

        driverPo.setId( arg0.getId() );
        driverPo.setCreateUserId( arg0.getCreateUserId() );
        driverPo.setCreateUserName( arg0.getCreateUserName() );
        driverPo.setModifyUserId( arg0.getModifyUserId() );
        driverPo.setModifyUserName( arg0.getModifyUserName() );
        driverPo.setDriverName( arg0.getDriverName() );
        driverPo.setDriverMobileNo( arg0.getDriverMobileNo() );
        driverPo.setRemark( arg0.getRemark() );
        driverPo.setSupplierNo( arg0.getSupplierNo() );
        driverPo.setLicenseNumber( arg0.getLicenseNumber() );
        driverPo.setIdFrontImgUrl( arg0.getIdFrontImgUrl() );
        driverPo.setIdBackImgUrl( arg0.getIdBackImgUrl() );
        driverPo.setDriveFrontImgUrl( arg0.getDriveFrontImgUrl() );
        driverPo.setDriveBackImgUrl( arg0.getDriveBackImgUrl() );
        driverPo.setDriverType( arg0.getDriverType() );
        driverPo.setDriverDeadline( arg0.getDriverDeadline() );
        driverPo.setQualificationsNo( arg0.getQualificationsNo() );
        driverPo.setQualificationType( arg0.getQualificationType() );
        driverPo.setQualificationUrl( arg0.getQualificationUrl() );
        driverPo.setDriveGrade( arg0.getDriveGrade() );
        driverPo.setDriverNo( arg0.getDriverNo() );
        driverPo.setIsInternalDriver( arg0.getIsInternalDriver() );
        driverPo.setWorkingState( arg0.getWorkingState() );
        driverPo.setIsvId( arg0.getIsvId() );
        driverPo.setCreateRealName( arg0.getCreateRealName() );
        driverPo.setModifyRealName( arg0.getModifyRealName() );
        driverPo.setSex( arg0.getSex() );
        driverPo.setQualificationDeadline( arg0.getQualificationDeadline() );
        driverPo.setEntryTime( arg0.getEntryTime() );
        driverPo.setVehicleMessage( arg0.getVehicleMessage() );

        return driverPo;
    }

    @Override
    public List<DriverEntity> dtoList2EntityList(List<DriverReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverEntity> list = new ArrayList<DriverEntity>( arg0.size() );
        for ( DriverReqDto driverReqDto : arg0 ) {
            list.add( dto2Entity( driverReqDto ) );
        }

        return list;
    }

    @Override
    public List<DriverPo> dtoList2PoList(List<DriverReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverPo> list = new ArrayList<DriverPo>( arg0.size() );
        for ( DriverReqDto driverReqDto : arg0 ) {
            list.add( dto2Po( driverReqDto ) );
        }

        return list;
    }

    @Override
    public List<DriverReqDto> entityList2DtoList(List<DriverEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverReqDto> list = new ArrayList<DriverReqDto>( arg0.size() );
        for ( DriverEntity driverEntity : arg0 ) {
            list.add( entity2Dto( driverEntity ) );
        }

        return list;
    }

    @Override
    public List<DriverReqDto> poList2DtoList(List<DriverPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverReqDto> list = new ArrayList<DriverReqDto>( arg0.size() );
        for ( DriverPo driverPo : arg0 ) {
            list.add( po2Dto( driverPo ) );
        }

        return list;
    }

    @Override
    public List<DriverEntity> poList2EntityList(List<DriverPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverEntity> list = new ArrayList<DriverEntity>( arg0.size() );
        for ( DriverPo driverPo : arg0 ) {
            list.add( po2Entity( driverPo ) );
        }

        return list;
    }

    @Override
    public List<DriverPo> entityList2PoList(List<DriverEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverPo> list = new ArrayList<DriverPo>( arg0.size() );
        for ( DriverEntity driverEntity : arg0 ) {
            list.add( entity2Po( driverEntity ) );
        }

        return list;
    }
}
