package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.PlayBoardOrderEntity;
import com.bizcenter.freight.dto.res.PlayBoardOrderResDto;
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
public class PlayBoardOrderResDtoConvertorImpl extends PlayBoardOrderResDtoConvertor {

    @Override
    public PlayBoardOrderEntity dto2Entity(PlayBoardOrderResDto arg0) {
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
    public String dto2Po(PlayBoardOrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public PlayBoardOrderResDto entity2Dto(PlayBoardOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayBoardOrderResDto playBoardOrderResDto = new PlayBoardOrderResDto();

        playBoardOrderResDto.setId( arg0.getId() );
        playBoardOrderResDto.setModifyUserName( arg0.getModifyUserName() );
        playBoardOrderResDto.setModifyUserId( arg0.getModifyUserId() );
        playBoardOrderResDto.setCreateUserName( arg0.getCreateUserName() );
        playBoardOrderResDto.setCreateUserId( arg0.getCreateUserId() );
        playBoardOrderResDto.setIsvId( arg0.getIsvId() );
        playBoardOrderResDto.setCreateRealName( arg0.getCreateRealName() );
        playBoardOrderResDto.setModifyRealName( arg0.getModifyRealName() );
        playBoardOrderResDto.setPlayBoardNo( arg0.getPlayBoardNo() );
        playBoardOrderResDto.setCustomerNo( arg0.getCustomerNo() );
        playBoardOrderResDto.setFlightNumber( arg0.getFlightNumber() );
        playBoardOrderResDto.setCustomerCode( arg0.getCustomerCode() );
        playBoardOrderResDto.setCustomerName( arg0.getCustomerName() );
        playBoardOrderResDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        playBoardOrderResDto.setFinancialOrgName( arg0.getFinancialOrgName() );
        playBoardOrderResDto.setCustomerContacts( arg0.getCustomerContacts() );
        playBoardOrderResDto.setCustomerPhone( arg0.getCustomerPhone() );
        playBoardOrderResDto.setBusType( arg0.getBusType() );
        playBoardOrderResDto.setWeight( arg0.getWeight() );
        playBoardOrderResDto.setVolume( arg0.getVolume() );
        playBoardOrderResDto.setQuantity( arg0.getQuantity() );
        playBoardOrderResDto.setZhName( arg0.getZhName() );
        playBoardOrderResDto.setGoodsStation( arg0.getGoodsStation() );
        playBoardOrderResDto.setOrderSource( arg0.getOrderSource() );
        playBoardOrderResDto.setOrderNo( arg0.getOrderNo() );
        playBoardOrderResDto.setInStationTime( arg0.getInStationTime() );
        playBoardOrderResDto.setPlayBoardTime( arg0.getPlayBoardTime() );
        playBoardOrderResDto.setStatus( arg0.getStatus() );
        playBoardOrderResDto.setRemark( arg0.getRemark() );
        playBoardOrderResDto.setUserDef1( arg0.getUserDef1() );
        playBoardOrderResDto.setUserDef2( arg0.getUserDef2() );
        playBoardOrderResDto.setDepartureDate( arg0.getDepartureDate() );
        playBoardOrderResDto.setType( arg0.getType() );
        playBoardOrderResDto.setOrderOutNo( arg0.getOrderOutNo() );
        playBoardOrderResDto.setDepartCode( arg0.getDepartCode() );
        playBoardOrderResDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        playBoardOrderResDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        playBoardOrderResDto.setBookingBusinessNo( arg0.getBookingBusinessNo() );

        return playBoardOrderResDto;
    }

    @Override
    public PlayBoardOrderResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayBoardOrderResDto playBoardOrderResDto = new PlayBoardOrderResDto();

        return playBoardOrderResDto;
    }

    @Override
    public PlayBoardOrderEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayBoardOrderEntity playBoardOrderEntity = new PlayBoardOrderEntity();

        return playBoardOrderEntity;
    }

    @Override
    public String entity2Po(PlayBoardOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<PlayBoardOrderEntity> dtoList2EntityList(List<PlayBoardOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderEntity> list = new ArrayList<PlayBoardOrderEntity>( arg0.size() );
        for ( PlayBoardOrderResDto playBoardOrderResDto : arg0 ) {
            list.add( dto2Entity( playBoardOrderResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<PlayBoardOrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( PlayBoardOrderResDto playBoardOrderResDto : arg0 ) {
            list.add( dto2Po( playBoardOrderResDto ) );
        }

        return list;
    }

    @Override
    public List<PlayBoardOrderResDto> entityList2DtoList(List<PlayBoardOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderResDto> list = new ArrayList<PlayBoardOrderResDto>( arg0.size() );
        for ( PlayBoardOrderEntity playBoardOrderEntity : arg0 ) {
            list.add( entity2Dto( playBoardOrderEntity ) );
        }

        return list;
    }

    @Override
    public List<PlayBoardOrderResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderResDto> list = new ArrayList<PlayBoardOrderResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<PlayBoardOrderEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderEntity> list = new ArrayList<PlayBoardOrderEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<PlayBoardOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( PlayBoardOrderEntity playBoardOrderEntity : arg0 ) {
            list.add( entity2Po( playBoardOrderEntity ) );
        }

        return list;
    }
}
