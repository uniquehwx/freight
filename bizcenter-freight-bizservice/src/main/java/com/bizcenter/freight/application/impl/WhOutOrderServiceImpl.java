package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.WhOutOrderService;
import com.bizcenter.freight.convertor.WhOutOrderReqDtoConvertor;
import com.bizcenter.freight.convertor.WhOutOrderResDtoConvertor;
import com.bizcenter.freight.dto.req.WhOutOrderReqDto;
import com.bizcenter.freight.dto.res.WhOutOrderResDto;
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
@Service("whOutOrderAppService")
@Transactional(rollbackFor = Exception.class)
public class WhOutOrderServiceImpl implements WhOutOrderService {

    @Autowired
    private WhOutOrderReqDtoConvertor whOutOrderReqDtoConvertor;

    @Autowired
    private WhOutOrderResDtoConvertor whOutOrderResDtoConvertor;

//    private IPService<WhOutOrderPo> whOutOrderPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public WhOutOrderServiceImpl(WhOutOrderMapper whOutOrderMapper) {
//        this.whOutOrderPoService = new BasePService(whOutOrderMapper);
//    }



    @Override
    public WhOutOrderResDto save(WhOutOrderReqDto reqDto) {
//        WhOutOrderPo po = whOutOrderReqDtoConvertor.dto2Po(reqDto);
//        whOutOrderPoService.save(po);
//        WhOutOrderResDto resDto = whOutOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return whOutOrderPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<WhOutOrderResDto> doPager(Map<String, Object> params) {
//        Pager<WhOutOrderPo> poPager = whOutOrderPoService.queryPage(params, WhOutOrderPo.class);
//        Pager<WhOutOrderResDto> resDtoPager = whOutOrderResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public WhOutOrderResDto selectOne(Long id) {
//        WhOutOrderPo po = whOutOrderPoService.getById(id);
//        WhOutOrderResDto resDto = whOutOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public WhOutOrderResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WhOutOrderPo::new, params);
//        queryWrapper.last(" limit 1");
//        WhOutOrderPo po = whOutOrderPoService.getOne(queryWrapper);
//        WhOutOrderResDto resDto = whOutOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<WhOutOrderPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WhOutOrderPo::new, id, params);
//        return whOutOrderPoService.update(new WhOutOrderPo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, WhOutOrderReqDto reqDto) {
//        WhOutOrderPo po = whOutOrderReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return whOutOrderPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, WhOutOrderReqDto reqDto) {
//        UpdateWrapper<WhOutOrderPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = WhOutOrderReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WhOutOrderReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return whOutOrderPoService.update(new WhOutOrderPo(), updateWrapper);
        return  true;
    }

}