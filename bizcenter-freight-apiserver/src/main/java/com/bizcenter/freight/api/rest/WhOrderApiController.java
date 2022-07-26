package com.bizcenter.freight.api.rest;

import com.bizcenter.freight.application.WhOrderService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.WhOrderReqDto;
import com.bizcenter.freight.dto.res.WhOrderResDto;
import com.bizcenter.freight.api.WhOrderApi;
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
 * 仓库订单(入库单)表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Slf4j
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/whOrder")
public class WhOrderApiController implements WhOrderApi {


    @Autowired
    private WhOrderService whOrderService;

    @Override
    @PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public ResultDTO<WhOrderResDto> addWhOrder(
        @ApiParam(value = "要保存的对象", required = true) @Valid @RequestBody WhOrderReqDto reqDto) {
        WhOrderResDto resDto = whOrderService.save(reqDto);
        return ResultDTO.ok(resDto);
    }

    @Override
    @DeleteMapping(value = "/{ids}", produces = {"application/json"})
    public ResultDTO<Void> deleteWhOrder(
        @ApiParam(value = "要删除的对象主键，多个对象主键可以用英文逗号隔开", required = true) @PathVariable("ids") String ids) {
        boolean bl = whOrderService.deleteByIds(ids);
        return ResultDTO.ok();
    }

    @Override
    @GetMapping(produces = {"application/json"})
    public ResultDTO<Pager<WhOrderResDto>> getWhOrderList(@ApiIgnore @RequestParam Map<String, Object> params) {
        Pager<WhOrderResDto> resDtoPager = whOrderService.doPager(params);
        return ResultDTO.ok(resDtoPager);
    }

    @Override
    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<WhOrderResDto> getOneWhOrder(@ApiParam(value = "要查询的对象主键", required = true) @PathVariable("id") Long id) {
        WhOrderResDto resDto = whOrderService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @GetMapping(value = "/one", produces = {"application/json"})
    public ResultDTO<WhOrderResDto> getOneWhOrder(@ApiIgnore @RequestParam Map<String, Object> params) {
        WhOrderResDto resDto = whOrderService.selectOne(params);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/map/{id}", produces = {"application/json"})
    public ResultDTO<WhOrderResDto> updateWhOrder(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
    @ApiIgnore @RequestParam Map<String, Object> params) {
        whOrderService.updateProps(id, params);
        WhOrderResDto resDto = whOrderService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<WhOrderResDto> patchUpdateWhOrder(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象，对象属性有值的才更新,即null值不更新", required = true) @Valid @RequestBody WhOrderReqDto reqDto) {
        whOrderService.updateProps(id, reqDto);
        WhOrderResDto resDto = whOrderService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PutMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<WhOrderResDto> putUpdateWhOrder(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象,对象属性全部更新", required = true) @Valid @RequestBody WhOrderReqDto reqDto) {
        whOrderService.updateAllProps(id, reqDto);
        WhOrderResDto resDto = whOrderService.selectOne(id);
        return ResultDTO.ok(resDto);
    }
}
