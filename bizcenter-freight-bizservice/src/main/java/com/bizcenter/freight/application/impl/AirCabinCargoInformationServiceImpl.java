package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.exception.AppException;
import com.bitsun.core.common.exception.ErrorCode;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.AirCabinCargoInformationService;
import com.bizcenter.freight.convertor.AirCabinCargoInformationReqDtoConvertor;
import com.bizcenter.freight.convertor.AirCabinCargoInformationResDtoConvertor;
import com.bizcenter.freight.dto.req.AirCabinCargoInformationReqDto;
import com.bizcenter.freight.dto.res.AirCabinCargoInformationResDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("airCabinCargoInformationAppService")
@Transactional(rollbackFor = Exception.class)
public class AirCabinCargoInformationServiceImpl implements AirCabinCargoInformationService {

    @Autowired
    private AirCabinCargoInformationReqDtoConvertor airCabinCargoInformationReqDtoConvertor;

    @Autowired
    private AirCabinCargoInformationResDtoConvertor airCabinCargoInformationResDtoConvertor;

//    private IPService<AirCabinCargoInformationPo> airCabinCargoInformationPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public AirCabinCargoInformationServiceImpl(AirCabinCargoInformationMapper airCabinCargoInformationMapper) {
//        this.airCabinCargoInformationPoService = new BasePService(airCabinCargoInformationMapper);
//    }



    @Override
    public AirCabinCargoInformationResDto save(AirCabinCargoInformationReqDto reqDto) {
//        AirCabinCargoInformationPo po = airCabinCargoInformationReqDtoConvertor.dto2Po(reqDto);
////        airCabinCargoInformationPoService.save(po);
//        AirCabinCargoInformationResDto resDto = airCabinCargoInformationResDtoConvertor.po2Dto(po);
//        return resDto;
        return null;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return airCabinCargoInformationPoService.removeByIds(idLongList);
            return true;
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<AirCabinCargoInformationResDto> doPager(Map<String, Object> params) {
//        Pager<AirCabinCargoInformationPo> poPager = airCabinCargoInformationPoService.queryPage(params, AirCabinCargoInformationPo.class);
//        Pager<AirCabinCargoInformationResDto> resDtoPager = airCabinCargoInformationResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return null;
    }

    @Override
    public AirCabinCargoInformationResDto selectOne(Long id) {
//        AirCabinCargoInformationPo po = airCabinCargoInformationPoService.getById(id);
//        AirCabinCargoInformationResDto resDto = airCabinCargoInformationResDtoConvertor.po2Dto(po);
//        return resDto;
        return null;
    }

    @Override
    public AirCabinCargoInformationResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(AirCabinCargoInformationPo::new, params);
//        queryWrapper.last(" limit 1");
//        AirCabinCargoInformationPo po = airCabinCargoInformationPoService.getOne(queryWrapper);
//        AirCabinCargoInformationResDto resDto = airCabinCargoInformationResDtoConvertor.po2Dto(po);
//        return resDto;
        return null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<AirCabinCargoInformationPo> updateWrapper = QueryParamUtils.updateWrapper4Map(AirCabinCargoInformationPo::new, id, params);
//        return airCabinCargoInformationPoService.update(new AirCabinCargoInformationPo(), updateWrapper);
        return true;
        }

    @Override
    public boolean updateProps(Long id, AirCabinCargoInformationReqDto reqDto) {
//        AirCabinCargoInformationPo po = airCabinCargoInformationReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return airCabinCargoInformationPoService.updateById(po);
        return true;
    }


    @Override
    public boolean updateAllProps(Long id, AirCabinCargoInformationReqDto reqDto) {
//        UpdateWrapper<AirCabinCargoInformationPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = AirCabinCargoInformationReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), AirCabinCargoInformationReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return airCabinCargoInformationPoService.update(new AirCabinCargoInformationPo(), updateWrapper);
        return true;
    }

}