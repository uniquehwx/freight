package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.PlayBoardOrderService;
import com.bizcenter.freight.convertor.PlayBoardOrderReqDtoConvertor;
import com.bizcenter.freight.convertor.PlayBoardOrderResDtoConvertor;
import com.bizcenter.freight.dto.req.PlayBoardOrderReqDto;
import com.bizcenter.freight.dto.res.PlayBoardOrderResDto;
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
@Service("playBoardOrderAppService")
@Transactional(rollbackFor = Exception.class)
public class PlayBoardOrderServiceImpl implements PlayBoardOrderService {

    @Autowired
    private PlayBoardOrderReqDtoConvertor playBoardOrderReqDtoConvertor;

    @Autowired
    private PlayBoardOrderResDtoConvertor playBoardOrderResDtoConvertor;

//    private IPService<PlayBoardOrderPo> playBoardOrderPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public PlayBoardOrderServiceImpl(PlayBoardOrderMapper playBoardOrderMapper) {
//        this.playBoardOrderPoService = new BasePService(playBoardOrderMapper);
//    }



    @Override
    public PlayBoardOrderResDto save(PlayBoardOrderReqDto reqDto) {
//        PlayBoardOrderPo po = playBoardOrderReqDtoConvertor.dto2Po(reqDto);
//        playBoardOrderPoService.save(po);
//        PlayBoardOrderResDto resDto = playBoardOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return playBoardOrderPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<PlayBoardOrderResDto> doPager(Map<String, Object> params) {
//        Pager<PlayBoardOrderPo> poPager = playBoardOrderPoService.queryPage(params, PlayBoardOrderPo.class);
//        Pager<PlayBoardOrderResDto> resDtoPager = playBoardOrderResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public PlayBoardOrderResDto selectOne(Long id) {
//        PlayBoardOrderPo po = playBoardOrderPoService.getById(id);
//        PlayBoardOrderResDto resDto = playBoardOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public PlayBoardOrderResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(PlayBoardOrderPo::new, params);
//        queryWrapper.last(" limit 1");
//        PlayBoardOrderPo po = playBoardOrderPoService.getOne(queryWrapper);
//        PlayBoardOrderResDto resDto = playBoardOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<PlayBoardOrderPo> updateWrapper = QueryParamUtils.updateWrapper4Map(PlayBoardOrderPo::new, id, params);
////        return playBoardOrderPoService.update(new PlayBoardOrderPo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, PlayBoardOrderReqDto reqDto) {
//        PlayBoardOrderPo po = playBoardOrderReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return playBoardOrderPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, PlayBoardOrderReqDto reqDto) {
//        UpdateWrapper<PlayBoardOrderPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = PlayBoardOrderReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), PlayBoardOrderReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return playBoardOrderPoService.update(new PlayBoardOrderPo(), updateWrapper);
        return  true;
    }

}