package com.bizcenter.freight.api.rest;

import com.bizcenter.freight.application.AirCompanyService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.AirCompanyReqDto;
import com.bizcenter.freight.dto.res.AirCompanyResDto;
import com.bizcenter.freight.api.AirCompanyApi;
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
 * 航司表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Slf4j
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/airCompany")
public class AirCompanyApiController implements AirCompanyApi {


    @Autowired
    private AirCompanyService airCompanyService;

    @Override
    @PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public ResultDTO<AirCompanyResDto> addAirCompany(
        @ApiParam(value = "要保存的对象", required = true) @Valid @RequestBody AirCompanyReqDto reqDto) {
        AirCompanyResDto resDto = airCompanyService.save(reqDto);
        return ResultDTO.ok(resDto);
    }

    @Override
    @DeleteMapping(value = "/{ids}", produces = {"application/json"})
    public ResultDTO<Void> deleteAirCompany(
        @ApiParam(value = "要删除的对象主键，多个对象主键可以用英文逗号隔开", required = true) @PathVariable("ids") String ids) {
        boolean bl = airCompanyService.deleteByIds(ids);
        return ResultDTO.ok();
    }

    @Override
    @GetMapping(produces = {"application/json"})
    public ResultDTO<Pager<AirCompanyResDto>> getAirCompanyList(@ApiIgnore @RequestParam Map<String, Object> params) {
        Pager<AirCompanyResDto> resDtoPager = airCompanyService.doPager(params);
        return ResultDTO.ok(resDtoPager);
    }

    @Override
    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<AirCompanyResDto> getOneAirCompany(@ApiParam(value = "要查询的对象主键", required = true) @PathVariable("id") Long id) {
        AirCompanyResDto resDto = airCompanyService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @GetMapping(value = "/one", produces = {"application/json"})
    public ResultDTO<AirCompanyResDto> getOneAirCompany(@ApiIgnore @RequestParam Map<String, Object> params) {
        AirCompanyResDto resDto = airCompanyService.selectOne(params);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/map/{id}", produces = {"application/json"})
    public ResultDTO<AirCompanyResDto> updateAirCompany(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
    @ApiIgnore @RequestParam Map<String, Object> params) {
        airCompanyService.updateProps(id, params);
        AirCompanyResDto resDto = airCompanyService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<AirCompanyResDto> patchUpdateAirCompany(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象，对象属性有值的才更新,即null值不更新", required = true) @Valid @RequestBody AirCompanyReqDto reqDto) {
        airCompanyService.updateProps(id, reqDto);
        AirCompanyResDto resDto = airCompanyService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PutMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<AirCompanyResDto> putUpdateAirCompany(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象,对象属性全部更新", required = true) @Valid @RequestBody AirCompanyReqDto reqDto) {
        airCompanyService.updateAllProps(id, reqDto);
        AirCompanyResDto resDto = airCompanyService.selectOne(id);
        return ResultDTO.ok(resDto);
    }
}
