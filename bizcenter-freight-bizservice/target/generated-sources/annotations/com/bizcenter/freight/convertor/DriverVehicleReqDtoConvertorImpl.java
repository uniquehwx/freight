package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.DriverVehicleEntity;
import com.bizcenter.freight.dto.req.DriverVehicleReqDto;
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
    public String dto2Po(DriverVehicleReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
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
    public DriverVehicleReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DriverVehicleReqDto driverVehicleReqDto = new DriverVehicleReqDto();

        return driverVehicleReqDto;
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
    public List<String> dtoList2PoList(List<DriverVehicleReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
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
    public List<DriverVehicleReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<DriverVehicleReqDto> list = new ArrayList<DriverVehicleReqDto>( arg0.size() );
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
