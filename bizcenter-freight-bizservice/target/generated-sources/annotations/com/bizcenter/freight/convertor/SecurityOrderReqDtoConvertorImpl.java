package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.SecurityOrderEntity;
import com.bizcenter.freight.dto.req.SecurityOrderReqDto;
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
public class SecurityOrderReqDtoConvertorImpl extends SecurityOrderReqDtoConvertor {

    @Override
    public SecurityOrderEntity dto2Entity(SecurityOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderEntity securityOrderEntity = new SecurityOrderEntity();

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
    public String dto2Po(SecurityOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public SecurityOrderReqDto entity2Dto(SecurityOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderReqDto securityOrderReqDto = new SecurityOrderReqDto();

        securityOrderReqDto.setIsvId( arg0.getIsvId() );
        securityOrderReqDto.setCreateRealName( arg0.getCreateRealName() );
        securityOrderReqDto.setModifyRealName( arg0.getModifyRealName() );
        securityOrderReqDto.setPlayBoardNo( arg0.getPlayBoardNo() );
        securityOrderReqDto.setCustomerNo( arg0.getCustomerNo() );
        securityOrderReqDto.setFlightNumber( arg0.getFlightNumber() );
        securityOrderReqDto.setCustomerCode( arg0.getCustomerCode() );
        securityOrderReqDto.setCustomerName( arg0.getCustomerName() );
        securityOrderReqDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        securityOrderReqDto.setFinancialOrgName( arg0.getFinancialOrgName() );
        securityOrderReqDto.setCustomerContacts( arg0.getCustomerContacts() );
        securityOrderReqDto.setCustomerPhone( arg0.getCustomerPhone() );
        securityOrderReqDto.setBusType( arg0.getBusType() );
        securityOrderReqDto.setWeight( arg0.getWeight() );
        securityOrderReqDto.setVolume( arg0.getVolume() );
        securityOrderReqDto.setQuantity( arg0.getQuantity() );
        securityOrderReqDto.setZhName( arg0.getZhName() );
        securityOrderReqDto.setGoodsStation( arg0.getGoodsStation() );
        securityOrderReqDto.setOrderSource( arg0.getOrderSource() );
        securityOrderReqDto.setOrderNo( arg0.getOrderNo() );
        securityOrderReqDto.setInStationTime( arg0.getInStationTime() );
        securityOrderReqDto.setPlayBoardTime( arg0.getPlayBoardTime() );
        securityOrderReqDto.setStatus( arg0.getStatus() );
        securityOrderReqDto.setRemark( arg0.getRemark() );
        securityOrderReqDto.setUserDef1( arg0.getUserDef1() );
        securityOrderReqDto.setUserDef2( arg0.getUserDef2() );
        securityOrderReqDto.setDepartureDate( arg0.getDepartureDate() );
        securityOrderReqDto.setType( arg0.getType() );
        securityOrderReqDto.setOrderOutNo( arg0.getOrderOutNo() );
        securityOrderReqDto.setDepartCode( arg0.getDepartCode() );
        securityOrderReqDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        securityOrderReqDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        securityOrderReqDto.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return securityOrderReqDto;
    }

    @Override
    public SecurityOrderReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderReqDto securityOrderReqDto = new SecurityOrderReqDto();

        return securityOrderReqDto;
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
    public List<SecurityOrderEntity> dtoList2EntityList(List<SecurityOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderEntity> list = new ArrayList<SecurityOrderEntity>( arg0.size() );
        for ( SecurityOrderReqDto securityOrderReqDto : arg0 ) {
            list.add( dto2Entity( securityOrderReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<SecurityOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( SecurityOrderReqDto securityOrderReqDto : arg0 ) {
            list.add( dto2Po( securityOrderReqDto ) );
        }

        return list;
    }

    @Override
    public List<SecurityOrderReqDto> entityList2DtoList(List<SecurityOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderReqDto> list = new ArrayList<SecurityOrderReqDto>( arg0.size() );
        for ( SecurityOrderEntity securityOrderEntity : arg0 ) {
            list.add( entity2Dto( securityOrderEntity ) );
        }

        return list;
    }

    @Override
    public List<SecurityOrderReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderReqDto> list = new ArrayList<SecurityOrderReqDto>( arg0.size() );
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
