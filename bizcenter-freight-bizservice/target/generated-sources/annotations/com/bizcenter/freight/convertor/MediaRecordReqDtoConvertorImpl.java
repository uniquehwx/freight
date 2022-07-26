package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.MediaRecordEntity;
import com.bizcenter.freight.dto.req.MediaRecordReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.MediaRecordPo;
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
public class MediaRecordReqDtoConvertorImpl extends MediaRecordReqDtoConvertor {

    @Override
    public MediaRecordEntity dto2Entity(MediaRecordReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordEntity mediaRecordEntity = new MediaRecordEntity();

        mediaRecordEntity.setImgUrl( arg0.getImgUrl() );
        mediaRecordEntity.setRefId( arg0.getRefId() );
        mediaRecordEntity.setRemark( arg0.getRemark() );
        mediaRecordEntity.setIsvId( arg0.getIsvId() );
        mediaRecordEntity.setModifyRealName( arg0.getModifyRealName() );
        mediaRecordEntity.setCreateRealName( arg0.getCreateRealName() );
        mediaRecordEntity.setFileName( arg0.getFileName() );
        mediaRecordEntity.setType( arg0.getType() );
        mediaRecordEntity.setStatus( arg0.getStatus() );
        mediaRecordEntity.setExtData1( arg0.getExtData1() );
        mediaRecordEntity.setExtData2( arg0.getExtData2() );

        return mediaRecordEntity;
    }

    @Override
    public MediaRecordPo dto2Po(MediaRecordReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordPo mediaRecordPo = new MediaRecordPo();

        mediaRecordPo.setAppId( arg0.getAppId() );
        mediaRecordPo.setTenantId( arg0.getTenantId() );
        mediaRecordPo.setImgUrl( arg0.getImgUrl() );
        mediaRecordPo.setRefId( arg0.getRefId() );
        mediaRecordPo.setRemark( arg0.getRemark() );
        mediaRecordPo.setIsvId( arg0.getIsvId() );
        mediaRecordPo.setModifyRealName( arg0.getModifyRealName() );
        mediaRecordPo.setCreateRealName( arg0.getCreateRealName() );
        mediaRecordPo.setFileName( arg0.getFileName() );
        mediaRecordPo.setType( arg0.getType() );
        mediaRecordPo.setStatus( arg0.getStatus() );
        mediaRecordPo.setExtData1( arg0.getExtData1() );
        mediaRecordPo.setExtData2( arg0.getExtData2() );

        return mediaRecordPo;
    }

    @Override
    public MediaRecordReqDto entity2Dto(MediaRecordEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordReqDto mediaRecordReqDto = new MediaRecordReqDto();

        mediaRecordReqDto.setImgUrl( arg0.getImgUrl() );
        mediaRecordReqDto.setRefId( arg0.getRefId() );
        mediaRecordReqDto.setRemark( arg0.getRemark() );
        mediaRecordReqDto.setIsvId( arg0.getIsvId() );
        mediaRecordReqDto.setModifyRealName( arg0.getModifyRealName() );
        mediaRecordReqDto.setCreateRealName( arg0.getCreateRealName() );
        mediaRecordReqDto.setFileName( arg0.getFileName() );
        mediaRecordReqDto.setType( arg0.getType() );
        mediaRecordReqDto.setStatus( arg0.getStatus() );
        mediaRecordReqDto.setExtData1( arg0.getExtData1() );
        mediaRecordReqDto.setExtData2( arg0.getExtData2() );

        return mediaRecordReqDto;
    }

    @Override
    public MediaRecordReqDto po2Dto(MediaRecordPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordReqDto mediaRecordReqDto = new MediaRecordReqDto();

        mediaRecordReqDto.setImgUrl( arg0.getImgUrl() );
        mediaRecordReqDto.setRefId( arg0.getRefId() );
        mediaRecordReqDto.setRemark( arg0.getRemark() );
        mediaRecordReqDto.setTenantId( arg0.getTenantId() );
        mediaRecordReqDto.setAppId( arg0.getAppId() );
        mediaRecordReqDto.setIsvId( arg0.getIsvId() );
        mediaRecordReqDto.setModifyRealName( arg0.getModifyRealName() );
        mediaRecordReqDto.setCreateRealName( arg0.getCreateRealName() );
        mediaRecordReqDto.setFileName( arg0.getFileName() );
        mediaRecordReqDto.setType( arg0.getType() );
        mediaRecordReqDto.setStatus( arg0.getStatus() );
        mediaRecordReqDto.setExtData1( arg0.getExtData1() );
        mediaRecordReqDto.setExtData2( arg0.getExtData2() );

        return mediaRecordReqDto;
    }

    @Override
    public MediaRecordEntity po2Entity(MediaRecordPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordEntity mediaRecordEntity = new MediaRecordEntity();

        mediaRecordEntity.setId( arg0.getId() );
        mediaRecordEntity.setImgUrl( arg0.getImgUrl() );
        mediaRecordEntity.setRefId( arg0.getRefId() );
        mediaRecordEntity.setRemark( arg0.getRemark() );
        mediaRecordEntity.setModifyUserName( arg0.getModifyUserName() );
        mediaRecordEntity.setModifyUserId( arg0.getModifyUserId() );
        mediaRecordEntity.setCreateUserName( arg0.getCreateUserName() );
        mediaRecordEntity.setCreateUserId( arg0.getCreateUserId() );
        mediaRecordEntity.setIsvId( arg0.getIsvId() );
        mediaRecordEntity.setModifyRealName( arg0.getModifyRealName() );
        mediaRecordEntity.setCreateRealName( arg0.getCreateRealName() );
        mediaRecordEntity.setFileName( arg0.getFileName() );
        mediaRecordEntity.setType( arg0.getType() );
        mediaRecordEntity.setStatus( arg0.getStatus() );
        mediaRecordEntity.setExtData1( arg0.getExtData1() );
        mediaRecordEntity.setExtData2( arg0.getExtData2() );

        return mediaRecordEntity;
    }

    @Override
    public MediaRecordPo entity2Po(MediaRecordEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordPo mediaRecordPo = new MediaRecordPo();

        mediaRecordPo.setId( arg0.getId() );
        mediaRecordPo.setCreateUserId( arg0.getCreateUserId() );
        mediaRecordPo.setCreateUserName( arg0.getCreateUserName() );
        mediaRecordPo.setModifyUserId( arg0.getModifyUserId() );
        mediaRecordPo.setModifyUserName( arg0.getModifyUserName() );
        mediaRecordPo.setImgUrl( arg0.getImgUrl() );
        mediaRecordPo.setRefId( arg0.getRefId() );
        mediaRecordPo.setRemark( arg0.getRemark() );
        mediaRecordPo.setIsvId( arg0.getIsvId() );
        mediaRecordPo.setModifyRealName( arg0.getModifyRealName() );
        mediaRecordPo.setCreateRealName( arg0.getCreateRealName() );
        mediaRecordPo.setFileName( arg0.getFileName() );
        mediaRecordPo.setType( arg0.getType() );
        mediaRecordPo.setStatus( arg0.getStatus() );
        mediaRecordPo.setExtData1( arg0.getExtData1() );
        mediaRecordPo.setExtData2( arg0.getExtData2() );

        return mediaRecordPo;
    }

    @Override
    public List<MediaRecordEntity> dtoList2EntityList(List<MediaRecordReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordEntity> list = new ArrayList<MediaRecordEntity>( arg0.size() );
        for ( MediaRecordReqDto mediaRecordReqDto : arg0 ) {
            list.add( dto2Entity( mediaRecordReqDto ) );
        }

        return list;
    }

    @Override
    public List<MediaRecordPo> dtoList2PoList(List<MediaRecordReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordPo> list = new ArrayList<MediaRecordPo>( arg0.size() );
        for ( MediaRecordReqDto mediaRecordReqDto : arg0 ) {
            list.add( dto2Po( mediaRecordReqDto ) );
        }

        return list;
    }

    @Override
    public List<MediaRecordReqDto> entityList2DtoList(List<MediaRecordEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordReqDto> list = new ArrayList<MediaRecordReqDto>( arg0.size() );
        for ( MediaRecordEntity mediaRecordEntity : arg0 ) {
            list.add( entity2Dto( mediaRecordEntity ) );
        }

        return list;
    }

    @Override
    public List<MediaRecordReqDto> poList2DtoList(List<MediaRecordPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordReqDto> list = new ArrayList<MediaRecordReqDto>( arg0.size() );
        for ( MediaRecordPo mediaRecordPo : arg0 ) {
            list.add( po2Dto( mediaRecordPo ) );
        }

        return list;
    }

    @Override
    public List<MediaRecordEntity> poList2EntityList(List<MediaRecordPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordEntity> list = new ArrayList<MediaRecordEntity>( arg0.size() );
        for ( MediaRecordPo mediaRecordPo : arg0 ) {
            list.add( po2Entity( mediaRecordPo ) );
        }

        return list;
    }

    @Override
    public List<MediaRecordPo> entityList2PoList(List<MediaRecordEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordPo> list = new ArrayList<MediaRecordPo>( arg0.size() );
        for ( MediaRecordEntity mediaRecordEntity : arg0 ) {
            list.add( entity2Po( mediaRecordEntity ) );
        }

        return list;
    }
}
