package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.MediaRecordEntity;
import com.bizcenter.freight.dto.res.MediaRecordResDto;
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
    public String dto2Po(MediaRecordResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
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
    public MediaRecordResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordResDto mediaRecordResDto = new MediaRecordResDto();

        return mediaRecordResDto;
    }

    @Override
    public MediaRecordEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordEntity mediaRecordEntity = new MediaRecordEntity();

        return mediaRecordEntity;
    }

    @Override
    public String entity2Po(MediaRecordEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
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
    public List<String> dtoList2PoList(List<MediaRecordResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
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
    public List<MediaRecordResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordResDto> list = new ArrayList<MediaRecordResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<MediaRecordEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordEntity> list = new ArrayList<MediaRecordEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<MediaRecordEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( MediaRecordEntity mediaRecordEntity : arg0 ) {
            list.add( entity2Po( mediaRecordEntity ) );
        }

        return list;
    }
}
