package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirCabinCargoInformationEntity;
import com.bizcenter.freight.dto.res.AirCabinCargoInformationResDto;
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
public class AirCabinCargoInformationResDtoConvertorImpl extends AirCabinCargoInformationResDtoConvertor {

    @Override
    public AirCabinCargoInformationEntity dto2Entity(AirCabinCargoInformationResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCabinCargoInformationEntity airCabinCargoInformationEntity = new AirCabinCargoInformationEntity();

        airCabinCargoInformationEntity.setId( arg0.getId() );
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
        airCabinCargoInformationEntity.setModifyUserName( arg0.getModifyUserName() );
        airCabinCargoInformationEntity.setModifyRealName( arg0.getModifyRealName() );
        airCabinCargoInformationEntity.setModifyUserId( arg0.getModifyUserId() );
        airCabinCargoInformationEntity.setCreateUserName( arg0.getCreateUserName() );
        airCabinCargoInformationEntity.setCreateRealName( arg0.getCreateRealName() );
        airCabinCargoInformationEntity.setCreateUserId( arg0.getCreateUserId() );
        airCabinCargoInformationEntity.setEffectTime( arg0.getEffectTime() );
        airCabinCargoInformationEntity.setInvalidTime( arg0.getInvalidTime() );
        airCabinCargoInformationEntity.setContractPenalty( arg0.getContractPenalty() );

        return airCabinCargoInformationEntity;
    }

    @Override
    public String dto2Po(AirCabinCargoInformationResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public AirCabinCargoInformationResDto entity2Dto(AirCabinCargoInformationEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCabinCargoInformationResDto airCabinCargoInformationResDto = new AirCabinCargoInformationResDto();

        airCabinCargoInformationResDto.setId( arg0.getId() );
        airCabinCargoInformationResDto.setFlightNo( arg0.getFlightNo() );
        airCabinCargoInformationResDto.setProductNo( arg0.getProductNo() );
        airCabinCargoInformationResDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCabinCargoInformationResDto.setFlightCode( arg0.getFlightCode() );
        airCabinCargoInformationResDto.setDestinationPort( arg0.getDestinationPort() );
        airCabinCargoInformationResDto.setPanelType( arg0.getPanelType() );
        airCabinCargoInformationResDto.setFlightService( arg0.getFlightService() );
        airCabinCargoInformationResDto.setFlightOperator( arg0.getFlightOperator() );
        airCabinCargoInformationResDto.setCompany( arg0.getCompany() );
        airCabinCargoInformationResDto.setDepartment( arg0.getDepartment() );
        airCabinCargoInformationResDto.setModifyUserName( arg0.getModifyUserName() );
        airCabinCargoInformationResDto.setModifyRealName( arg0.getModifyRealName() );
        airCabinCargoInformationResDto.setModifyUserId( arg0.getModifyUserId() );
        airCabinCargoInformationResDto.setCreateUserName( arg0.getCreateUserName() );
        airCabinCargoInformationResDto.setCreateRealName( arg0.getCreateRealName() );
        airCabinCargoInformationResDto.setCreateUserId( arg0.getCreateUserId() );
        airCabinCargoInformationResDto.setEffectTime( arg0.getEffectTime() );
        airCabinCargoInformationResDto.setInvalidTime( arg0.getInvalidTime() );
        airCabinCargoInformationResDto.setContractPenalty( arg0.getContractPenalty() );

        return airCabinCargoInformationResDto;
    }

    @Override
    public AirCabinCargoInformationResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCabinCargoInformationResDto airCabinCargoInformationResDto = new AirCabinCargoInformationResDto();

        return airCabinCargoInformationResDto;
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
    public List<AirCabinCargoInformationEntity> dtoList2EntityList(List<AirCabinCargoInformationResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationEntity> list = new ArrayList<AirCabinCargoInformationEntity>( arg0.size() );
        for ( AirCabinCargoInformationResDto airCabinCargoInformationResDto : arg0 ) {
            list.add( dto2Entity( airCabinCargoInformationResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<AirCabinCargoInformationResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirCabinCargoInformationResDto airCabinCargoInformationResDto : arg0 ) {
            list.add( dto2Po( airCabinCargoInformationResDto ) );
        }

        return list;
    }

    @Override
    public List<AirCabinCargoInformationResDto> entityList2DtoList(List<AirCabinCargoInformationEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationResDto> list = new ArrayList<AirCabinCargoInformationResDto>( arg0.size() );
        for ( AirCabinCargoInformationEntity airCabinCargoInformationEntity : arg0 ) {
            list.add( entity2Dto( airCabinCargoInformationEntity ) );
        }

        return list;
    }

    @Override
    public List<AirCabinCargoInformationResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationResDto> list = new ArrayList<AirCabinCargoInformationResDto>( arg0.size() );
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
