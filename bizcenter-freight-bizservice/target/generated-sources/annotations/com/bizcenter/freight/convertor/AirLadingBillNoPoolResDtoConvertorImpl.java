package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirLadingBillNoPoolEntity;
import com.bizcenter.freight.dto.res.AirLadingBillNoPoolResDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-26T16:50:54+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_251 (Oracle Corporation)"
)
@Component
public class AirLadingBillNoPoolResDtoConvertorImpl extends AirLadingBillNoPoolResDtoConvertor {

    @Override
    public AirLadingBillNoPoolEntity dto2Entity(AirLadingBillNoPoolResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirLadingBillNoPoolEntity airLadingBillNoPoolEntity = new AirLadingBillNoPoolEntity();

        airLadingBillNoPoolEntity.setId( arg0.getId() );
        airLadingBillNoPoolEntity.setAirCompanyCode( arg0.getAirCompanyCode() );
        airLadingBillNoPoolEntity.setCompanyCode( arg0.getCompanyCode() );
        airLadingBillNoPoolEntity.setLadingBillNo( arg0.getLadingBillNo() );
        airLadingBillNoPoolEntity.setLadingBillType( arg0.getLadingBillType() );
        airLadingBillNoPoolEntity.setLadingBillNoStatusCode( arg0.getLadingBillNoStatusCode() );
        airLadingBillNoPoolEntity.setIssuedAt( arg0.getIssuedAt() );
        airLadingBillNoPoolEntity.setNotBefore( arg0.getNotBefore() );
        airLadingBillNoPoolEntity.setNotAfter( arg0.getNotAfter() );
        airLadingBillNoPoolEntity.setModifyUserName( arg0.getModifyUserName() );
        airLadingBillNoPoolEntity.setModifyRealName( arg0.getModifyRealName() );
        airLadingBillNoPoolEntity.setModifyUserId( arg0.getModifyUserId() );
        airLadingBillNoPoolEntity.setCreateUserName( arg0.getCreateUserName() );
        airLadingBillNoPoolEntity.setCreateRealName( arg0.getCreateRealName() );
        airLadingBillNoPoolEntity.setCreateUserId( arg0.getCreateUserId() );
        airLadingBillNoPoolEntity.setPlanningStatusCode( arg0.getPlanningStatusCode() );
        airLadingBillNoPoolEntity.setOrderNo( arg0.getOrderNo() );

        return airLadingBillNoPoolEntity;
    }

    @Override
    public String dto2Po(AirLadingBillNoPoolResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public AirLadingBillNoPoolResDto entity2Dto(AirLadingBillNoPoolEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirLadingBillNoPoolResDto airLadingBillNoPoolResDto = new AirLadingBillNoPoolResDto();

        airLadingBillNoPoolResDto.setId( arg0.getId() );
        airLadingBillNoPoolResDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airLadingBillNoPoolResDto.setCompanyCode( arg0.getCompanyCode() );
        airLadingBillNoPoolResDto.setLadingBillNo( arg0.getLadingBillNo() );
        airLadingBillNoPoolResDto.setLadingBillType( arg0.getLadingBillType() );
        airLadingBillNoPoolResDto.setLadingBillNoStatusCode( arg0.getLadingBillNoStatusCode() );
        airLadingBillNoPoolResDto.setIssuedAt( arg0.getIssuedAt() );
        airLadingBillNoPoolResDto.setNotBefore( arg0.getNotBefore() );
        airLadingBillNoPoolResDto.setNotAfter( arg0.getNotAfter() );
        airLadingBillNoPoolResDto.setModifyUserName( arg0.getModifyUserName() );
        airLadingBillNoPoolResDto.setModifyRealName( arg0.getModifyRealName() );
        airLadingBillNoPoolResDto.setModifyUserId( arg0.getModifyUserId() );
        airLadingBillNoPoolResDto.setCreateUserName( arg0.getCreateUserName() );
        airLadingBillNoPoolResDto.setCreateRealName( arg0.getCreateRealName() );
        airLadingBillNoPoolResDto.setCreateUserId( arg0.getCreateUserId() );
        airLadingBillNoPoolResDto.setPlanningStatusCode( arg0.getPlanningStatusCode() );
        airLadingBillNoPoolResDto.setOrderNo( arg0.getOrderNo() );

        return airLadingBillNoPoolResDto;
    }

    @Override
    public AirLadingBillNoPoolResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirLadingBillNoPoolResDto airLadingBillNoPoolResDto = new AirLadingBillNoPoolResDto();

        return airLadingBillNoPoolResDto;
    }

    @Override
    public AirLadingBillNoPoolEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirLadingBillNoPoolEntity airLadingBillNoPoolEntity = new AirLadingBillNoPoolEntity();

        return airLadingBillNoPoolEntity;
    }

    @Override
    public String entity2Po(AirLadingBillNoPoolEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<AirLadingBillNoPoolEntity> dtoList2EntityList(List<AirLadingBillNoPoolResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirLadingBillNoPoolEntity> list = new ArrayList<AirLadingBillNoPoolEntity>( arg0.size() );
        for ( AirLadingBillNoPoolResDto airLadingBillNoPoolResDto : arg0 ) {
            list.add( dto2Entity( airLadingBillNoPoolResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<AirLadingBillNoPoolResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirLadingBillNoPoolResDto airLadingBillNoPoolResDto : arg0 ) {
            list.add( dto2Po( airLadingBillNoPoolResDto ) );
        }

        return list;
    }

    @Override
    public List<AirLadingBillNoPoolResDto> entityList2DtoList(List<AirLadingBillNoPoolEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirLadingBillNoPoolResDto> list = new ArrayList<AirLadingBillNoPoolResDto>( arg0.size() );
        for ( AirLadingBillNoPoolEntity airLadingBillNoPoolEntity : arg0 ) {
            list.add( entity2Dto( airLadingBillNoPoolEntity ) );
        }

        return list;
    }

    @Override
    public List<AirLadingBillNoPoolResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirLadingBillNoPoolResDto> list = new ArrayList<AirLadingBillNoPoolResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<AirLadingBillNoPoolEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirLadingBillNoPoolEntity> list = new ArrayList<AirLadingBillNoPoolEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<AirLadingBillNoPoolEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirLadingBillNoPoolEntity airLadingBillNoPoolEntity : arg0 ) {
            list.add( entity2Po( airLadingBillNoPoolEntity ) );
        }

        return list;
    }
}
