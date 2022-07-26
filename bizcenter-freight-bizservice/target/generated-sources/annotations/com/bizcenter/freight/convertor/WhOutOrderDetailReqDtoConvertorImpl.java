package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOutOrderDetailEntity;
import com.bizcenter.freight.dto.req.WhOutOrderDetailReqDto;
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
public class WhOutOrderDetailReqDtoConvertorImpl extends WhOutOrderDetailReqDtoConvertor {

    @Override
    public WhOutOrderDetailEntity dto2Entity(WhOutOrderDetailReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderDetailEntity whOutOrderDetailEntity = new WhOutOrderDetailEntity();

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
    public String dto2Po(WhOutOrderDetailReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        String string = new String();

        return string;
    }

    @Override
    public WhOutOrderDetailReqDto entity2Dto(WhOutOrderDetailEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderDetailReqDto whOutOrderDetailReqDto = new WhOutOrderDetailReqDto();

        whOutOrderDetailReqDto.setIsvId( arg0.getIsvId() );
        whOutOrderDetailReqDto.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderDetailReqDto.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderDetailReqDto.setOutOrderId( arg0.getOutOrderId() );
        whOutOrderDetailReqDto.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderDetailReqDto.setTrayNo( arg0.getTrayNo() );
        whOutOrderDetailReqDto.setQuantity( arg0.getQuantity() );
        whOutOrderDetailReqDto.setVolume( arg0.getVolume() );
        whOutOrderDetailReqDto.setWeight( arg0.getWeight() );
        whOutOrderDetailReqDto.setImages( arg0.getImages() );
        whOutOrderDetailReqDto.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        whOutOrderDetailReqDto.setSealNo( arg0.getSealNo() );
        whOutOrderDetailReqDto.setDriverName( arg0.getDriverName() );
        whOutOrderDetailReqDto.setRemark( arg0.getRemark() );
        whOutOrderDetailReqDto.setUserDef1( arg0.getUserDef1() );
        whOutOrderDetailReqDto.setUserDef2( arg0.getUserDef2() );
        whOutOrderDetailReqDto.setSupplierNo( arg0.getSupplierNo() );
        whOutOrderDetailReqDto.setOutOrderNo( arg0.getOutOrderNo() );

        return whOutOrderDetailReqDto;
    }

    @Override
    public WhOutOrderDetailReqDto po2Dto(String arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderDetailReqDto whOutOrderDetailReqDto = new WhOutOrderDetailReqDto();

        return whOutOrderDetailReqDto;
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
    public List<WhOutOrderDetailEntity> dtoList2EntityList(List<WhOutOrderDetailReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailEntity> list = new ArrayList<WhOutOrderDetailEntity>( arg0.size() );
        for ( WhOutOrderDetailReqDto whOutOrderDetailReqDto : arg0 ) {
            list.add( dto2Entity( whOutOrderDetailReqDto ) );
        }

        return list;
    }

    @Override
    public List<String> dtoList2PoList(List<WhOutOrderDetailReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( arg0.size() );
        for ( WhOutOrderDetailReqDto whOutOrderDetailReqDto : arg0 ) {
            list.add( dto2Po( whOutOrderDetailReqDto ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderDetailReqDto> entityList2DtoList(List<WhOutOrderDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailReqDto> list = new ArrayList<WhOutOrderDetailReqDto>( arg0.size() );
        for ( WhOutOrderDetailEntity whOutOrderDetailEntity : arg0 ) {
            list.add( entity2Dto( whOutOrderDetailEntity ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderDetailReqDto> poList2DtoList(List<String> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailReqDto> list = new ArrayList<WhOutOrderDetailReqDto>( arg0.size() );
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
