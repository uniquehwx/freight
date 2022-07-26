package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.SecurityOrderEntity;
import com.bizcenter.freight.dto.res.SecurityOrderResDto;
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
    public SecurityOrderPo dto2Po(SecurityOrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderPo securityOrderPo = new SecurityOrderPo();

        securityOrderPo.setId( arg0.getId() );
        securityOrderPo.setCreateUserId( arg0.getCreateUserId() );
        securityOrderPo.setCreateUserName( arg0.getCreateUserName() );
        securityOrderPo.setCreateTime( arg0.getCreateTime() );
        securityOrderPo.setModifyUserId( arg0.getModifyUserId() );
        securityOrderPo.setModifyUserName( arg0.getModifyUserName() );
        securityOrderPo.setModifyTime( arg0.getModifyTime() );
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
    public SecurityOrderResDto po2Dto(SecurityOrderPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SecurityOrderResDto securityOrderResDto = new SecurityOrderResDto();

        securityOrderResDto.setId( arg0.getId() );
        securityOrderResDto.setModifyTime( arg0.getModifyTime() );
        securityOrderResDto.setModifyUserName( arg0.getModifyUserName() );
        securityOrderResDto.setModifyUserId( arg0.getModifyUserId() );
        securityOrderResDto.setCreateTime( arg0.getCreateTime() );
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
    public List<SecurityOrderPo> dtoList2PoList(List<SecurityOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderPo> list = new ArrayList<SecurityOrderPo>( arg0.size() );
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
    public List<SecurityOrderResDto> poList2DtoList(List<SecurityOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SecurityOrderResDto> list = new ArrayList<SecurityOrderResDto>( arg0.size() );
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
