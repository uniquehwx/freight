package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.TransportOrderEntity;
import com.bizcenter.freight.dto.req.TransportOrderReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.TransportOrderPo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-22T17:21:58+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class TransportOrderReqDtoConvertorImpl extends TransportOrderReqDtoConvertor {

    @Override
    public TransportOrderEntity dto2Entity(TransportOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TransportOrderEntity transportOrderEntity = new TransportOrderEntity();

        transportOrderEntity.setOrderNo( arg0.getOrderNo() );
        transportOrderEntity.setServiceType( arg0.getServiceType() );
        transportOrderEntity.setCube( arg0.getCube() );
        transportOrderEntity.setPackageNumber( arg0.getPackageNumber() );
        transportOrderEntity.setRoughWeight( arg0.getRoughWeight() );
        transportOrderEntity.setSize( arg0.getSize() );
        transportOrderEntity.setStatus( arg0.getStatus() );
        transportOrderEntity.setPrincipalContactPerson( arg0.getPrincipalContactPerson() );
        transportOrderEntity.setBusinessTypes( arg0.getBusinessTypes() );
        transportOrderEntity.setDelegateNo( arg0.getDelegateNo() );
        transportOrderEntity.setDeliveryTime( arg0.getDeliveryTime() );
        transportOrderEntity.setArrivalContactName( arg0.getArrivalContactName() );
        transportOrderEntity.setArrivalContactPhone( arg0.getArrivalContactPhone() );
        transportOrderEntity.setDeliveryProvince( arg0.getDeliveryProvince() );
        transportOrderEntity.setDeliveryCity( arg0.getDeliveryCity() );
        transportOrderEntity.setDeliveryDistrict( arg0.getDeliveryDistrict() );
        transportOrderEntity.setDeliveryAddress( arg0.getDeliveryAddress() );
        transportOrderEntity.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        transportOrderEntity.setTakeDeliveryProvince( arg0.getTakeDeliveryProvince() );
        transportOrderEntity.setTakeDeliveryCity( arg0.getTakeDeliveryCity() );
        transportOrderEntity.setTakeDeliveryDistrict( arg0.getTakeDeliveryDistrict() );
        transportOrderEntity.setTakeDeliveryAddress( arg0.getTakeDeliveryAddress() );
        transportOrderEntity.setContactName( arg0.getContactName() );
        transportOrderEntity.setContactPhone( arg0.getContactPhone() );
        transportOrderEntity.setCargoInformation( arg0.getCargoInformation() );
        transportOrderEntity.setModifyRealName( arg0.getModifyRealName() );
        transportOrderEntity.setCreateRealName( arg0.getCreateRealName() );
        transportOrderEntity.setExternalServiceType( arg0.getExternalServiceType() );
        transportOrderEntity.setExternalOrder( arg0.getExternalOrder() );
        transportOrderEntity.setRemark( arg0.getRemark() );
        transportOrderEntity.setCarType( arg0.getCarType() );

        return transportOrderEntity;
    }

    @Override
    public TransportOrderPo dto2Po(TransportOrderReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TransportOrderPo transportOrderPo = new TransportOrderPo();

        transportOrderPo.setAppId( arg0.getAppId() );
        transportOrderPo.setTenantId( arg0.getTenantId() );
        transportOrderPo.setOrderNo( arg0.getOrderNo() );
        transportOrderPo.setServiceType( arg0.getServiceType() );
        transportOrderPo.setCube( arg0.getCube() );
        transportOrderPo.setPackageNumber( arg0.getPackageNumber() );
        transportOrderPo.setRoughWeight( arg0.getRoughWeight() );
        transportOrderPo.setSize( arg0.getSize() );
        transportOrderPo.setStatus( arg0.getStatus() );
        transportOrderPo.setPrincipalContactPerson( arg0.getPrincipalContactPerson() );
        transportOrderPo.setBusinessTypes( arg0.getBusinessTypes() );
        transportOrderPo.setDelegateNo( arg0.getDelegateNo() );
        transportOrderPo.setDeliveryTime( arg0.getDeliveryTime() );
        transportOrderPo.setArrivalContactName( arg0.getArrivalContactName() );
        transportOrderPo.setArrivalContactPhone( arg0.getArrivalContactPhone() );
        transportOrderPo.setDeliveryProvince( arg0.getDeliveryProvince() );
        transportOrderPo.setDeliveryCity( arg0.getDeliveryCity() );
        transportOrderPo.setDeliveryDistrict( arg0.getDeliveryDistrict() );
        transportOrderPo.setDeliveryAddress( arg0.getDeliveryAddress() );
        transportOrderPo.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        transportOrderPo.setTakeDeliveryProvince( arg0.getTakeDeliveryProvince() );
        transportOrderPo.setTakeDeliveryCity( arg0.getTakeDeliveryCity() );
        transportOrderPo.setTakeDeliveryDistrict( arg0.getTakeDeliveryDistrict() );
        transportOrderPo.setTakeDeliveryAddress( arg0.getTakeDeliveryAddress() );
        transportOrderPo.setContactName( arg0.getContactName() );
        transportOrderPo.setContactPhone( arg0.getContactPhone() );
        transportOrderPo.setCargoInformation( arg0.getCargoInformation() );
        transportOrderPo.setModifyRealName( arg0.getModifyRealName() );
        transportOrderPo.setCreateRealName( arg0.getCreateRealName() );
        transportOrderPo.setExternalServiceType( arg0.getExternalServiceType() );
        transportOrderPo.setExternalOrder( arg0.getExternalOrder() );
        transportOrderPo.setRemark( arg0.getRemark() );
        transportOrderPo.setCarType( arg0.getCarType() );

        return transportOrderPo;
    }

    @Override
    public TransportOrderReqDto entity2Dto(TransportOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TransportOrderReqDto transportOrderReqDto = new TransportOrderReqDto();

        transportOrderReqDto.setOrderNo( arg0.getOrderNo() );
        transportOrderReqDto.setServiceType( arg0.getServiceType() );
        transportOrderReqDto.setCube( arg0.getCube() );
        transportOrderReqDto.setPackageNumber( arg0.getPackageNumber() );
        transportOrderReqDto.setRoughWeight( arg0.getRoughWeight() );
        transportOrderReqDto.setSize( arg0.getSize() );
        transportOrderReqDto.setStatus( arg0.getStatus() );
        transportOrderReqDto.setPrincipalContactPerson( arg0.getPrincipalContactPerson() );
        transportOrderReqDto.setBusinessTypes( arg0.getBusinessTypes() );
        transportOrderReqDto.setDelegateNo( arg0.getDelegateNo() );
        transportOrderReqDto.setDeliveryTime( arg0.getDeliveryTime() );
        transportOrderReqDto.setArrivalContactName( arg0.getArrivalContactName() );
        transportOrderReqDto.setArrivalContactPhone( arg0.getArrivalContactPhone() );
        transportOrderReqDto.setDeliveryProvince( arg0.getDeliveryProvince() );
        transportOrderReqDto.setDeliveryCity( arg0.getDeliveryCity() );
        transportOrderReqDto.setDeliveryDistrict( arg0.getDeliveryDistrict() );
        transportOrderReqDto.setDeliveryAddress( arg0.getDeliveryAddress() );
        transportOrderReqDto.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        transportOrderReqDto.setTakeDeliveryProvince( arg0.getTakeDeliveryProvince() );
        transportOrderReqDto.setTakeDeliveryCity( arg0.getTakeDeliveryCity() );
        transportOrderReqDto.setTakeDeliveryDistrict( arg0.getTakeDeliveryDistrict() );
        transportOrderReqDto.setTakeDeliveryAddress( arg0.getTakeDeliveryAddress() );
        transportOrderReqDto.setContactName( arg0.getContactName() );
        transportOrderReqDto.setContactPhone( arg0.getContactPhone() );
        transportOrderReqDto.setCargoInformation( arg0.getCargoInformation() );
        transportOrderReqDto.setModifyRealName( arg0.getModifyRealName() );
        transportOrderReqDto.setCreateRealName( arg0.getCreateRealName() );
        transportOrderReqDto.setExternalServiceType( arg0.getExternalServiceType() );
        transportOrderReqDto.setExternalOrder( arg0.getExternalOrder() );
        transportOrderReqDto.setRemark( arg0.getRemark() );
        transportOrderReqDto.setCarType( arg0.getCarType() );

        return transportOrderReqDto;
    }

    @Override
    public TransportOrderReqDto po2Dto(TransportOrderPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TransportOrderReqDto transportOrderReqDto = new TransportOrderReqDto();

        transportOrderReqDto.setOrderNo( arg0.getOrderNo() );
        transportOrderReqDto.setServiceType( arg0.getServiceType() );
        transportOrderReqDto.setCube( arg0.getCube() );
        transportOrderReqDto.setPackageNumber( arg0.getPackageNumber() );
        transportOrderReqDto.setRoughWeight( arg0.getRoughWeight() );
        transportOrderReqDto.setSize( arg0.getSize() );
        transportOrderReqDto.setStatus( arg0.getStatus() );
        transportOrderReqDto.setPrincipalContactPerson( arg0.getPrincipalContactPerson() );
        transportOrderReqDto.setBusinessTypes( arg0.getBusinessTypes() );
        transportOrderReqDto.setDelegateNo( arg0.getDelegateNo() );
        transportOrderReqDto.setDeliveryTime( arg0.getDeliveryTime() );
        transportOrderReqDto.setArrivalContactName( arg0.getArrivalContactName() );
        transportOrderReqDto.setArrivalContactPhone( arg0.getArrivalContactPhone() );
        transportOrderReqDto.setDeliveryProvince( arg0.getDeliveryProvince() );
        transportOrderReqDto.setDeliveryCity( arg0.getDeliveryCity() );
        transportOrderReqDto.setDeliveryDistrict( arg0.getDeliveryDistrict() );
        transportOrderReqDto.setDeliveryAddress( arg0.getDeliveryAddress() );
        transportOrderReqDto.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        transportOrderReqDto.setTakeDeliveryProvince( arg0.getTakeDeliveryProvince() );
        transportOrderReqDto.setTakeDeliveryCity( arg0.getTakeDeliveryCity() );
        transportOrderReqDto.setTakeDeliveryDistrict( arg0.getTakeDeliveryDistrict() );
        transportOrderReqDto.setTakeDeliveryAddress( arg0.getTakeDeliveryAddress() );
        transportOrderReqDto.setContactName( arg0.getContactName() );
        transportOrderReqDto.setContactPhone( arg0.getContactPhone() );
        transportOrderReqDto.setCargoInformation( arg0.getCargoInformation() );
        transportOrderReqDto.setTenantId( arg0.getTenantId() );
        transportOrderReqDto.setAppId( arg0.getAppId() );
        transportOrderReqDto.setModifyRealName( arg0.getModifyRealName() );
        transportOrderReqDto.setCreateRealName( arg0.getCreateRealName() );
        transportOrderReqDto.setExternalServiceType( arg0.getExternalServiceType() );
        transportOrderReqDto.setExternalOrder( arg0.getExternalOrder() );
        transportOrderReqDto.setRemark( arg0.getRemark() );
        transportOrderReqDto.setCarType( arg0.getCarType() );

        return transportOrderReqDto;
    }

    @Override
    public TransportOrderEntity po2Entity(TransportOrderPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TransportOrderEntity transportOrderEntity = new TransportOrderEntity();

        transportOrderEntity.setId( arg0.getId() );
        transportOrderEntity.setOrderNo( arg0.getOrderNo() );
        transportOrderEntity.setServiceType( arg0.getServiceType() );
        transportOrderEntity.setCube( arg0.getCube() );
        transportOrderEntity.setPackageNumber( arg0.getPackageNumber() );
        transportOrderEntity.setRoughWeight( arg0.getRoughWeight() );
        transportOrderEntity.setSize( arg0.getSize() );
        transportOrderEntity.setStatus( arg0.getStatus() );
        transportOrderEntity.setPrincipalContactPerson( arg0.getPrincipalContactPerson() );
        transportOrderEntity.setBusinessTypes( arg0.getBusinessTypes() );
        transportOrderEntity.setDelegateNo( arg0.getDelegateNo() );
        transportOrderEntity.setDeliveryTime( arg0.getDeliveryTime() );
        transportOrderEntity.setArrivalContactName( arg0.getArrivalContactName() );
        transportOrderEntity.setArrivalContactPhone( arg0.getArrivalContactPhone() );
        transportOrderEntity.setDeliveryProvince( arg0.getDeliveryProvince() );
        transportOrderEntity.setDeliveryCity( arg0.getDeliveryCity() );
        transportOrderEntity.setDeliveryDistrict( arg0.getDeliveryDistrict() );
        transportOrderEntity.setDeliveryAddress( arg0.getDeliveryAddress() );
        transportOrderEntity.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        transportOrderEntity.setTakeDeliveryProvince( arg0.getTakeDeliveryProvince() );
        transportOrderEntity.setTakeDeliveryCity( arg0.getTakeDeliveryCity() );
        transportOrderEntity.setTakeDeliveryDistrict( arg0.getTakeDeliveryDistrict() );
        transportOrderEntity.setTakeDeliveryAddress( arg0.getTakeDeliveryAddress() );
        transportOrderEntity.setContactName( arg0.getContactName() );
        transportOrderEntity.setContactPhone( arg0.getContactPhone() );
        transportOrderEntity.setCargoInformation( arg0.getCargoInformation() );
        transportOrderEntity.setModifyUserName( arg0.getModifyUserName() );
        transportOrderEntity.setModifyUserId( arg0.getModifyUserId() );
        transportOrderEntity.setCreateUserName( arg0.getCreateUserName() );
        transportOrderEntity.setCreateUserId( arg0.getCreateUserId() );
        transportOrderEntity.setModifyRealName( arg0.getModifyRealName() );
        transportOrderEntity.setCreateRealName( arg0.getCreateRealName() );
        transportOrderEntity.setExternalServiceType( arg0.getExternalServiceType() );
        transportOrderEntity.setExternalOrder( arg0.getExternalOrder() );
        transportOrderEntity.setRemark( arg0.getRemark() );
        transportOrderEntity.setCarType( arg0.getCarType() );

        return transportOrderEntity;
    }

    @Override
    public TransportOrderPo entity2Po(TransportOrderEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TransportOrderPo transportOrderPo = new TransportOrderPo();

        transportOrderPo.setId( arg0.getId() );
        transportOrderPo.setCreateUserId( arg0.getCreateUserId() );
        transportOrderPo.setCreateUserName( arg0.getCreateUserName() );
        transportOrderPo.setModifyUserId( arg0.getModifyUserId() );
        transportOrderPo.setModifyUserName( arg0.getModifyUserName() );
        transportOrderPo.setOrderNo( arg0.getOrderNo() );
        transportOrderPo.setServiceType( arg0.getServiceType() );
        transportOrderPo.setCube( arg0.getCube() );
        transportOrderPo.setPackageNumber( arg0.getPackageNumber() );
        transportOrderPo.setRoughWeight( arg0.getRoughWeight() );
        transportOrderPo.setSize( arg0.getSize() );
        transportOrderPo.setStatus( arg0.getStatus() );
        transportOrderPo.setPrincipalContactPerson( arg0.getPrincipalContactPerson() );
        transportOrderPo.setBusinessTypes( arg0.getBusinessTypes() );
        transportOrderPo.setDelegateNo( arg0.getDelegateNo() );
        transportOrderPo.setDeliveryTime( arg0.getDeliveryTime() );
        transportOrderPo.setArrivalContactName( arg0.getArrivalContactName() );
        transportOrderPo.setArrivalContactPhone( arg0.getArrivalContactPhone() );
        transportOrderPo.setDeliveryProvince( arg0.getDeliveryProvince() );
        transportOrderPo.setDeliveryCity( arg0.getDeliveryCity() );
        transportOrderPo.setDeliveryDistrict( arg0.getDeliveryDistrict() );
        transportOrderPo.setDeliveryAddress( arg0.getDeliveryAddress() );
        transportOrderPo.setTakeDeliveryTime( arg0.getTakeDeliveryTime() );
        transportOrderPo.setTakeDeliveryProvince( arg0.getTakeDeliveryProvince() );
        transportOrderPo.setTakeDeliveryCity( arg0.getTakeDeliveryCity() );
        transportOrderPo.setTakeDeliveryDistrict( arg0.getTakeDeliveryDistrict() );
        transportOrderPo.setTakeDeliveryAddress( arg0.getTakeDeliveryAddress() );
        transportOrderPo.setContactName( arg0.getContactName() );
        transportOrderPo.setContactPhone( arg0.getContactPhone() );
        transportOrderPo.setCargoInformation( arg0.getCargoInformation() );
        transportOrderPo.setModifyRealName( arg0.getModifyRealName() );
        transportOrderPo.setCreateRealName( arg0.getCreateRealName() );
        transportOrderPo.setExternalServiceType( arg0.getExternalServiceType() );
        transportOrderPo.setExternalOrder( arg0.getExternalOrder() );
        transportOrderPo.setRemark( arg0.getRemark() );
        transportOrderPo.setCarType( arg0.getCarType() );

        return transportOrderPo;
    }

    @Override
    public List<TransportOrderEntity> dtoList2EntityList(List<TransportOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransportOrderEntity> list = new ArrayList<TransportOrderEntity>( arg0.size() );
        for ( TransportOrderReqDto transportOrderReqDto : arg0 ) {
            list.add( dto2Entity( transportOrderReqDto ) );
        }

        return list;
    }

    @Override
    public List<TransportOrderPo> dtoList2PoList(List<TransportOrderReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransportOrderPo> list = new ArrayList<TransportOrderPo>( arg0.size() );
        for ( TransportOrderReqDto transportOrderReqDto : arg0 ) {
            list.add( dto2Po( transportOrderReqDto ) );
        }

        return list;
    }

    @Override
    public List<TransportOrderReqDto> entityList2DtoList(List<TransportOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransportOrderReqDto> list = new ArrayList<TransportOrderReqDto>( arg0.size() );
        for ( TransportOrderEntity transportOrderEntity : arg0 ) {
            list.add( entity2Dto( transportOrderEntity ) );
        }

        return list;
    }

    @Override
    public List<TransportOrderReqDto> poList2DtoList(List<TransportOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransportOrderReqDto> list = new ArrayList<TransportOrderReqDto>( arg0.size() );
        for ( TransportOrderPo transportOrderPo : arg0 ) {
            list.add( po2Dto( transportOrderPo ) );
        }

        return list;
    }

    @Override
    public List<TransportOrderEntity> poList2EntityList(List<TransportOrderPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransportOrderEntity> list = new ArrayList<TransportOrderEntity>( arg0.size() );
        for ( TransportOrderPo transportOrderPo : arg0 ) {
            list.add( po2Entity( transportOrderPo ) );
        }

        return list;
    }

    @Override
    public List<TransportOrderPo> entityList2PoList(List<TransportOrderEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<TransportOrderPo> list = new ArrayList<TransportOrderPo>( arg0.size() );
        for ( TransportOrderEntity transportOrderEntity : arg0 ) {
            list.add( entity2Po( transportOrderEntity ) );
        }

        return list;
    }
}
