package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.CustomsClearanceEntity;
import com.bizcenter.freight.dto.req.CustomsClearanceReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.CustomsClearancePo;
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
public class CustomsClearanceReqDtoConvertorImpl extends CustomsClearanceReqDtoConvertor {

    @Override
    public CustomsClearanceEntity dto2Entity(CustomsClearanceReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceEntity customsClearanceEntity = new CustomsClearanceEntity();

        customsClearanceEntity.setStatus( arg0.getStatus() );
        customsClearanceEntity.setOrderNo( arg0.getOrderNo() );
        customsClearanceEntity.setCustomerNo( arg0.getCustomerNo() );
        customsClearanceEntity.setFlightNumber( arg0.getFlightNumber() );
        customsClearanceEntity.setCustomerCode( arg0.getCustomerCode() );
        customsClearanceEntity.setCustomerName( arg0.getCustomerName() );
        customsClearanceEntity.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        customsClearanceEntity.setDepartCode( arg0.getDepartCode() );
        customsClearanceEntity.setAddedServiceNo( arg0.getAddedServiceNo() );
        customsClearanceEntity.setBusType( arg0.getBusType() );
        customsClearanceEntity.setOrderSource( arg0.getOrderSource() );
        customsClearanceEntity.setBilllandingNo( arg0.getBilllandingNo() );
        customsClearanceEntity.setRemark( arg0.getRemark() );
        customsClearanceEntity.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        customsClearanceEntity.setUserDef2( arg0.getUserDef2() );
        customsClearanceEntity.setIsvId( arg0.getIsvId() );
        customsClearanceEntity.setCreateRealName( arg0.getCreateRealName() );
        customsClearanceEntity.setModifyRealName( arg0.getModifyRealName() );
        customsClearanceEntity.setType( arg0.getType() );
        customsClearanceEntity.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        customsClearanceEntity.setInitCreatDepart( arg0.getInitCreatDepart() );
        customsClearanceEntity.setMainOrderNo( arg0.getMainOrderNo() );

        return customsClearanceEntity;
    }

    @Override
    public CustomsClearancePo dto2Po(CustomsClearanceReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearancePo customsClearancePo = new CustomsClearancePo();

        customsClearancePo.setAppId( arg0.getAppId() );
        customsClearancePo.setTenantId( arg0.getTenantId() );
        customsClearancePo.setStatus( arg0.getStatus() );
        customsClearancePo.setOrderNo( arg0.getOrderNo() );
        customsClearancePo.setCustomerNo( arg0.getCustomerNo() );
        customsClearancePo.setFlightNumber( arg0.getFlightNumber() );
        customsClearancePo.setCustomerCode( arg0.getCustomerCode() );
        customsClearancePo.setCustomerName( arg0.getCustomerName() );
        customsClearancePo.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        customsClearancePo.setDepartCode( arg0.getDepartCode() );
        customsClearancePo.setAddedServiceNo( arg0.getAddedServiceNo() );
        customsClearancePo.setBusType( arg0.getBusType() );
        customsClearancePo.setOrderSource( arg0.getOrderSource() );
        customsClearancePo.setBilllandingNo( arg0.getBilllandingNo() );
        customsClearancePo.setRemark( arg0.getRemark() );
        customsClearancePo.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        customsClearancePo.setUserDef2( arg0.getUserDef2() );
        customsClearancePo.setIsvId( arg0.getIsvId() );
        customsClearancePo.setCreateRealName( arg0.getCreateRealName() );
        customsClearancePo.setModifyRealName( arg0.getModifyRealName() );
        customsClearancePo.setType( arg0.getType() );
        customsClearancePo.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        customsClearancePo.setInitCreatDepart( arg0.getInitCreatDepart() );
        customsClearancePo.setMainOrderNo( arg0.getMainOrderNo() );

        return customsClearancePo;
    }

    @Override
    public CustomsClearanceReqDto entity2Dto(CustomsClearanceEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceReqDto customsClearanceReqDto = new CustomsClearanceReqDto();

        customsClearanceReqDto.setStatus( arg0.getStatus() );
        customsClearanceReqDto.setOrderNo( arg0.getOrderNo() );
        customsClearanceReqDto.setCustomerNo( arg0.getCustomerNo() );
        customsClearanceReqDto.setFlightNumber( arg0.getFlightNumber() );
        customsClearanceReqDto.setCustomerCode( arg0.getCustomerCode() );
        customsClearanceReqDto.setCustomerName( arg0.getCustomerName() );
        customsClearanceReqDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        customsClearanceReqDto.setDepartCode( arg0.getDepartCode() );
        customsClearanceReqDto.setAddedServiceNo( arg0.getAddedServiceNo() );
        customsClearanceReqDto.setBusType( arg0.getBusType() );
        customsClearanceReqDto.setOrderSource( arg0.getOrderSource() );
        customsClearanceReqDto.setBilllandingNo( arg0.getBilllandingNo() );
        customsClearanceReqDto.setRemark( arg0.getRemark() );
        customsClearanceReqDto.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        customsClearanceReqDto.setUserDef2( arg0.getUserDef2() );
        customsClearanceReqDto.setIsvId( arg0.getIsvId() );
        customsClearanceReqDto.setCreateRealName( arg0.getCreateRealName() );
        customsClearanceReqDto.setModifyRealName( arg0.getModifyRealName() );
        customsClearanceReqDto.setType( arg0.getType() );
        customsClearanceReqDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        customsClearanceReqDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        customsClearanceReqDto.setMainOrderNo( arg0.getMainOrderNo() );

        return customsClearanceReqDto;
    }

    @Override
    public CustomsClearanceReqDto po2Dto(CustomsClearancePo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceReqDto customsClearanceReqDto = new CustomsClearanceReqDto();

        customsClearanceReqDto.setStatus( arg0.getStatus() );
        customsClearanceReqDto.setOrderNo( arg0.getOrderNo() );
        customsClearanceReqDto.setCustomerNo( arg0.getCustomerNo() );
        customsClearanceReqDto.setFlightNumber( arg0.getFlightNumber() );
        customsClearanceReqDto.setCustomerCode( arg0.getCustomerCode() );
        customsClearanceReqDto.setCustomerName( arg0.getCustomerName() );
        customsClearanceReqDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        customsClearanceReqDto.setDepartCode( arg0.getDepartCode() );
        customsClearanceReqDto.setAddedServiceNo( arg0.getAddedServiceNo() );
        customsClearanceReqDto.setBusType( arg0.getBusType() );
        customsClearanceReqDto.setOrderSource( arg0.getOrderSource() );
        customsClearanceReqDto.setBilllandingNo( arg0.getBilllandingNo() );
        customsClearanceReqDto.setRemark( arg0.getRemark() );
        customsClearanceReqDto.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        customsClearanceReqDto.setUserDef2( arg0.getUserDef2() );
        customsClearanceReqDto.setTenantId( arg0.getTenantId() );
        customsClearanceReqDto.setAppId( arg0.getAppId() );
        customsClearanceReqDto.setIsvId( arg0.getIsvId() );
        customsClearanceReqDto.setCreateRealName( arg0.getCreateRealName() );
        customsClearanceReqDto.setModifyRealName( arg0.getModifyRealName() );
        customsClearanceReqDto.setType( arg0.getType() );
        customsClearanceReqDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        customsClearanceReqDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        customsClearanceReqDto.setMainOrderNo( arg0.getMainOrderNo() );

        return customsClearanceReqDto;
    }

    @Override
    public CustomsClearanceEntity po2Entity(CustomsClearancePo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearanceEntity customsClearanceEntity = new CustomsClearanceEntity();

        customsClearanceEntity.setId( arg0.getId() );
        customsClearanceEntity.setStatus( arg0.getStatus() );
        customsClearanceEntity.setOrderNo( arg0.getOrderNo() );
        customsClearanceEntity.setCustomerNo( arg0.getCustomerNo() );
        customsClearanceEntity.setFlightNumber( arg0.getFlightNumber() );
        customsClearanceEntity.setCustomerCode( arg0.getCustomerCode() );
        customsClearanceEntity.setCustomerName( arg0.getCustomerName() );
        customsClearanceEntity.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        customsClearanceEntity.setDepartCode( arg0.getDepartCode() );
        customsClearanceEntity.setAddedServiceNo( arg0.getAddedServiceNo() );
        customsClearanceEntity.setBusType( arg0.getBusType() );
        customsClearanceEntity.setOrderSource( arg0.getOrderSource() );
        customsClearanceEntity.setBilllandingNo( arg0.getBilllandingNo() );
        customsClearanceEntity.setRemark( arg0.getRemark() );
        customsClearanceEntity.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        customsClearanceEntity.setUserDef2( arg0.getUserDef2() );
        customsClearanceEntity.setModifyUserName( arg0.getModifyUserName() );
        customsClearanceEntity.setModifyUserId( arg0.getModifyUserId() );
        customsClearanceEntity.setCreateUserName( arg0.getCreateUserName() );
        customsClearanceEntity.setCreateUserId( arg0.getCreateUserId() );
        customsClearanceEntity.setIsvId( arg0.getIsvId() );
        customsClearanceEntity.setCreateRealName( arg0.getCreateRealName() );
        customsClearanceEntity.setModifyRealName( arg0.getModifyRealName() );
        customsClearanceEntity.setType( arg0.getType() );
        customsClearanceEntity.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        customsClearanceEntity.setInitCreatDepart( arg0.getInitCreatDepart() );
        customsClearanceEntity.setMainOrderNo( arg0.getMainOrderNo() );

        return customsClearanceEntity;
    }

    @Override
    public CustomsClearancePo entity2Po(CustomsClearanceEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CustomsClearancePo customsClearancePo = new CustomsClearancePo();

        customsClearancePo.setId( arg0.getId() );
        customsClearancePo.setCreateUserId( arg0.getCreateUserId() );
        customsClearancePo.setCreateUserName( arg0.getCreateUserName() );
        customsClearancePo.setModifyUserId( arg0.getModifyUserId() );
        customsClearancePo.setModifyUserName( arg0.getModifyUserName() );
        customsClearancePo.setStatus( arg0.getStatus() );
        customsClearancePo.setOrderNo( arg0.getOrderNo() );
        customsClearancePo.setCustomerNo( arg0.getCustomerNo() );
        customsClearancePo.setFlightNumber( arg0.getFlightNumber() );
        customsClearancePo.setCustomerCode( arg0.getCustomerCode() );
        customsClearancePo.setCustomerName( arg0.getCustomerName() );
        customsClearancePo.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        customsClearancePo.setDepartCode( arg0.getDepartCode() );
        customsClearancePo.setAddedServiceNo( arg0.getAddedServiceNo() );
        customsClearancePo.setBusType( arg0.getBusType() );
        customsClearancePo.setOrderSource( arg0.getOrderSource() );
        customsClearancePo.setBilllandingNo( arg0.getBilllandingNo() );
        customsClearancePo.setRemark( arg0.getRemark() );
        customsClearancePo.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        customsClearancePo.setUserDef2( arg0.getUserDef2() );
        customsClearancePo.setIsvId( arg0.getIsvId() );
        customsClearancePo.setCreateRealName( arg0.getCreateRealName() );
        customsClearancePo.setModifyRealName( arg0.getModifyRealName() );
        customsClearancePo.setType( arg0.getType() );
        customsClearancePo.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        customsClearancePo.setInitCreatDepart( arg0.getInitCreatDepart() );
        customsClearancePo.setMainOrderNo( arg0.getMainOrderNo() );

        return customsClearancePo;
    }

    @Override
    public List<CustomsClearanceEntity> dtoList2EntityList(List<CustomsClearanceReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceEntity> list = new ArrayList<CustomsClearanceEntity>( arg0.size() );
        for ( CustomsClearanceReqDto customsClearanceReqDto : arg0 ) {
            list.add( dto2Entity( customsClearanceReqDto ) );
        }

        return list;
    }

    @Override
    public List<CustomsClearancePo> dtoList2PoList(List<CustomsClearanceReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearancePo> list = new ArrayList<CustomsClearancePo>( arg0.size() );
        for ( CustomsClearanceReqDto customsClearanceReqDto : arg0 ) {
            list.add( dto2Po( customsClearanceReqDto ) );
        }

        return list;
    }

    @Override
    public List<CustomsClearanceReqDto> entityList2DtoList(List<CustomsClearanceEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceReqDto> list = new ArrayList<CustomsClearanceReqDto>( arg0.size() );
        for ( CustomsClearanceEntity customsClearanceEntity : arg0 ) {
            list.add( entity2Dto( customsClearanceEntity ) );
        }

        return list;
    }

    @Override
    public List<CustomsClearanceReqDto> poList2DtoList(List<CustomsClearancePo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceReqDto> list = new ArrayList<CustomsClearanceReqDto>( arg0.size() );
        for ( CustomsClearancePo customsClearancePo : arg0 ) {
            list.add( po2Dto( customsClearancePo ) );
        }

        return list;
    }

    @Override
    public List<CustomsClearanceEntity> poList2EntityList(List<CustomsClearancePo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearanceEntity> list = new ArrayList<CustomsClearanceEntity>( arg0.size() );
        for ( CustomsClearancePo customsClearancePo : arg0 ) {
            list.add( po2Entity( customsClearancePo ) );
        }

        return list;
    }

    @Override
    public List<CustomsClearancePo> entityList2PoList(List<CustomsClearanceEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CustomsClearancePo> list = new ArrayList<CustomsClearancePo>( arg0.size() );
        for ( CustomsClearanceEntity customsClearanceEntity : arg0 ) {
            list.add( entity2Po( customsClearanceEntity ) );
        }

        return list;
    }
}
