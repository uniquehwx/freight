package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.BookingBusinessEntity;
import com.bizcenter.freight.dto.req.BookingBusinessReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.BookingBusinessPo;
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
public class BookingBusinessReqDtoConvertorImpl extends BookingBusinessReqDtoConvertor {

    @Override
    public BookingBusinessEntity dto2Entity(BookingBusinessReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BookingBusinessEntity bookingBusinessEntity = new BookingBusinessEntity();

        bookingBusinessEntity.setStatus( arg0.getStatus() );
        bookingBusinessEntity.setOrderNo( arg0.getOrderNo() );
        bookingBusinessEntity.setCustomerNo( arg0.getCustomerNo() );
        bookingBusinessEntity.setFlightNumber( arg0.getFlightNumber() );
        bookingBusinessEntity.setCustomerCode( arg0.getCustomerCode() );
        bookingBusinessEntity.setCustomerName( arg0.getCustomerName() );
        bookingBusinessEntity.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        bookingBusinessEntity.setDepartCode( arg0.getDepartCode() );
        bookingBusinessEntity.setAddedServiceNo( arg0.getAddedServiceNo() );
        bookingBusinessEntity.setBusType( arg0.getBusType() );
        bookingBusinessEntity.setOrderSource( arg0.getOrderSource() );
        bookingBusinessEntity.setBillLadingNo( arg0.getBillLadingNo() );
        bookingBusinessEntity.setRemark( arg0.getRemark() );
        bookingBusinessEntity.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        bookingBusinessEntity.setType( arg0.getType() );
        bookingBusinessEntity.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        bookingBusinessEntity.setInitCreatDepart( arg0.getInitCreatDepart() );
        bookingBusinessEntity.setIsvId( arg0.getIsvId() );
        bookingBusinessEntity.setCreateRealName( arg0.getCreateRealName() );
        bookingBusinessEntity.setModifyRealName( arg0.getModifyRealName() );

        return bookingBusinessEntity;
    }

    @Override
    public BookingBusinessPo dto2Po(BookingBusinessReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BookingBusinessPo bookingBusinessPo = new BookingBusinessPo();

        bookingBusinessPo.setAppId( arg0.getAppId() );
        bookingBusinessPo.setTenantId( arg0.getTenantId() );
        bookingBusinessPo.setStatus( arg0.getStatus() );
        bookingBusinessPo.setOrderNo( arg0.getOrderNo() );
        bookingBusinessPo.setCustomerNo( arg0.getCustomerNo() );
        bookingBusinessPo.setFlightNumber( arg0.getFlightNumber() );
        bookingBusinessPo.setCustomerCode( arg0.getCustomerCode() );
        bookingBusinessPo.setCustomerName( arg0.getCustomerName() );
        bookingBusinessPo.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        bookingBusinessPo.setDepartCode( arg0.getDepartCode() );
        bookingBusinessPo.setAddedServiceNo( arg0.getAddedServiceNo() );
        bookingBusinessPo.setBusType( arg0.getBusType() );
        bookingBusinessPo.setOrderSource( arg0.getOrderSource() );
        bookingBusinessPo.setBillLadingNo( arg0.getBillLadingNo() );
        bookingBusinessPo.setRemark( arg0.getRemark() );
        bookingBusinessPo.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        bookingBusinessPo.setType( arg0.getType() );
        bookingBusinessPo.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        bookingBusinessPo.setInitCreatDepart( arg0.getInitCreatDepart() );
        bookingBusinessPo.setIsvId( arg0.getIsvId() );
        bookingBusinessPo.setCreateRealName( arg0.getCreateRealName() );
        bookingBusinessPo.setModifyRealName( arg0.getModifyRealName() );

        return bookingBusinessPo;
    }

    @Override
    public BookingBusinessReqDto entity2Dto(BookingBusinessEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BookingBusinessReqDto bookingBusinessReqDto = new BookingBusinessReqDto();

        bookingBusinessReqDto.setStatus( arg0.getStatus() );
        bookingBusinessReqDto.setOrderNo( arg0.getOrderNo() );
        bookingBusinessReqDto.setCustomerNo( arg0.getCustomerNo() );
        bookingBusinessReqDto.setFlightNumber( arg0.getFlightNumber() );
        bookingBusinessReqDto.setCustomerCode( arg0.getCustomerCode() );
        bookingBusinessReqDto.setCustomerName( arg0.getCustomerName() );
        bookingBusinessReqDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        bookingBusinessReqDto.setDepartCode( arg0.getDepartCode() );
        bookingBusinessReqDto.setAddedServiceNo( arg0.getAddedServiceNo() );
        bookingBusinessReqDto.setBusType( arg0.getBusType() );
        bookingBusinessReqDto.setOrderSource( arg0.getOrderSource() );
        bookingBusinessReqDto.setBillLadingNo( arg0.getBillLadingNo() );
        bookingBusinessReqDto.setRemark( arg0.getRemark() );
        bookingBusinessReqDto.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        bookingBusinessReqDto.setType( arg0.getType() );
        bookingBusinessReqDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        bookingBusinessReqDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        bookingBusinessReqDto.setIsvId( arg0.getIsvId() );
        bookingBusinessReqDto.setCreateRealName( arg0.getCreateRealName() );
        bookingBusinessReqDto.setModifyRealName( arg0.getModifyRealName() );

        return bookingBusinessReqDto;
    }

    @Override
    public BookingBusinessReqDto po2Dto(BookingBusinessPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BookingBusinessReqDto bookingBusinessReqDto = new BookingBusinessReqDto();

        bookingBusinessReqDto.setStatus( arg0.getStatus() );
        bookingBusinessReqDto.setOrderNo( arg0.getOrderNo() );
        bookingBusinessReqDto.setCustomerNo( arg0.getCustomerNo() );
        bookingBusinessReqDto.setFlightNumber( arg0.getFlightNumber() );
        bookingBusinessReqDto.setCustomerCode( arg0.getCustomerCode() );
        bookingBusinessReqDto.setCustomerName( arg0.getCustomerName() );
        bookingBusinessReqDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        bookingBusinessReqDto.setDepartCode( arg0.getDepartCode() );
        bookingBusinessReqDto.setAddedServiceNo( arg0.getAddedServiceNo() );
        bookingBusinessReqDto.setBusType( arg0.getBusType() );
        bookingBusinessReqDto.setOrderSource( arg0.getOrderSource() );
        bookingBusinessReqDto.setBillLadingNo( arg0.getBillLadingNo() );
        bookingBusinessReqDto.setRemark( arg0.getRemark() );
        bookingBusinessReqDto.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        bookingBusinessReqDto.setType( arg0.getType() );
        bookingBusinessReqDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        bookingBusinessReqDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        bookingBusinessReqDto.setTenantId( arg0.getTenantId() );
        bookingBusinessReqDto.setAppId( arg0.getAppId() );
        bookingBusinessReqDto.setIsvId( arg0.getIsvId() );
        bookingBusinessReqDto.setCreateRealName( arg0.getCreateRealName() );
        bookingBusinessReqDto.setModifyRealName( arg0.getModifyRealName() );

        return bookingBusinessReqDto;
    }

    @Override
    public BookingBusinessEntity po2Entity(BookingBusinessPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BookingBusinessEntity bookingBusinessEntity = new BookingBusinessEntity();

        bookingBusinessEntity.setId( arg0.getId() );
        bookingBusinessEntity.setStatus( arg0.getStatus() );
        bookingBusinessEntity.setOrderNo( arg0.getOrderNo() );
        bookingBusinessEntity.setCustomerNo( arg0.getCustomerNo() );
        bookingBusinessEntity.setFlightNumber( arg0.getFlightNumber() );
        bookingBusinessEntity.setCustomerCode( arg0.getCustomerCode() );
        bookingBusinessEntity.setCustomerName( arg0.getCustomerName() );
        bookingBusinessEntity.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        bookingBusinessEntity.setDepartCode( arg0.getDepartCode() );
        bookingBusinessEntity.setAddedServiceNo( arg0.getAddedServiceNo() );
        bookingBusinessEntity.setBusType( arg0.getBusType() );
        bookingBusinessEntity.setOrderSource( arg0.getOrderSource() );
        bookingBusinessEntity.setBillLadingNo( arg0.getBillLadingNo() );
        bookingBusinessEntity.setRemark( arg0.getRemark() );
        bookingBusinessEntity.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        bookingBusinessEntity.setType( arg0.getType() );
        bookingBusinessEntity.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        bookingBusinessEntity.setInitCreatDepart( arg0.getInitCreatDepart() );
        bookingBusinessEntity.setModifyUserName( arg0.getModifyUserName() );
        bookingBusinessEntity.setModifyUserId( arg0.getModifyUserId() );
        bookingBusinessEntity.setCreateUserName( arg0.getCreateUserName() );
        bookingBusinessEntity.setCreateUserId( arg0.getCreateUserId() );
        bookingBusinessEntity.setIsvId( arg0.getIsvId() );
        bookingBusinessEntity.setCreateRealName( arg0.getCreateRealName() );
        bookingBusinessEntity.setModifyRealName( arg0.getModifyRealName() );

        return bookingBusinessEntity;
    }

    @Override
    public BookingBusinessPo entity2Po(BookingBusinessEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BookingBusinessPo bookingBusinessPo = new BookingBusinessPo();

        bookingBusinessPo.setId( arg0.getId() );
        bookingBusinessPo.setCreateUserId( arg0.getCreateUserId() );
        bookingBusinessPo.setCreateUserName( arg0.getCreateUserName() );
        bookingBusinessPo.setModifyUserId( arg0.getModifyUserId() );
        bookingBusinessPo.setModifyUserName( arg0.getModifyUserName() );
        bookingBusinessPo.setStatus( arg0.getStatus() );
        bookingBusinessPo.setOrderNo( arg0.getOrderNo() );
        bookingBusinessPo.setCustomerNo( arg0.getCustomerNo() );
        bookingBusinessPo.setFlightNumber( arg0.getFlightNumber() );
        bookingBusinessPo.setCustomerCode( arg0.getCustomerCode() );
        bookingBusinessPo.setCustomerName( arg0.getCustomerName() );
        bookingBusinessPo.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        bookingBusinessPo.setDepartCode( arg0.getDepartCode() );
        bookingBusinessPo.setAddedServiceNo( arg0.getAddedServiceNo() );
        bookingBusinessPo.setBusType( arg0.getBusType() );
        bookingBusinessPo.setOrderSource( arg0.getOrderSource() );
        bookingBusinessPo.setBillLadingNo( arg0.getBillLadingNo() );
        bookingBusinessPo.setRemark( arg0.getRemark() );
        bookingBusinessPo.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        bookingBusinessPo.setType( arg0.getType() );
        bookingBusinessPo.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        bookingBusinessPo.setInitCreatDepart( arg0.getInitCreatDepart() );
        bookingBusinessPo.setIsvId( arg0.getIsvId() );
        bookingBusinessPo.setCreateRealName( arg0.getCreateRealName() );
        bookingBusinessPo.setModifyRealName( arg0.getModifyRealName() );

        return bookingBusinessPo;
    }

    @Override
    public List<BookingBusinessEntity> dtoList2EntityList(List<BookingBusinessReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BookingBusinessEntity> list = new ArrayList<BookingBusinessEntity>( arg0.size() );
        for ( BookingBusinessReqDto bookingBusinessReqDto : arg0 ) {
            list.add( dto2Entity( bookingBusinessReqDto ) );
        }

        return list;
    }

    @Override
    public List<BookingBusinessPo> dtoList2PoList(List<BookingBusinessReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BookingBusinessPo> list = new ArrayList<BookingBusinessPo>( arg0.size() );
        for ( BookingBusinessReqDto bookingBusinessReqDto : arg0 ) {
            list.add( dto2Po( bookingBusinessReqDto ) );
        }

        return list;
    }

    @Override
    public List<BookingBusinessReqDto> entityList2DtoList(List<BookingBusinessEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BookingBusinessReqDto> list = new ArrayList<BookingBusinessReqDto>( arg0.size() );
        for ( BookingBusinessEntity bookingBusinessEntity : arg0 ) {
            list.add( entity2Dto( bookingBusinessEntity ) );
        }

        return list;
    }

    @Override
    public List<BookingBusinessReqDto> poList2DtoList(List<BookingBusinessPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BookingBusinessReqDto> list = new ArrayList<BookingBusinessReqDto>( arg0.size() );
        for ( BookingBusinessPo bookingBusinessPo : arg0 ) {
            list.add( po2Dto( bookingBusinessPo ) );
        }

        return list;
    }

    @Override
    public List<BookingBusinessEntity> poList2EntityList(List<BookingBusinessPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BookingBusinessEntity> list = new ArrayList<BookingBusinessEntity>( arg0.size() );
        for ( BookingBusinessPo bookingBusinessPo : arg0 ) {
            list.add( po2Entity( bookingBusinessPo ) );
        }

        return list;
    }

    @Override
    public List<BookingBusinessPo> entityList2PoList(List<BookingBusinessEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BookingBusinessPo> list = new ArrayList<BookingBusinessPo>( arg0.size() );
        for ( BookingBusinessEntity bookingBusinessEntity : arg0 ) {
            list.add( entity2Po( bookingBusinessEntity ) );
        }

        return list;
    }
}
