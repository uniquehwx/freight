package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirFlightEntity;
import com.bizcenter.freight.dto.res.AirFlightResDto;
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
public class AirFlightResDtoConvertorImpl extends AirFlightResDtoConvertor {

    @Override
    public AirFlightEntity dto2Entity(AirFlightResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirFlightEntity airFlightEntity = new AirFlightEntity();

        airFlightEntity.setId( arg0.getId() );
        airFlightEntity.setCompanyNo( arg0.getCompanyNo() );
        airFlightEntity.setFlightNo( arg0.getFlightNo() );
        airFlightEntity.setAirCompanyCode( arg0.getAirCompanyCode() );
        airFlightEntity.setFreightStation( arg0.getFreightStation() );
        airFlightEntity.setDeparturePortCode( arg0.getDeparturePortCode() );
        airFlightEntity.setDeparturePort( arg0.getDeparturePort() );
        airFlightEntity.setDestinationPortCode( arg0.getDestinationPortCode() );
        airFlightEntity.setDestinationPort( arg0.getDestinationPort() );
        airFlightEntity.setFlightCode( arg0.getFlightCode() );
        airFlightEntity.setSchedule( arg0.getSchedule() );
        airFlightEntity.setDepartureTime( arg0.getDepartureTime() );
        airFlightEntity.setArrivalTime( arg0.getArrivalTime() );
        airFlightEntity.setClosingTime( arg0.getClosingTime() );
        airFlightEntity.setClosingDays( arg0.getClosingDays() );
        airFlightEntity.setModel( arg0.getModel() );
        airFlightEntity.setPlaneType( arg0.getPlaneType() );
        airFlightEntity.setModifyUserName( arg0.getModifyUserName() );
        airFlightEntity.setModifyRealName( arg0.getModifyRealName() );
        airFlightEntity.setModifyUserId( arg0.getModifyUserId() );
        airFlightEntity.setCreateUserName( arg0.getCreateUserName() );
        airFlightEntity.setCreateRealName( arg0.getCreateRealName() );
        airFlightEntity.setCreateUserId( arg0.getCreateUserId() );

        return airFlightEntity;
    }

    @Override
    public String dto2Po(AirFlightResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public AirFlightResDto entity2Dto(AirFlightEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirFlightResDto airFlightResDto = new AirFlightResDto();

        airFlightResDto.setId( arg0.getId() );
        airFlightResDto.setCompanyNo( arg0.getCompanyNo() );
        airFlightResDto.setFlightNo( arg0.getFlightNo() );
        airFlightResDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airFlightResDto.setFreightStation( arg0.getFreightStation() );
        airFlightResDto.setDeparturePortCode( arg0.getDeparturePortCode() );
        airFlightResDto.setDeparturePort( arg0.getDeparturePort() );
        airFlightResDto.setDestinationPortCode( arg0.getDestinationPortCode() );
        airFlightResDto.setDestinationPort( arg0.getDestinationPort() );
        airFlightResDto.setFlightCode( arg0.getFlightCode() );
        airFlightResDto.setSchedule( arg0.getSchedule() );
        airFlightResDto.setDepartureTime( arg0.getDepartureTime() );
        airFlightResDto.setArrivalTime( arg0.getArrivalTime() );
        airFlightResDto.setClosingTime( arg0.getClosingTime() );
        airFlightResDto.setClosingDays( arg0.getClosingDays() );
        airFlightResDto.setModel( arg0.getModel() );
        airFlightResDto.setPlaneType( arg0.getPlaneType() );
        airFlightResDto.setModifyUserName( arg0.getModifyUserName() );
        airFlightResDto.setModifyRealName( arg0.getModifyRealName() );
        airFlightResDto.setModifyUserId( arg0.getModifyUserId() );
        airFlightResDto.setCreateUserName( arg0.getCreateUserName() );
        airFlightResDto.setCreateRealName( arg0.getCreateRealName() );
        airFlightResDto.setCreateUserId( arg0.getCreateUserId() );

        return airFlightResDto;
    }

    @Override
    public AirFlightResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirFlightResDto airFlightResDto = new AirFlightResDto();

        return airFlightResDto;
    }

    @Override
    public AirFlightEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirFlightEntity airFlightEntity = new AirFlightEntity();

        return airFlightEntity;
    }

    @Override
    public String entity2Po(AirFlightEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<AirFlightEntity> dtoList2EntityList(List<AirFlightResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightEntity> list = new ArrayList<AirFlightEntity>( arg0.size() );
        for ( AirFlightResDto airFlightResDto : arg0 ) {
            list.add( dto2Entity( airFlightResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<AirFlightResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirFlightResDto airFlightResDto : arg0 ) {
            list.add( dto2Po( airFlightResDto ) );
        }

        return list;
    }

    @Override
    public List<AirFlightResDto> entityList2DtoList(List<AirFlightEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightResDto> list = new ArrayList<AirFlightResDto>( arg0.size() );
        for ( AirFlightEntity airFlightEntity : arg0 ) {
            list.add( entity2Dto( airFlightEntity ) );
        }

        return list;
    }

    @Override
    public List<AirFlightResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightResDto> list = new ArrayList<AirFlightResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<AirFlightEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightEntity> list = new ArrayList<AirFlightEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<AirFlightEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirFlightEntity airFlightEntity : arg0 ) {
            list.add( entity2Po( airFlightEntity ) );
        }

        return list;
    }
}
