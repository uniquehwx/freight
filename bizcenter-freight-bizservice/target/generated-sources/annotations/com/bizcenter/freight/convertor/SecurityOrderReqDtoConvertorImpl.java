package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.SecurityOrderEntity;
import com.bizcenter.freight.dto.req.SecurityOrderReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.SecurityOrderPo;
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
    public SecurityOrderPo dto2Po(SecurityOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderPo securityOrderPo = new SecurityOrderPo();

        securityOrderPo.setAppId( arg0.getAppId() );
        securityOrderPo.setTenantId( arg0.getTenantId() );
        securityOrderPo.setIsvId( arg0.getIsvId() );
        securityOrderPo.setCreateRealName( arg0.getCreateRealName() );
        securityOrderPo.setModifyRealName( arg0.getModifyRealName() );
        securityOrderPo.setPlayBoardNo( arg0.getPlayBoardNo() );
        securityOrderPo.setCustomerNo( arg0.getCustomerNo() );
        securityOrderPo.setFlightNumber( arg0.getFlightNumber() );
        securityOrderPo.setCustomerCode( arg0.getCustomerCode() );
        securityOrderPo.setCustomerName( arg0.getCustomerName() );
        securityOrderPo.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        securityOrderPo.setFinancialOrgName( arg0.getFinancialOrgName() );
        securityOrderPo.setCustomerContacts( arg0.getCustomerContacts() );
        securityOrderPo.setCustomerPhone( arg0.getCustomerPhone() );
        securityOrderPo.setBusType( arg0.getBusType() );
        securityOrderPo.setWeight( arg0.getWeight() );
        securityOrderPo.setVolume( arg0.getVolume() );
        securityOrderPo.setQuantity( arg0.getQuantity() );
        securityOrderPo.setZhName( arg0.getZhName() );
        securityOrderPo.setGoodsStation( arg0.getGoodsStation() );
        securityOrderPo.setOrderSource( arg0.getOrderSource() );
        securityOrderPo.setOrderNo( arg0.getOrderNo() );
        securityOrderPo.setInStationTime( arg0.getInStationTime() );
        securityOrderPo.setPlayBoardTime( arg0.getPlayBoardTime() );
        securityOrderPo.setStatus( arg0.getStatus() );
        securityOrderPo.setRemark( arg0.getRemark() );
        securityOrderPo.setUserDef1( arg0.getUserDef1() );
        securityOrderPo.setUserDef2( arg0.getUserDef2() );
        securityOrderPo.setDepartureDate( arg0.getDepartureDate() );
        securityOrderPo.setType( arg0.getType() );
        securityOrderPo.setOrderOutNo( arg0.getOrderOutNo() );
        securityOrderPo.setDepartCode( arg0.getDepartCode() );
        securityOrderPo.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        securityOrderPo.setInitCreatDepart( arg0.getInitCreatDepart() );
        securityOrderPo.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return securityOrderPo;
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
    public SecurityOrderReqDto po2Dto(SecurityOrderPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderReqDto securityOrderReqDto = new SecurityOrderReqDto();

        securityOrderReqDto.setTenantId( arg0.getTenantId() );
        securityOrderReqDto.setAppId( arg0.getAppId() );
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
    public SecurityOrderEntity po2Entity(SecurityOrderPo arg0) {
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
    public SecurityOrderPo entity2Po(SecurityOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderPo securityOrderPo = new SecurityOrderPo();

        securityOrderPo.setId( arg0.getId() );
        securityOrderPo.setCreateUserId( arg0.getCreateUserId() );
        securityOrderPo.setCreateUserName( arg0.getCreateUserName() );
        securityOrderPo.setModifyUserId( arg0.getModifyUserId() );
        securityOrderPo.setModifyUserName( arg0.getModifyUserName() );
        securityOrderPo.setIsvId( arg0.getIsvId() );
        securityOrderPo.setCreateRealName( arg0.getCreateRealName() );
        securityOrderPo.setModifyRealName( arg0.getModifyRealName() );
        securityOrderPo.setPlayBoardNo( arg0.getPlayBoardNo() );
        securityOrderPo.setCustomerNo( arg0.getCustomerNo() );
        securityOrderPo.setFlightNumber( arg0.getFlightNumber() );
        securityOrderPo.setCustomerCode( arg0.getCustomerCode() );
        securityOrderPo.setCustomerName( arg0.getCustomerName() );
        securityOrderPo.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        securityOrderPo.setFinancialOrgName( arg0.getFinancialOrgName() );
        securityOrderPo.setCustomerContacts( arg0.getCustomerContacts() );
        securityOrderPo.setCustomerPhone( arg0.getCustomerPhone() );
        securityOrderPo.setBusType( arg0.getBusType() );
        securityOrderPo.setWeight( arg0.getWeight() );
        securityOrderPo.setVolume( arg0.getVolume() );
        securityOrderPo.setQuantity( arg0.getQuantity() );
        securityOrderPo.setZhName( arg0.getZhName() );
        securityOrderPo.setGoodsStation( arg0.getGoodsStation() );
        securityOrderPo.setOrderSource( arg0.getOrderSource() );
        securityOrderPo.setOrderNo( arg0.getOrderNo() );
        securityOrderPo.setInStationTime( arg0.getInStationTime() );
        securityOrderPo.setPlayBoardTime( arg0.getPlayBoardTime() );
        securityOrderPo.setStatus( arg0.getStatus() );
        securityOrderPo.setRemark( arg0.getRemark() );
        securityOrderPo.setUserDef1( arg0.getUserDef1() );
        securityOrderPo.setUserDef2( arg0.getUserDef2() );
        securityOrderPo.setDepartureDate( arg0.getDepartureDate() );
        securityOrderPo.setType( arg0.getType() );
        securityOrderPo.setOrderOutNo( arg0.getOrderOutNo() );
        securityOrderPo.setDepartCode( arg0.getDepartCode() );
        securityOrderPo.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        securityOrderPo.setInitCreatDepart( arg0.getInitCreatDepart() );
        securityOrderPo.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return securityOrderPo;
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
    public List<SecurityOrderPo> dtoList2PoList(List<SecurityOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderPo> list = new ArrayList<SecurityOrderPo>( arg0.size() );
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
    public List<SecurityOrderReqDto> poList2DtoList(List<SecurityOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderReqDto> list = new ArrayList<SecurityOrderReqDto>( arg0.size() );
        for ( SecurityOrderPo securityOrderPo : arg0 ) {
            list.add( po2Dto( securityOrderPo ) );
        }

        return list;
    }

    @Override
    public List<SecurityOrderEntity> poList2EntityList(List<SecurityOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderEntity> list = new ArrayList<SecurityOrderEntity>( arg0.size() );
        for ( SecurityOrderPo securityOrderPo : arg0 ) {
            list.add( po2Entity( securityOrderPo ) );
        }

        return list;
    }

    @Override
    public List<SecurityOrderPo> entityList2PoList(List<SecurityOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderPo> list = new ArrayList<SecurityOrderPo>( arg0.size() );
        for ( SecurityOrderEntity securityOrderEntity : arg0 ) {
            list.add( entity2Po( securityOrderEntity ) );
        }

        return list;
    }
}
