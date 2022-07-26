package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.OrderEntity;
import com.bizcenter.freight.dto.req.OrderReqDto;
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
public class OrderReqDtoConvertorImpl extends OrderReqDtoConvertor {

    @Override
    public OrderEntity dto2Entity(OrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();

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
        orderEntity.setExtData( arg0.getExtData() );
        orderEntity.setBusinessType( arg0.getBusinessType() );
        orderEntity.setCompletionTime( arg0.getCompletionTime() );
        orderEntity.setSalesClerkCode( arg0.getSalesClerkCode() );

        return orderEntity;
    }

    @Override
    public String dto2Po(OrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public OrderReqDto entity2Dto(OrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OrderReqDto orderReqDto = new OrderReqDto();

        orderReqDto.setOrderNo( arg0.getOrderNo() );
        orderReqDto.setTradeType( arg0.getTradeType() );
        orderReqDto.setCustomerCode( arg0.getCustomerCode() );
        orderReqDto.setClientName( arg0.getClientName() );
        orderReqDto.setClinetPhone( arg0.getClinetPhone() );
        orderReqDto.setOutOrderNo( arg0.getOutOrderNo() );
        orderReqDto.setOrderType( arg0.getOrderType() );
        orderReqDto.setTradeStatus( arg0.getTradeStatus() );
        orderReqDto.setSupllierCode( arg0.getSupllierCode() );
        orderReqDto.setStartPointCode( arg0.getStartPointCode() );
        orderReqDto.setEndPointCode( arg0.getEndPointCode() );
        orderReqDto.setRemark( arg0.getRemark() );
        orderReqDto.setExtData( arg0.getExtData() );
        orderReqDto.setBusinessType( arg0.getBusinessType() );
        orderReqDto.setCompletionTime( arg0.getCompletionTime() );
        orderReqDto.setSalesClerkCode( arg0.getSalesClerkCode() );

        return orderReqDto;
    }

    @Override
    public OrderReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OrderReqDto orderReqDto = new OrderReqDto();

        return orderReqDto;
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
    public List<OrderEntity> dtoList2EntityList(List<OrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderEntity> list = new ArrayList<OrderEntity>( arg0.size() );
        for ( OrderReqDto orderReqDto : arg0 ) {
            list.add( dto2Entity( orderReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<OrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( OrderReqDto orderReqDto : arg0 ) {
            list.add( dto2Po( orderReqDto ) );
        }

        return list;
    }

    @Override
    public List<OrderReqDto> entityList2DtoList(List<OrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderReqDto> list = new ArrayList<OrderReqDto>( arg0.size() );
        for ( OrderEntity orderEntity : arg0 ) {
            list.add( entity2Dto( orderEntity ) );
        }

        return list;
    }

    @Override
    public List<OrderReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderReqDto> list = new ArrayList<OrderReqDto>( arg0.size() );
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
