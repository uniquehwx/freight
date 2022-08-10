package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.OrderService;
import com.bizcenter.freight.constants.OrderStatus;
import com.bizcenter.freight.convertor.OrderReqDtoConvertor;
import com.bizcenter.freight.convertor.OrderResDtoConvertor;
import com.bizcenter.freight.domain.model.order.OrderEntity;
import com.bizcenter.freight.domain.service.order.OrderDomainService;
import com.bizcenter.freight.dto.req.OrderReqDto;
import com.bizcenter.freight.dto.res.OrderResDto;
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
@Service("orderAppService")
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderReqDtoConvertor orderReqDtoConvertor;

    @Autowired
    private OrderResDtoConvertor orderResDtoConvertor;

    @Autowired
    private OrderDomainService orderDomainService;

//    @Autowired
//    private OrderRepository orderRepository;
//
//    private IPService<OrderPo> orderPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public OrderServiceImpl(OrderMapper orderMapper) {
//        this.orderPoService = new BasePService(orderMapper);
//    }

    @Override
    public OrderResDto save(OrderReqDto reqDto) {
        OrderEntity req = orderReqDtoConvertor.dto2Entity(reqDto);
        OrderEntity entity = orderDomainService.addOrder(req);
        OrderResDto res = orderResDtoConvertor.entity2Dto(entity);
        return res;
    }

    @Override
    public OrderResDto selectOne(Long id) {
//        OrderPo po = orderPoService.getById(id);
//        OrderResDto resDto = orderResDtoConvertor.po2Dto(po);
//        return resDto;
        OrderEntity entity = orderDomainService.selectOne(id);
        OrderResDto res = orderResDtoConvertor.entity2Dto(entity);
        return res;
    }

    @Override
    public boolean updateProps(Long id, OrderReqDto reqDto) {
        OrderEntity entity = orderReqDtoConvertor.dto2Entity(reqDto);
        entity.setId(id);

//        OrderPo po = orderReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return orderPoService.updateById(po);
        return  orderDomainService.update(entity);
    }

    @Override
    public Pager<OrderResDto> doPager(Map<String, Object> params) {
        Pager<OrderEntity> orderEntity = orderDomainService.doPager(params);
//        Pager<OrderPo> poPager = orderPoService.queryPage(params, OrderPo.class);
        Pager<OrderResDto> resDtoPager = orderResDtoConvertor.convertEntityPager2ResDtoPager(orderEntity);
//        return resDtoPager;
        return resDtoPager;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return orderPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }





    @Override
    public OrderResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(OrderPo::new, params);
//        queryWrapper.last(" limit 1");
//        OrderPo po = orderPoService.getOne(queryWrapper);
//        OrderResDto resDto = orderResDtoConvertor.po2Dto(po);
//        return resDto;
        return null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<OrderPo> updateWrapper = QueryParamUtils.updateWrapper4Map(OrderPo::new, id, params);
//        return orderPoService.update(new OrderPo(), updateWrapper);
        return true;
        }




    @Override
    public boolean updateAllProps(Long id, OrderReqDto reqDto) {
//        UpdateWrapper<OrderPo> updateWrapper = Wrappers.update();
//        updateWrapper.eq("id", id);
//        Field[] fields = OrderReqDto.class.getDeclaredFields();
//        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
//        try {
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), OrderReqDto.class);
//        Method getMethod = propertyDescriptor.getReadMethod();
//        String fileNameCamel = getMethod.getName().substring(3);
//        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
//        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
//        } catch (Exception ex) {
//        log.warn("属性不存在get方法："+field.getName(),ex);
//        }
//        });
//        return orderPoService.update(new OrderPo(), updateWrapper);
        return true;
    }

    @Override
    public boolean cancelOrder(Long id) {
        OrderEntity entity = new OrderEntity();
        entity.setId(id);
        entity.setTradeStatus(OrderStatus.cancel);
//        OrderPo po = orderReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return orderPoService.updateById(po);

        return orderDomainService.update(entity);
    }

}