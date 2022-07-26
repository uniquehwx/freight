package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.DriverVehicleEntity;
import com.bizcenter.freight.dto.res.DriverVehicleResDto;
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
    public String dto2Po(DriverVehicleResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
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
    public DriverVehicleResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehicleResDto driverVehicleResDto = new DriverVehicleResDto();

        return driverVehicleResDto;
    }

    @Override
    public DriverVehicleEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehicleEntity driverVehicleEntity = new DriverVehicleEntity();

        return driverVehicleEntity;
    }

    @Override
    public String entity2Po(DriverVehicleEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
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
    public List<String> dtoList2PoList(List<DriverVehicleResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
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
    public List<DriverVehicleResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehicleResDto> list = new ArrayList<DriverVehicleResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<DriverVehicleEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehicleEntity> list = new ArrayList<DriverVehicleEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<DriverVehicleEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( DriverVehicleEntity driverVehicleEntity : arg0 ) {
            list.add( entity2Po( driverVehicleEntity ) );
        }

        return list;
    }
}
