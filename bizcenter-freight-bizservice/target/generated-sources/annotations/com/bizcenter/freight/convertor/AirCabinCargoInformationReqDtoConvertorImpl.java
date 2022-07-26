package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirCabinCargoInformationEntity;
import com.bizcenter.freight.dto.req.AirCabinCargoInformationReqDto;
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
public class AirCabinCargoInformationReqDtoConvertorImpl extends AirCabinCargoInformationReqDtoConvertor {

    @Override
    public AirCabinCargoInformationEntity dto2Entity(AirCabinCargoInformationReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCabinCargoInformationEntity airCabinCargoInformationEntity = new AirCabinCargoInformationEntity();

        airCabinCargoInformationEntity.setFlightNo( arg0.getFlightNo() );
        airCabinCargoInformationEntity.setProductNo( arg0.getProductNo() );
        airCabinCargoInformationEntity.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCabinCargoInformationEntity.setFlightCode( arg0.getFlightCode() );
        airCabinCargoInformationEntity.setDestinationPort( arg0.getDestinationPort() );
        airCabinCargoInformationEntity.setPanelType( arg0.getPanelType() );
        airCabinCargoInformationEntity.setFlightService( arg0.getFlightService() );
        airCabinCargoInformationEntity.setFlightOperator( arg0.getFlightOperator() );
        airCabinCargoInformationEntity.setCompany( arg0.getCompany() );
        airCabinCargoInformationEntity.setDepartment( arg0.getDepartment() );
        airCabinCargoInformationEntity.setModifyRealName( arg0.getModifyRealName() );
        airCabinCargoInformationEntity.setCreateRealName( arg0.getCreateRealName() );
        airCabinCargoInformationEntity.setEffectTime( arg0.getEffectTime() );
        airCabinCargoInformationEntity.setInvalidTime( arg0.getInvalidTime() );
        airCabinCargoInformationEntity.setContractPenalty( arg0.getContractPenalty() );

        return airCabinCargoInformationEntity;
    }

    @Override
    public String dto2Po(AirCabinCargoInformationReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public AirCabinCargoInformationReqDto entity2Dto(AirCabinCargoInformationEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCabinCargoInformationReqDto airCabinCargoInformationReqDto = new AirCabinCargoInformationReqDto();

        airCabinCargoInformationReqDto.setFlightNo( arg0.getFlightNo() );
        airCabinCargoInformationReqDto.setProductNo( arg0.getProductNo() );
        airCabinCargoInformationReqDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCabinCargoInformationReqDto.setFlightCode( arg0.getFlightCode() );
        airCabinCargoInformationReqDto.setDestinationPort( arg0.getDestinationPort() );
        airCabinCargoInformationReqDto.setPanelType( arg0.getPanelType() );
        airCabinCargoInformationReqDto.setFlightService( arg0.getFlightService() );
        airCabinCargoInformationReqDto.setFlightOperator( arg0.getFlightOperator() );
        airCabinCargoInformationReqDto.setCompany( arg0.getCompany() );
        airCabinCargoInformationReqDto.setDepartment( arg0.getDepartment() );
        airCabinCargoInformationReqDto.setModifyRealName( arg0.getModifyRealName() );
        airCabinCargoInformationReqDto.setCreateRealName( arg0.getCreateRealName() );
        airCabinCargoInformationReqDto.setEffectTime( arg0.getEffectTime() );
        airCabinCargoInformationReqDto.setInvalidTime( arg0.getInvalidTime() );
        airCabinCargoInformationReqDto.setContractPenalty( arg0.getContractPenalty() );

        return airCabinCargoInformationReqDto;
    }

    @Override
    public AirCabinCargoInformationReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCabinCargoInformationReqDto airCabinCargoInformationReqDto = new AirCabinCargoInformationReqDto();

        return airCabinCargoInformationReqDto;
    }

    @Override
    public AirCabinCargoInformationEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCabinCargoInformationEntity airCabinCargoInformationEntity = new AirCabinCargoInformationEntity();

        return airCabinCargoInformationEntity;
    }

    @Override
    public String entity2Po(AirCabinCargoInformationEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<AirCabinCargoInformationEntity> dtoList2EntityList(List<AirCabinCargoInformationReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationEntity> list = new ArrayList<AirCabinCargoInformationEntity>( arg0.size() );
        for ( AirCabinCargoInformationReqDto airCabinCargoInformationReqDto : arg0 ) {
            list.add( dto2Entity( airCabinCargoInformationReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<AirCabinCargoInformationReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirCabinCargoInformationReqDto airCabinCargoInformationReqDto : arg0 ) {
            list.add( dto2Po( airCabinCargoInformationReqDto ) );
        }

        return list;
    }

    @Override
    public List<AirCabinCargoInformationReqDto> entityList2DtoList(List<AirCabinCargoInformationEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationReqDto> list = new ArrayList<AirCabinCargoInformationReqDto>( arg0.size() );
        for ( AirCabinCargoInformationEntity airCabinCargoInformationEntity : arg0 ) {
            list.add( entity2Dto( airCabinCargoInformationEntity ) );
        }

        return list;
    }

    @Override
    public List<AirCabinCargoInformationReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationReqDto> list = new ArrayList<AirCabinCargoInformationReqDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<AirCabinCargoInformationEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationEntity> list = new ArrayList<AirCabinCargoInformationEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<AirCabinCargoInformationEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirCabinCargoInformationEntity airCabinCargoInformationEntity : arg0 ) {
            list.add( entity2Po( airCabinCargoInformationEntity ) );
        }

        return list;
    }
}
