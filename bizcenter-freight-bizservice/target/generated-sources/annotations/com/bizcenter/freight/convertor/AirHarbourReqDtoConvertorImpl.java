package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirHarbourEntity;
import com.bizcenter.freight.dto.req.AirHarbourReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirHarbourPo;
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
public class AirHarbourReqDtoConvertorImpl extends AirHarbourReqDtoConvertor {

    @Override
    public AirHarbourEntity dto2Entity(AirHarbourReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirHarbourEntity airHarbourEntity = new AirHarbourEntity();

        airHarbourEntity.setHarbourNo( arg0.getHarbourNo() );
        airHarbourEntity.setHarbourCode( arg0.getHarbourCode() );
        airHarbourEntity.setHarbourCnName( arg0.getHarbourCnName() );
        airHarbourEntity.setHarbourUsName( arg0.getHarbourUsName() );
        airHarbourEntity.setCountry( arg0.getCountry() );
        airHarbourEntity.setCountryCode( arg0.getCountryCode() );
        airHarbourEntity.setCity( arg0.getCity() );
        airHarbourEntity.setCityCode( arg0.getCityCode() );
        airHarbourEntity.setState( arg0.getState() );
        airHarbourEntity.setModifyRealName( arg0.getModifyRealName() );
        airHarbourEntity.setCreateRealName( arg0.getCreateRealName() );
        airHarbourEntity.setProvince( arg0.getProvince() );
        airHarbourEntity.setProvinceCode( arg0.getProvinceCode() );
        airHarbourEntity.setLongitude( arg0.getLongitude() );
        airHarbourEntity.setLatitude( arg0.getLatitude() );

        return airHarbourEntity;
    }

    @Override
    public AirHarbourPo dto2Po(AirHarbourReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirHarbourPo airHarbourPo = new AirHarbourPo();

        airHarbourPo.setAppId( arg0.getAppId() );
        airHarbourPo.setTenantId( arg0.getTenantId() );
        airHarbourPo.setHarbourNo( arg0.getHarbourNo() );
        airHarbourPo.setHarbourCode( arg0.getHarbourCode() );
        airHarbourPo.setHarbourCnName( arg0.getHarbourCnName() );
        airHarbourPo.setHarbourUsName( arg0.getHarbourUsName() );
        airHarbourPo.setCountry( arg0.getCountry() );
        airHarbourPo.setCountryCode( arg0.getCountryCode() );
        airHarbourPo.setCity( arg0.getCity() );
        airHarbourPo.setCityCode( arg0.getCityCode() );
        airHarbourPo.setState( arg0.getState() );
        airHarbourPo.setModifyRealName( arg0.getModifyRealName() );
        airHarbourPo.setCreateRealName( arg0.getCreateRealName() );
        airHarbourPo.setProvince( arg0.getProvince() );
        airHarbourPo.setProvinceCode( arg0.getProvinceCode() );
        airHarbourPo.setLongitude( arg0.getLongitude() );
        airHarbourPo.setLatitude( arg0.getLatitude() );

        return airHarbourPo;
    }

    @Override
    public AirHarbourReqDto entity2Dto(AirHarbourEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirHarbourReqDto airHarbourReqDto = new AirHarbourReqDto();

        airHarbourReqDto.setHarbourNo( arg0.getHarbourNo() );
        airHarbourReqDto.setHarbourCode( arg0.getHarbourCode() );
        airHarbourReqDto.setHarbourCnName( arg0.getHarbourCnName() );
        airHarbourReqDto.setHarbourUsName( arg0.getHarbourUsName() );
        airHarbourReqDto.setCountry( arg0.getCountry() );
        airHarbourReqDto.setCountryCode( arg0.getCountryCode() );
        airHarbourReqDto.setCity( arg0.getCity() );
        airHarbourReqDto.setCityCode( arg0.getCityCode() );
        airHarbourReqDto.setState( arg0.getState() );
        airHarbourReqDto.setModifyRealName( arg0.getModifyRealName() );
        airHarbourReqDto.setCreateRealName( arg0.getCreateRealName() );
        airHarbourReqDto.setProvince( arg0.getProvince() );
        airHarbourReqDto.setProvinceCode( arg0.getProvinceCode() );
        airHarbourReqDto.setLongitude( arg0.getLongitude() );
        airHarbourReqDto.setLatitude( arg0.getLatitude() );

        return airHarbourReqDto;
    }

    @Override
    public AirHarbourReqDto po2Dto(AirHarbourPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirHarbourReqDto airHarbourReqDto = new AirHarbourReqDto();

        airHarbourReqDto.setHarbourNo( arg0.getHarbourNo() );
        airHarbourReqDto.setHarbourCode( arg0.getHarbourCode() );
        airHarbourReqDto.setHarbourCnName( arg0.getHarbourCnName() );
        airHarbourReqDto.setHarbourUsName( arg0.getHarbourUsName() );
        airHarbourReqDto.setCountry( arg0.getCountry() );
        airHarbourReqDto.setCountryCode( arg0.getCountryCode() );
        airHarbourReqDto.setCity( arg0.getCity() );
        airHarbourReqDto.setCityCode( arg0.getCityCode() );
        airHarbourReqDto.setState( arg0.getState() );
        airHarbourReqDto.setTenantId( arg0.getTenantId() );
        airHarbourReqDto.setAppId( arg0.getAppId() );
        airHarbourReqDto.setModifyRealName( arg0.getModifyRealName() );
        airHarbourReqDto.setCreateRealName( arg0.getCreateRealName() );
        airHarbourReqDto.setProvince( arg0.getProvince() );
        airHarbourReqDto.setProvinceCode( arg0.getProvinceCode() );
        airHarbourReqDto.setLongitude( arg0.getLongitude() );
        airHarbourReqDto.setLatitude( arg0.getLatitude() );

        return airHarbourReqDto;
    }

    @Override
    public AirHarbourEntity po2Entity(AirHarbourPo arg0) {
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
    public AirHarbourPo entity2Po(AirHarbourEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirHarbourPo airHarbourPo = new AirHarbourPo();

        airHarbourPo.setId( arg0.getId() );
        airHarbourPo.setCreateUserId( arg0.getCreateUserId() );
        airHarbourPo.setCreateUserName( arg0.getCreateUserName() );
        airHarbourPo.setModifyUserId( arg0.getModifyUserId() );
        airHarbourPo.setModifyUserName( arg0.getModifyUserName() );
        airHarbourPo.setHarbourNo( arg0.getHarbourNo() );
        airHarbourPo.setHarbourCode( arg0.getHarbourCode() );
        airHarbourPo.setHarbourCnName( arg0.getHarbourCnName() );
        airHarbourPo.setHarbourUsName( arg0.getHarbourUsName() );
        airHarbourPo.setCountry( arg0.getCountry() );
        airHarbourPo.setCountryCode( arg0.getCountryCode() );
        airHarbourPo.setCity( arg0.getCity() );
        airHarbourPo.setCityCode( arg0.getCityCode() );
        airHarbourPo.setState( arg0.getState() );
        airHarbourPo.setModifyRealName( arg0.getModifyRealName() );
        airHarbourPo.setCreateRealName( arg0.getCreateRealName() );
        airHarbourPo.setProvince( arg0.getProvince() );
        airHarbourPo.setProvinceCode( arg0.getProvinceCode() );
        airHarbourPo.setLongitude( arg0.getLongitude() );
        airHarbourPo.setLatitude( arg0.getLatitude() );

        return airHarbourPo;
    }

    @Override
    public List<AirHarbourEntity> dtoList2EntityList(List<AirHarbourReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirHarbourEntity> list = new ArrayList<AirHarbourEntity>( arg0.size() );
        for ( AirHarbourReqDto airHarbourReqDto : arg0 ) {
            list.add( dto2Entity( airHarbourReqDto ) );
        }

        return list;
    }

    @Override
    public List<AirHarbourPo> dtoList2PoList(List<AirHarbourReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirHarbourPo> list = new ArrayList<AirHarbourPo>( arg0.size() );
        for ( AirHarbourReqDto airHarbourReqDto : arg0 ) {
            list.add( dto2Po( airHarbourReqDto ) );
        }

        return list;
    }

    @Override
    public List<AirHarbourReqDto> entityList2DtoList(List<AirHarbourEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirHarbourReqDto> list = new ArrayList<AirHarbourReqDto>( arg0.size() );
        for ( AirHarbourEntity airHarbourEntity : arg0 ) {
            list.add( entity2Dto( airHarbourEntity ) );
        }

        return list;
    }

    @Override
    public List<AirHarbourReqDto> poList2DtoList(List<AirHarbourPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirHarbourReqDto> list = new ArrayList<AirHarbourReqDto>( arg0.size() );
        for ( AirHarbourPo airHarbourPo : arg0 ) {
            list.add( po2Dto( airHarbourPo ) );
        }

        return list;
    }

    @Override
    public List<AirHarbourEntity> poList2EntityList(List<AirHarbourPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirHarbourEntity> list = new ArrayList<AirHarbourEntity>( arg0.size() );
        for ( AirHarbourPo airHarbourPo : arg0 ) {
            list.add( po2Entity( airHarbourPo ) );
        }

        return list;
    }

    @Override
    public List<AirHarbourPo> entityList2PoList(List<AirHarbourEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirHarbourPo> list = new ArrayList<AirHarbourPo>( arg0.size() );
        for ( AirHarbourEntity airHarbourEntity : arg0 ) {
            list.add( entity2Po( airHarbourEntity ) );
        }

        return list;
    }
}
