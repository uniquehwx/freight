package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.PlayBoardOrderEntity;
import com.bizcenter.freight.dto.req.PlayBoardOrderReqDto;
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
    public String dto2Po(PlayBoardOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
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
    public PlayBoardOrderReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayBoardOrderReqDto playBoardOrderReqDto = new PlayBoardOrderReqDto();

        return playBoardOrderReqDto;
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
    public List<String> dtoList2PoList(List<PlayBoardOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
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
    public List<PlayBoardOrderReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<PlayBoardOrderReqDto> list = new ArrayList<PlayBoardOrderReqDto>( arg0.size() );
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
