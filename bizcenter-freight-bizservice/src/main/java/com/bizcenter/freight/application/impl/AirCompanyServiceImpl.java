package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.AirCompanyService;
import com.bizcenter.freight.convertor.AirCompanyReqDtoConvertor;
import com.bizcenter.freight.convertor.AirCompanyResDtoConvertor;
import com.bizcenter.freight.dto.req.AirCompanyReqDto;
import com.bizcenter.freight.dto.res.AirCompanyResDto;
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
@Service("airCompanyAppService")
@Transactional(rollbackFor = Exception.class)
public class AirCompanyServiceImpl implements AirCompanyService {

    @Autowired
    private AirCompanyReqDtoConvertor airCompanyReqDtoConvertor;

    @Autowired
    private AirCompanyResDtoConvertor airCompanyResDtoConvertor;

//    private IPService<AirCompanyPo> airCompanyPoService;

//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public AirCompanyServiceImpl(AirCompanyMapper airCompanyMapper) {
//        this.airCompanyPoService = new BasePService(airCompanyMapper);
//    }



    @Override
    public AirCompanyResDto save(AirCompanyReqDto reqDto) {
//        AirCompanyPo po = airCompanyReqDtoConvertor.dto2Po(reqDto);
//        airCompanyPoService.save(po);
//        AirCompanyResDto resDto = airCompanyResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return airCompanyPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<AirCompanyResDto> doPager(Map<String, Object> params) {
//        Pager<AirCompanyPo> poPager = airCompanyPoService.queryPage(params, AirCompanyPo.class);
//        Pager<AirCompanyResDto> resDtoPager = airCompanyResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public AirCompanyResDto selectOne(Long id) {
//        AirCompanyPo po = airCompanyPoService.getById(id);
//        AirCompanyResDto resDto = airCompanyResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public AirCompanyResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(AirCompanyPo::new, params);
//        queryWrapper.last(" limit 1");
//        AirCompanyPo po = airCompanyPoService.getOne(queryWrapper);
//        AirCompanyResDto resDto = airCompanyResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<AirCompanyPo> updateWrapper = QueryParamUtils.updateWrapper4Map(AirCompanyPo::new, id, params);
//        return airCompanyPoService.update(new AirCompanyPo(), updateWrapper);
        return  true;
    }

    @Override
    public boolean updateProps(Long id, AirCompanyReqDto reqDto) {
//        AirCompanyPo po = airCompanyReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return airCompanyPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, AirCompanyReqDto reqDto) {
//        UpdateWrapper<AirCompanyPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = AirCompanyReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), AirCompanyReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return airCompanyPoService.update(new AirCompanyPo(), updateWrapper);
          return  true;
    }

}