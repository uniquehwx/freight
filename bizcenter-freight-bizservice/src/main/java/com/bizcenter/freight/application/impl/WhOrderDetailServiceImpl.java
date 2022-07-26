package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.WhOrderDetailService;
import com.bizcenter.freight.convertor.WhOrderDetailReqDtoConvertor;
import com.bizcenter.freight.convertor.WhOrderDetailResDtoConvertor;
import com.bizcenter.freight.dto.req.WhOrderDetailReqDto;
import com.bizcenter.freight.dto.res.WhOrderDetailResDto;
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
@Service("whOrderDetailAppService")
@Transactional(rollbackFor = Exception.class)
public class WhOrderDetailServiceImpl implements WhOrderDetailService {

    @Autowired
    private WhOrderDetailReqDtoConvertor whOrderDetailReqDtoConvertor;

    @Autowired
    private WhOrderDetailResDtoConvertor whOrderDetailResDtoConvertor;
//
//    private IPService<WhOrderDetailPo> whOrderDetailPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public WhOrderDetailServiceImpl(WhOrderDetailMapper whOrderDetailMapper) {
//        this.whOrderDetailPoService = new BasePService(whOrderDetailMapper);
//    }



    @Override
    public WhOrderDetailResDto save(WhOrderDetailReqDto reqDto) {
//        WhOrderDetailPo po = whOrderDetailReqDtoConvertor.dto2Po(reqDto);
//        whOrderDetailPoService.save(po);
//        WhOrderDetailResDto resDto = whOrderDetailResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return whOrderDetailPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<WhOrderDetailResDto> doPager(Map<String, Object> params) {
//        Pager<WhOrderDetailPo> poPager = whOrderDetailPoService.queryPage(params, WhOrderDetailPo.class);
//        Pager<WhOrderDetailResDto> resDtoPager = whOrderDetailResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public WhOrderDetailResDto selectOne(Long id) {
//        WhOrderDetailPo po = whOrderDetailPoService.getById(id);
//        WhOrderDetailResDto resDto = whOrderDetailResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public WhOrderDetailResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(WhOrderDetailPo::new, params);
//        queryWrapper.last(" limit 1");
//        WhOrderDetailPo po = whOrderDetailPoService.getOne(queryWrapper);
//        WhOrderDetailResDto resDto = whOrderDetailResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<WhOrderDetailPo> updateWrapper = QueryParamUtils.updateWrapper4Map(WhOrderDetailPo::new, id, params);
//        return whOrderDetailPoService.update(new WhOrderDetailPo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, WhOrderDetailReqDto reqDto) {
//        WhOrderDetailPo po = whOrderDetailReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return whOrderDetailPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, WhOrderDetailReqDto reqDto) {
//        UpdateWrapper<WhOrderDetailPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = WhOrderDetailReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), WhOrderDetailReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return whOrderDetailPoService.update(new WhOrderDetailPo(), updateWrapper);
        return  true;
    }

}