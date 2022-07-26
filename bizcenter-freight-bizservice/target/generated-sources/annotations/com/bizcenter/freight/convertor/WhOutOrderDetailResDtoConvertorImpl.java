package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOutOrderDetailEntity;
import com.bizcenter.freight.dto.res.WhOutOrderDetailResDto;
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
public class WhOutOrderDetailResDtoConvertorImpl extends WhOutOrderDetailResDtoConvertor {

    @Override
    public WhOutOrderDetailEntity dto2Entity(WhOutOrderDetailResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderDetailEntity whOutOrderDetailEntity = new WhOutOrderDetailEntity();

        whOutOrderDetailEntity.setId( arg0.getId() );
        whOutOrderDetailEntity.setModifyUserName( arg0.getModifyUserName() );
        whOutOrderDetailEntity.setModifyUserId( arg0.getModifyUserId() );
        whOutOrderDetailEntity.setCreateUserName( arg0.getCreateUserName() );
        whOutOrderDetailEntity.setCreateUserId( arg0.getCreateUserId() );
        whOutOrderDetailEntity.setIsvId( arg0.getIsvId() );
        whOutOrderDetailEntity.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderDetailEntity.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderDetailEntity.setOutOrderId( arg0.getOutOrderId() );
        whOutOrderDetailEntity.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderDetailEntity.setTrayNo( arg0.getTrayNo() );
        whOutOrderDetailEntity.setQuantity( arg0.getQuantity() );
        whOutOrderDetailEntity.setVolume( arg0.getVolume() );
        whOutOrderDetailEntity.setWeight( arg0.getWeight() );
        whOutOrderDetailEntity.setImages( arg0.getImages() );
        whOutOrderDetailEntity.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        whOutOrderDetailEntity.setSealNo( arg0.getSealNo() );
        whOutOrderDetailEntity.setDriverName( arg0.getDriverName() );
        whOutOrderDetailEntity.setRemark( arg0.getRemark() );
        whOutOrderDetailEntity.setUserDef1( arg0.getUserDef1() );
        whOutOrderDetailEntity.setUserDef2( arg0.getUserDef2() );
        whOutOrderDetailEntity.setSupplierNo( arg0.getSupplierNo() );
        whOutOrderDetailEntity.setOutOrderNo( arg0.getOutOrderNo() );

        return whOutOrderDetailEntity;
    }

    @Override
    public String dto2Po(WhOutOrderDetailResDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public WhOutOrderDetailResDto entity2Dto(WhOutOrderDetailEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderDetailResDto whOutOrderDetailResDto = new WhOutOrderDetailResDto();

        whOutOrderDetailResDto.setId( arg0.getId() );
        whOutOrderDetailResDto.setModifyUserName( arg0.getModifyUserName() );
        whOutOrderDetailResDto.setModifyUserId( arg0.getModifyUserId() );
        whOutOrderDetailResDto.setCreateUserName( arg0.getCreateUserName() );
        whOutOrderDetailResDto.setCreateUserId( arg0.getCreateUserId() );
        whOutOrderDetailResDto.setIsvId( arg0.getIsvId() );
        whOutOrderDetailResDto.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderDetailResDto.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderDetailResDto.setOutOrderId( arg0.getOutOrderId() );
        whOutOrderDetailResDto.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderDetailResDto.setTrayNo( arg0.getTrayNo() );
        whOutOrderDetailResDto.setQuantity( arg0.getQuantity() );
        whOutOrderDetailResDto.setVolume( arg0.getVolume() );
        whOutOrderDetailResDto.setWeight( arg0.getWeight() );
        whOutOrderDetailResDto.setImages( arg0.getImages() );
        whOutOrderDetailResDto.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        whOutOrderDetailResDto.setSealNo( arg0.getSealNo() );
        whOutOrderDetailResDto.setDriverName( arg0.getDriverName() );
        whOutOrderDetailResDto.setRemark( arg0.getRemark() );
        whOutOrderDetailResDto.setUserDef1( arg0.getUserDef1() );
        whOutOrderDetailResDto.setUserDef2( arg0.getUserDef2() );
        whOutOrderDetailResDto.setSupplierNo( arg0.getSupplierNo() );
        whOutOrderDetailResDto.setOutOrderNo( arg0.getOutOrderNo() );

        return whOutOrderDetailResDto;
    }

    @Override
    public WhOutOrderDetailResDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderDetailResDto whOutOrderDetailResDto = new WhOutOrderDetailResDto();

        return whOutOrderDetailResDto;
    }

    @Override
    public WhOutOrderDetailEntity po2Entity(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderDetailEntity whOutOrderDetailEntity = new WhOutOrderDetailEntity();

        return whOutOrderDetailEntity;
    }

    @Override
    public String entity2Po(WhOutOrderDetailEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public List<WhOutOrderDetailEntity> dtoList2EntityList(List<WhOutOrderDetailResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailEntity> list = new ArrayList<WhOutOrderDetailEntity>( arg0.size() );
        for ( WhOutOrderDetailResDto whOutOrderDetailResDto : arg0 ) {
            list.add( dto2Entity( whOutOrderDetailResDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<WhOutOrderDetailResDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WhOutOrderDetailResDto whOutOrderDetailResDto : arg0 ) {
            list.add( dto2Po( whOutOrderDetailResDto ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderDetailResDto> entityList2DtoList(List<WhOutOrderDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailResDto> list = new ArrayList<WhOutOrderDetailResDto>( arg0.size() );
        for ( WhOutOrderDetailEntity whOutOrderDetailEntity : arg0 ) {
            list.add( entity2Dto( whOutOrderDetailEntity ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderDetailResDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailResDto> list = new ArrayList<WhOutOrderDetailResDto>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Dto( string ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderDetailEntity> poList2EntityList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailEntity> list = new ArrayList<WhOutOrderDetailEntity>( arg0.size() );
        for ( String string : arg0 ) {
            list.add( po2Entity( string ) );
        }

        return list;
    }

    @Override
    public List<String> entityList2PoList(List<WhOutOrderDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WhOutOrderDetailEntity whOutOrderDetailEntity : arg0 ) {
            list.add( entity2Po( whOutOrderDetailEntity ) );
        }

        return list;
    }
}
