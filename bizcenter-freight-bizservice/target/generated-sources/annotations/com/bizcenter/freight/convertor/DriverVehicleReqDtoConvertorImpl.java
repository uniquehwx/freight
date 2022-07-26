package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.DriverVehicleEntity;
import com.bizcenter.freight.dto.req.DriverVehicleReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.DriverVehiclePo;
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
public class DriverVehicleReqDtoConvertorImpl extends DriverVehicleReqDtoConvertor {

    @Override
    public DriverVehicleEntity dto2Entity(DriverVehicleReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehicleEntity driverVehicleEntity = new DriverVehicleEntity();

        driverVehicleEntity.setDriverNo( arg0.getDriverNo() );
        driverVehicleEntity.setVehicleNo( arg0.getVehicleNo() );
        driverVehicleEntity.setIsvId( arg0.getIsvId() );
        driverVehicleEntity.setCreateRealName( arg0.getCreateRealName() );
        driverVehicleEntity.setModifyRealName( arg0.getModifyRealName() );

        return driverVehicleEntity;
    }

    @Override
    public DriverVehiclePo dto2Po(DriverVehicleReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehiclePo driverVehiclePo = new DriverVehiclePo();

        driverVehiclePo.setAppId( arg0.getAppId() );
        driverVehiclePo.setTenantId( arg0.getTenantId() );
        driverVehiclePo.setDriverNo( arg0.getDriverNo() );
        driverVehiclePo.setVehicleNo( arg0.getVehicleNo() );
        driverVehiclePo.setIsvId( arg0.getIsvId() );
        driverVehiclePo.setCreateRealName( arg0.getCreateRealName() );
        driverVehiclePo.setModifyRealName( arg0.getModifyRealName() );

        return driverVehiclePo;
    }

    @Override
    public DriverVehicleReqDto entity2Dto(DriverVehicleEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehicleReqDto driverVehicleReqDto = new DriverVehicleReqDto();

        driverVehicleReqDto.setDriverNo( arg0.getDriverNo() );
        driverVehicleReqDto.setVehicleNo( arg0.getVehicleNo() );
        driverVehicleReqDto.setIsvId( arg0.getIsvId() );
        driverVehicleReqDto.setCreateRealName( arg0.getCreateRealName() );
        driverVehicleReqDto.setModifyRealName( arg0.getModifyRealName() );

        return driverVehicleReqDto;
    }

    @Override
    public DriverVehicleReqDto po2Dto(DriverVehiclePo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehicleReqDto driverVehicleReqDto = new DriverVehicleReqDto();

        driverVehicleReqDto.setDriverNo( arg0.getDriverNo() );
        driverVehicleReqDto.setVehicleNo( arg0.getVehicleNo() );
        driverVehicleReqDto.setTenantId( arg0.getTenantId() );
        driverVehicleReqDto.setAppId( arg0.getAppId() );
        driverVehicleReqDto.setIsvId( arg0.getIsvId() );
        driverVehicleReqDto.setCreateRealName( arg0.getCreateRealName() );
        driverVehicleReqDto.setModifyRealName( arg0.getModifyRealName() );

        return driverVehicleReqDto;
    }

    @Override
    public DriverVehicleEntity po2Entity(DriverVehiclePo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehicleEntity driverVehicleEntity = new DriverVehicleEntity();

        driverVehicleEntity.setId( arg0.getId() );
        driverVehicleEntity.setDriverNo( arg0.getDriverNo() );
        driverVehicleEntity.setVehicleNo( arg0.getVehicleNo() );
        driverVehicleEntity.setModifyUserName( arg0.getModifyUserName() );
        driverVehicleEntity.setModifyUserId( arg0.getModifyUserId() );
        driverVehicleEntity.setCreateUserName( arg0.getCreateUserName() );
        driverVehicleEntity.setCreateUserId( arg0.getCreateUserId() );
        driverVehicleEntity.setIsvId( arg0.getIsvId() );
        driverVehicleEntity.setCreateRealName( arg0.getCreateRealName() );
        driverVehicleEntity.setModifyRealName( arg0.getModifyRealName() );

        return driverVehicleEntity;
    }

    @Override
    public DriverVehiclePo entity2Po(DriverVehicleEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehiclePo driverVehiclePo = new DriverVehiclePo();

        driverVehiclePo.setId( arg0.getId() );
        driverVehiclePo.setCreateUserId( arg0.getCreateUserId() );
        driverVehiclePo.setCreateUserName( arg0.getCreateUserName() );
        driverVehiclePo.setModifyUserId( arg0.getModifyUserId() );
        driverVehiclePo.setModifyUserName( arg0.getModifyUserName() );
        driverVehiclePo.setDriverNo( arg0.getDriverNo() );
        driverVehiclePo.setVehicleNo( arg0.getVehicleNo() );
        driverVehiclePo.setIsvId( arg0.getIsvId() );
        driverVehiclePo.setCreateRealName( arg0.getCreateRealName() );
        driverVehiclePo.setModifyRealName( arg0.getModifyRealName() );

        return driverVehiclePo;
    }

    @Override
    public List<DriverVehicleEntity> dtoList2EntityList(List<DriverVehicleReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehicleEntity> list = new ArrayList<DriverVehicleEntity>( arg0.size() );
        for ( DriverVehicleReqDto driverVehicleReqDto : arg0 ) {
            list.add( dto2Entity( driverVehicleReqDto ) );
        }

        return list;
    }

    @Override
    public List<DriverVehiclePo> dtoList2PoList(List<DriverVehicleReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehiclePo> list = new ArrayList<DriverVehiclePo>( arg0.size() );
        for ( DriverVehicleReqDto driverVehicleReqDto : arg0 ) {
            list.add( dto2Po( driverVehicleReqDto ) );
        }

        return list;
    }

    @Override
    public List<DriverVehicleReqDto> entityList2DtoList(List<DriverVehicleEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehicleReqDto> list = new ArrayList<DriverVehicleReqDto>( arg0.size() );
        for ( DriverVehicleEntity driverVehicleEntity : arg0 ) {
            list.add( entity2Dto( driverVehicleEntity ) );
        }

        return list;
    }

    @Override
    public List<DriverVehicleReqDto> poList2DtoList(List<DriverVehiclePo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehicleReqDto> list = new ArrayList<DriverVehicleReqDto>( arg0.size() );
        for ( DriverVehiclePo driverVehiclePo : arg0 ) {
            list.add( po2Dto( driverVehiclePo ) );
        }

        return list;
    }

    @Override
    public List<DriverVehicleEntity> poList2EntityList(List<DriverVehiclePo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehicleEntity> list = new ArrayList<DriverVehicleEntity>( arg0.size() );
        for ( DriverVehiclePo driverVehiclePo : arg0 ) {
            list.add( po2Entity( driverVehiclePo ) );
        }

        return list;
    }

    @Override
    public List<DriverVehiclePo> entityList2PoList(List<DriverVehicleEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehiclePo> list = new ArrayList<DriverVehiclePo>( arg0.size() );
        for ( DriverVehicleEntity driverVehicleEntity : arg0 ) {
            list.add( entity2Po( driverVehicleEntity ) );
        }

        return list;
    }
}
