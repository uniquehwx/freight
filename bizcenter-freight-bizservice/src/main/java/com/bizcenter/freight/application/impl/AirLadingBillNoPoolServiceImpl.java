package com.bizcenter.freight.application.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.google.common.base.CaseFormat;
import com.bitsun.core.common.exception.AppException;
import com.bitsun.core.common.exception.ErrorCode;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.persistence.QueryParamUtils;
import com.bizcenter.freight.application.AirLadingBillNoPoolService;
import com.bizcenter.freight.infrastructure.persistence.dao.AirLadingBillNoPoolMapper;
import com.bizcenter.freight.infrastructure.persistence.po.AirLadingBillNoPoolPo;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bizcenter.freight.convertor.AirLadingBillNoPoolReqDtoConvertor;
import com.bizcenter.freight.convertor.AirLadingBillNoPoolResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.AirLadingBillNoPoolReqDto;
import com.bizcenter.freight.dto.res.AirLadingBillNoPoolResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("airLadingBillNoPoolAppService")
@Transactional(rollbackFor = Exception.class)
public class AirLadingBillNoPoolServiceImpl implements AirLadingBillNoPoolService {

    @Autowired
    private AirLadingBillNoPoolReqDtoConvertor airLadingBillNoPoolReqDtoConvertor;

    @Autowired
    private AirLadingBillNoPoolResDtoConvertor airLadingBillNoPoolResDtoConvertor;

    private IPService<AirLadingBillNoPoolPo> airLadingBillNoPoolPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public AirLadingBillNoPoolServiceImpl(AirLadingBillNoPoolMapper airLadingBillNoPoolMapper) {
        this.airLadingBillNoPoolPoService = new BasePService(airLadingBillNoPoolMapper);
    }



    @Override
    public AirLadingBillNoPoolResDto save(AirLadingBillNoPoolReqDto reqDto) {
        AirLadingBillNoPoolPo po = airLadingBillNoPoolReqDtoConvertor.dto2Po(reqDto);
        airLadingBillNoPoolPoService.save(po);
        AirLadingBillNoPoolResDto resDto = airLadingBillNoPoolResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return airLadingBillNoPoolPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<AirLadingBillNoPoolResDto> doPager(Map<String, Object> params) {
        Pager<AirLadingBillNoPoolPo> poPager = airLadingBillNoPoolPoService.queryPage(params, AirLadingBillNoPoolPo.class);
        Pager<AirLadingBillNoPoolResDto> resDtoPager = airLadingBillNoPoolResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public AirLadingBillNoPoolResDto selectOne(Long id) {
        AirLadingBillNoPoolPo po = airLadingBillNoPoolPoService.getById(id);
        AirLadingBillNoPoolResDto resDto = airLadingBillNoPoolResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public AirLadingBillNoPoolResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(AirLadingBillNoPoolPo::new, params);
        queryWrapper.last(" limit 1");
        AirLadingBillNoPoolPo po = airLadingBillNoPoolPoService.getOne(queryWrapper);
        AirLadingBillNoPoolResDto resDto = airLadingBillNoPoolResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<AirLadingBillNoPoolPo> updateWrapper = QueryParamUtils.updateWrapper4Map(AirLadingBillNoPoolPo::new, id, params);
        return airLadingBillNoPoolPoService.update(new AirLadingBillNoPoolPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, AirLadingBillNoPoolReqDto reqDto) {
        AirLadingBillNoPoolPo po = airLadingBillNoPoolReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return airLadingBillNoPoolPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, AirLadingBillNoPoolReqDto reqDto) {
        UpdateWrapper<AirLadingBillNoPoolPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = AirLadingBillNoPoolReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), AirLadingBillNoPoolReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return airLadingBillNoPoolPoService.update(new AirLadingBillNoPoolPo(), updateWrapper);
    }

}