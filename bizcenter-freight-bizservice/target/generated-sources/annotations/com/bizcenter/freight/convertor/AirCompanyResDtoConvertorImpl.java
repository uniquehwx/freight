package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirCompanyEntity;
import com.bizcenter.freight.dto.res.AirCompanyResDto;
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
public class AirCompanyResDtoConvertorImpl extends AirCompanyResDtoConvertor {

    @Override
    public AirCompanyEntity dto2Entity(AirCompanyResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCompanyEntity airCompanyEntity = new AirCompanyEntity();

        airCompanyEntity.setId( arg0.getId() );
        airCompanyEntity.setCompanyNo( arg0.getCompanyNo() );
        airCompanyEntity.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCompanyEntity.setCompanyName( arg0.getCompanyName() );
        airCompanyEntity.setCompanyCode( arg0.getCompanyCode() );
        airCompanyEntity.setLandingBillInvoiceTitle( arg0.getLandingBillInvoiceTitle() );
        airCompanyEntity.setIssuingCar( arg0.getIssuingCar() );
        airCompanyEntity.setIataCode( arg0.getIataCode() );
        airCompanyEntity.setModifyUserName( arg0.getModifyUserName() );
        airCompanyEntity.setModifyRealName( arg0.getModifyRealName() );
        airCompanyEntity.setModifyUserId( arg0.getModifyUserId() );
        airCompanyEntity.setCreateUserName( arg0.getCreateUserName() );
        airCompanyEntity.setCreateRealName( arg0.getCreateRealName() );
        airCompanyEntity.setCreateUserId( arg0.getCreateUserId() );
        airCompanyEntity.setSupplierCode( arg0.getSupplierCode() );
        airCompanyEntity.setSupplierName( arg0.getSupplierName() );
        airCompanyEntity.setAccountNo( arg0.getAccountNo() );

        return airCompanyEntity;
    }

    @Override
    public String dto2Po(AirCompanyResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public AirCompanyResDto entity2Dto(AirCompanyEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCompanyResDto airCompanyResDto = new AirCompanyResDto();

        airCompanyResDto.setId( arg0.getId() );
        airCompanyResDto.setCompanyNo( arg0.getCompanyNo() );
        airCompanyResDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCompanyResDto.setCompanyName( arg0.getCompanyName() );
        airCompanyResDto.setCompanyCode( arg0.getCompanyCode() );
        airCompanyResDto.setLandingBillInvoiceTitle( arg0.getLandingBillInvoiceTitle() );
        airCompanyResDto.setIssuingCar( arg0.getIssuingCar() );
        airCompanyResDto.setIataCode( arg0.getIataCode() );
        airCompanyResDto.setModifyUserName( arg0.getModifyUserName() );
        airCompanyResDto.setModifyRealName( arg0.getModifyRealName() );
        airCompanyResDto.setModifyUserId( arg0.getModifyUserId() );
        airCompanyResDto.setCreateUserName( arg0.getCreateUserName() );
        airCompanyResDto.setCreateRealName( arg0.getCreateRealName() );
        airCompanyResDto.setCreateUserId( arg0.getCreateUserId() );
        airCompanyResDto.setSupplierCode( arg0.getSupplierCode() );
        airCompanyResDto.setSupplierName( arg0.getSupplierName() );
        airCompanyResDto.setAccountNo( arg0.getAccountNo() );

        return airCompanyResDto;
    }

    @Override
    public AirCompanyResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCompanyResDto airCompanyResDto = new AirCompanyResDto();

        return airCompanyResDto;
    }

    @Override
    public AirCompanyEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCompanyEntity airCompanyEntity = new AirCompanyEntity();

        return airCompanyEntity;
    }

    @Override
    public String entity2Po(AirCompanyEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<AirCompanyEntity> dtoList2EntityList(List<AirCompanyResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCompanyEntity> list = new ArrayList<AirCompanyEntity>( arg0.size() );
        for ( AirCompanyResDto airCompanyResDto : arg0 ) {
            list.add( dto2Entity( airCompanyResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<AirCompanyResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirCompanyResDto airCompanyResDto : arg0 ) {
            list.add( dto2Po( airCompanyResDto ) );
        }

        return list;
    }

    @Override
    public List<AirCompanyResDto> entityList2DtoList(List<AirCompanyEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCompanyResDto> list = new ArrayList<AirCompanyResDto>( arg0.size() );
        for ( AirCompanyEntity airCompanyEntity : arg0 ) {
            list.add( entity2Dto( airCompanyEntity ) );
        }

        return list;
    }

    @Override
    public List<AirCompanyResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCompanyResDto> list = new ArrayList<AirCompanyResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<AirCompanyEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCompanyEntity> list = new ArrayList<AirCompanyEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<AirCompanyEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirCompanyEntity airCompanyEntity : arg0 ) {
            list.add( entity2Po( airCompanyEntity ) );
        }

        return list;
    }
}
