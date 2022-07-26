package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.BookingBusinessEntity;
import com.bizcenter.freight.dto.res.BookingBusinessResDto;
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
public class BookingBusinessResDtoConvertorImpl extends BookingBusinessResDtoConvertor {

    @Override
    public BookingBusinessEntity dto2Entity(BookingBusinessResDto arg0) {
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
    public String dto2Po(BookingBusinessResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public BookingBusinessResDto entity2Dto(BookingBusinessEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BookingBusinessResDto bookingBusinessResDto = new BookingBusinessResDto();

        bookingBusinessResDto.setId( arg0.getId() );
        bookingBusinessResDto.setStatus( arg0.getStatus() );
        bookingBusinessResDto.setOrderNo( arg0.getOrderNo() );
        bookingBusinessResDto.setCustomerNo( arg0.getCustomerNo() );
        bookingBusinessResDto.setFlightNumber( arg0.getFlightNumber() );
        bookingBusinessResDto.setCustomerCode( arg0.getCustomerCode() );
        bookingBusinessResDto.setCustomerName( arg0.getCustomerName() );
        bookingBusinessResDto.setFinancialOrgCode( arg0.getFinancialOrgCode() );
        bookingBusinessResDto.setDepartCode( arg0.getDepartCode() );
        bookingBusinessResDto.setAddedServiceNo( arg0.getAddedServiceNo() );
        bookingBusinessResDto.setBusType( arg0.getBusType() );
        bookingBusinessResDto.setOrderSource( arg0.getOrderSource() );
        bookingBusinessResDto.setBillLadingNo( arg0.getBillLadingNo() );
        bookingBusinessResDto.setRemark( arg0.getRemark() );
        bookingBusinessResDto.setServiceCompletionTime( arg0.getServiceCompletionTime() );
        bookingBusinessResDto.setType( arg0.getType() );
        bookingBusinessResDto.setOrderSourceFinancial( arg0.getOrderSourceFinancial() );
        bookingBusinessResDto.setInitCreatDepart( arg0.getInitCreatDepart() );
        bookingBusinessResDto.setModifyUserName( arg0.getModifyUserName() );
        bookingBusinessResDto.setModifyUserId( arg0.getModifyUserId() );
        bookingBusinessResDto.setCreateUserName( arg0.getCreateUserName() );
        bookingBusinessResDto.setCreateUserId( arg0.getCreateUserId() );
        bookingBusinessResDto.setIsvId( arg0.getIsvId() );
        bookingBusinessResDto.setCreateRealName( arg0.getCreateRealName() );
        bookingBusinessResDto.setModifyRealName( arg0.getModifyRealName() );

        return bookingBusinessResDto;
    }

    @Override
    public BookingBusinessResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BookingBusinessResDto bookingBusinessResDto = new BookingBusinessResDto();

        return bookingBusinessResDto;
    }

    @Override
    public BookingBusinessEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        BookingBusinessEntity bookingBusinessEntity = new BookingBusinessEntity();

        return bookingBusinessEntity;
    }

    @Override
    public String entity2Po(BookingBusinessEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<BookingBusinessEntity> dtoList2EntityList(List<BookingBusinessResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BookingBusinessEntity> list = new ArrayList<BookingBusinessEntity>( arg0.size() );
        for ( BookingBusinessResDto bookingBusinessResDto : arg0 ) {
            list.add( dto2Entity( bookingBusinessResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<BookingBusinessResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( BookingBusinessResDto bookingBusinessResDto : arg0 ) {
            list.add( dto2Po( bookingBusinessResDto ) );
        }

        return list;
    }

    @Override
    public List<BookingBusinessResDto> entityList2DtoList(List<BookingBusinessEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BookingBusinessResDto> list = new ArrayList<BookingBusinessResDto>( arg0.size() );
        for ( BookingBusinessEntity bookingBusinessEntity : arg0 ) {
            list.add( entity2Dto( bookingBusinessEntity ) );
        }

        return list;
    }

    @Override
    public List<BookingBusinessResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BookingBusinessResDto> list = new ArrayList<BookingBusinessResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<BookingBusinessEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<BookingBusinessEntity> list = new ArrayList<BookingBusinessEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<BookingBusinessEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( BookingBusinessEntity bookingBusinessEntity : arg0 ) {
            list.add( entity2Po( bookingBusinessEntity ) );
        }

        return list;
    }
}
