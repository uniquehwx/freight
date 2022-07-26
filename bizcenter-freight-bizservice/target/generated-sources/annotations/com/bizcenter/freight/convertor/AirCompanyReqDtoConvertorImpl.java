package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirCompanyEntity;
import com.bizcenter.freight.dto.req.AirCompanyReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirCompanyPo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-22T17:21:58+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class AirCompanyReqDtoConvertorImpl extends AirCompanyReqDtoConvertor {

    @Override
    public AirCompanyEntity dto2Entity(AirCompanyReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCompanyEntity airCompanyEntity = new AirCompanyEntity();

        airCompanyEntity.setCompanyNo( arg0.getCompanyNo() );
        airCompanyEntity.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCompanyEntity.setCompanyName( arg0.getCompanyName() );
        airCompanyEntity.setCompanyCode( arg0.getCompanyCode() );
        airCompanyEntity.setLandingBillInvoiceTitle( arg0.getLandingBillInvoiceTitle() );
        airCompanyEntity.setIssuingCar( arg0.getIssuingCar() );
        airCompanyEntity.setIataCode( arg0.getIataCode() );
        airCompanyEntity.setModifyRealName( arg0.getModifyRealName() );
        airCompanyEntity.setCreateRealName( arg0.getCreateRealName() );
        airCompanyEntity.setSupplierCode( arg0.getSupplierCode() );
        airCompanyEntity.setSupplierName( arg0.getSupplierName() );
        airCompanyEntity.setAccountNo( arg0.getAccountNo() );

        return airCompanyEntity;
    }

    @Override
    public AirCompanyPo dto2Po(AirCompanyReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCompanyPo airCompanyPo = new AirCompanyPo();

        airCompanyPo.setAppId( arg0.getAppId() );
        airCompanyPo.setTenantId( arg0.getTenantId() );
        airCompanyPo.setCompanyNo( arg0.getCompanyNo() );
        airCompanyPo.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCompanyPo.setCompanyName( arg0.getCompanyName() );
        airCompanyPo.setCompanyCode( arg0.getCompanyCode() );
        airCompanyPo.setLandingBillInvoiceTitle( arg0.getLandingBillInvoiceTitle() );
        airCompanyPo.setIssuingCar( arg0.getIssuingCar() );
        airCompanyPo.setIataCode( arg0.getIataCode() );
        airCompanyPo.setModifyRealName( arg0.getModifyRealName() );
        airCompanyPo.setCreateRealName( arg0.getCreateRealName() );
        airCompanyPo.setSupplierCode( arg0.getSupplierCode() );
        airCompanyPo.setSupplierName( arg0.getSupplierName() );
        airCompanyPo.setAccountNo( arg0.getAccountNo() );

        return airCompanyPo;
    }

    @Override
    public AirCompanyReqDto entity2Dto(AirCompanyEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCompanyReqDto airCompanyReqDto = new AirCompanyReqDto();

        airCompanyReqDto.setCompanyNo( arg0.getCompanyNo() );
        airCompanyReqDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCompanyReqDto.setCompanyName( arg0.getCompanyName() );
        airCompanyReqDto.setCompanyCode( arg0.getCompanyCode() );
        airCompanyReqDto.setLandingBillInvoiceTitle( arg0.getLandingBillInvoiceTitle() );
        airCompanyReqDto.setIssuingCar( arg0.getIssuingCar() );
        airCompanyReqDto.setIataCode( arg0.getIataCode() );
        airCompanyReqDto.setModifyRealName( arg0.getModifyRealName() );
        airCompanyReqDto.setCreateRealName( arg0.getCreateRealName() );
        airCompanyReqDto.setSupplierCode( arg0.getSupplierCode() );
        airCompanyReqDto.setSupplierName( arg0.getSupplierName() );
        airCompanyReqDto.setAccountNo( arg0.getAccountNo() );

        return airCompanyReqDto;
    }

    @Override
    public AirCompanyReqDto po2Dto(AirCompanyPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCompanyReqDto airCompanyReqDto = new AirCompanyReqDto();

        airCompanyReqDto.setCompanyNo( arg0.getCompanyNo() );
        airCompanyReqDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCompanyReqDto.setCompanyName( arg0.getCompanyName() );
        airCompanyReqDto.setCompanyCode( arg0.getCompanyCode() );
        airCompanyReqDto.setLandingBillInvoiceTitle( arg0.getLandingBillInvoiceTitle() );
        airCompanyReqDto.setIssuingCar( arg0.getIssuingCar() );
        airCompanyReqDto.setIataCode( arg0.getIataCode() );
        airCompanyReqDto.setTenantId( arg0.getTenantId() );
        airCompanyReqDto.setAppId( arg0.getAppId() );
        airCompanyReqDto.setModifyRealName( arg0.getModifyRealName() );
        airCompanyReqDto.setCreateRealName( arg0.getCreateRealName() );
        airCompanyReqDto.setSupplierCode( arg0.getSupplierCode() );
        airCompanyReqDto.setSupplierName( arg0.getSupplierName() );
        airCompanyReqDto.setAccountNo( arg0.getAccountNo() );

        return airCompanyReqDto;
    }

    @Override
    public AirCompanyEntity po2Entity(AirCompanyPo arg0) {
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
    public AirCompanyPo entity2Po(AirCompanyEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirCompanyPo airCompanyPo = new AirCompanyPo();

        airCompanyPo.setId( arg0.getId() );
        airCompanyPo.setCreateUserId( arg0.getCreateUserId() );
        airCompanyPo.setCreateUserName( arg0.getCreateUserName() );
        airCompanyPo.setModifyUserId( arg0.getModifyUserId() );
        airCompanyPo.setModifyUserName( arg0.getModifyUserName() );
        airCompanyPo.setCompanyNo( arg0.getCompanyNo() );
        airCompanyPo.setAirCompanyCode( arg0.getAirCompanyCode() );
        airCompanyPo.setCompanyName( arg0.getCompanyName() );
        airCompanyPo.setCompanyCode( arg0.getCompanyCode() );
        airCompanyPo.setLandingBillInvoiceTitle( arg0.getLandingBillInvoiceTitle() );
        airCompanyPo.setIssuingCar( arg0.getIssuingCar() );
        airCompanyPo.setIataCode( arg0.getIataCode() );
        airCompanyPo.setModifyRealName( arg0.getModifyRealName() );
        airCompanyPo.setCreateRealName( arg0.getCreateRealName() );
        airCompanyPo.setSupplierCode( arg0.getSupplierCode() );
        airCompanyPo.setSupplierName( arg0.getSupplierName() );
        airCompanyPo.setAccountNo( arg0.getAccountNo() );

        return airCompanyPo;
    }

    @Override
    public List<AirCompanyEntity> dtoList2EntityList(List<AirCompanyReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCompanyEntity> list = new ArrayList<AirCompanyEntity>( arg0.size() );
        for ( AirCompanyReqDto airCompanyReqDto : arg0 ) {
            list.add( dto2Entity( airCompanyReqDto ) );
        }

        return list;
    }

    @Override
    public List<AirCompanyPo> dtoList2PoList(List<AirCompanyReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCompanyPo> list = new ArrayList<AirCompanyPo>( arg0.size() );
        for ( AirCompanyReqDto airCompanyReqDto : arg0 ) {
            list.add( dto2Po( airCompanyReqDto ) );
        }

        return list;
    }

    @Override
    public List<AirCompanyReqDto> entityList2DtoList(List<AirCompanyEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCompanyReqDto> list = new ArrayList<AirCompanyReqDto>( arg0.size() );
        for ( AirCompanyEntity airCompanyEntity : arg0 ) {
            list.add( entity2Dto( airCompanyEntity ) );
        }

        return list;
    }

    @Override
    public List<AirCompanyReqDto> poList2DtoList(List<AirCompanyPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCompanyReqDto> list = new ArrayList<AirCompanyReqDto>( arg0.size() );
        for ( AirCompanyPo airCompanyPo : arg0 ) {
            list.add( po2Dto( airCompanyPo ) );
        }

        return list;
    }

    @Override
    public List<AirCompanyEntity> poList2EntityList(List<AirCompanyPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCompanyEntity> list = new ArrayList<AirCompanyEntity>( arg0.size() );
        for ( AirCompanyPo airCompanyPo : arg0 ) {
            list.add( po2Entity( airCompanyPo ) );
        }

        return list;
    }

    @Override
    public List<AirCompanyPo> entityList2PoList(List<AirCompanyEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirCompanyPo> list = new ArrayList<AirCompanyPo>( arg0.size() );
        for ( AirCompanyEntity airCompanyEntity : arg0 ) {
            list.add( entity2Po( airCompanyEntity ) );
        }

        return list;
    }
}
