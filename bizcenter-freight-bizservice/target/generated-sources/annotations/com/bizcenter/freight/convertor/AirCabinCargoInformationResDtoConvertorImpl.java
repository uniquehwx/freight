package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirCabinCargoInformationEntity;
import com.bizcenter.freight.dto.res.AirCabinCargoInformationResDto;
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
    public AirCabinCargoInformationPo dto2Po(AirCabinCargoInformationResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCabinCargoInformationPo airCabinCargoInformationPo = new AirCabinCargoInformationPo();

        airCabinCargoInformationPo.setId( arg0.getId() );
        airCabinCargoInformationPo.setCreateUserId( arg0.getCreateUserId() );
        airCabinCargoInformationPo.setCreateUserName( arg0.getCreateUserName() );
        airCabinCargoInformationPo.setCreateTime( arg0.getCreateTime() );
        airCabinCargoInformationPo.setModifyUserId( arg0.getModifyUserId() );
        airCabinCargoInformationPo.setModifyUserName( arg0.getModifyUserName() );
        airCabinCargoInformationPo.setModifyTime( arg0.getModifyTime() );
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
    public AirCabinCargoInformationResDto po2Dto(AirCabinCargoInformationPo arg0) {
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
        airCabinCargoInformationResDto.setModifyTime( arg0.getModifyTime() );
        airCabinCargoInformationResDto.setModifyUserName( arg0.getModifyUserName() );
        airCabinCargoInformationResDto.setModifyRealName( arg0.getModifyRealName() );
        airCabinCargoInformationResDto.setModifyUserId( arg0.getModifyUserId() );
        airCabinCargoInformationResDto.setCreateTime( arg0.getCreateTime() );
        airCabinCargoInformationResDto.setCreateUserName( arg0.getCreateUserName() );
        airCabinCargoInformationResDto.setCreateRealName( arg0.getCreateRealName() );
        airCabinCargoInformationResDto.setCreateUserId( arg0.getCreateUserId() );
        airCabinCargoInformationResDto.setEffectTime( arg0.getEffectTime() );
        airCabinCargoInformationResDto.setInvalidTime( arg0.getInvalidTime() );
        airCabinCargoInformationResDto.setContractPenalty( arg0.getContractPenalty() );

        return airCabinCargoInformationResDto;
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
    public List<AirCabinCargoInformationPo> dtoList2PoList(List<AirCabinCargoInformationResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationPo> list = new ArrayList<AirCabinCargoInformationPo>( arg0.size() );
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
    public List<AirCabinCargoInformationResDto> poList2DtoList(List<AirCabinCargoInformationPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCabinCargoInformationResDto> list = new ArrayList<AirCabinCargoInformationResDto>( arg0.size() );
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
