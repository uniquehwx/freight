package com.bizcenter.freight.application.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.bizcenter.freight.domain.model.OrderEntity;
import com.bizcenter.freight.domain.service.order.OrderDomainService;
import com.google.common.base.CaseFormat;
import com.bitsun.core.common.exception.AppException;
import com.bitsun.core.common.exception.ErrorCode;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.persistence.QueryParamUtils;
import com.bizcenter.freight.application.OrderService;
import com.bizcenter.freight.infrastructure.persistence.dao.OrderMapper;
import com.bizcenter.freight.infrastructure.persistence.po.OrderPo;
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
import com.bizcenter.freight.convertor.OrderReqDtoConvertor;
import com.bizcenter.freight.convertor.OrderResDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import com.bizcenter.freight.dto.req.OrderReqDto;
import com.bizcenter.freight.dto.res.OrderResDto;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("orderAppService")
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderReqDtoConvertor orderReqDtoConvertor;

    @Autowired
    private OrderResDtoConvertor orderResDtoConvertor;

    @Autowired
    private OrderDomainService orderDomainService;

    private IPService<OrderPo> orderPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderPoService = new BasePService(orderMapper);
    }



    @Override
    public OrderResDto save(OrderReqDto reqDto) {
        OrderPo po = orderReqDtoConvertor.dto2Po(reqDto);
        orderPoService.save(po);
        OrderResDto resDto = orderResDtoConvertor.po2Dto(po);

        OrderEntity orderEntity = orderReqDtoConvertor.dto2Entity(reqDto);
//        orderDomainService.addOrder();
        return resDto;
    }

    @Override
    public boolean deleteByIds(String ids) {
        try {
            List<Long> idLongList =
            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
            return orderPoService.removeByIds(idLongList);
        } catch (Exception e) {
            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
        }
     }

    @Override
    public Pager<OrderResDto> doPager(Map<String, Object> params) {
        Pager<OrderPo> poPager = orderPoService.queryPage(params, OrderPo.class);
        Pager<OrderResDto> resDtoPager = orderResDtoConvertor.convertPoPager2ResDtoPager(poPager);
        return resDtoPager;
    }

    @Override
    public OrderResDto selectOne(Long id) {
        OrderPo po = orderPoService.getById(id);
        OrderResDto resDto = orderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public OrderResDto selectOne(Map<String, Object> params) {
        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(OrderPo::new, params);
        queryWrapper.last(" limit 1");
        OrderPo po = orderPoService.getOne(queryWrapper);
        OrderResDto resDto = orderResDtoConvertor.po2Dto(po);
        return resDto;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
        UpdateWrapper<OrderPo> updateWrapper = QueryParamUtils.updateWrapper4Map(OrderPo::new, id, params);
        return orderPoService.update(new OrderPo(), updateWrapper);
        }

    @Override
    public boolean updateProps(Long id, OrderReqDto reqDto) {
        OrderPo po = orderReqDtoConvertor.dto2Po(reqDto);
        po.setId(id);
        return orderPoService.updateById(po);
    }


    @Override
    public boolean updateAllProps(Long id, OrderReqDto reqDto) {
        UpdateWrapper<OrderPo> updateWrapper = Wrappers.update();
        updateWrapper.eq("id", id);
        Field[] fields = OrderReqDto.class.getDeclaredFields();
        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
        try {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), OrderReqDto.class);
        Method getMethod = propertyDescriptor.getReadMethod();
        String fileNameCamel = getMethod.getName().substring(3);
        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
        } catch (Exception ex) {
        log.warn("属性不存在get方法："+field.getName(),ex);
        }
        });
        return orderPoService.update(new OrderPo(), updateWrapper);
    }

}