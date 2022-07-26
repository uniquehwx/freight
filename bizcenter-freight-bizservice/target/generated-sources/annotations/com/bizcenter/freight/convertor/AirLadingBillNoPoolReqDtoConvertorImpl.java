package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.AirLadingBillNoPoolEntity;
import com.bizcenter.freight.dto.req.AirLadingBillNoPoolReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.AirLadingBillNoPoolPo;
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
public class AirLadingBillNoPoolReqDtoConvertorImpl extends AirLadingBillNoPoolReqDtoConvertor {

    @Override
    public AirLadingBillNoPoolEntity dto2Entity(AirLadingBillNoPoolReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirLadingBillNoPoolEntity airLadingBillNoPoolEntity = new AirLadingBillNoPoolEntity();

        airLadingBillNoPoolEntity.setAirCompanyCode( arg0.getAirCompanyCode() );
        airLadingBillNoPoolEntity.setCompanyCode( arg0.getCompanyCode() );
        airLadingBillNoPoolEntity.setLadingBillNo( arg0.getLadingBillNo() );
        airLadingBillNoPoolEntity.setLadingBillType( arg0.getLadingBillType() );
        airLadingBillNoPoolEntity.setLadingBillNoStatusCode( arg0.getLadingBillNoStatusCode() );
        airLadingBillNoPoolEntity.setIssuedAt( arg0.getIssuedAt() );
        airLadingBillNoPoolEntity.setNotBefore( arg0.getNotBefore() );
        airLadingBillNoPoolEntity.setNotAfter( arg0.getNotAfter() );
        airLadingBillNoPoolEntity.setModifyRealName( arg0.getModifyRealName() );
        airLadingBillNoPoolEntity.setCreateRealName( arg0.getCreateRealName() );
        airLadingBillNoPoolEntity.setPlanningStatusCode( arg0.getPlanningStatusCode() );
        airLadingBillNoPoolEntity.setOrderNo( arg0.getOrderNo() );

        return airLadingBillNoPoolEntity;
    }

    @Override
    public AirLadingBillNoPoolPo dto2Po(AirLadingBillNoPoolReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirLadingBillNoPoolPo airLadingBillNoPoolPo = new AirLadingBillNoPoolPo();

        airLadingBillNoPoolPo.setAppId( arg0.getAppId() );
        airLadingBillNoPoolPo.setTenantId( arg0.getTenantId() );
        airLadingBillNoPoolPo.setAirCompanyCode( arg0.getAirCompanyCode() );
        airLadingBillNoPoolPo.setCompanyCode( arg0.getCompanyCode() );
        airLadingBillNoPoolPo.setLadingBillNo( arg0.getLadingBillNo() );
        airLadingBillNoPoolPo.setLadingBillType( arg0.getLadingBillType() );
        airLadingBillNoPoolPo.setLadingBillNoStatusCode( arg0.getLadingBillNoStatusCode() );
        airLadingBillNoPoolPo.setIssuedAt( arg0.getIssuedAt() );
        airLadingBillNoPoolPo.setNotBefore( arg0.getNotBefore() );
        airLadingBillNoPoolPo.setNotAfter( arg0.getNotAfter() );
        airLadingBillNoPoolPo.setModifyRealName( arg0.getModifyRealName() );
        airLadingBillNoPoolPo.setCreateRealName( arg0.getCreateRealName() );
        airLadingBillNoPoolPo.setPlanningStatusCode( arg0.getPlanningStatusCode() );
        airLadingBillNoPoolPo.setOrderNo( arg0.getOrderNo() );

        return airLadingBillNoPoolPo;
    }

    @Override
    public AirLadingBillNoPoolReqDto entity2Dto(AirLadingBillNoPoolEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirLadingBillNoPoolReqDto airLadingBillNoPoolReqDto = new AirLadingBillNoPoolReqDto();

        airLadingBillNoPoolReqDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airLadingBillNoPoolReqDto.setCompanyCode( arg0.getCompanyCode() );
        airLadingBillNoPoolReqDto.setLadingBillNo( arg0.getLadingBillNo() );
        airLadingBillNoPoolReqDto.setLadingBillType( arg0.getLadingBillType() );
        airLadingBillNoPoolReqDto.setLadingBillNoStatusCode( arg0.getLadingBillNoStatusCode() );
        airLadingBillNoPoolReqDto.setIssuedAt( arg0.getIssuedAt() );
        airLadingBillNoPoolReqDto.setNotBefore( arg0.getNotBefore() );
        airLadingBillNoPoolReqDto.setNotAfter( arg0.getNotAfter() );
        airLadingBillNoPoolReqDto.setModifyRealName( arg0.getModifyRealName() );
        airLadingBillNoPoolReqDto.setCreateRealName( arg0.getCreateRealName() );
        airLadingBillNoPoolReqDto.setPlanningStatusCode( arg0.getPlanningStatusCode() );
        airLadingBillNoPoolReqDto.setOrderNo( arg0.getOrderNo() );

        return airLadingBillNoPoolReqDto;
    }

    @Override
    public AirLadingBillNoPoolReqDto po2Dto(AirLadingBillNoPoolPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirLadingBillNoPoolReqDto airLadingBillNoPoolReqDto = new AirLadingBillNoPoolReqDto();

        airLadingBillNoPoolReqDto.setAirCompanyCode( arg0.getAirCompanyCode() );
        airLadingBillNoPoolReqDto.setCompanyCode( arg0.getCompanyCode() );
        airLadingBillNoPoolReqDto.setLadingBillNo( arg0.getLadingBillNo() );
        airLadingBillNoPoolReqDto.setLadingBillType( arg0.getLadingBillType() );
        airLadingBillNoPoolReqDto.setLadingBillNoStatusCode( arg0.getLadingBillNoStatusCode() );
        airLadingBillNoPoolReqDto.setIssuedAt( arg0.getIssuedAt() );
        airLadingBillNoPoolReqDto.setNotBefore( arg0.getNotBefore() );
        airLadingBillNoPoolReqDto.setNotAfter( arg0.getNotAfter() );
        airLadingBillNoPoolReqDto.setTenantId( arg0.getTenantId() );
        airLadingBillNoPoolReqDto.setAppId( arg0.getAppId() );
        airLadingBillNoPoolReqDto.setModifyRealName( arg0.getModifyRealName() );
        airLadingBillNoPoolReqDto.setCreateRealName( arg0.getCreateRealName() );
        airLadingBillNoPoolReqDto.setPlanningStatusCode( arg0.getPlanningStatusCode() );
        airLadingBillNoPoolReqDto.setOrderNo( arg0.getOrderNo() );

        return airLadingBillNoPoolReqDto;
    }

    @Override
    public AirLadingBillNoPoolEntity po2Entity(AirLadingBillNoPoolPo arg0) {
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
    public AirLadingBillNoPoolPo entity2Po(AirLadingBillNoPoolEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AirLadingBillNoPoolPo airLadingBillNoPoolPo = new AirLadingBillNoPoolPo();

        airLadingBillNoPoolPo.setId( arg0.getId() );
        airLadingBillNoPoolPo.setCreateUserId( arg0.getCreateUserId() );
        airLadingBillNoPoolPo.setCreateUserName( arg0.getCreateUserName() );
        airLadingBillNoPoolPo.setModifyUserId( arg0.getModifyUserId() );
        airLadingBillNoPoolPo.setModifyUserName( arg0.getModifyUserName() );
        airLadingBillNoPoolPo.setAirCompanyCode( arg0.getAirCompanyCode() );
        airLadingBillNoPoolPo.setCompanyCode( arg0.getCompanyCode() );
        airLadingBillNoPoolPo.setLadingBillNo( arg0.getLadingBillNo() );
        airLadingBillNoPoolPo.setLadingBillType( arg0.getLadingBillType() );
        airLadingBillNoPoolPo.setLadingBillNoStatusCode( arg0.getLadingBillNoStatusCode() );
        airLadingBillNoPoolPo.setIssuedAt( arg0.getIssuedAt() );
        airLadingBillNoPoolPo.setNotBefore( arg0.getNotBefore() );
        airLadingBillNoPoolPo.setNotAfter( arg0.getNotAfter() );
        airLadingBillNoPoolPo.setModifyRealName( arg0.getModifyRealName() );
        airLadingBillNoPoolPo.setCreateRealName( arg0.getCreateRealName() );
        airLadingBillNoPoolPo.setPlanningStatusCode( arg0.getPlanningStatusCode() );
        airLadingBillNoPoolPo.setOrderNo( arg0.getOrderNo() );

        return airLadingBillNoPoolPo;
    }

    @Override
    public List<AirLadingBillNoPoolEntity> dtoList2EntityList(List<AirLadingBillNoPoolReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirLadingBillNoPoolEntity> list = new ArrayList<AirLadingBillNoPoolEntity>( arg0.size() );
        for ( AirLadingBillNoPoolReqDto airLadingBillNoPoolReqDto : arg0 ) {
            list.add( dto2Entity( airLadingBillNoPoolReqDto ) );
        }

        return list;
    }

    @Override
    public List<AirLadingBillNoPoolPo> dtoList2PoList(List<AirLadingBillNoPoolReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirLadingBillNoPoolPo> list = new ArrayList<AirLadingBillNoPoolPo>( arg0.size() );
        for ( AirLadingBillNoPoolReqDto airLadingBillNoPoolReqDto : arg0 ) {
            list.add( dto2Po( airLadingBillNoPoolReqDto ) );
        }

        return list;
    }

    @Override
    public List<AirLadingBillNoPoolReqDto> entityList2DtoList(List<AirLadingBillNoPoolEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirLadingBillNoPoolReqDto> list = new ArrayList<AirLadingBillNoPoolReqDto>( arg0.size() );
        for ( AirLadingBillNoPoolEntity airLadingBillNoPoolEntity : arg0 ) {
            list.add( entity2Dto( airLadingBillNoPoolEntity ) );
        }

        return list;
    }

    @Override
    public List<AirLadingBillNoPoolReqDto> poList2DtoList(List<AirLadingBillNoPoolPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirLadingBillNoPoolReqDto> list = new ArrayList<AirLadingBillNoPoolReqDto>( arg0.size() );
        for ( AirLadingBillNoPoolPo airLadingBillNoPoolPo : arg0 ) {
            list.add( po2Dto( airLadingBillNoPoolPo ) );
        }

        return list;
    }

    @Override
    public List<AirLadingBillNoPoolEntity> poList2EntityList(List<AirLadingBillNoPoolPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirLadingBillNoPoolEntity> list = new ArrayList<AirLadingBillNoPoolEntity>( arg0.size() );
        for ( AirLadingBillNoPoolPo airLadingBillNoPoolPo : arg0 ) {
            list.add( po2Entity( airLadingBillNoPoolPo ) );
        }

        return list;
    }

    @Override
    public List<AirLadingBillNoPoolPo> entityList2PoList(List<AirLadingBillNoPoolEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<AirLadingBillNoPoolPo> list = new ArrayList<AirLadingBillNoPoolPo>( arg0.size() );
        for ( AirLadingBillNoPoolEntity airLadingBillNoPoolEntity : arg0 ) {
            list.add( entity2Po( airLadingBillNoPoolEntity ) );
        }

        return list;
    }
}
