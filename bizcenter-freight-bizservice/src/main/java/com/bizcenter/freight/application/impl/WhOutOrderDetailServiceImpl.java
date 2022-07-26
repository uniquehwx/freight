package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.WhOutOrderDetailService;
import com.bizcenter.freight.convertor.WhOutOrderDetailReqDtoConvertor;
import com.bizcenter.freight.convertor.WhOutOrderDetailResDtoConvertor;
import com.bizcenter.freight.dto.req.WhOutOrderDetailReqDto;
import com.bizcenter.freight.dto.res.WhOutOrderDetailResDto;
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
@Service("whOutOrderDetailAppService")
@Transactional(rollbackFor = Exception.class)
public class WhOutOrderDetailServiceImpl implements WhOutOrderDetailService {

    @Autowired
    private WhOutOrderDetailReqDtoConvertor whOutOrderDetailReqDtoConvertor;

    @Autowired
    private WhOutOrderDetailResDtoConvertor whOutOrderDetailResDtoConvertor;

//    private IPService<WhOutOrderDetailPo> whOutOrderDetailPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public WhOutOrderDetailServiceImpl(WhOutOrderDetailMapper whOutOrderDetailMapper) {
//        this.whOutOrderDetailPoService = new BasePService(whOutOrderDetailMapper);
//    }



    @Override
    public WhOutOrderDetailResDto save(WhOutOrderDetailReqDto reqDto) {
//        WhOutOrderDetailPo po = whOutOrderDetailReqDtoConvertor.dto2Po(reqDto);
//        whOutOrderDetailPoService.save(po);
//        WhOutOrderDetailResDto resDto = whOutOrderDetailResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return whOutOrderDetailPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<WhOutOrderDetailResDto> doPager(Map<String, Object> params) {
//        Pager<WhOutOrderDetailPo> poPager = whOutOrderDetailPoService.queryPage(params, WhOutOrderDetailPo.class);
//        Pager<WhOutOrderDetailResDto> resDtoPager = whOutOrderDetailResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public WhOutOrderDetailResDto selectOne(Long id) {
//        WhOutOrderDetailPo po = whOutOrderDetailPoService.getById(id);
//        WhOutOrderDetailResDto resDto = whOutOrderDetailResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public WhOutOrderDetailResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WhOutOrderDetailPo::new, params);
//        queryWrapper.last(" limit 1");
//        WhOutOrderDetailPo po = whOutOrderDetailPoService.getOne(queryWrapper);
//        WhOutOrderDetailResDto resDto = whOutOrderDetailResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<WhOutOrderDetailPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WhOutOrderDetailPo::new, id, params);
//        return whOutOrderDetailPoService.update(new WhOutOrderDetailPo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, WhOutOrderDetailReqDto reqDto) {
//        WhOutOrderDetailPo po = whOutOrderDetailReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return whOutOrderDetailPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, WhOutOrderDetailReqDto reqDto) {
//        UpdateWrapper<WhOutOrderDetailPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = WhOutOrderDetailReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WhOutOrderDetailReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return whOutOrderDetailPoService.update(new WhOutOrderDetailPo(), updateWrapper);
        return  true;
    }

}