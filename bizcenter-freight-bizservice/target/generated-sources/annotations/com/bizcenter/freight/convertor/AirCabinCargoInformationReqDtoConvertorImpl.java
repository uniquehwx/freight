package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirCabinCargoInformationEntity;
import com.bizcenter.freight.dto.req.AirCabinCargoInformationReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirCabinCargoInformationPo;
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
    public AirCabinCargoInformationPo dto2Po(AirCabinCargoInformationReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCabinCargoInformationPo airCabinCargoInformationPo = new AirCabinCargoInformationPo();

        airCabinCargoInformationPo.setAppId( arg0.getAppId() );
        airCabinCargoInformationPo.setTenantId( arg0.getTenantId() );
        airCabinCargoInformationPo.setFlightNo( arg0.getFlightNo() );
        airCabinCargoInformationPo.setProductNo( arg0.getProductNo() );
        airCabinCargoInformationPo.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCabinCargoInformationPo.setFlightCode( arg0.getFlightCode() );
        airCabinCargoInformationPo.setDestinationPort( arg0.getDestinationPort() );
        airCabinCargoInformationPo.setPanelType( arg0.getPanelType() );
        airCabinCargoInformationPo.setFlightService( arg0.getFlightService() );
        airCabinCargoInformationPo.setFlightOperator( arg0.getFlightOperator() );
        airCabinCargoInformationPo.setCompany( arg0.getCompany() );
        airCabinCargoInformationPo.setDepartment( arg0.getDepartment() );
        airCabinCargoInformationPo.setModifyRealName( arg0.getModifyRealName() );
        airCabinCargoInformationPo.setCreateRealName( arg0.getCreateRealName() );
        airCabinCargoInformationPo.setEffectTime( arg0.getEffectTime() );
        airCabinCargoInformationPo.setInvalidTime( arg0.getInvalidTime() );
        airCabinCargoInformationPo.setContractPenalty( arg0.getContractPenalty() );

        return airCabinCargoInformationPo;
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
    public AirCabinCargoInformationReqDto po2Dto(AirCabinCargoInformationPo arg0) {
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
        airCabinCargoInformationReqDto.setTenantId( arg0.getTenantId() );
        airCabinCargoInformationReqDto.setAppId( arg0.getAppId() );
        airCabinCargoInformationReqDto.setModifyRealName( arg0.getModifyRealName() );
        airCabinCargoInformationReqDto.setCreateRealName( arg0.getCreateRealName() );
        airCabinCargoInformationReqDto.setEffectTime( arg0.getEffectTime() );
        airCabinCargoInformationReqDto.setInvalidTime( arg0.getInvalidTime() );
        airCabinCargoInformationReqDto.setContractPenalty( arg0.getContractPenalty() );

        return airCabinCargoInformationReqDto;
    }

    @Override
    public AirCabinCargoInformationEntity po2Entity(AirCabinCargoInformationPo arg0) {
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
    public AirCabinCargoInformationPo entity2Po(AirCabinCargoInformationEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCabinCargoInformationPo airCabinCargoInformationPo = new AirCabinCargoInformationPo();

        airCabinCargoInformationPo.setId( arg0.getId() );
        airCabinCargoInformationPo.setCreateUserId( arg0.getCreateUserId() );
        airCabinCargoInformationPo.setCreateUserName( arg0.getCreateUserName() );
        airCabinCargoInformationPo.setModifyUserId( arg0.getModifyUserId() );
        airCabinCargoInformationPo.setModifyUserName( arg0.getModifyUserName() );
        airCabinCargoInformationPo.setFlightNo( arg0.getFlightNo() );
        airCabinCargoInformationPo.setProductNo( arg0.getProductNo() );
        airCabinCargoInformationPo.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCabinCargoInformationPo.setFlightCode( arg0.getFlightCode() );
        airCabinCargoInformationPo.setDestinationPort( arg0.getDestinationPort() );
        airCabinCargoInformationPo.setPanelType( arg0.getPanelType() );
        airCabinCargoInformationPo.setFlightService( arg0.getFlightService() );
        airCabinCargoInformationPo.setFlightOperator( arg0.getFlightOperator() );
        airCabinCargoInformationPo.setCompany( arg0.getCompany() );
        airCabinCargoInformationPo.setDepartment( arg0.getDepartment() );
        airCabinCargoInformationPo.setModifyRealName( arg0.getModifyRealName() );
        airCabinCargoInformationPo.setCreateRealName( arg0.getCreateRealName() );
        airCabinCargoInformationPo.setEffectTime( arg0.getEffectTime() );
        airCabinCargoInformationPo.setInvalidTime( arg0.getInvalidTime() );
        airCabinCargoInformationPo.setContractPenalty( arg0.getContractPenalty() );

        return airCabinCargoInformationPo;
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
    public List<AirCabinCargoInformationPo> dtoList2PoList(List<AirCabinCargoInformationReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationPo> list = new ArrayList<AirCabinCargoInformationPo>( arg0.size() );
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
    public List<AirCabinCargoInformationReqDto> poList2DtoList(List<AirCabinCargoInformationPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationReqDto> list = new ArrayList<AirCabinCargoInformationReqDto>( arg0.size() );
        for ( AirCabinCargoInformationPo airCabinCargoInformationPo : arg0 ) {
            list.add( po2Dto( airCabinCargoInformationPo ) );
        }

        return list;
    }

    @Override
    public List<AirCabinCargoInformationEntity> poList2EntityList(List<AirCabinCargoInformationPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationEntity> list = new ArrayList<AirCabinCargoInformationEntity>( arg0.size() );
        for ( AirCabinCargoInformationPo airCabinCargoInformationPo : arg0 ) {
            list.add( po2Entity( airCabinCargoInformationPo ) );
        }

        return list;
    }

    @Override
    public List<AirCabinCargoInformationPo> entityList2PoList(List<AirCabinCargoInformationEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationPo> list = new ArrayList<AirCabinCargoInformationPo>( arg0.size() );
        for ( AirCabinCargoInformationEntity airCabinCargoInformationEntity : arg0 ) {
            list.add( entity2Po( airCabinCargoInformationEntity ) );
        }

        return list;
    }
}
