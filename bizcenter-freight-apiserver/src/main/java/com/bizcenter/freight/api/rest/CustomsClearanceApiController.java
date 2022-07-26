package com.bizcenter.freight.api.rest;

import com.bizcenter.freight.application.CustomsClearanceService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.CustomsClearanceReqDto;
import com.bizcenter.freight.dto.res.CustomsClearanceResDto;
import com.bizcenter.freight.api.CustomsClearanceApi;
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
 * 报关表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Slf4j
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/customsClearance")
public class CustomsClearanceApiController implements CustomsClearanceApi {


    @Autowired
    private CustomsClearanceService customsClearanceService;

    @Override
    @PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public ResultDTO<CustomsClearanceResDto> addCustomsClearance(
        @ApiParam(value = "要保存的对象", required = true) @Valid @RequestBody CustomsClearanceReqDto reqDto) {
        CustomsClearanceResDto resDto = customsClearanceService.save(reqDto);
        return ResultDTO.ok(resDto);
    }

    @Override
    @DeleteMapping(value = "/{ids}", produces = {"application/json"})
    public ResultDTO<Void> deleteCustomsClearance(
        @ApiParam(value = "要删除的对象主键，多个对象主键可以用英文逗号隔开", required = true) @PathVariable("ids") String ids) {
        boolean bl = customsClearanceService.deleteByIds(ids);
        return ResultDTO.ok();
    }

    @Override
    @GetMapping(produces = {"application/json"})
    public ResultDTO<Pager<CustomsClearanceResDto>> getCustomsClearanceList(@ApiIgnore @RequestParam Map<String, Object> params) {
        Pager<CustomsClearanceResDto> resDtoPager = customsClearanceService.doPager(params);
        return ResultDTO.ok(resDtoPager);
    }

    @Override
    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<CustomsClearanceResDto> getOneCustomsClearance(@ApiParam(value = "要查询的对象主键", required = true) @PathVariable("id") Long id) {
        CustomsClearanceResDto resDto = customsClearanceService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @GetMapping(value = "/one", produces = {"application/json"})
    public ResultDTO<CustomsClearanceResDto> getOneCustomsClearance(@ApiIgnore @RequestParam Map<String, Object> params) {
        CustomsClearanceResDto resDto = customsClearanceService.selectOne(params);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/map/{id}", produces = {"application/json"})
    public ResultDTO<CustomsClearanceResDto> updateCustomsClearance(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
    @ApiIgnore @RequestParam Map<String, Object> params) {
        customsClearanceService.updateProps(id, params);
        CustomsClearanceResDto resDto = customsClearanceService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<CustomsClearanceResDto> patchUpdateCustomsClearance(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象，对象属性有值的才更新,即null值不更新", required = true) @Valid @RequestBody CustomsClearanceReqDto reqDto) {
        customsClearanceService.updateProps(id, reqDto);
        CustomsClearanceResDto resDto = customsClearanceService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PutMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<CustomsClearanceResDto> putUpdateCustomsClearance(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象,对象属性全部更新", required = true) @Valid @RequestBody CustomsClearanceReqDto reqDto) {
        customsClearanceService.updateAllProps(id, reqDto);
        CustomsClearanceResDto resDto = customsClearanceService.selectOne(id);
        return ResultDTO.ok(resDto);
    }
}
