package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.MediaRecordEntity;
import com.bizcenter.freight.dto.res.MediaRecordResDto;
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
public class MediaRecordResDtoConvertorImpl extends MediaRecordResDtoConvertor {

    @Override
    public MediaRecordEntity dto2Entity(MediaRecordResDto arg0) {
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
    public MediaRecordPo dto2Po(MediaRecordResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordPo mediaRecordPo = new MediaRecordPo();

        mediaRecordPo.setId( arg0.getId() );
        mediaRecordPo.setCreateUserId( arg0.getCreateUserId() );
        mediaRecordPo.setCreateUserName( arg0.getCreateUserName() );
        mediaRecordPo.setCreateTime( arg0.getCreateTime() );
        mediaRecordPo.setModifyUserId( arg0.getModifyUserId() );
        mediaRecordPo.setModifyUserName( arg0.getModifyUserName() );
        mediaRecordPo.setModifyTime( arg0.getModifyTime() );
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
    public MediaRecordResDto entity2Dto(MediaRecordEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordResDto mediaRecordResDto = new MediaRecordResDto();

        mediaRecordResDto.setId( arg0.getId() );
        mediaRecordResDto.setImgUrl( arg0.getImgUrl() );
        mediaRecordResDto.setRefId( arg0.getRefId() );
        mediaRecordResDto.setRemark( arg0.getRemark() );
        mediaRecordResDto.setModifyUserName( arg0.getModifyUserName() );
        mediaRecordResDto.setModifyUserId( arg0.getModifyUserId() );
        mediaRecordResDto.setCreateUserName( arg0.getCreateUserName() );
        mediaRecordResDto.setCreateUserId( arg0.getCreateUserId() );
        mediaRecordResDto.setIsvId( arg0.getIsvId() );
        mediaRecordResDto.setModifyRealName( arg0.getModifyRealName() );
        mediaRecordResDto.setCreateRealName( arg0.getCreateRealName() );
        mediaRecordResDto.setFileName( arg0.getFileName() );
        mediaRecordResDto.setType( arg0.getType() );
        mediaRecordResDto.setStatus( arg0.getStatus() );
        mediaRecordResDto.setExtData1( arg0.getExtData1() );
        mediaRecordResDto.setExtData2( arg0.getExtData2() );

        return mediaRecordResDto;
    }

    @Override
    public MediaRecordResDto po2Dto(MediaRecordPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordResDto mediaRecordResDto = new MediaRecordResDto();

        mediaRecordResDto.setId( arg0.getId() );
        mediaRecordResDto.setImgUrl( arg0.getImgUrl() );
        mediaRecordResDto.setRefId( arg0.getRefId() );
        mediaRecordResDto.setRemark( arg0.getRemark() );
        mediaRecordResDto.setModifyTime( arg0.getModifyTime() );
        mediaRecordResDto.setModifyUserName( arg0.getModifyUserName() );
        mediaRecordResDto.setModifyUserId( arg0.getModifyUserId() );
        mediaRecordResDto.setCreateTime( arg0.getCreateTime() );
        mediaRecordResDto.setCreateUserName( arg0.getCreateUserName() );
        mediaRecordResDto.setCreateUserId( arg0.getCreateUserId() );
        mediaRecordResDto.setIsvId( arg0.getIsvId() );
        mediaRecordResDto.setModifyRealName( arg0.getModifyRealName() );
        mediaRecordResDto.setCreateRealName( arg0.getCreateRealName() );
        mediaRecordResDto.setFileName( arg0.getFileName() );
        mediaRecordResDto.setType( arg0.getType() );
        mediaRecordResDto.setStatus( arg0.getStatus() );
        mediaRecordResDto.setExtData1( arg0.getExtData1() );
        mediaRecordResDto.setExtData2( arg0.getExtData2() );

        return mediaRecordResDto;
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
    public List<MediaRecordEntity> dtoList2EntityList(List<MediaRecordResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordEntity> list = new ArrayList<MediaRecordEntity>( arg0.size() );
        for ( MediaRecordResDto mediaRecordResDto : arg0 ) {
            list.add( dto2Entity( mediaRecordResDto ) );
        }

        return list;
    }

    @Override
    public List<MediaRecordPo> dtoList2PoList(List<MediaRecordResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordPo> list = new ArrayList<MediaRecordPo>( arg0.size() );
        for ( MediaRecordResDto mediaRecordResDto : arg0 ) {
            list.add( dto2Po( mediaRecordResDto ) );
        }

        return list;
    }

    @Override
    public List<MediaRecordResDto> entityList2DtoList(List<MediaRecordEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordResDto> list = new ArrayList<MediaRecordResDto>( arg0.size() );
        for ( MediaRecordEntity mediaRecordEntity : arg0 ) {
            list.add( entity2Dto( mediaRecordEntity ) );
        }

        return list;
    }

    @Override
    public List<MediaRecordResDto> poList2DtoList(List<MediaRecordPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordResDto> list = new ArrayList<MediaRecordResDto>( arg0.size() );
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
