package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirFlightEntity;
import com.bizcenter.freight.dto.res.AirFlightResDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirFlightPo;
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
    public AirFlightPo dto2Po(AirFlightResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirFlightPo airFlightPo = new AirFlightPo();

        airFlightPo.setId( arg0.getId() );
        airFlightPo.setCreateUserId( arg0.getCreateUserId() );
        airFlightPo.setCreateUserName( arg0.getCreateUserName() );
        airFlightPo.setCreateTime( arg0.getCreateTime() );
        airFlightPo.setModifyUserId( arg0.getModifyUserId() );
        airFlightPo.setModifyUserName( arg0.getModifyUserName() );
        airFlightPo.setModifyTime( arg0.getModifyTime() );
        airFlightPo.setCompanyNo( arg0.getCompanyNo() );
        airFlightPo.setFlightNo( arg0.getFlightNo() );
        airFlightPo.setAirCompanyCode( arg0.getAirCompanyCode() );
        airFlightPo.setFreightStation( arg0.getFreightStation() );
        airFlightPo.setDeparturePortCode( arg0.getDeparturePortCode() );
        airFlightPo.setDeparturePort( arg0.getDeparturePort() );
        airFlightPo.setDestinationPortCode( arg0.getDestinationPortCode() );
        airFlightPo.setDestinationPort( arg0.getDestinationPort() );
        airFlightPo.setFlightCode( arg0.getFlightCode() );
        airFlightPo.setSchedule( arg0.getSchedule() );
        airFlightPo.setDepartureTime( arg0.getDepartureTime() );
        airFlightPo.setArrivalTime( arg0.getArrivalTime() );
        airFlightPo.setClosingTime( arg0.getClosingTime() );
        airFlightPo.setClosingDays( arg0.getClosingDays() );
        airFlightPo.setModel( arg0.getModel() );
        airFlightPo.setPlaneType( arg0.getPlaneType() );
        airFlightPo.setModifyRealName( arg0.getModifyRealName() );
        airFlightPo.setCreateRealName( arg0.getCreateRealName() );

        return airFlightPo;
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
    public AirFlightResDto po2Dto(AirFlightPo arg0) {
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
        airFlightResDto.setModifyTime( arg0.getModifyTime() );
        airFlightResDto.setModifyUserName( arg0.getModifyUserName() );
        airFlightResDto.setModifyRealName( arg0.getModifyRealName() );
        airFlightResDto.setModifyUserId( arg0.getModifyUserId() );
        airFlightResDto.setCreateTime( arg0.getCreateTime() );
        airFlightResDto.setCreateUserName( arg0.getCreateUserName() );
        airFlightResDto.setCreateRealName( arg0.getCreateRealName() );
        airFlightResDto.setCreateUserId( arg0.getCreateUserId() );

        return airFlightResDto;
    }

    @Override
    public AirFlightEntity po2Entity(AirFlightPo arg0) {
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
    public AirFlightPo entity2Po(AirFlightEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirFlightPo airFlightPo = new AirFlightPo();

        airFlightPo.setId( arg0.getId() );
        airFlightPo.setCreateUserId( arg0.getCreateUserId() );
        airFlightPo.setCreateUserName( arg0.getCreateUserName() );
        airFlightPo.setModifyUserId( arg0.getModifyUserId() );
        airFlightPo.setModifyUserName( arg0.getModifyUserName() );
        airFlightPo.setCompanyNo( arg0.getCompanyNo() );
        airFlightPo.setFlightNo( arg0.getFlightNo() );
        airFlightPo.setAirCompanyCode( arg0.getAirCompanyCode() );
        airFlightPo.setFreightStation( arg0.getFreightStation() );
        airFlightPo.setDeparturePortCode( arg0.getDeparturePortCode() );
        airFlightPo.setDeparturePort( arg0.getDeparturePort() );
        airFlightPo.setDestinationPortCode( arg0.getDestinationPortCode() );
        airFlightPo.setDestinationPort( arg0.getDestinationPort() );
        airFlightPo.setFlightCode( arg0.getFlightCode() );
        airFlightPo.setSchedule( arg0.getSchedule() );
        airFlightPo.setDepartureTime( arg0.getDepartureTime() );
        airFlightPo.setArrivalTime( arg0.getArrivalTime() );
        airFlightPo.setClosingTime( arg0.getClosingTime() );
        airFlightPo.setClosingDays( arg0.getClosingDays() );
        airFlightPo.setModel( arg0.getModel() );
        airFlightPo.setPlaneType( arg0.getPlaneType() );
        airFlightPo.setModifyRealName( arg0.getModifyRealName() );
        airFlightPo.setCreateRealName( arg0.getCreateRealName() );

        return airFlightPo;
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
    public List<AirFlightPo> dtoList2PoList(List<AirFlightResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightPo> list = new ArrayList<AirFlightPo>( arg0.size() );
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
    public List<AirFlightResDto> poList2DtoList(List<AirFlightPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightResDto> list = new ArrayList<AirFlightResDto>( arg0.size() );
        for ( AirFlightPo airFlightPo : arg0 ) {
            list.add( po2Dto( airFlightPo ) );
        }

        return list;
    }

    @Override
    public List<AirFlightEntity> poList2EntityList(List<AirFlightPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightEntity> list = new ArrayList<AirFlightEntity>( arg0.size() );
        for ( AirFlightPo airFlightPo : arg0 ) {
            list.add( po2Entity( airFlightPo ) );
        }

        return list;
    }

    @Override
    public List<AirFlightPo> entityList2PoList(List<AirFlightEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightPo> list = new ArrayList<AirFlightPo>( arg0.size() );
        for ( AirFlightEntity airFlightEntity : arg0 ) {
            list.add( entity2Po( airFlightEntity ) );
        }

        return list;
    }
}
