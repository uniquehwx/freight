package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.CustomsClearanceEntity;
import com.bizcenter.freight.dto.req.CustomsClearanceReqDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-26T16:50:54+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class CustomsClearanceReqDtoConvertorImpl extends CustomsClearanceReqDtoConvertor {

    @Override
    public CustomsClearanceEntity dto2Entity(CustomsClearanceReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceEntity customsClearanceEntity = new CustomsClearanceEntity();

        customsClearanceEntity.setStatus( arg0.getStatus() );
        customsClearanceEntity.setOrderNo( arg0.getOrderNo() );
        customsClearanceEntity.setCustomerNo( arg0.getCustomerNo() );
        customsClearanceEntity.setFlightNumber( arg0.getFlightNumber() );
        customsClearanceEntity.setCustomerCode( arg0.getCustomerCode() );
        customsClearanceEntity.setCustomerName( arg0.getCustomerName() );
        customsClearanceEntity.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        customsClearanceEntity.setDepartCode( arg0.getDepartCode() );
        customsClearanceEntity.setAddedServiceNo( arg0.getAddedServiceNo() );
        customsClearanceEntity.setBusType( arg0.getBusType() );
        customsClearanceEntity.setOrderSource( arg0.getOrderSource() );
        customsClearanceEntity.setBilllandingNo( arg0.getBilllandingNo() );
        customsClearanceEntity.setRemark( arg0.getRemark() );
        customsClearanceEntity.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        customsClearanceEntity.setUserDef2( arg0.getUserDef2() );
        customsClearanceEntity.setIsvId( arg0.getIsvId() );
        customsClearanceEntity.setCreateRealName( arg0.getCreateRealName() );
        customsClearanceEntity.setModifyRealName( arg0.getModifyRealName() );
        customsClearanceEntity.setType( arg0.getType() );
        customsClearanceEntity.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        customsClearanceEntity.setInitCreatDepart( arg0.getInitCreatDepart() );
        customsClearanceEntity.setMainOrderNo( arg0.getMainOrderNo() );

        return customsClearanceEntity;
    }

    @Override
    public String dto2Po(CustomsClearanceReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public CustomsClearanceReqDto entity2Dto(CustomsClearanceEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceReqDto customsClearanceReqDto = new CustomsClearanceReqDto();

        customsClearanceReqDto.setStatus( arg0.getStatus() );
        customsClearanceReqDto.setOrderNo( arg0.getOrderNo() );
        customsClearanceReqDto.setCustomerNo( arg0.getCustomerNo() );
        customsClearanceReqDto.setFlightNumber( arg0.getFlightNumber() );
        customsClearanceReqDto.setCustomerCode( arg0.getCustomerCode() );
        customsClearanceReqDto.setCustomerName( arg0.getCustomerName() );
        customsClearanceReqDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        customsClearanceReqDto.setDepartCode( arg0.getDepartCode() );
        customsClearanceReqDto.setAddedServiceNo( arg0.getAddedServiceNo() );
        customsClearanceReqDto.setBusType( arg0.getBusType() );
        customsClearanceReqDto.setOrderSource( arg0.getOrderSource() );
        customsClearanceReqDto.setBilllandingNo( arg0.getBilllandingNo() );
        customsClearanceReqDto.setRemark( arg0.getRemark() );
        customsClearanceReqDto.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        customsClearanceReqDto.setUserDef2( arg0.getUserDef2() );
        customsClearanceReqDto.setIsvId( arg0.getIsvId() );
        customsClearanceReqDto.setCreateRealName( arg0.getCreateRealName() );
        customsClearanceReqDto.setModifyRealName( arg0.getModifyRealName() );
        customsClearanceReqDto.setType( arg0.getType() );
        customsClearanceReqDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        customsClearanceReqDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        customsClearanceReqDto.setMainOrderNo( arg0.getMainOrderNo() );

        return customsClearanceReqDto;
    }

    @Override
    public CustomsClearanceReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceReqDto customsClearanceReqDto = new CustomsClearanceReqDto();

        return customsClearanceReqDto;
    }

    @Override
    public CustomsClearanceEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceEntity customsClearanceEntity = new CustomsClearanceEntity();

        return customsClearanceEntity;
    }

    @Override
    public String entity2Po(CustomsClearanceEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<CustomsClearanceEntity> dtoList2EntityList(List<CustomsClearanceReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceEntity> list = new ArrayList<CustomsClearanceEntity>( arg0.size() );
        for ( CustomsClearanceReqDto customsClearanceReqDto : arg0 ) {
            list.add( dto2Entity( customsClearanceReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<CustomsClearanceReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( CustomsClearanceReqDto customsClearanceReqDto : arg0 ) {
            list.add( dto2Po( customsClearanceReqDto ) );
        }

        return list;
    }

    @Override
    public List<CustomsClearanceReqDto> entityList2DtoList(List<CustomsClearanceEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceReqDto> list = new ArrayList<CustomsClearanceReqDto>( arg0.size() );
        for ( CustomsClearanceEntity customsClearanceEntity : arg0 ) {
            list.add( entity2Dto( customsClearanceEntity ) );
        }

        return list;
    }

    @Override
    public List<CustomsClearanceReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceReqDto> list = new ArrayList<CustomsClearanceReqDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<CustomsClearanceEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceEntity> list = new ArrayList<CustomsClearanceEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<CustomsClearanceEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( CustomsClearanceEntity customsClearanceEntity : arg0 ) {
            list.add( entity2Po( customsClearanceEntity ) );
        }

        return list;
    }
}
