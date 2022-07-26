package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOrderDetailEntity;
import com.bizcenter.freight.dto.res.WhOrderDetailResDto;
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
public class WhOrderDetailResDtoConvertorImpl extends WhOrderDetailResDtoConvertor {

    @Override
    public WhOrderDetailEntity dto2Entity(WhOrderDetailResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderDetailEntity whOrderDetailEntity = new WhOrderDetailEntity();

        whOrderDetailEntity.setId( arg0.getId() );
        whOrderDetailEntity.setModifyUserName( arg0.getModifyUserName() );
        whOrderDetailEntity.setModifyUserId( arg0.getModifyUserId() );
        whOrderDetailEntity.setCreateUserName( arg0.getCreateUserName() );
        whOrderDetailEntity.setCreateUserId( arg0.getCreateUserId() );
        whOrderDetailEntity.setIsvId( arg0.getIsvId() );
        whOrderDetailEntity.setCreateRealName( arg0.getCreateRealName() );
        whOrderDetailEntity.setModifyRealName( arg0.getModifyRealName() );
        whOrderDetailEntity.setInStorageNo( arg0.getInStorageNo() );
        whOrderDetailEntity.setTrayNo( arg0.getTrayNo() );
        whOrderDetailEntity.setQuantity( arg0.getQuantity() );
        whOrderDetailEntity.setVolume( arg0.getVolume() );
        whOrderDetailEntity.setWeight( arg0.getWeight() );
        whOrderDetailEntity.setImages( arg0.getImages() );
        whOrderDetailEntity.setRemark( arg0.getRemark() );
        whOrderDetailEntity.setUserDef1( arg0.getUserDef1() );
        whOrderDetailEntity.setUserDef2( arg0.getUserDef2() );
        whOrderDetailEntity.setStatus( arg0.getStatus() );

        return whOrderDetailEntity;
    }

    @Override
    public String dto2Po(WhOrderDetailResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public WhOrderDetailResDto entity2Dto(WhOrderDetailEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderDetailResDto whOrderDetailResDto = new WhOrderDetailResDto();

        whOrderDetailResDto.setId( arg0.getId() );
        whOrderDetailResDto.setModifyUserName( arg0.getModifyUserName() );
        whOrderDetailResDto.setModifyUserId( arg0.getModifyUserId() );
        whOrderDetailResDto.setCreateUserName( arg0.getCreateUserName() );
        whOrderDetailResDto.setCreateUserId( arg0.getCreateUserId() );
        whOrderDetailResDto.setIsvId( arg0.getIsvId() );
        whOrderDetailResDto.setCreateRealName( arg0.getCreateRealName() );
        whOrderDetailResDto.setModifyRealName( arg0.getModifyRealName() );
        whOrderDetailResDto.setInStorageNo( arg0.getInStorageNo() );
        whOrderDetailResDto.setTrayNo( arg0.getTrayNo() );
        whOrderDetailResDto.setQuantity( arg0.getQuantity() );
        whOrderDetailResDto.setVolume( arg0.getVolume() );
        whOrderDetailResDto.setWeight( arg0.getWeight() );
        whOrderDetailResDto.setImages( arg0.getImages() );
        whOrderDetailResDto.setRemark( arg0.getRemark() );
        whOrderDetailResDto.setUserDef1( arg0.getUserDef1() );
        whOrderDetailResDto.setUserDef2( arg0.getUserDef2() );
        whOrderDetailResDto.setStatus( arg0.getStatus() );

        return whOrderDetailResDto;
    }

    @Override
    public WhOrderDetailResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderDetailResDto whOrderDetailResDto = new WhOrderDetailResDto();

        return whOrderDetailResDto;
    }

    @Override
    public WhOrderDetailEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderDetailEntity whOrderDetailEntity = new WhOrderDetailEntity();

        return whOrderDetailEntity;
    }

    @Override
    public String entity2Po(WhOrderDetailEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<WhOrderDetailEntity> dtoList2EntityList(List<WhOrderDetailResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailEntity> list = new ArrayList<WhOrderDetailEntity>( arg0.size() );
        for ( WhOrderDetailResDto whOrderDetailResDto : arg0 ) {
            list.add( dto2Entity( whOrderDetailResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<WhOrderDetailResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WhOrderDetailResDto whOrderDetailResDto : arg0 ) {
            list.add( dto2Po( whOrderDetailResDto ) );
        }

        return list;
    }

    @Override
    public List<WhOrderDetailResDto> entityList2DtoList(List<WhOrderDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailResDto> list = new ArrayList<WhOrderDetailResDto>( arg0.size() );
        for ( WhOrderDetailEntity whOrderDetailEntity : arg0 ) {
            list.add( entity2Dto( whOrderDetailEntity ) );
        }

        return list;
    }

    @Override
    public List<WhOrderDetailResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailResDto> list = new ArrayList<WhOrderDetailResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<WhOrderDetailEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailEntity> list = new ArrayList<WhOrderDetailEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<WhOrderDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WhOrderDetailEntity whOrderDetailEntity : arg0 ) {
            list.add( entity2Po( whOrderDetailEntity ) );
        }

        return list;
    }
}
