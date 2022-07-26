package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.WhOrderService;
import com.bizcenter.freight.convertor.WhOrderReqDtoConvertor;
import com.bizcenter.freight.convertor.WhOrderResDtoConvertor;
import com.bizcenter.freight.dto.req.WhOrderReqDto;
import com.bizcenter.freight.dto.res.WhOrderResDto;
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
@Service("whOrderAppService")
@Transactional(rollbackFor = Exception.class)
public class WhOrderServiceImpl implements WhOrderService {

    @Autowired
    private WhOrderReqDtoConvertor whOrderReqDtoConvertor;

    @Autowired
    private WhOrderResDtoConvertor whOrderResDtoConvertor;

//    private IPService<WhOrderPo> whOrderPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public WhOrderServiceImpl(WhOrderMapper whOrderMapper) {
//        this.whOrderPoService = new BasePService(whOrderMapper);
//    }



    @Override
    public WhOrderResDto save(WhOrderReqDto reqDto) {
//        WhOrderPo po = whOrderReqDtoConvertor.dto2Po(reqDto);
//        whOrderPoService.save(po);
//        WhOrderResDto resDto = whOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return whOrderPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<WhOrderResDto> doPager(Map<String, Object> params) {
//        Pager<WhOrderPo> poPager = whOrderPoService.queryPage(params, WhOrderPo.class);
//        Pager<WhOrderResDto> resDtoPager = whOrderResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public WhOrderResDto selectOne(Long id) {
//        WhOrderPo po = whOrderPoService.getById(id);
//        WhOrderResDto resDto = whOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public WhOrderResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WhOrderPo::new, params);
//        queryWrapper.last(" limit 1");
//        WhOrderPo po = whOrderPoService.getOne(queryWrapper);
//        WhOrderResDto resDto = whOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<WhOrderPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WhOrderPo::new, id, params);
//        return whOrderPoService.update(new WhOrderPo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, WhOrderReqDto reqDto) {
//        WhOrderPo po = whOrderReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return whOrderPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, WhOrderReqDto reqDto) {
//        UpdateWrapper<WhOrderPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = WhOrderReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WhOrderReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return whOrderPoService.update(new WhOrderPo(), updateWrapper);
        return  true;
    }

}