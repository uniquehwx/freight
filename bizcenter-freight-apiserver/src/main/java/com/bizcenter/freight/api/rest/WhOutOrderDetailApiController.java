package com.bizcenter.freight.api.rest;

import com.bizcenter.freight.application.WhOutOrderDetailService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.WhOutOrderDetailReqDto;
import com.bizcenter.freight.dto.res.WhOutOrderDetailResDto;
import com.bizcenter.freight.api.WhOutOrderDetailApi;
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
 * 出库明细表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Slf4j
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/whOutOrderDetail")
public class WhOutOrderDetailApiController implements WhOutOrderDetailApi {


    @Autowired
    private WhOutOrderDetailService whOutOrderDetailService;

    @Override
    @PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public ResultDTO<WhOutOrderDetailResDto> addWhOutOrderDetail(
        @ApiParam(value = "要保存的对象", required = true) @Valid @RequestBody WhOutOrderDetailReqDto reqDto) {
        WhOutOrderDetailResDto resDto = whOutOrderDetailService.save(reqDto);
        return ResultDTO.ok(resDto);
    }

    @Override
    @DeleteMapping(value = "/{ids}", produces = {"application/json"})
    public ResultDTO<Void> deleteWhOutOrderDetail(
        @ApiParam(value = "要删除的对象主键，多个对象主键可以用英文逗号隔开", required = true) @PathVariable("ids") String ids) {
        boolean bl = whOutOrderDetailService.deleteByIds(ids);
        return ResultDTO.ok();
    }

    @Override
    @GetMapping(produces = {"application/json"})
    public ResultDTO<Pager<WhOutOrderDetailResDto>> getWhOutOrderDetailList(@ApiIgnore @RequestParam Map<String, Object> params) {
        Pager<WhOutOrderDetailResDto> resDtoPager = whOutOrderDetailService.doPager(params);
        return ResultDTO.ok(resDtoPager);
    }

    @Override
    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<WhOutOrderDetailResDto> getOneWhOutOrderDetail(@ApiParam(value = "要查询的对象主键", required = true) @PathVariable("id") Long id) {
        WhOutOrderDetailResDto resDto = whOutOrderDetailService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @GetMapping(value = "/one", produces = {"application/json"})
    public ResultDTO<WhOutOrderDetailResDto> getOneWhOutOrderDetail(@ApiIgnore @RequestParam Map<String, Object> params) {
        WhOutOrderDetailResDto resDto = whOutOrderDetailService.selectOne(params);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/map/{id}", produces = {"application/json"})
    public ResultDTO<WhOutOrderDetailResDto> updateWhOutOrderDetail(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
    @ApiIgnore @RequestParam Map<String, Object> params) {
        whOutOrderDetailService.updateProps(id, params);
        WhOutOrderDetailResDto resDto = whOutOrderDetailService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<WhOutOrderDetailResDto> patchUpdateWhOutOrderDetail(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象，对象属性有值的才更新,即null值不更新", required = true) @Valid @RequestBody WhOutOrderDetailReqDto reqDto) {
        whOutOrderDetailService.updateProps(id, reqDto);
        WhOutOrderDetailResDto resDto = whOutOrderDetailService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PutMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<WhOutOrderDetailResDto> putUpdateWhOutOrderDetail(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象,对象属性全部更新", required = true) @Valid @RequestBody WhOutOrderDetailReqDto reqDto) {
        whOutOrderDetailService.updateAllProps(id, reqDto);
        WhOutOrderDetailResDto resDto = whOutOrderDetailService.selectOne(id);
        return ResultDTO.ok(resDto);
    }
}
