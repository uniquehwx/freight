package com.bizcenter.freight.api.rest;

import com.bizcenter.freight.application.WhOrderDetailService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.WhOrderDetailReqDto;
import com.bizcenter.freight.dto.res.WhOrderDetailResDto;
import com.bizcenter.freight.api.WhOrderDetailApi;
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
 * 入库明细表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Slf4j
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/whOrderDetail")
public class WhOrderDetailApiController implements WhOrderDetailApi {


    @Autowired
    private WhOrderDetailService whOrderDetailService;

    @Override
    @PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public ResultDTO<WhOrderDetailResDto> addWhOrderDetail(
        @ApiParam(value = "要保存的对象", required = true) @Valid @RequestBody WhOrderDetailReqDto reqDto) {
        WhOrderDetailResDto resDto = whOrderDetailService.save(reqDto);
        return ResultDTO.ok(resDto);
    }

    @Override
    @DeleteMapping(value = "/{ids}", produces = {"application/json"})
    public ResultDTO<Void> deleteWhOrderDetail(
        @ApiParam(value = "要删除的对象主键，多个对象主键可以用英文逗号隔开", required = true) @PathVariable("ids") String ids) {
        boolean bl = whOrderDetailService.deleteByIds(ids);
        return ResultDTO.ok();
    }

    @Override
    @GetMapping(produces = {"application/json"})
    public ResultDTO<Pager<WhOrderDetailResDto>> getWhOrderDetailList(@ApiIgnore @RequestParam Map<String, Object> params) {
        Pager<WhOrderDetailResDto> resDtoPager = whOrderDetailService.doPager(params);
        return ResultDTO.ok(resDtoPager);
    }

    @Override
    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<WhOrderDetailResDto> getOneWhOrderDetail(@ApiParam(value = "要查询的对象主键", required = true) @PathVariable("id") Long id) {
        WhOrderDetailResDto resDto = whOrderDetailService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @GetMapping(value = "/one", produces = {"application/json"})
    public ResultDTO<WhOrderDetailResDto> getOneWhOrderDetail(@ApiIgnore @RequestParam Map<String, Object> params) {
        WhOrderDetailResDto resDto = whOrderDetailService.selectOne(params);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/map/{id}", produces = {"application/json"})
    public ResultDTO<WhOrderDetailResDto> updateWhOrderDetail(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
    @ApiIgnore @RequestParam Map<String, Object> params) {
        whOrderDetailService.updateProps(id, params);
        WhOrderDetailResDto resDto = whOrderDetailService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<WhOrderDetailResDto> patchUpdateWhOrderDetail(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象，对象属性有值的才更新,即null值不更新", required = true) @Valid @RequestBody WhOrderDetailReqDto reqDto) {
        whOrderDetailService.updateProps(id, reqDto);
        WhOrderDetailResDto resDto = whOrderDetailService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PutMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<WhOrderDetailResDto> putUpdateWhOrderDetail(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象,对象属性全部更新", required = true) @Valid @RequestBody WhOrderDetailReqDto reqDto) {
        whOrderDetailService.updateAllProps(id, reqDto);
        WhOrderDetailResDto resDto = whOrderDetailService.selectOne(id);
        return ResultDTO.ok(resDto);
    }
}
