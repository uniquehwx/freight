package com.bizcenter.freight.api.rest;

import com.bizcenter.freight.application.OrderService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.OrderReqDto;
import com.bizcenter.freight.dto.res.OrderResDto;
import com.bizcenter.freight.api.order.OrderApi;
import io.swagger.annotations.ApiParam;
import java.util.Map;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 订单
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Slf4j
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/order")
public class OrderApiController implements OrderApi {


    @Autowired
    private OrderService orderService;

    @Override
    @PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public ResultDTO<OrderResDto> addOrder(
        @ApiParam(value = "要保存的对象", required = true) @Valid @RequestBody OrderReqDto reqDto) {
        OrderResDto resDto = orderService.save(reqDto);
        return ResultDTO.ok(resDto);
    }


    @Override
    @PatchMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<OrderResDto> patchUpdateOrder(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
                                                   @ApiParam(value = "要修改的对象，对象属性有值的才更新,即null值不更新", required = true) @Valid @RequestBody OrderReqDto reqDto) {
        orderService.updateProps(id, reqDto);
        OrderResDto resDto = orderService.selectOne(id);
        return ResultDTO.ok(resDto);
    }


    @Override
    @PatchMapping(value = "cancel/{id}", produces = {"application/json"})
    public ResultDTO<Boolean> cancelOrder(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id) {

        return  ResultDTO.ok(orderService.cancelOrder(id));
    }

    @Override
    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<OrderResDto> getOneOrder(@ApiParam(value = "要查询的对象主键", required = true) @PathVariable("id") Long id) {
        OrderResDto resDto = orderService.selectOne(id);
        return ResultDTO.ok(resDto);
    }


    @Override
    @GetMapping(produces = {"application/json"})
    public ResultDTO<Pager<OrderResDto>> getOrderList(@ApiIgnore @RequestParam Map<String, Object> params) {
        Pager<OrderResDto> resDtoPager = orderService.doPager(params);
        return ResultDTO.ok(resDtoPager);
    }
    //-----------------------------------------------------下面是不怎么需要的生成的接口信息

    @Override
    @DeleteMapping(value = "/{ids}", produces = {"application/json"})
    public ResultDTO<Void> deleteOrder(
        @ApiParam(value = "要删除的对象主键，多个对象主键可以用英文逗号隔开", required = true) @PathVariable("ids") String ids) {
        boolean bl = orderService.deleteByIds(ids);
        return ResultDTO.ok(bl);
    }

//    @Override
//    @GetMapping(produces = {"application/json"})
//    public ResultDTO<Pager<OrderResDto>> getOrderList(@ApiIgnore @RequestParam Map<String, Object> params) {
//        Pager<OrderResDto> resDtoPager = orderService.doPager(params);
//        return ResultDTO.ok(resDtoPager);
//    }

//    @Override
//    @GetMapping(value = "/one", produces = {"application/json"})
//    public ResultDTO<OrderResDto> getOneOrder(@ApiIgnore @RequestParam Map<String, Object> params) {
//        OrderResDto resDto = orderService.selectOne(params);
//        return ResultDTO.ok(resDto);
//    }
//
//    @Override
//    @PatchMapping(value = "/map/{id}", produces = {"application/json"})
//    public ResultDTO<OrderResDto> updateOrder(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
//    @ApiIgnore @RequestParam Map<String, Object> params) {
//        orderService.updateProps(id, params);
//        OrderResDto resDto = orderService.selectOne(id);
//        return ResultDTO.ok(resDto);
//    }
//
//
//    @Override
//    @PutMapping(value = "/{id}", produces = {"application/json"})
//    public ResultDTO<OrderResDto> putUpdateOrder(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
//        @ApiParam(value = "要修改的对象,对象属性全部更新", required = true) @Valid @RequestBody OrderReqDto reqDto) {
//        orderService.updateAllProps(id, reqDto);
//        OrderResDto resDto = orderService.selectOne(id);
//        return ResultDTO.ok(resDto);
//    }
}
