package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WaybillExceptionLogEntity;
import com.bizcenter.freight.dto.req.WaybillExceptionLogReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.WaybillExceptionLogPo;
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
public class WaybillExceptionLogReqDtoConvertorImpl extends WaybillExceptionLogReqDtoConvertor {

    @Override
    public WaybillExceptionLogEntity dto2Entity(WaybillExceptionLogReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillExceptionLogEntity waybillExceptionLogEntity = new WaybillExceptionLogEntity();

        waybillExceptionLogEntity.setStatusKey( arg0.getStatusKey() );
        waybillExceptionLogEntity.setTypeKey( arg0.getTypeKey() );
        waybillExceptionLogEntity.setWaybillStateId( arg0.getWaybillStateId() );
        waybillExceptionLogEntity.setUrl( arg0.getUrl() );
        waybillExceptionLogEntity.setWaybillId( arg0.getWaybillId() );
        waybillExceptionLogEntity.setRemark( arg0.getRemark() );
        waybillExceptionLogEntity.setIsvId( arg0.getIsvId() );
        waybillExceptionLogEntity.setModifyRealName( arg0.getModifyRealName() );
        waybillExceptionLogEntity.setCreateRealName( arg0.getCreateRealName() );

        return waybillExceptionLogEntity;
    }

    @Override
    public WaybillExceptionLogPo dto2Po(WaybillExceptionLogReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillExceptionLogPo waybillExceptionLogPo = new WaybillExceptionLogPo();

        waybillExceptionLogPo.setAppId( arg0.getAppId() );
        waybillExceptionLogPo.setTenantId( arg0.getTenantId() );
        waybillExceptionLogPo.setStatusKey( arg0.getStatusKey() );
        waybillExceptionLogPo.setTypeKey( arg0.getTypeKey() );
        waybillExceptionLogPo.setWaybillStateId( arg0.getWaybillStateId() );
        waybillExceptionLogPo.setUrl( arg0.getUrl() );
        waybillExceptionLogPo.setWaybillId( arg0.getWaybillId() );
        waybillExceptionLogPo.setRemark( arg0.getRemark() );
        waybillExceptionLogPo.setIsvId( arg0.getIsvId() );
        waybillExceptionLogPo.setModifyRealName( arg0.getModifyRealName() );
        waybillExceptionLogPo.setCreateRealName( arg0.getCreateRealName() );

        return waybillExceptionLogPo;
    }

    @Override
    public WaybillExceptionLogReqDto entity2Dto(WaybillExceptionLogEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillExceptionLogReqDto waybillExceptionLogReqDto = new WaybillExceptionLogReqDto();

        waybillExceptionLogReqDto.setStatusKey( arg0.getStatusKey() );
        waybillExceptionLogReqDto.setTypeKey( arg0.getTypeKey() );
        waybillExceptionLogReqDto.setWaybillStateId( arg0.getWaybillStateId() );
        waybillExceptionLogReqDto.setUrl( arg0.getUrl() );
        waybillExceptionLogReqDto.setWaybillId( arg0.getWaybillId() );
        waybillExceptionLogReqDto.setRemark( arg0.getRemark() );
        waybillExceptionLogReqDto.setIsvId( arg0.getIsvId() );
        waybillExceptionLogReqDto.setModifyRealName( arg0.getModifyRealName() );
        waybillExceptionLogReqDto.setCreateRealName( arg0.getCreateRealName() );

        return waybillExceptionLogReqDto;
    }

    @Override
    public WaybillExceptionLogReqDto po2Dto(WaybillExceptionLogPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillExceptionLogReqDto waybillExceptionLogReqDto = new WaybillExceptionLogReqDto();

        waybillExceptionLogReqDto.setStatusKey( arg0.getStatusKey() );
        waybillExceptionLogReqDto.setTypeKey( arg0.getTypeKey() );
        waybillExceptionLogReqDto.setWaybillStateId( arg0.getWaybillStateId() );
        waybillExceptionLogReqDto.setUrl( arg0.getUrl() );
        waybillExceptionLogReqDto.setWaybillId( arg0.getWaybillId() );
        waybillExceptionLogReqDto.setRemark( arg0.getRemark() );
        waybillExceptionLogReqDto.setTenantId( arg0.getTenantId() );
        waybillExceptionLogReqDto.setAppId( arg0.getAppId() );
        waybillExceptionLogReqDto.setIsvId( arg0.getIsvId() );
        waybillExceptionLogReqDto.setModifyRealName( arg0.getModifyRealName() );
        waybillExceptionLogReqDto.setCreateRealName( arg0.getCreateRealName() );

        return waybillExceptionLogReqDto;
    }

    @Override
    public WaybillExceptionLogEntity po2Entity(WaybillExceptionLogPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillExceptionLogEntity waybillExceptionLogEntity = new WaybillExceptionLogEntity();

        waybillExceptionLogEntity.setId( arg0.getId() );
        waybillExceptionLogEntity.setStatusKey( arg0.getStatusKey() );
        waybillExceptionLogEntity.setTypeKey( arg0.getTypeKey() );
        waybillExceptionLogEntity.setWaybillStateId( arg0.getWaybillStateId() );
        waybillExceptionLogEntity.setUrl( arg0.getUrl() );
        waybillExceptionLogEntity.setWaybillId( arg0.getWaybillId() );
        waybillExceptionLogEntity.setRemark( arg0.getRemark() );
        waybillExceptionLogEntity.setModifyUserName( arg0.getModifyUserName() );
        waybillExceptionLogEntity.setModifyUserId( arg0.getModifyUserId() );
        waybillExceptionLogEntity.setCreateUserName( arg0.getCreateUserName() );
        waybillExceptionLogEntity.setCreateUserId( arg0.getCreateUserId() );
        waybillExceptionLogEntity.setIsvId( arg0.getIsvId() );
        waybillExceptionLogEntity.setModifyRealName( arg0.getModifyRealName() );
        waybillExceptionLogEntity.setCreateRealName( arg0.getCreateRealName() );

        return waybillExceptionLogEntity;
    }

    @Override
    public WaybillExceptionLogPo entity2Po(WaybillExceptionLogEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillExceptionLogPo waybillExceptionLogPo = new WaybillExceptionLogPo();

        waybillExceptionLogPo.setId( arg0.getId() );
        waybillExceptionLogPo.setCreateUserId( arg0.getCreateUserId() );
        waybillExceptionLogPo.setCreateUserName( arg0.getCreateUserName() );
        waybillExceptionLogPo.setModifyUserId( arg0.getModifyUserId() );
        waybillExceptionLogPo.setModifyUserName( arg0.getModifyUserName() );
        waybillExceptionLogPo.setStatusKey( arg0.getStatusKey() );
        waybillExceptionLogPo.setTypeKey( arg0.getTypeKey() );
        waybillExceptionLogPo.setWaybillStateId( arg0.getWaybillStateId() );
        waybillExceptionLogPo.setUrl( arg0.getUrl() );
        waybillExceptionLogPo.setWaybillId( arg0.getWaybillId() );
        waybillExceptionLogPo.setRemark( arg0.getRemark() );
        waybillExceptionLogPo.setIsvId( arg0.getIsvId() );
        waybillExceptionLogPo.setModifyRealName( arg0.getModifyRealName() );
        waybillExceptionLogPo.setCreateRealName( arg0.getCreateRealName() );

        return waybillExceptionLogPo;
    }

    @Override
    public List<WaybillExceptionLogEntity> dtoList2EntityList(List<WaybillExceptionLogReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillExceptionLogEntity> list = new ArrayList<WaybillExceptionLogEntity>( arg0.size() );
        for ( WaybillExceptionLogReqDto waybillExceptionLogReqDto : arg0 ) {
            list.add( dto2Entity( waybillExceptionLogReqDto ) );
        }

        return list;
    }

    @Override
    public List<WaybillExceptionLogPo> dtoList2PoList(List<WaybillExceptionLogReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillExceptionLogPo> list = new ArrayList<WaybillExceptionLogPo>( arg0.size() );
        for ( WaybillExceptionLogReqDto waybillExceptionLogReqDto : arg0 ) {
            list.add( dto2Po( waybillExceptionLogReqDto ) );
        }

        return list;
    }

    @Override
    public List<WaybillExceptionLogReqDto> entityList2DtoList(List<WaybillExceptionLogEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillExceptionLogReqDto> list = new ArrayList<WaybillExceptionLogReqDto>( arg0.size() );
        for ( WaybillExceptionLogEntity waybillExceptionLogEntity : arg0 ) {
            list.add( entity2Dto( waybillExceptionLogEntity ) );
        }

        return list;
    }

    @Override
    public List<WaybillExceptionLogReqDto> poList2DtoList(List<WaybillExceptionLogPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillExceptionLogReqDto> list = new ArrayList<WaybillExceptionLogReqDto>( arg0.size() );
        for ( WaybillExceptionLogPo waybillExceptionLogPo : arg0 ) {
            list.add( po2Dto( waybillExceptionLogPo ) );
        }

        return list;
    }

    @Override
    public List<WaybillExceptionLogEntity> poList2EntityList(List<WaybillExceptionLogPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillExceptionLogEntity> list = new ArrayList<WaybillExceptionLogEntity>( arg0.size() );
        for ( WaybillExceptionLogPo waybillExceptionLogPo : arg0 ) {
            list.add( po2Entity( waybillExceptionLogPo ) );
        }

        return list;
    }

    @Override
    public List<WaybillExceptionLogPo> entityList2PoList(List<WaybillExceptionLogEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillExceptionLogPo> list = new ArrayList<WaybillExceptionLogPo>( arg0.size() );
        for ( WaybillExceptionLogEntity waybillExceptionLogEntity : arg0 ) {
            list.add( entity2Po( waybillExceptionLogEntity ) );
        }

        return list;
    }
}
