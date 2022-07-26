package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirFlightEntity;
import com.bizcenter.freight.dto.req.AirFlightReqDto;
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
public class AirFlightReqDtoConvertorImpl extends AirFlightReqDtoConvertor {

    @Override
    public AirFlightEntity dto2Entity(AirFlightReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirFlightEntity airFlightEntity = new AirFlightEntity();

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
        airFlightEntity.setModifyRealName( arg0.getModifyRealName() );
        airFlightEntity.setCreateRealName( arg0.getCreateRealName() );

        return airFlightEntity;
    }

    @Override
    public String dto2Po(AirFlightReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public AirFlightReqDto entity2Dto(AirFlightEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirFlightReqDto airFlightReqDto = new AirFlightReqDto();

        airFlightReqDto.setCompanyNo( arg0.getCompanyNo() );
        airFlightReqDto.setFlightNo( arg0.getFlightNo() );
        airFlightReqDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airFlightReqDto.setFreightStation( arg0.getFreightStation() );
        airFlightReqDto.setDeparturePortCode( arg0.getDeparturePortCode() );
        airFlightReqDto.setDeparturePort( arg0.getDeparturePort() );
        airFlightReqDto.setDestinationPortCode( arg0.getDestinationPortCode() );
        airFlightReqDto.setDestinationPort( arg0.getDestinationPort() );
        airFlightReqDto.setFlightCode( arg0.getFlightCode() );
        airFlightReqDto.setSchedule( arg0.getSchedule() );
        airFlightReqDto.setDepartureTime( arg0.getDepartureTime() );
        airFlightReqDto.setArrivalTime( arg0.getArrivalTime() );
        airFlightReqDto.setClosingTime( arg0.getClosingTime() );
        airFlightReqDto.setClosingDays( arg0.getClosingDays() );
        airFlightReqDto.setModel( arg0.getModel() );
        airFlightReqDto.setPlaneType( arg0.getPlaneType() );
        airFlightReqDto.setModifyRealName( arg0.getModifyRealName() );
        airFlightReqDto.setCreateRealName( arg0.getCreateRealName() );

        return airFlightReqDto;
    }

    @Override
    public AirFlightReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirFlightReqDto airFlightReqDto = new AirFlightReqDto();

        return airFlightReqDto;
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
    public List<AirFlightEntity> dtoList2EntityList(List<AirFlightReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightEntity> list = new ArrayList<AirFlightEntity>( arg0.size() );
        for ( AirFlightReqDto airFlightReqDto : arg0 ) {
            list.add( dto2Entity( airFlightReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<AirFlightReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirFlightReqDto airFlightReqDto : arg0 ) {
            list.add( dto2Po( airFlightReqDto ) );
        }

        return list;
    }

    @Override
    public List<AirFlightReqDto> entityList2DtoList(List<AirFlightEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightReqDto> list = new ArrayList<AirFlightReqDto>( arg0.size() );
        for ( AirFlightEntity airFlightEntity : arg0 ) {
            list.add( entity2Dto( airFlightEntity ) );
        }

        return list;
    }

    @Override
    public List<AirFlightReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightReqDto> list = new ArrayList<AirFlightReqDto>( arg0.size() );
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
