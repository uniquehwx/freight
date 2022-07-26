package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirPanelEntity;
import com.bizcenter.freight.dto.req.AirPanelReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirPanelPo;
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
public class AirPanelReqDtoConvertorImpl extends AirPanelReqDtoConvertor {

    @Override
    public AirPanelEntity dto2Entity(AirPanelReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirPanelEntity airPanelEntity = new AirPanelEntity();

        airPanelEntity.setAirCompanyCode( arg0.getAirCompanyCode() );
        airPanelEntity.setModel( arg0.getModel() );
        airPanelEntity.setPanelTypeCode( arg0.getPanelTypeCode() );
        airPanelEntity.setAltName( arg0.getAltName() );
        airPanelEntity.setCubicMeter( arg0.getCubicMeter() );
        airPanelEntity.setPanelLong( arg0.getPanelLong() );
        airPanelEntity.setPanelWide( arg0.getPanelWide() );
        airPanelEntity.setPanelHigh( arg0.getPanelHigh() );
        airPanelEntity.setPanelSize( arg0.getPanelSize() );
        airPanelEntity.setWeightLimit( arg0.getWeightLimit() );
        airPanelEntity.setModifyRealName( arg0.getModifyRealName() );
        airPanelEntity.setCreateRealName( arg0.getCreateRealName() );

        return airPanelEntity;
    }

    @Override
    public AirPanelPo dto2Po(AirPanelReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirPanelPo airPanelPo = new AirPanelPo();

        airPanelPo.setAppId( arg0.getAppId() );
        airPanelPo.setTenantId( arg0.getTenantId() );
        airPanelPo.setAirCompanyCode( arg0.getAirCompanyCode() );
        airPanelPo.setModel( arg0.getModel() );
        airPanelPo.setPanelTypeCode( arg0.getPanelTypeCode() );
        airPanelPo.setAltName( arg0.getAltName() );
        airPanelPo.setCubicMeter( arg0.getCubicMeter() );
        airPanelPo.setPanelLong( arg0.getPanelLong() );
        airPanelPo.setPanelWide( arg0.getPanelWide() );
        airPanelPo.setPanelHigh( arg0.getPanelHigh() );
        airPanelPo.setPanelSize( arg0.getPanelSize() );
        airPanelPo.setWeightLimit( arg0.getWeightLimit() );
        airPanelPo.setModifyRealName( arg0.getModifyRealName() );
        airPanelPo.setCreateRealName( arg0.getCreateRealName() );

        return airPanelPo;
    }

    @Override
    public AirPanelReqDto entity2Dto(AirPanelEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirPanelReqDto airPanelReqDto = new AirPanelReqDto();

        airPanelReqDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airPanelReqDto.setModel( arg0.getModel() );
        airPanelReqDto.setPanelTypeCode( arg0.getPanelTypeCode() );
        airPanelReqDto.setAltName( arg0.getAltName() );
        airPanelReqDto.setCubicMeter( arg0.getCubicMeter() );
        airPanelReqDto.setPanelLong( arg0.getPanelLong() );
        airPanelReqDto.setPanelWide( arg0.getPanelWide() );
        airPanelReqDto.setPanelHigh( arg0.getPanelHigh() );
        airPanelReqDto.setPanelSize( arg0.getPanelSize() );
        airPanelReqDto.setWeightLimit( arg0.getWeightLimit() );
        airPanelReqDto.setModifyRealName( arg0.getModifyRealName() );
        airPanelReqDto.setCreateRealName( arg0.getCreateRealName() );

        return airPanelReqDto;
    }

    @Override
    public AirPanelReqDto po2Dto(AirPanelPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirPanelReqDto airPanelReqDto = new AirPanelReqDto();

        airPanelReqDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airPanelReqDto.setModel( arg0.getModel() );
        airPanelReqDto.setPanelTypeCode( arg0.getPanelTypeCode() );
        airPanelReqDto.setAltName( arg0.getAltName() );
        airPanelReqDto.setCubicMeter( arg0.getCubicMeter() );
        airPanelReqDto.setPanelLong( arg0.getPanelLong() );
        airPanelReqDto.setPanelWide( arg0.getPanelWide() );
        airPanelReqDto.setPanelHigh( arg0.getPanelHigh() );
        airPanelReqDto.setPanelSize( arg0.getPanelSize() );
        airPanelReqDto.setWeightLimit( arg0.getWeightLimit() );
        airPanelReqDto.setTenantId( arg0.getTenantId() );
        airPanelReqDto.setAppId( arg0.getAppId() );
        airPanelReqDto.setModifyRealName( arg0.getModifyRealName() );
        airPanelReqDto.setCreateRealName( arg0.getCreateRealName() );

        return airPanelReqDto;
    }

    @Override
    public AirPanelEntity po2Entity(AirPanelPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirPanelEntity airPanelEntity = new AirPanelEntity();

        airPanelEntity.setId( arg0.getId() );
        airPanelEntity.setAirCompanyCode( arg0.getAirCompanyCode() );
        airPanelEntity.setModel( arg0.getModel() );
        airPanelEntity.setPanelTypeCode( arg0.getPanelTypeCode() );
        airPanelEntity.setAltName( arg0.getAltName() );
        airPanelEntity.setCubicMeter( arg0.getCubicMeter() );
        airPanelEntity.setPanelLong( arg0.getPanelLong() );
        airPanelEntity.setPanelWide( arg0.getPanelWide() );
        airPanelEntity.setPanelHigh( arg0.getPanelHigh() );
        airPanelEntity.setPanelSize( arg0.getPanelSize() );
        airPanelEntity.setWeightLimit( arg0.getWeightLimit() );
        airPanelEntity.setModifyUserName( arg0.getModifyUserName() );
        airPanelEntity.setModifyRealName( arg0.getModifyRealName() );
        airPanelEntity.setModifyUserId( arg0.getModifyUserId() );
        airPanelEntity.setCreateUserName( arg0.getCreateUserName() );
        airPanelEntity.setCreateRealName( arg0.getCreateRealName() );
        airPanelEntity.setCreateUserId( arg0.getCreateUserId() );

        return airPanelEntity;
    }

    @Override
    public AirPanelPo entity2Po(AirPanelEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirPanelPo airPanelPo = new AirPanelPo();

        airPanelPo.setId( arg0.getId() );
        airPanelPo.setCreateUserId( arg0.getCreateUserId() );
        airPanelPo.setCreateUserName( arg0.getCreateUserName() );
        airPanelPo.setModifyUserId( arg0.getModifyUserId() );
        airPanelPo.setModifyUserName( arg0.getModifyUserName() );
        airPanelPo.setAirCompanyCode( arg0.getAirCompanyCode() );
        airPanelPo.setModel( arg0.getModel() );
        airPanelPo.setPanelTypeCode( arg0.getPanelTypeCode() );
        airPanelPo.setAltName( arg0.getAltName() );
        airPanelPo.setCubicMeter( arg0.getCubicMeter() );
        airPanelPo.setPanelLong( arg0.getPanelLong() );
        airPanelPo.setPanelWide( arg0.getPanelWide() );
        airPanelPo.setPanelHigh( arg0.getPanelHigh() );
        airPanelPo.setPanelSize( arg0.getPanelSize() );
        airPanelPo.setWeightLimit( arg0.getWeightLimit() );
        airPanelPo.setModifyRealName( arg0.getModifyRealName() );
        airPanelPo.setCreateRealName( arg0.getCreateRealName() );

        return airPanelPo;
    }

    @Override
    public List<AirPanelEntity> dtoList2EntityList(List<AirPanelReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirPanelEntity> list = new ArrayList<AirPanelEntity>( arg0.size() );
        for ( AirPanelReqDto airPanelReqDto : arg0 ) {
            list.add( dto2Entity( airPanelReqDto ) );
        }

        return list;
    }

    @Override
    public List<AirPanelPo> dtoList2PoList(List<AirPanelReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirPanelPo> list = new ArrayList<AirPanelPo>( arg0.size() );
        for ( AirPanelReqDto airPanelReqDto : arg0 ) {
            list.add( dto2Po( airPanelReqDto ) );
        }

        return list;
    }

    @Override
    public List<AirPanelReqDto> entityList2DtoList(List<AirPanelEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirPanelReqDto> list = new ArrayList<AirPanelReqDto>( arg0.size() );
        for ( AirPanelEntity airPanelEntity : arg0 ) {
            list.add( entity2Dto( airPanelEntity ) );
        }

        return list;
    }

    @Override
    public List<AirPanelReqDto> poList2DtoList(List<AirPanelPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirPanelReqDto> list = new ArrayList<AirPanelReqDto>( arg0.size() );
        for ( AirPanelPo airPanelPo : arg0 ) {
            list.add( po2Dto( airPanelPo ) );
        }

        return list;
    }

    @Override
    public List<AirPanelEntity> poList2EntityList(List<AirPanelPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirPanelEntity> list = new ArrayList<AirPanelEntity>( arg0.size() );
        for ( AirPanelPo airPanelPo : arg0 ) {
            list.add( po2Entity( airPanelPo ) );
        }

        return list;
    }

    @Override
    public List<AirPanelPo> entityList2PoList(List<AirPanelEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirPanelPo> list = new ArrayList<AirPanelPo>( arg0.size() );
        for ( AirPanelEntity airPanelEntity : arg0 ) {
            list.add( entity2Po( airPanelEntity ) );
        }

        return list;
    }
}
