package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.OrderEntity;
import com.bizcenter.freight.dto.req.OrderReqDto;
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
    public OrderPo dto2Po(OrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OrderPo orderPo = new OrderPo();

        orderPo.setAppId( arg0.getAppId() );
        orderPo.setTenantId( arg0.getTenantId() );
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
    public OrderReqDto po2Dto(OrderPo arg0) {
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
        orderReqDto.setAppId( arg0.getAppId() );
        orderReqDto.setTenantId( arg0.getTenantId() );
        orderReqDto.setExtData( arg0.getExtData() );
        orderReqDto.setBusinessType( arg0.getBusinessType() );
        orderReqDto.setCompletionTime( arg0.getCompletionTime() );
        orderReqDto.setSalesClerkCode( arg0.getSalesClerkCode() );

        return orderReqDto;
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
    public List<OrderPo> dtoList2PoList(List<OrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderPo> list = new ArrayList<OrderPo>( arg0.size() );
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
    public List<OrderReqDto> poList2DtoList(List<OrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<OrderReqDto> list = new ArrayList<OrderReqDto>( arg0.size() );
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
