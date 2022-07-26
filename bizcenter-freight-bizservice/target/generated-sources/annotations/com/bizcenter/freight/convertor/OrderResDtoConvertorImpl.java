package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.OrderEntity;
import com.bizcenter.freight.dto.res.OrderResDto;
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
public class OrderResDtoConvertorImpl extends OrderResDtoConvertor {

    @Override
    public OrderEntity dto2Entity(OrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setId( arg0.getId() );
        orderEntity.setOrderNo( arg0.getOrderNo() );
        orderEntity.setTradeType( arg0.getTradeType() );
        orderEntity.setCustomerCode( arg0.getCustomerCode() );
        orderEntity.setClientName( arg0.getClientName() );
        orderEntity.setClinetPhone( arg0.getClinetPhone() );
        orderEntity.setOutOrderNo( arg0.getOutOrderNo() );
        orderEntity.setOrderType( arg0.getOrderType() );
        orderEntity.setTradeStatus( arg0.getTradeStatus() );
        orderEntity.setSupllierCode( arg0.getSupllierCode() );
        orderEntity.setStartPointCode( arg0.getStartPointCode() );
        orderEntity.setEndPointCode( arg0.getEndPointCode() );
        orderEntity.setRemark( arg0.getRemark() );
        orderEntity.setCreateUserId( arg0.getCreateUserId() );
        orderEntity.setCreateUserName( arg0.getCreateUserName() );
        orderEntity.setModifyUserId( arg0.getModifyUserId() );
        orderEntity.setModifyUserName( arg0.getModifyUserName() );
        orderEntity.setExtData( arg0.getExtData() );
        orderEntity.setBusinessType( arg0.getBusinessType() );
        orderEntity.setCompletionTime( arg0.getCompletionTime() );
        orderEntity.setSalesClerkCode( arg0.getSalesClerkCode() );

        return orderEntity;
    }

    @Override
    public String dto2Po(OrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public OrderResDto entity2Dto(OrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OrderResDto orderResDto = new OrderResDto();

        orderResDto.setId( arg0.getId() );
        orderResDto.setOrderNo( arg0.getOrderNo() );
        orderResDto.setTradeType( arg0.getTradeType() );
        orderResDto.setCustomerCode( arg0.getCustomerCode() );
        orderResDto.setClientName( arg0.getClientName() );
        orderResDto.setClinetPhone( arg0.getClinetPhone() );
        orderResDto.setOutOrderNo( arg0.getOutOrderNo() );
        orderResDto.setOrderType( arg0.getOrderType() );
        orderResDto.setTradeStatus( arg0.getTradeStatus() );
        orderResDto.setSupllierCode( arg0.getSupllierCode() );
        orderResDto.setStartPointCode( arg0.getStartPointCode() );
        orderResDto.setEndPointCode( arg0.getEndPointCode() );
        orderResDto.setRemark( arg0.getRemark() );
        orderResDto.setCreateUserId( arg0.getCreateUserId() );
        orderResDto.setCreateUserName( arg0.getCreateUserName() );
        orderResDto.setModifyUserId( arg0.getModifyUserId() );
        orderResDto.setModifyUserName( arg0.getModifyUserName() );
        orderResDto.setExtData( arg0.getExtData() );
        orderResDto.setBusinessType( arg0.getBusinessType() );
        orderResDto.setCompletionTime( arg0.getCompletionTime() );
        orderResDto.setSalesClerkCode( arg0.getSalesClerkCode() );

        return orderResDto;
    }

    @Override
    public OrderResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OrderResDto orderResDto = new OrderResDto();

        return orderResDto;
    }

    @Override
    public OrderEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();

        return orderEntity;
    }

    @Override
    public String entity2Po(OrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<OrderEntity> dtoList2EntityList(List<OrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderEntity> list = new ArrayList<OrderEntity>( arg0.size() );
        for ( OrderResDto orderResDto : arg0 ) {
            list.add( dto2Entity( orderResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<OrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( OrderResDto orderResDto : arg0 ) {
            list.add( dto2Po( orderResDto ) );
        }

        return list;
    }

    @Override
    public List<OrderResDto> entityList2DtoList(List<OrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderResDto> list = new ArrayList<OrderResDto>( arg0.size() );
        for ( OrderEntity orderEntity : arg0 ) {
            list.add( entity2Dto( orderEntity ) );
        }

        return list;
    }

    @Override
    public List<OrderResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderResDto> list = new ArrayList<OrderResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<OrderEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderEntity> list = new ArrayList<OrderEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<OrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( OrderEntity orderEntity : arg0 ) {
            list.add( entity2Po( orderEntity ) );
        }

        return list;
    }
}
