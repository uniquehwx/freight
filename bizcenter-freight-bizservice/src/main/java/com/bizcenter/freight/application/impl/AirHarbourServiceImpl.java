package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.AirHarbourService;
import com.bizcenter.freight.convertor.AirHarbourReqDtoConvertor;
import com.bizcenter.freight.convertor.AirHarbourResDtoConvertor;
import com.bizcenter.freight.dto.req.AirHarbourReqDto;
import com.bizcenter.freight.dto.res.AirHarbourResDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("airHarbourAppService")
@Transactional(rollbackFor = Exception.class)
public class AirHarbourServiceImpl implements AirHarbourService {

    @Autowired
    private AirHarbourReqDtoConvertor airHarbourReqDtoConvertor;

    @Autowired
    private AirHarbourResDtoConvertor airHarbourResDtoConvertor;

//    private IPService<AirHarbourPo> airHarbourPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public AirHarbourServiceImpl(AirHarbourMapper airHarbourMapper) {
//        this.airHarbourPoService = new BasePService(airHarbourMapper);
//    }



    @Override
    public AirHarbourResDto save(AirHarbourReqDto reqDto) {
//        AirHarbourPo po = airHarbourReqDtoConvertor.dto2Po(reqDto);
//        airHarbourPoService.save(po);
//        AirHarbourResDto resDto = airHarbourResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return airHarbourPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<AirHarbourResDto> doPager(Map<String, Object> params) {
//        Pager<AirHarbourPo> poPager = airHarbourPoService.queryPage(params, AirHarbourPo.class);
//        Pager<AirHarbourResDto> resDtoPager = airHarbourResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public AirHarbourResDto selectOne(Long id) {
//        AirHarbourPo po = airHarbourPoService.getById(id);
//        AirHarbourResDto resDto = airHarbourResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public AirHarbourResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(AirHarbourPo::new, params);
//        queryWrapper.last(" limit 1");
//        AirHarbourPo po = airHarbourPoService.getOne(queryWrapper);
//        AirHarbourResDto resDto = airHarbourResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<AirHarbourPo> updateWrapper = QueryParamUtils.updateWrapper4Map(AirHarbourPo::new, id, params);
//        return airHarbourPoService.update(new AirHarbourPo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, AirHarbourReqDto reqDto) {
//        AirHarbourPo po = airHarbourReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return airHarbourPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, AirHarbourReqDto reqDto) {
//        UpdateWrapper<AirHarbourPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = AirHarbourReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), AirHarbourReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return airHarbourPoService.update(new AirHarbourPo(), updateWrapper);
        return  true;
    }

}