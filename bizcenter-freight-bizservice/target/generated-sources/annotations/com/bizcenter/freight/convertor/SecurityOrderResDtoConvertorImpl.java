package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.SecurityOrderEntity;
import com.bizcenter.freight.dto.res.SecurityOrderResDto;
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
public class SecurityOrderResDtoConvertorImpl extends SecurityOrderResDtoConvertor {

    @Override
    public SecurityOrderEntity dto2Entity(SecurityOrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderEntity securityOrderEntity = new SecurityOrderEntity();

        securityOrderEntity.setId( arg0.getId() );
        securityOrderEntity.setModifyUserName( arg0.getModifyUserName() );
        securityOrderEntity.setModifyUserId( arg0.getModifyUserId() );
        securityOrderEntity.setCreateUserName( arg0.getCreateUserName() );
        securityOrderEntity.setCreateUserId( arg0.getCreateUserId() );
        securityOrderEntity.setIsvId( arg0.getIsvId() );
        securityOrderEntity.setCreateRealName( arg0.getCreateRealName() );
        securityOrderEntity.setModifyRealName( arg0.getModifyRealName() );
        securityOrderEntity.setPlayBoardNo( arg0.getPlayBoardNo() );
        securityOrderEntity.setCustomerNo( arg0.getCustomerNo() );
        securityOrderEntity.setFlightNumber( arg0.getFlightNumber() );
        securityOrderEntity.setCustomerCode( arg0.getCustomerCode() );
        securityOrderEntity.setCustomerName( arg0.getCustomerName() );
        securityOrderEntity.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        securityOrderEntity.setFinancialOrgName( arg0.getFinancialOrgName() );
        securityOrderEntity.setCustomerContacts( arg0.getCustomerContacts() );
        securityOrderEntity.setCustomerPhone( arg0.getCustomerPhone() );
        securityOrderEntity.setBusType( arg0.getBusType() );
        securityOrderEntity.setWeight( arg0.getWeight() );
        securityOrderEntity.setVolume( arg0.getVolume() );
        securityOrderEntity.setQuantity( arg0.getQuantity() );
        securityOrderEntity.setZhName( arg0.getZhName() );
        securityOrderEntity.setGoodsStation( arg0.getGoodsStation() );
        securityOrderEntity.setOrderSource( arg0.getOrderSource() );
        securityOrderEntity.setOrderNo( arg0.getOrderNo() );
        securityOrderEntity.setInStationTime( arg0.getInStationTime() );
        securityOrderEntity.setPlayBoardTime( arg0.getPlayBoardTime() );
        securityOrderEntity.setStatus( arg0.getStatus() );
        securityOrderEntity.setRemark( arg0.getRemark() );
        securityOrderEntity.setUserDef1( arg0.getUserDef1() );
        securityOrderEntity.setUserDef2( arg0.getUserDef2() );
        securityOrderEntity.setDepartureDate( arg0.getDepartureDate() );
        securityOrderEntity.setType( arg0.getType() );
        securityOrderEntity.setOrderOutNo( arg0.getOrderOutNo() );
        securityOrderEntity.setDepartCode( arg0.getDepartCode() );
        securityOrderEntity.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        securityOrderEntity.setInitCreatDepart( arg0.getInitCreatDepart() );
        securityOrderEntity.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return securityOrderEntity;
    }

    @Override
    public String dto2Po(SecurityOrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public SecurityOrderResDto entity2Dto(SecurityOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderResDto securityOrderResDto = new SecurityOrderResDto();

        securityOrderResDto.setId( arg0.getId() );
        securityOrderResDto.setModifyUserName( arg0.getModifyUserName() );
        securityOrderResDto.setModifyUserId( arg0.getModifyUserId() );
        securityOrderResDto.setCreateUserName( arg0.getCreateUserName() );
        securityOrderResDto.setCreateUserId( arg0.getCreateUserId() );
        securityOrderResDto.setIsvId( arg0.getIsvId() );
        securityOrderResDto.setCreateRealName( arg0.getCreateRealName() );
        securityOrderResDto.setModifyRealName( arg0.getModifyRealName() );
        securityOrderResDto.setPlayBoardNo( arg0.getPlayBoardNo() );
        securityOrderResDto.setCustomerNo( arg0.getCustomerNo() );
        securityOrderResDto.setFlightNumber( arg0.getFlightNumber() );
        securityOrderResDto.setCustomerCode( arg0.getCustomerCode() );
        securityOrderResDto.setCustomerName( arg0.getCustomerName() );
        securityOrderResDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        securityOrderResDto.setFinancialOrgName( arg0.getFinancialOrgName() );
        securityOrderResDto.setCustomerContacts( arg0.getCustomerContacts() );
        securityOrderResDto.setCustomerPhone( arg0.getCustomerPhone() );
        securityOrderResDto.setBusType( arg0.getBusType() );
        securityOrderResDto.setWeight( arg0.getWeight() );
        securityOrderResDto.setVolume( arg0.getVolume() );
        securityOrderResDto.setQuantity( arg0.getQuantity() );
        securityOrderResDto.setZhName( arg0.getZhName() );
        securityOrderResDto.setGoodsStation( arg0.getGoodsStation() );
        securityOrderResDto.setOrderSource( arg0.getOrderSource() );
        securityOrderResDto.setOrderNo( arg0.getOrderNo() );
        securityOrderResDto.setInStationTime( arg0.getInStationTime() );
        securityOrderResDto.setPlayBoardTime( arg0.getPlayBoardTime() );
        securityOrderResDto.setStatus( arg0.getStatus() );
        securityOrderResDto.setRemark( arg0.getRemark() );
        securityOrderResDto.setUserDef1( arg0.getUserDef1() );
        securityOrderResDto.setUserDef2( arg0.getUserDef2() );
        securityOrderResDto.setDepartureDate( arg0.getDepartureDate() );
        securityOrderResDto.setType( arg0.getType() );
        securityOrderResDto.setOrderOutNo( arg0.getOrderOutNo() );
        securityOrderResDto.setDepartCode( arg0.getDepartCode() );
        securityOrderResDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        securityOrderResDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        securityOrderResDto.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return securityOrderResDto;
    }

    @Override
    public SecurityOrderResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderResDto securityOrderResDto = new SecurityOrderResDto();

        return securityOrderResDto;
    }

    @Override
    public SecurityOrderEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderEntity securityOrderEntity = new SecurityOrderEntity();

        return securityOrderEntity;
    }

    @Override
    public String entity2Po(SecurityOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<SecurityOrderEntity> dtoList2EntityList(List<SecurityOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderEntity> list = new ArrayList<SecurityOrderEntity>( arg0.size() );
        for ( SecurityOrderResDto securityOrderResDto : arg0 ) {
            list.add( dto2Entity( securityOrderResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<SecurityOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( SecurityOrderResDto securityOrderResDto : arg0 ) {
            list.add( dto2Po( securityOrderResDto ) );
        }

        return list;
    }

    @Override
    public List<SecurityOrderResDto> entityList2DtoList(List<SecurityOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderResDto> list = new ArrayList<SecurityOrderResDto>( arg0.size() );
        for ( SecurityOrderEntity securityOrderEntity : arg0 ) {
            list.add( entity2Dto( securityOrderEntity ) );
        }

        return list;
    }

    @Override
    public List<SecurityOrderResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderResDto> list = new ArrayList<SecurityOrderResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<SecurityOrderEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderEntity> list = new ArrayList<SecurityOrderEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<SecurityOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( SecurityOrderEntity securityOrderEntity : arg0 ) {
            list.add( entity2Po( securityOrderEntity ) );
        }

        return list;
    }
}
