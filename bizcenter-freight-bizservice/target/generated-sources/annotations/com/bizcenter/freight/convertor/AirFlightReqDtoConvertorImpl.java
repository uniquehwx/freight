package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirFlightEntity;
import com.bizcenter.freight.dto.req.AirFlightReqDto;
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
    public AirFlightPo dto2Po(AirFlightReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirFlightPo airFlightPo = new AirFlightPo();

        airFlightPo.setAppId( arg0.getAppId() );
        airFlightPo.setTenantId( arg0.getTenantId() );
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
    public AirFlightReqDto po2Dto(AirFlightPo arg0) {
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
        airFlightReqDto.setTenantId( arg0.getTenantId() );
        airFlightReqDto.setAppId( arg0.getAppId() );
        airFlightReqDto.setModifyRealName( arg0.getModifyRealName() );
        airFlightReqDto.setCreateRealName( arg0.getCreateRealName() );

        return airFlightReqDto;
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
    public List<AirFlightPo> dtoList2PoList(List<AirFlightReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightPo> list = new ArrayList<AirFlightPo>( arg0.size() );
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
    public List<AirFlightReqDto> poList2DtoList(List<AirFlightPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirFlightReqDto> list = new ArrayList<AirFlightReqDto>( arg0.size() );
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
