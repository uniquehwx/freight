package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.OrderEntity;
import com.bizcenter.freight.dto.res.OrderResDto;
import com.bizcenter.freight.infrastructure.persistence.po.OrderPo;
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
    public OrderPo dto2Po(OrderResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OrderPo orderPo = new OrderPo();

        orderPo.setId( arg0.getId() );
        orderPo.setCreateUserId( arg0.getCreateUserId() );
        orderPo.setCreateUserName( arg0.getCreateUserName() );
        orderPo.setCreateTime( arg0.getCreateTime() );
        orderPo.setModifyUserId( arg0.getModifyUserId() );
        orderPo.setModifyUserName( arg0.getModifyUserName() );
        orderPo.setModifyTime( arg0.getModifyTime() );
        orderPo.setOrderNo( arg0.getOrderNo() );
        orderPo.setTradeType( arg0.getTradeType() );
        orderPo.setCustomerCode( arg0.getCustomerCode() );
        orderPo.setClientName( arg0.getClientName() );
        orderPo.setClinetPhone( arg0.getClinetPhone() );
        orderPo.setOutOrderNo( arg0.getOutOrderNo() );
        orderPo.setOrderType( arg0.getOrderType() );
        orderPo.setTradeStatus( arg0.getTradeStatus() );
        orderPo.setSupllierCode( arg0.getSupllierCode() );
        orderPo.setStartPointCode( arg0.getStartPointCode() );
        orderPo.setEndPointCode( arg0.getEndPointCode() );
        orderPo.setRemark( arg0.getRemark() );
        orderPo.setExtData( arg0.getExtData() );
        orderPo.setBusinessType( arg0.getBusinessType() );
        orderPo.setCompletionTime( arg0.getCompletionTime() );
        orderPo.setSalesClerkCode( arg0.getSalesClerkCode() );

        return orderPo;
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
    public OrderResDto po2Dto(OrderPo arg0) {
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
        orderResDto.setCreateTime( arg0.getCreateTime() );
        orderResDto.setModifyUserId( arg0.getModifyUserId() );
        orderResDto.setModifyUserName( arg0.getModifyUserName() );
        orderResDto.setModifyTime( arg0.getModifyTime() );
        orderResDto.setExtData( arg0.getExtData() );
        orderResDto.setBusinessType( arg0.getBusinessType() );
        orderResDto.setCompletionTime( arg0.getCompletionTime() );
        orderResDto.setSalesClerkCode( arg0.getSalesClerkCode() );

        return orderResDto;
    }

    @Override
    public OrderEntity po2Entity(OrderPo arg0) {
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
    public OrderPo entity2Po(OrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OrderPo orderPo = new OrderPo();

        orderPo.setId( arg0.getId() );
        orderPo.setCreateUserId( arg0.getCreateUserId() );
        orderPo.setCreateUserName( arg0.getCreateUserName() );
        orderPo.setModifyUserId( arg0.getModifyUserId() );
        orderPo.setModifyUserName( arg0.getModifyUserName() );
        orderPo.setOrderNo( arg0.getOrderNo() );
        orderPo.setTradeType( arg0.getTradeType() );
        orderPo.setCustomerCode( arg0.getCustomerCode() );
        orderPo.setClientName( arg0.getClientName() );
        orderPo.setClinetPhone( arg0.getClinetPhone() );
        orderPo.setOutOrderNo( arg0.getOutOrderNo() );
        orderPo.setOrderType( arg0.getOrderType() );
        orderPo.setTradeStatus( arg0.getTradeStatus() );
        orderPo.setSupllierCode( arg0.getSupllierCode() );
        orderPo.setStartPointCode( arg0.getStartPointCode() );
        orderPo.setEndPointCode( arg0.getEndPointCode() );
        orderPo.setRemark( arg0.getRemark() );
        orderPo.setExtData( arg0.getExtData() );
        orderPo.setBusinessType( arg0.getBusinessType() );
        orderPo.setCompletionTime( arg0.getCompletionTime() );
        orderPo.setSalesClerkCode( arg0.getSalesClerkCode() );

        return orderPo;
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
    public List<OrderPo> dtoList2PoList(List<OrderResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderPo> list = new ArrayList<OrderPo>( arg0.size() );
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
    public List<OrderResDto> poList2DtoList(List<OrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderResDto> list = new ArrayList<OrderResDto>( arg0.size() );
        for ( OrderPo orderPo : arg0 ) {
            list.add( po2Dto( orderPo ) );
        }

        return list;
    }

    @Override
    public List<OrderEntity> poList2EntityList(List<OrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderEntity> list = new ArrayList<OrderEntity>( arg0.size() );
        for ( OrderPo orderPo : arg0 ) {
            list.add( po2Entity( orderPo ) );
        }

        return list;
    }

    @Override
    public List<OrderPo> entityList2PoList(List<OrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderPo> list = new ArrayList<OrderPo>( arg0.size() );
        for ( OrderEntity orderEntity : arg0 ) {
            list.add( entity2Po( orderEntity ) );
        }

        return list;
    }
}
