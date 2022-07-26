package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.TransportOrderService;
import com.bizcenter.freight.convertor.TransportOrderReqDtoConvertor;
import com.bizcenter.freight.convertor.TransportOrderResDtoConvertor;
import com.bizcenter.freight.dto.req.TransportOrderReqDto;
import com.bizcenter.freight.dto.res.TransportOrderResDto;
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
@Service("transportOrderAppService")
@Transactional(rollbackFor = Exception.class)
public class TransportOrderServiceImpl implements TransportOrderService {

    @Autowired
    private TransportOrderReqDtoConvertor transportOrderReqDtoConvertor;

    @Autowired
    private TransportOrderResDtoConvertor transportOrderResDtoConvertor;

//    private IPService<TransportOrderPo> transportOrderPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public TransportOrderServiceImpl(TransportOrderMapper transportOrderMapper) {
//        this.transportOrderPoService = new BasePService(transportOrderMapper);
//    }



    @Override
    public TransportOrderResDto save(TransportOrderReqDto reqDto) {
//        TransportOrderPo po = transportOrderReqDtoConvertor.dto2Po(reqDto);
//        transportOrderPoService.save(po);
//        TransportOrderResDto resDto = transportOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return transportOrderPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<TransportOrderResDto> doPager(Map<String, Object> params) {
//        Pager<TransportOrderPo> poPager = transportOrderPoService.queryPage(params, TransportOrderPo.class);
//        Pager<TransportOrderResDto> resDtoPager = transportOrderResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public TransportOrderResDto selectOne(Long id) {
//        TransportOrderPo po = transportOrderPoService.getById(id);
//        TransportOrderResDto resDto = transportOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public TransportOrderResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(TransportOrderPo::new, params);
//        queryWrapper.last(" limit 1");
//        TransportOrderPo po = transportOrderPoService.getOne(queryWrapper);
//        TransportOrderResDto resDto = transportOrderResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<TransportOrderPo> updateWrapper = QueryParamUtils.updateWrapper4Map(TransportOrderPo::new, id, params);
//        return transportOrderPoService.update(new TransportOrderPo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, TransportOrderReqDto reqDto) {
//        TransportOrderPo po = transportOrderReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return transportOrderPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, TransportOrderReqDto reqDto) {
//        UpdateWrapper<TransportOrderPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = TransportOrderReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), TransportOrderReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return transportOrderPoService.update(new TransportOrderPo(), updateWrapper);
        return  true;
    }

}