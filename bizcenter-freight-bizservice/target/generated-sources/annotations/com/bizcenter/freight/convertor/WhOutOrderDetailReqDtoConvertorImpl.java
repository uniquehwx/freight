package com.bizcenter.freight.convertor;

import com.bizcenter.freight.domain.model.WhOutOrderDetailEntity;
import com.bizcenter.freight.dto.req.WhOutOrderDetailReqDto;
import com.bizcenter.freight.infrastructure.persistence.po.WhOutOrderDetailPo;
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
    public WhOutOrderDetailPo dto2Po(WhOutOrderDetailReqDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderDetailPo whOutOrderDetailPo = new WhOutOrderDetailPo();

        whOutOrderDetailPo.setAppId( arg0.getAppId() );
        whOutOrderDetailPo.setTenantId( arg0.getTenantId() );
        whOutOrderDetailPo.setIsvId( arg0.getIsvId() );
        whOutOrderDetailPo.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderDetailPo.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderDetailPo.setOutOrderId( arg0.getOutOrderId() );
        whOutOrderDetailPo.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderDetailPo.setTrayNo( arg0.getTrayNo() );
        whOutOrderDetailPo.setQuantity( arg0.getQuantity() );
        whOutOrderDetailPo.setVolume( arg0.getVolume() );
        whOutOrderDetailPo.setWeight( arg0.getWeight() );
        whOutOrderDetailPo.setImages( arg0.getImages() );
        whOutOrderDetailPo.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        whOutOrderDetailPo.setSealNo( arg0.getSealNo() );
        whOutOrderDetailPo.setDriverName( arg0.getDriverName() );
        whOutOrderDetailPo.setRemark( arg0.getRemark() );
        whOutOrderDetailPo.setUserDef1( arg0.getUserDef1() );
        whOutOrderDetailPo.setUserDef2( arg0.getUserDef2() );
        whOutOrderDetailPo.setSupplierNo( arg0.getSupplierNo() );
        whOutOrderDetailPo.setOutOrderNo( arg0.getOutOrderNo() );

        return whOutOrderDetailPo;
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
    public WhOutOrderDetailReqDto po2Dto(WhOutOrderDetailPo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderDetailReqDto whOutOrderDetailReqDto = new WhOutOrderDetailReqDto();

        whOutOrderDetailReqDto.setTenantId( arg0.getTenantId() );
        whOutOrderDetailReqDto.setAppId( arg0.getAppId() );
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
    public WhOutOrderDetailEntity po2Entity(WhOutOrderDetailPo arg0) {
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
    public WhOutOrderDetailPo entity2Po(WhOutOrderDetailEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WhOutOrderDetailPo whOutOrderDetailPo = new WhOutOrderDetailPo();

        whOutOrderDetailPo.setId( arg0.getId() );
        whOutOrderDetailPo.setCreateUserId( arg0.getCreateUserId() );
        whOutOrderDetailPo.setCreateUserName( arg0.getCreateUserName() );
        whOutOrderDetailPo.setModifyUserId( arg0.getModifyUserId() );
        whOutOrderDetailPo.setModifyUserName( arg0.getModifyUserName() );
        whOutOrderDetailPo.setIsvId( arg0.getIsvId() );
        whOutOrderDetailPo.setCreateRealName( arg0.getCreateRealName() );
        whOutOrderDetailPo.setModifyRealName( arg0.getModifyRealName() );
        whOutOrderDetailPo.setOutOrderId( arg0.getOutOrderId() );
        whOutOrderDetailPo.setInStorageNo( arg0.getInStorageNo() );
        whOutOrderDetailPo.setTrayNo( arg0.getTrayNo() );
        whOutOrderDetailPo.setQuantity( arg0.getQuantity() );
        whOutOrderDetailPo.setVolume( arg0.getVolume() );
        whOutOrderDetailPo.setWeight( arg0.getWeight() );
        whOutOrderDetailPo.setImages( arg0.getImages() );
        whOutOrderDetailPo.setLicensePlateNumber( arg0.getLicensePlateNumber() );
        whOutOrderDetailPo.setSealNo( arg0.getSealNo() );
        whOutOrderDetailPo.setDriverName( arg0.getDriverName() );
        whOutOrderDetailPo.setRemark( arg0.getRemark() );
        whOutOrderDetailPo.setUserDef1( arg0.getUserDef1() );
        whOutOrderDetailPo.setUserDef2( arg0.getUserDef2() );
        whOutOrderDetailPo.setSupplierNo( arg0.getSupplierNo() );
        whOutOrderDetailPo.setOutOrderNo( arg0.getOutOrderNo() );

        return whOutOrderDetailPo;
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
    public List<WhOutOrderDetailPo> dtoList2PoList(List<WhOutOrderDetailReqDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailPo> list = new ArrayList<WhOutOrderDetailPo>( arg0.size() );
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
    public List<WhOutOrderDetailReqDto> poList2DtoList(List<WhOutOrderDetailPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailReqDto> list = new ArrayList<WhOutOrderDetailReqDto>( arg0.size() );
        for ( WhOutOrderDetailPo whOutOrderDetailPo : arg0 ) {
            list.add( po2Dto( whOutOrderDetailPo ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderDetailEntity> poList2EntityList(List<WhOutOrderDetailPo> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailEntity> list = new ArrayList<WhOutOrderDetailEntity>( arg0.size() );
        for ( WhOutOrderDetailPo whOutOrderDetailPo : arg0 ) {
            list.add( po2Entity( whOutOrderDetailPo ) );
        }

        return list;
    }

    @Override
    public List<WhOutOrderDetailPo> entityList2PoList(List<WhOutOrderDetailEntity> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<WhOutOrderDetailPo> list = new ArrayList<WhOutOrderDetailPo>( arg0.size() );
        for ( WhOutOrderDetailEntity whOutOrderDetailEntity : arg0 ) {
            list.add( entity2Po( whOutOrderDetailEntity ) );
        }

        return list;
    }
}
