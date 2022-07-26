package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.DriverVehicleEntity;
import com.bizcenter.freight.dto.res.DriverVehicleResDto;
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
public class DriverVehicleResDtoConvertorImpl extends DriverVehicleResDtoConvertor {

    @Override
    public DriverVehicleEntity dto2Entity(DriverVehicleResDto arg0) {
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
    public DriverVehiclePo dto2Po(DriverVehicleResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehiclePo driverVehiclePo = new DriverVehiclePo();

        driverVehiclePo.setId( arg0.getId() );
        driverVehiclePo.setCreateUserId( arg0.getCreateUserId() );
        driverVehiclePo.setCreateUserName( arg0.getCreateUserName() );
        driverVehiclePo.setCreateTime( arg0.getCreateTime() );
        driverVehiclePo.setModifyUserId( arg0.getModifyUserId() );
        driverVehiclePo.setModifyUserName( arg0.getModifyUserName() );
        driverVehiclePo.setModifyTime( arg0.getModifyTime() );
        driverVehiclePo.setDriverNo( arg0.getDriverNo() );
        driverVehiclePo.setVehicleNo( arg0.getVehicleNo() );
        driverVehiclePo.setIsvId( arg0.getIsvId() );
        driverVehiclePo.setCreateRealName( arg0.getCreateRealName() );
        driverVehiclePo.setModifyRealName( arg0.getModifyRealName() );

        return driverVehiclePo;
    }

    @Override
    public DriverVehicleResDto entity2Dto(DriverVehicleEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehicleResDto driverVehicleResDto = new DriverVehicleResDto();

        driverVehicleResDto.setId( arg0.getId() );
        driverVehicleResDto.setDriverNo( arg0.getDriverNo() );
        driverVehicleResDto.setVehicleNo( arg0.getVehicleNo() );
        driverVehicleResDto.setModifyUserName( arg0.getModifyUserName() );
        driverVehicleResDto.setModifyUserId( arg0.getModifyUserId() );
        driverVehicleResDto.setCreateUserName( arg0.getCreateUserName() );
        driverVehicleResDto.setCreateUserId( arg0.getCreateUserId() );
        driverVehicleResDto.setIsvId( arg0.getIsvId() );
        driverVehicleResDto.setCreateRealName( arg0.getCreateRealName() );
        driverVehicleResDto.setModifyRealName( arg0.getModifyRealName() );

        return driverVehicleResDto;
    }

    @Override
    public DriverVehicleResDto po2Dto(DriverVehiclePo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehicleResDto driverVehicleResDto = new DriverVehicleResDto();

        driverVehicleResDto.setId( arg0.getId() );
        driverVehicleResDto.setDriverNo( arg0.getDriverNo() );
        driverVehicleResDto.setVehicleNo( arg0.getVehicleNo() );
        driverVehicleResDto.setModifyTime( arg0.getModifyTime() );
        driverVehicleResDto.setModifyUserName( arg0.getModifyUserName() );
        driverVehicleResDto.setModifyUserId( arg0.getModifyUserId() );
        driverVehicleResDto.setCreateTime( arg0.getCreateTime() );
        driverVehicleResDto.setCreateUserName( arg0.getCreateUserName() );
        driverVehicleResDto.setCreateUserId( arg0.getCreateUserId() );
        driverVehicleResDto.setIsvId( arg0.getIsvId() );
        driverVehicleResDto.setCreateRealName( arg0.getCreateRealName() );
        driverVehicleResDto.setModifyRealName( arg0.getModifyRealName() );

        return driverVehicleResDto;
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
    public List<DriverVehicleEntity> dtoList2EntityList(List<DriverVehicleResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehicleEntity> list = new ArrayList<DriverVehicleEntity>( arg0.size() );
        for ( DriverVehicleResDto driverVehicleResDto : arg0 ) {
            list.add( dto2Entity( driverVehicleResDto ) );
        }

        return list;
    }

    @Override
    public List<DriverVehiclePo> dtoList2PoList(List<DriverVehicleResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehiclePo> list = new ArrayList<DriverVehiclePo>( arg0.size() );
        for ( DriverVehicleResDto driverVehicleResDto : arg0 ) {
            list.add( dto2Po( driverVehicleResDto ) );
        }

        return list;
    }

    @Override
    public List<DriverVehicleResDto> entityList2DtoList(List<DriverVehicleEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehicleResDto> list = new ArrayList<DriverVehicleResDto>( arg0.size() );
        for ( DriverVehicleEntity driverVehicleEntity : arg0 ) {
            list.add( entity2Dto( driverVehicleEntity ) );
        }

        return list;
    }

    @Override
    public List<DriverVehicleResDto> poList2DtoList(List<DriverVehiclePo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehicleResDto> list = new ArrayList<DriverVehicleResDto>( arg0.size() );
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
