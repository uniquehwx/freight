package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.PlayBoardOrderEntity;
import com.bizcenter.freight.dto.req.PlayBoardOrderReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.PlayBoardOrderPo;
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
public class PlayBoardOrderReqDtoConvertorImpl extends PlayBoardOrderReqDtoConvertor {

    @Override
    public PlayBoardOrderEntity dto2Entity(PlayBoardOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayBoardOrderEntity playBoardOrderEntity = new PlayBoardOrderEntity();

        playBoardOrderEntity.setIsvId( arg0.getIsvId() );
        playBoardOrderEntity.setCreateRealName( arg0.getCreateRealName() );
        playBoardOrderEntity.setModifyRealName( arg0.getModifyRealName() );
        playBoardOrderEntity.setPlayBoardNo( arg0.getPlayBoardNo() );
        playBoardOrderEntity.setCustomerNo( arg0.getCustomerNo() );
        playBoardOrderEntity.setFlightNumber( arg0.getFlightNumber() );
        playBoardOrderEntity.setCustomerCode( arg0.getCustomerCode() );
        playBoardOrderEntity.setCustomerName( arg0.getCustomerName() );
        playBoardOrderEntity.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        playBoardOrderEntity.setFinancialOrgName( arg0.getFinancialOrgName() );
        playBoardOrderEntity.setCustomerContacts( arg0.getCustomerContacts() );
        playBoardOrderEntity.setCustomerPhone( arg0.getCustomerPhone() );
        playBoardOrderEntity.setBusType( arg0.getBusType() );
        playBoardOrderEntity.setWeight( arg0.getWeight() );
        playBoardOrderEntity.setVolume( arg0.getVolume() );
        playBoardOrderEntity.setQuantity( arg0.getQuantity() );
        playBoardOrderEntity.setZhName( arg0.getZhName() );
        playBoardOrderEntity.setGoodsStation( arg0.getGoodsStation() );
        playBoardOrderEntity.setOrderSource( arg0.getOrderSource() );
        playBoardOrderEntity.setOrderNo( arg0.getOrderNo() );
        playBoardOrderEntity.setInStationTime( arg0.getInStationTime() );
        playBoardOrderEntity.setPlayBoardTime( arg0.getPlayBoardTime() );
        playBoardOrderEntity.setStatus( arg0.getStatus() );
        playBoardOrderEntity.setRemark( arg0.getRemark() );
        playBoardOrderEntity.setUserDef1( arg0.getUserDef1() );
        playBoardOrderEntity.setUserDef2( arg0.getUserDef2() );
        playBoardOrderEntity.setDepartureDate( arg0.getDepartureDate() );
        playBoardOrderEntity.setType( arg0.getType() );
        playBoardOrderEntity.setOrderOutNo( arg0.getOrderOutNo() );
        playBoardOrderEntity.setDepartCode( arg0.getDepartCode() );
        playBoardOrderEntity.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        playBoardOrderEntity.setInitCreatDepart( arg0.getInitCreatDepart() );
        playBoardOrderEntity.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return playBoardOrderEntity;
    }

    @Override
    public PlayBoardOrderPo dto2Po(PlayBoardOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayBoardOrderPo playBoardOrderPo = new PlayBoardOrderPo();

        playBoardOrderPo.setAppId( arg0.getAppId() );
        playBoardOrderPo.setTenantId( arg0.getTenantId() );
        playBoardOrderPo.setIsvId( arg0.getIsvId() );
        playBoardOrderPo.setCreateRealName( arg0.getCreateRealName() );
        playBoardOrderPo.setModifyRealName( arg0.getModifyRealName() );
        playBoardOrderPo.setPlayBoardNo( arg0.getPlayBoardNo() );
        playBoardOrderPo.setCustomerNo( arg0.getCustomerNo() );
        playBoardOrderPo.setFlightNumber( arg0.getFlightNumber() );
        playBoardOrderPo.setCustomerCode( arg0.getCustomerCode() );
        playBoardOrderPo.setCustomerName( arg0.getCustomerName() );
        playBoardOrderPo.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        playBoardOrderPo.setFinancialOrgName( arg0.getFinancialOrgName() );
        playBoardOrderPo.setCustomerContacts( arg0.getCustomerContacts() );
        playBoardOrderPo.setCustomerPhone( arg0.getCustomerPhone() );
        playBoardOrderPo.setBusType( arg0.getBusType() );
        playBoardOrderPo.setWeight( arg0.getWeight() );
        playBoardOrderPo.setVolume( arg0.getVolume() );
        playBoardOrderPo.setQuantity( arg0.getQuantity() );
        playBoardOrderPo.setZhName( arg0.getZhName() );
        playBoardOrderPo.setGoodsStation( arg0.getGoodsStation() );
        playBoardOrderPo.setOrderSource( arg0.getOrderSource() );
        playBoardOrderPo.setOrderNo( arg0.getOrderNo() );
        playBoardOrderPo.setInStationTime( arg0.getInStationTime() );
        playBoardOrderPo.setPlayBoardTime( arg0.getPlayBoardTime() );
        playBoardOrderPo.setStatus( arg0.getStatus() );
        playBoardOrderPo.setRemark( arg0.getRemark() );
        playBoardOrderPo.setUserDef1( arg0.getUserDef1() );
        playBoardOrderPo.setUserDef2( arg0.getUserDef2() );
        playBoardOrderPo.setDepartureDate( arg0.getDepartureDate() );
        playBoardOrderPo.setType( arg0.getType() );
        playBoardOrderPo.setOrderOutNo( arg0.getOrderOutNo() );
        playBoardOrderPo.setDepartCode( arg0.getDepartCode() );
        playBoardOrderPo.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        playBoardOrderPo.setInitCreatDepart( arg0.getInitCreatDepart() );
        playBoardOrderPo.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return playBoardOrderPo;
    }

    @Override
    public PlayBoardOrderReqDto entity2Dto(PlayBoardOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayBoardOrderReqDto playBoardOrderReqDto = new PlayBoardOrderReqDto();

        playBoardOrderReqDto.setIsvId( arg0.getIsvId() );
        playBoardOrderReqDto.setCreateRealName( arg0.getCreateRealName() );
        playBoardOrderReqDto.setModifyRealName( arg0.getModifyRealName() );
        playBoardOrderReqDto.setPlayBoardNo( arg0.getPlayBoardNo() );
        playBoardOrderReqDto.setCustomerNo( arg0.getCustomerNo() );
        playBoardOrderReqDto.setFlightNumber( arg0.getFlightNumber() );
        playBoardOrderReqDto.setCustomerCode( arg0.getCustomerCode() );
        playBoardOrderReqDto.setCustomerName( arg0.getCustomerName() );
        playBoardOrderReqDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        playBoardOrderReqDto.setFinancialOrgName( arg0.getFinancialOrgName() );
        playBoardOrderReqDto.setCustomerContacts( arg0.getCustomerContacts() );
        playBoardOrderReqDto.setCustomerPhone( arg0.getCustomerPhone() );
        playBoardOrderReqDto.setBusType( arg0.getBusType() );
        playBoardOrderReqDto.setWeight( arg0.getWeight() );
        playBoardOrderReqDto.setVolume( arg0.getVolume() );
        playBoardOrderReqDto.setQuantity( arg0.getQuantity() );
        playBoardOrderReqDto.setZhName( arg0.getZhName() );
        playBoardOrderReqDto.setGoodsStation( arg0.getGoodsStation() );
        playBoardOrderReqDto.setOrderSource( arg0.getOrderSource() );
        playBoardOrderReqDto.setOrderNo( arg0.getOrderNo() );
        playBoardOrderReqDto.setInStationTime( arg0.getInStationTime() );
        playBoardOrderReqDto.setPlayBoardTime( arg0.getPlayBoardTime() );
        playBoardOrderReqDto.setStatus( arg0.getStatus() );
        playBoardOrderReqDto.setRemark( arg0.getRemark() );
        playBoardOrderReqDto.setUserDef1( arg0.getUserDef1() );
        playBoardOrderReqDto.setUserDef2( arg0.getUserDef2() );
        playBoardOrderReqDto.setDepartureDate( arg0.getDepartureDate() );
        playBoardOrderReqDto.setType( arg0.getType() );
        playBoardOrderReqDto.setOrderOutNo( arg0.getOrderOutNo() );
        playBoardOrderReqDto.setDepartCode( arg0.getDepartCode() );
        playBoardOrderReqDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        playBoardOrderReqDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        playBoardOrderReqDto.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return playBoardOrderReqDto;
    }

    @Override
    public PlayBoardOrderReqDto po2Dto(PlayBoardOrderPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayBoardOrderReqDto playBoardOrderReqDto = new PlayBoardOrderReqDto();

        playBoardOrderReqDto.setTenantId( arg0.getTenantId() );
        playBoardOrderReqDto.setAppId( arg0.getAppId() );
        playBoardOrderReqDto.setIsvId( arg0.getIsvId() );
        playBoardOrderReqDto.setCreateRealName( arg0.getCreateRealName() );
        playBoardOrderReqDto.setModifyRealName( arg0.getModifyRealName() );
        playBoardOrderReqDto.setPlayBoardNo( arg0.getPlayBoardNo() );
        playBoardOrderReqDto.setCustomerNo( arg0.getCustomerNo() );
        playBoardOrderReqDto.setFlightNumber( arg0.getFlightNumber() );
        playBoardOrderReqDto.setCustomerCode( arg0.getCustomerCode() );
        playBoardOrderReqDto.setCustomerName( arg0.getCustomerName() );
        playBoardOrderReqDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        playBoardOrderReqDto.setFinancialOrgName( arg0.getFinancialOrgName() );
        playBoardOrderReqDto.setCustomerContacts( arg0.getCustomerContacts() );
        playBoardOrderReqDto.setCustomerPhone( arg0.getCustomerPhone() );
        playBoardOrderReqDto.setBusType( arg0.getBusType() );
        playBoardOrderReqDto.setWeight( arg0.getWeight() );
        playBoardOrderReqDto.setVolume( arg0.getVolume() );
        playBoardOrderReqDto.setQuantity( arg0.getQuantity() );
        playBoardOrderReqDto.setZhName( arg0.getZhName() );
        playBoardOrderReqDto.setGoodsStation( arg0.getGoodsStation() );
        playBoardOrderReqDto.setOrderSource( arg0.getOrderSource() );
        playBoardOrderReqDto.setOrderNo( arg0.getOrderNo() );
        playBoardOrderReqDto.setInStationTime( arg0.getInStationTime() );
        playBoardOrderReqDto.setPlayBoardTime( arg0.getPlayBoardTime() );
        playBoardOrderReqDto.setStatus( arg0.getStatus() );
        playBoardOrderReqDto.setRemark( arg0.getRemark() );
        playBoardOrderReqDto.setUserDef1( arg0.getUserDef1() );
        playBoardOrderReqDto.setUserDef2( arg0.getUserDef2() );
        playBoardOrderReqDto.setDepartureDate( arg0.getDepartureDate() );
        playBoardOrderReqDto.setType( arg0.getType() );
        playBoardOrderReqDto.setOrderOutNo( arg0.getOrderOutNo() );
        playBoardOrderReqDto.setDepartCode( arg0.getDepartCode() );
        playBoardOrderReqDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        playBoardOrderReqDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        playBoardOrderReqDto.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return playBoardOrderReqDto;
    }

    @Override
    public PlayBoardOrderEntity po2Entity(PlayBoardOrderPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayBoardOrderEntity playBoardOrderEntity = new PlayBoardOrderEntity();

        playBoardOrderEntity.setId( arg0.getId() );
        playBoardOrderEntity.setModifyUserName( arg0.getModifyUserName() );
        playBoardOrderEntity.setModifyUserId( arg0.getModifyUserId() );
        playBoardOrderEntity.setCreateUserName( arg0.getCreateUserName() );
        playBoardOrderEntity.setCreateUserId( arg0.getCreateUserId() );
        playBoardOrderEntity.setIsvId( arg0.getIsvId() );
        playBoardOrderEntity.setCreateRealName( arg0.getCreateRealName() );
        playBoardOrderEntity.setModifyRealName( arg0.getModifyRealName() );
        playBoardOrderEntity.setPlayBoardNo( arg0.getPlayBoardNo() );
        playBoardOrderEntity.setCustomerNo( arg0.getCustomerNo() );
        playBoardOrderEntity.setFlightNumber( arg0.getFlightNumber() );
        playBoardOrderEntity.setCustomerCode( arg0.getCustomerCode() );
        playBoardOrderEntity.setCustomerName( arg0.getCustomerName() );
        playBoardOrderEntity.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        playBoardOrderEntity.setFinancialOrgName( arg0.getFinancialOrgName() );
        playBoardOrderEntity.setCustomerContacts( arg0.getCustomerContacts() );
        playBoardOrderEntity.setCustomerPhone( arg0.getCustomerPhone() );
        playBoardOrderEntity.setBusType( arg0.getBusType() );
        playBoardOrderEntity.setWeight( arg0.getWeight() );
        playBoardOrderEntity.setVolume( arg0.getVolume() );
        playBoardOrderEntity.setQuantity( arg0.getQuantity() );
        playBoardOrderEntity.setZhName( arg0.getZhName() );
        playBoardOrderEntity.setGoodsStation( arg0.getGoodsStation() );
        playBoardOrderEntity.setOrderSource( arg0.getOrderSource() );
        playBoardOrderEntity.setOrderNo( arg0.getOrderNo() );
        playBoardOrderEntity.setInStationTime( arg0.getInStationTime() );
        playBoardOrderEntity.setPlayBoardTime( arg0.getPlayBoardTime() );
        playBoardOrderEntity.setStatus( arg0.getStatus() );
        playBoardOrderEntity.setRemark( arg0.getRemark() );
        playBoardOrderEntity.setUserDef1( arg0.getUserDef1() );
        playBoardOrderEntity.setUserDef2( arg0.getUserDef2() );
        playBoardOrderEntity.setDepartureDate( arg0.getDepartureDate() );
        playBoardOrderEntity.setType( arg0.getType() );
        playBoardOrderEntity.setOrderOutNo( arg0.getOrderOutNo() );
        playBoardOrderEntity.setDepartCode( arg0.getDepartCode() );
        playBoardOrderEntity.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        playBoardOrderEntity.setInitCreatDepart( arg0.getInitCreatDepart() );
        playBoardOrderEntity.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return playBoardOrderEntity;
    }

    @Override
    public PlayBoardOrderPo entity2Po(PlayBoardOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayBoardOrderPo playBoardOrderPo = new PlayBoardOrderPo();

        playBoardOrderPo.setId( arg0.getId() );
        playBoardOrderPo.setCreateUserId( arg0.getCreateUserId() );
        playBoardOrderPo.setCreateUserName( arg0.getCreateUserName() );
        playBoardOrderPo.setModifyUserId( arg0.getModifyUserId() );
        playBoardOrderPo.setModifyUserName( arg0.getModifyUserName() );
        playBoardOrderPo.setIsvId( arg0.getIsvId() );
        playBoardOrderPo.setCreateRealName( arg0.getCreateRealName() );
        playBoardOrderPo.setModifyRealName( arg0.getModifyRealName() );
        playBoardOrderPo.setPlayBoardNo( arg0.getPlayBoardNo() );
        playBoardOrderPo.setCustomerNo( arg0.getCustomerNo() );
        playBoardOrderPo.setFlightNumber( arg0.getFlightNumber() );
        playBoardOrderPo.setCustomerCode( arg0.getCustomerCode() );
        playBoardOrderPo.setCustomerName( arg0.getCustomerName() );
        playBoardOrderPo.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        playBoardOrderPo.setFinancialOrgName( arg0.getFinancialOrgName() );
        playBoardOrderPo.setCustomerContacts( arg0.getCustomerContacts() );
        playBoardOrderPo.setCustomerPhone( arg0.getCustomerPhone() );
        playBoardOrderPo.setBusType( arg0.getBusType() );
        playBoardOrderPo.setWeight( arg0.getWeight() );
        playBoardOrderPo.setVolume( arg0.getVolume() );
        playBoardOrderPo.setQuantity( arg0.getQuantity() );
        playBoardOrderPo.setZhName( arg0.getZhName() );
        playBoardOrderPo.setGoodsStation( arg0.getGoodsStation() );
        playBoardOrderPo.setOrderSource( arg0.getOrderSource() );
        playBoardOrderPo.setOrderNo( arg0.getOrderNo() );
        playBoardOrderPo.setInStationTime( arg0.getInStationTime() );
        playBoardOrderPo.setPlayBoardTime( arg0.getPlayBoardTime() );
        playBoardOrderPo.setStatus( arg0.getStatus() );
        playBoardOrderPo.setRemark( arg0.getRemark() );
        playBoardOrderPo.setUserDef1( arg0.getUserDef1() );
        playBoardOrderPo.setUserDef2( arg0.getUserDef2() );
        playBoardOrderPo.setDepartureDate( arg0.getDepartureDate() );
        playBoardOrderPo.setType( arg0.getType() );
        playBoardOrderPo.setOrderOutNo( arg0.getOrderOutNo() );
        playBoardOrderPo.setDepartCode( arg0.getDepartCode() );
        playBoardOrderPo.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        playBoardOrderPo.setInitCreatDepart( arg0.getInitCreatDepart() );
        playBoardOrderPo.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return playBoardOrderPo;
    }

    @Override
    public List<PlayBoardOrderEntity> dtoList2EntityList(List<PlayBoardOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderEntity> list = new ArrayList<PlayBoardOrderEntity>( arg0.size() );
        for ( PlayBoardOrderReqDto playBoardOrderReqDto : arg0 ) {
            list.add( dto2Entity( playBoardOrderReqDto ) );
        }

        return list;
    }

    @Override
    public List<PlayBoardOrderPo> dtoList2PoList(List<PlayBoardOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderPo> list = new ArrayList<PlayBoardOrderPo>( arg0.size() );
        for ( PlayBoardOrderReqDto playBoardOrderReqDto : arg0 ) {
            list.add( dto2Po( playBoardOrderReqDto ) );
        }

        return list;
    }

    @Override
    public List<PlayBoardOrderReqDto> entityList2DtoList(List<PlayBoardOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderReqDto> list = new ArrayList<PlayBoardOrderReqDto>( arg0.size() );
        for ( PlayBoardOrderEntity playBoardOrderEntity : arg0 ) {
            list.add( entity2Dto( playBoardOrderEntity ) );
        }

        return list;
    }

    @Override
    public List<PlayBoardOrderReqDto> poList2DtoList(List<PlayBoardOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderReqDto> list = new ArrayList<PlayBoardOrderReqDto>( arg0.size() );
        for ( PlayBoardOrderPo playBoardOrderPo : arg0 ) {
            list.add( po2Dto( playBoardOrderPo ) );
        }

        return list;
    }

    @Override
    public List<PlayBoardOrderEntity> poList2EntityList(List<PlayBoardOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderEntity> list = new ArrayList<PlayBoardOrderEntity>( arg0.size() );
        for ( PlayBoardOrderPo playBoardOrderPo : arg0 ) {
            list.add( po2Entity( playBoardOrderPo ) );
        }

        return list;
    }

    @Override
    public List<PlayBoardOrderPo> entityList2PoList(List<PlayBoardOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderPo> list = new ArrayList<PlayBoardOrderPo>( arg0.size() );
        for ( PlayBoardOrderEntity playBoardOrderEntity : arg0 ) {
            list.add( entity2Po( playBoardOrderEntity ) );
        }

        return list;
    }
}
