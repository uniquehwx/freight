package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WaybillExceptionLogEntity;
import com.bizcenter.freight.dto.req.WaybillExceptionLogReqDto;
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
    public String dto2Po(WaybillExceptionLogReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
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
    public WaybillExceptionLogReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillExceptionLogReqDto waybillExceptionLogReqDto = new WaybillExceptionLogReqDto();

        return waybillExceptionLogReqDto;
    }

    @Override
    public WaybillExceptionLogEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WaybillExceptionLogEntity waybillExceptionLogEntity = new WaybillExceptionLogEntity();

        return waybillExceptionLogEntity;
    }

    @Override
    public String entity2Po(WaybillExceptionLogEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
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
    public List<String> dtoList2PoList(List<WaybillExceptionLogReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
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
    public List<WaybillExceptionLogReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillExceptionLogReqDto> list = new ArrayList<WaybillExceptionLogReqDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<WaybillExceptionLogEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WaybillExceptionLogEntity> list = new ArrayList<WaybillExceptionLogEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<WaybillExceptionLogEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WaybillExceptionLogEntity waybillExceptionLogEntity : arg0 ) {
            list.add( entity2Po( waybillExceptionLogEntity ) );
        }

        return list;
    }
}
