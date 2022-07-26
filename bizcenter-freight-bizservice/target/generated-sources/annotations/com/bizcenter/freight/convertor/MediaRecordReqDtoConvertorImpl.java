package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.MediaRecordEntity;
import com.bizcenter.freight.dto.req.MediaRecordReqDto;
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
    public String dto2Po(MediaRecordReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
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
    public MediaRecordReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MediaRecordReqDto mediaRecordReqDto = new MediaRecordReqDto();

        return mediaRecordReqDto;
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
    public List<String> dtoList2PoList(List<MediaRecordReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
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
    public List<MediaRecordReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<MediaRecordReqDto> list = new ArrayList<MediaRecordReqDto>( arg0.size() );
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
