package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirHarbourEntity;
import com.bizcenter.freight.dto.res.AirHarbourResDto;
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
public class AirHarbourResDtoConvertorImpl extends AirHarbourResDtoConvertor {

    @Override
    public AirHarbourEntity dto2Entity(AirHarbourResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirHarbourEntity airHarbourEntity = new AirHarbourEntity();

        airHarbourEntity.setId( arg0.getId() );
        airHarbourEntity.setHarbourNo( arg0.getHarbourNo() );
        airHarbourEntity.setHarbourCode( arg0.getHarbourCode() );
        airHarbourEntity.setHarbourCnName( arg0.getHarbourCnName() );
        airHarbourEntity.setHarbourUsName( arg0.getHarbourUsName() );
        airHarbourEntity.setCountry( arg0.getCountry() );
        airHarbourEntity.setCountryCode( arg0.getCountryCode() );
        airHarbourEntity.setCity( arg0.getCity() );
        airHarbourEntity.setCityCode( arg0.getCityCode() );
        airHarbourEntity.setState( arg0.getState() );
        airHarbourEntity.setModifyUserName( arg0.getModifyUserName() );
        airHarbourEntity.setModifyRealName( arg0.getModifyRealName() );
        airHarbourEntity.setModifyUserId( arg0.getModifyUserId() );
        airHarbourEntity.setCreateUserName( arg0.getCreateUserName() );
        airHarbourEntity.setCreateRealName( arg0.getCreateRealName() );
        airHarbourEntity.setCreateUserId( arg0.getCreateUserId() );
        airHarbourEntity.setProvince( arg0.getProvince() );
        airHarbourEntity.setProvinceCode( arg0.getProvinceCode() );
        airHarbourEntity.setLongitude( arg0.getLongitude() );
        airHarbourEntity.setLatitude( arg0.getLatitude() );

        return airHarbourEntity;
    }

    @Override
    public String dto2Po(AirHarbourResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public AirHarbourResDto entity2Dto(AirHarbourEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirHarbourResDto airHarbourResDto = new AirHarbourResDto();

        airHarbourResDto.setId( arg0.getId() );
        airHarbourResDto.setHarbourNo( arg0.getHarbourNo() );
        airHarbourResDto.setHarbourCode( arg0.getHarbourCode() );
        airHarbourResDto.setHarbourCnName( arg0.getHarbourCnName() );
        airHarbourResDto.setHarbourUsName( arg0.getHarbourUsName() );
        airHarbourResDto.setCountry( arg0.getCountry() );
        airHarbourResDto.setCountryCode( arg0.getCountryCode() );
        airHarbourResDto.setCity( arg0.getCity() );
        airHarbourResDto.setCityCode( arg0.getCityCode() );
        airHarbourResDto.setState( arg0.getState() );
        airHarbourResDto.setModifyUserName( arg0.getModifyUserName() );
        airHarbourResDto.setModifyRealName( arg0.getModifyRealName() );
        airHarbourResDto.setModifyUserId( arg0.getModifyUserId() );
        airHarbourResDto.setCreateUserName( arg0.getCreateUserName() );
        airHarbourResDto.setCreateRealName( arg0.getCreateRealName() );
        airHarbourResDto.setCreateUserId( arg0.getCreateUserId() );
        airHarbourResDto.setProvince( arg0.getProvince() );
        airHarbourResDto.setProvinceCode( arg0.getProvinceCode() );
        airHarbourResDto.setLongitude( arg0.getLongitude() );
        airHarbourResDto.setLatitude( arg0.getLatitude() );

        return airHarbourResDto;
    }

    @Override
    public AirHarbourResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirHarbourResDto airHarbourResDto = new AirHarbourResDto();

        return airHarbourResDto;
    }

    @Override
    public AirHarbourEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirHarbourEntity airHarbourEntity = new AirHarbourEntity();

        return airHarbourEntity;
    }

    @Override
    public String entity2Po(AirHarbourEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<AirHarbourEntity> dtoList2EntityList(List<AirHarbourResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirHarbourEntity> list = new ArrayList<AirHarbourEntity>( arg0.size() );
        for ( AirHarbourResDto airHarbourResDto : arg0 ) {
            list.add( dto2Entity( airHarbourResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<AirHarbourResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirHarbourResDto airHarbourResDto : arg0 ) {
            list.add( dto2Po( airHarbourResDto ) );
        }

        return list;
    }

    @Override
    public List<AirHarbourResDto> entityList2DtoList(List<AirHarbourEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirHarbourResDto> list = new ArrayList<AirHarbourResDto>( arg0.size() );
        for ( AirHarbourEntity airHarbourEntity : arg0 ) {
            list.add( entity2Dto( airHarbourEntity ) );
        }

        return list;
    }

    @Override
    public List<AirHarbourResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirHarbourResDto> list = new ArrayList<AirHarbourResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<AirHarbourEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirHarbourEntity> list = new ArrayList<AirHarbourEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<AirHarbourEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( AirHarbourEntity airHarbourEntity : arg0 ) {
            list.add( entity2Po( airHarbourEntity ) );
        }

        return list;
    }
}
