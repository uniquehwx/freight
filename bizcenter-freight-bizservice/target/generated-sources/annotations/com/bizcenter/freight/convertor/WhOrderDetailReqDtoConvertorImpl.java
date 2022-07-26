package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOrderDetailEntity;
import com.bizcenter.freight.dto.req.WhOrderDetailReqDto;
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
public class WhOrderDetailReqDtoConvertorImpl extends WhOrderDetailReqDtoConvertor {

    @Override
    public WhOrderDetailEntity dto2Entity(WhOrderDetailReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderDetailEntity whOrderDetailEntity = new WhOrderDetailEntity();

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
    public String dto2Po(WhOrderDetailReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public WhOrderDetailReqDto entity2Dto(WhOrderDetailEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderDetailReqDto whOrderDetailReqDto = new WhOrderDetailReqDto();

        whOrderDetailReqDto.setIsvId( arg0.getIsvId() );
        whOrderDetailReqDto.setCreateRealName( arg0.getCreateRealName() );
        whOrderDetailReqDto.setModifyRealName( arg0.getModifyRealName() );
        whOrderDetailReqDto.setInStorageNo( arg0.getInStorageNo() );
        whOrderDetailReqDto.setTrayNo( arg0.getTrayNo() );
        whOrderDetailReqDto.setQuantity( arg0.getQuantity() );
        whOrderDetailReqDto.setVolume( arg0.getVolume() );
        whOrderDetailReqDto.setWeight( arg0.getWeight() );
        whOrderDetailReqDto.setImages( arg0.getImages() );
        whOrderDetailReqDto.setRemark( arg0.getRemark() );
        whOrderDetailReqDto.setUserDef1( arg0.getUserDef1() );
        whOrderDetailReqDto.setUserDef2( arg0.getUserDef2() );
        whOrderDetailReqDto.setStatus( arg0.getStatus() );

        return whOrderDetailReqDto;
    }

    @Override
    public WhOrderDetailReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderDetailReqDto whOrderDetailReqDto = new WhOrderDetailReqDto();

        return whOrderDetailReqDto;
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
    public List<WhOrderDetailEntity> dtoList2EntityList(List<WhOrderDetailReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailEntity> list = new ArrayList<WhOrderDetailEntity>( arg0.size() );
        for ( WhOrderDetailReqDto whOrderDetailReqDto : arg0 ) {
            list.add( dto2Entity( whOrderDetailReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<WhOrderDetailReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WhOrderDetailReqDto whOrderDetailReqDto : arg0 ) {
            list.add( dto2Po( whOrderDetailReqDto ) );
        }

        return list;
    }

    @Override
    public List<WhOrderDetailReqDto> entityList2DtoList(List<WhOrderDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailReqDto> list = new ArrayList<WhOrderDetailReqDto>( arg0.size() );
        for ( WhOrderDetailEntity whOrderDetailEntity : arg0 ) {
            list.add( entity2Dto( whOrderDetailEntity ) );
        }

        return list;
    }

    @Override
    public List<WhOrderDetailReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailReqDto> list = new ArrayList<WhOrderDetailReqDto>( arg0.size() );
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
