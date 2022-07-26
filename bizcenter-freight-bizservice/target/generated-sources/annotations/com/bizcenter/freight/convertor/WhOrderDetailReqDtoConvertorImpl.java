package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOrderDetailEntity;
import com.bizcenter.freight.dto.req.WhOrderDetailReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.WhOrderDetailPo;
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
    public WhOrderDetailPo dto2Po(WhOrderDetailReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderDetailPo whOrderDetailPo = new WhOrderDetailPo();

        whOrderDetailPo.setAppId( arg0.getAppId() );
        whOrderDetailPo.setTenantId( arg0.getTenantId() );
        whOrderDetailPo.setIsvId( arg0.getIsvId() );
        whOrderDetailPo.setCreateRealName( arg0.getCreateRealName() );
        whOrderDetailPo.setModifyRealName( arg0.getModifyRealName() );
        whOrderDetailPo.setInStorageNo( arg0.getInStorageNo() );
        whOrderDetailPo.setTrayNo( arg0.getTrayNo() );
        whOrderDetailPo.setQuantity( arg0.getQuantity() );
        whOrderDetailPo.setVolume( arg0.getVolume() );
        whOrderDetailPo.setWeight( arg0.getWeight() );
        whOrderDetailPo.setImages( arg0.getImages() );
        whOrderDetailPo.setRemark( arg0.getRemark() );
        whOrderDetailPo.setUserDef1( arg0.getUserDef1() );
        whOrderDetailPo.setUserDef2( arg0.getUserDef2() );
        whOrderDetailPo.setStatus( arg0.getStatus() );

        return whOrderDetailPo;
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
    public WhOrderDetailReqDto po2Dto(WhOrderDetailPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderDetailReqDto whOrderDetailReqDto = new WhOrderDetailReqDto();

        whOrderDetailReqDto.setTenantId( arg0.getTenantId() );
        whOrderDetailReqDto.setAppId( arg0.getAppId() );
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
    public WhOrderDetailEntity po2Entity(WhOrderDetailPo arg0) {
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
    public WhOrderDetailPo entity2Po(WhOrderDetailEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOrderDetailPo whOrderDetailPo = new WhOrderDetailPo();

        whOrderDetailPo.setId( arg0.getId() );
        whOrderDetailPo.setCreateUserId( arg0.getCreateUserId() );
        whOrderDetailPo.setCreateUserName( arg0.getCreateUserName() );
        whOrderDetailPo.setModifyUserId( arg0.getModifyUserId() );
        whOrderDetailPo.setModifyUserName( arg0.getModifyUserName() );
        whOrderDetailPo.setIsvId( arg0.getIsvId() );
        whOrderDetailPo.setCreateRealName( arg0.getCreateRealName() );
        whOrderDetailPo.setModifyRealName( arg0.getModifyRealName() );
        whOrderDetailPo.setInStorageNo( arg0.getInStorageNo() );
        whOrderDetailPo.setTrayNo( arg0.getTrayNo() );
        whOrderDetailPo.setQuantity( arg0.getQuantity() );
        whOrderDetailPo.setVolume( arg0.getVolume() );
        whOrderDetailPo.setWeight( arg0.getWeight() );
        whOrderDetailPo.setImages( arg0.getImages() );
        whOrderDetailPo.setRemark( arg0.getRemark() );
        whOrderDetailPo.setUserDef1( arg0.getUserDef1() );
        whOrderDetailPo.setUserDef2( arg0.getUserDef2() );
        whOrderDetailPo.setStatus( arg0.getStatus() );

        return whOrderDetailPo;
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
    public List<WhOrderDetailPo> dtoList2PoList(List<WhOrderDetailReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailPo> list = new ArrayList<WhOrderDetailPo>( arg0.size() );
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
    public List<WhOrderDetailReqDto> poList2DtoList(List<WhOrderDetailPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailReqDto> list = new ArrayList<WhOrderDetailReqDto>( arg0.size() );
        for ( WhOrderDetailPo whOrderDetailPo : arg0 ) {
            list.add( po2Dto( whOrderDetailPo ) );
        }

        return list;
    }

    @Override
    public List<WhOrderDetailEntity> poList2EntityList(List<WhOrderDetailPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailEntity> list = new ArrayList<WhOrderDetailEntity>( arg0.size() );
        for ( WhOrderDetailPo whOrderDetailPo : arg0 ) {
            list.add( po2Entity( whOrderDetailPo ) );
        }

        return list;
    }

    @Override
    public List<WhOrderDetailPo> entityList2PoList(List<WhOrderDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOrderDetailPo> list = new ArrayList<WhOrderDetailPo>( arg0.size() );
        for ( WhOrderDetailEntity whOrderDetailEntity : arg0 ) {
            list.add( entity2Po( whOrderDetailEntity ) );
        }

        return list;
    }
}
