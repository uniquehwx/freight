package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.WaybillExceptionLogService;
import com.bizcenter.freight.convertor.WaybillExceptionLogReqDtoConvertor;
import com.bizcenter.freight.convertor.WaybillExceptionLogResDtoConvertor;
import com.bizcenter.freight.dto.req.WaybillExceptionLogReqDto;
import com.bizcenter.freight.dto.res.WaybillExceptionLogResDto;
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
@Service("waybillExceptionLogAppService")
@Transactional(rollbackFor = Exception.class)
public class WaybillExceptionLogServiceImpl implements WaybillExceptionLogService {

    @Autowired
    private WaybillExceptionLogReqDtoConvertor waybillExceptionLogReqDtoConvertor;

    @Autowired
    private WaybillExceptionLogResDtoConvertor waybillExceptionLogResDtoConvertor;

//    private IPService<WaybillExceptionLogPo> waybillExceptionLogPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public WaybillExceptionLogServiceImpl(WaybillExceptionLogMapper waybillExceptionLogMapper) {
//        this.waybillExceptionLogPoService = new BasePService(waybillExceptionLogMapper);
//    }



    @Override
    public WaybillExceptionLogResDto save(WaybillExceptionLogReqDto reqDto) {
//        WaybillExceptionLogPo po = waybillExceptionLogReqDtoConvertor.dto2Po(reqDto);
//        waybillExceptionLogPoService.save(po);
//        WaybillExceptionLogResDto resDto = waybillExceptionLogResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return waybillExceptionLogPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<WaybillExceptionLogResDto> doPager(Map<String, Object> params) {
//        Pager<WaybillExceptionLogPo> poPager = waybillExceptionLogPoService.queryPage(params, WaybillExceptionLogPo.class);
//        Pager<WaybillExceptionLogResDto> resDtoPager = waybillExceptionLogResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public WaybillExceptionLogResDto selectOne(Long id) {
//        WaybillExceptionLogPo po = waybillExceptionLogPoService.getById(id);
//        WaybillExceptionLogResDto resDto = waybillExceptionLogResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public WaybillExceptionLogResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WaybillExceptionLogPo::new, params);
//        queryWrapper.last(" limit 1");
//        WaybillExceptionLogPo po = waybillExceptionLogPoService.getOne(queryWrapper);
//        WaybillExceptionLogResDto resDto = waybillExceptionLogResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<WaybillExceptionLogPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WaybillExceptionLogPo::new, id, params);
//        return waybillExceptionLogPoService.update(new WaybillExceptionLogPo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, WaybillExceptionLogReqDto reqDto) {
//        WaybillExceptionLogPo po = waybillExceptionLogReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return waybillExceptionLogPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, WaybillExceptionLogReqDto reqDto) {
//        UpdateWrapper<WaybillExceptionLogPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = WaybillExceptionLogReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WaybillExceptionLogReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return waybillExceptionLogPoService.update(new WaybillExceptionLogPo(), updateWrapper);
        return  true;
    }

}