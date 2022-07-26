package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.CustomsClearanceEntity;
import com.bizcenter.freight.dto.res.CustomsClearanceResDto;
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
public class CustomsClearanceResDtoConvertorImpl extends CustomsClearanceResDtoConvertor {

    @Override
    public CustomsClearanceEntity dto2Entity(CustomsClearanceResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceEntity customsClearanceEntity = new CustomsClearanceEntity();

        customsClearanceEntity.setId( arg0.getId() );
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
        customsClearanceEntity.setModifyUserName( arg0.getModifyUserName() );
        customsClearanceEntity.setModifyUserId( arg0.getModifyUserId() );
        customsClearanceEntity.setCreateUserName( arg0.getCreateUserName() );
        customsClearanceEntity.setCreateUserId( arg0.getCreateUserId() );
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
    public String dto2Po(CustomsClearanceResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public CustomsClearanceResDto entity2Dto(CustomsClearanceEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceResDto customsClearanceResDto = new CustomsClearanceResDto();

        customsClearanceResDto.setId( arg0.getId() );
        customsClearanceResDto.setStatus( arg0.getStatus() );
        customsClearanceResDto.setOrderNo( arg0.getOrderNo() );
        customsClearanceResDto.setCustomerNo( arg0.getCustomerNo() );
        customsClearanceResDto.setFlightNumber( arg0.getFlightNumber() );
        customsClearanceResDto.setCustomerCode( arg0.getCustomerCode() );
        customsClearanceResDto.setCustomerName( arg0.getCustomerName() );
        customsClearanceResDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        customsClearanceResDto.setDepartCode( arg0.getDepartCode() );
        customsClearanceResDto.setAddedServiceNo( arg0.getAddedServiceNo() );
        customsClearanceResDto.setBusType( arg0.getBusType() );
        customsClearanceResDto.setOrderSource( arg0.getOrderSource() );
        customsClearanceResDto.setBilllandingNo( arg0.getBilllandingNo() );
        customsClearanceResDto.setRemark( arg0.getRemark() );
        customsClearanceResDto.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        customsClearanceResDto.setUserDef2( arg0.getUserDef2() );
        customsClearanceResDto.setModifyUserName( arg0.getModifyUserName() );
        customsClearanceResDto.setModifyUserId( arg0.getModifyUserId() );
        customsClearanceResDto.setCreateUserName( arg0.getCreateUserName() );
        customsClearanceResDto.setCreateUserId( arg0.getCreateUserId() );
        customsClearanceResDto.setIsvId( arg0.getIsvId() );
        customsClearanceResDto.setCreateRealName( arg0.getCreateRealName() );
        customsClearanceResDto.setModifyRealName( arg0.getModifyRealName() );
        customsClearanceResDto.setType( arg0.getType() );
        customsClearanceResDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        customsClearanceResDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        customsClearanceResDto.setMainOrderNo( arg0.getMainOrderNo() );

        return customsClearanceResDto;
    }

    @Override
    public CustomsClearanceResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceResDto customsClearanceResDto = new CustomsClearanceResDto();

        return customsClearanceResDto;
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
    public List<CustomsClearanceEntity> dtoList2EntityList(List<CustomsClearanceResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceEntity> list = new ArrayList<CustomsClearanceEntity>( arg0.size() );
        for ( CustomsClearanceResDto customsClearanceResDto : arg0 ) {
            list.add( dto2Entity( customsClearanceResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<CustomsClearanceResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( CustomsClearanceResDto customsClearanceResDto : arg0 ) {
            list.add( dto2Po( customsClearanceResDto ) );
        }

        return list;
    }

    @Override
    public List<CustomsClearanceResDto> entityList2DtoList(List<CustomsClearanceEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceResDto> list = new ArrayList<CustomsClearanceResDto>( arg0.size() );
        for ( CustomsClearanceEntity customsClearanceEntity : arg0 ) {
            list.add( entity2Dto( customsClearanceEntity ) );
        }

        return list;
    }

    @Override
    public List<CustomsClearanceResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceResDto> list = new ArrayList<CustomsClearanceResDto>( arg0.size() );
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
