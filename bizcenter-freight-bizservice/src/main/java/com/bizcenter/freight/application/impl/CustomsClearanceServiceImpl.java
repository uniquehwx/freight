package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.CustomsClearanceService;
import com.bizcenter.freight.convertor.CustomsClearanceReqDtoConvertor;
import com.bizcenter.freight.convertor.CustomsClearanceResDtoConvertor;
import com.bizcenter.freight.dto.req.CustomsClearanceReqDto;
import com.bizcenter.freight.dto.res.CustomsClearanceResDto;
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
@Service("customsClearanceAppService")
@Transactional(rollbackFor = Exception.class)
public class CustomsClearanceServiceImpl implements CustomsClearanceService {

    @Autowired
    private CustomsClearanceReqDtoConvertor customsClearanceReqDtoConvertor;

    @Autowired
    private CustomsClearanceResDtoConvertor customsClearanceResDtoConvertor;

//    private IPService<CustomsClearancePo> customsClearancePoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public CustomsClearanceServiceImpl(CustomsClearanceMapper customsClearanceMapper) {
//        this.customsClearancePoService = new BasePService(customsClearanceMapper);
//    }



    @Override
    public CustomsClearanceResDto save(CustomsClearanceReqDto reqDto) {
//        CustomsClearancePo po = customsClearanceReqDtoConvertor.dto2Po(reqDto);
//        customsClearancePoService.save(po);
//        CustomsClearanceResDto resDto = customsClearanceResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return customsClearancePoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<CustomsClearanceResDto> doPager(Map<String, Object> params) {
//        Pager<CustomsClearancePo> poPager = customsClearancePoService.queryPage(params, CustomsClearancePo.class);
//        Pager<CustomsClearanceResDto> resDtoPager = customsClearanceResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public CustomsClearanceResDto selectOne(Long id) {
//        CustomsClearancePo po = customsClearancePoService.getById(id);
//        CustomsClearanceResDto resDto = customsClearanceResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public CustomsClearanceResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(CustomsClearancePo::new, params);
//        queryWrapper.last(" limit 1");
//        CustomsClearancePo po = customsClearancePoService.getOne(queryWrapper);
//        CustomsClearanceResDto resDto = customsClearanceResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<CustomsClearancePo> updateWrapper = QueryParamUtils.updateWrapper4Map(CustomsClearancePo::new, id, params);
//        return customsClearancePoService.update(new CustomsClearancePo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, CustomsClearanceReqDto reqDto) {
//        CustomsClearancePo po = customsClearanceReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return customsClearancePoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, CustomsClearanceReqDto reqDto) {
//        UpdateWrapper<CustomsClearancePo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = CustomsClearanceReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), CustomsClearanceReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return customsClearancePoService.update(new CustomsClearancePo(), updateWrapper);
        return  true;
    }

}