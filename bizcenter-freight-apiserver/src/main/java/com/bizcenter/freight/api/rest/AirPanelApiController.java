package com.bizcenter.freight.api.rest;

import com.bizcenter.freight.application.AirPanelService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.AirPanelReqDto;
import com.bizcenter.freight.dto.res.AirPanelResDto;
import com.bizcenter.freight.api.AirPanelApi;
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
 * 板型表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Slf4j
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/airPanel")
public class AirPanelApiController implements AirPanelApi {


    @Autowired
    private AirPanelService airPanelService;

    @Override
    @PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public ResultDTO<AirPanelResDto> addAirPanel(
        @ApiParam(value = "要保存的对象", required = true) @Valid @RequestBody AirPanelReqDto reqDto) {
        AirPanelResDto resDto = airPanelService.save(reqDto);
        return ResultDTO.ok(resDto);
    }

    @Override
    @DeleteMapping(value = "/{ids}", produces = {"application/json"})
    public ResultDTO<Void> deleteAirPanel(
        @ApiParam(value = "要删除的对象主键，多个对象主键可以用英文逗号隔开", required = true) @PathVariable("ids") String ids) {
        boolean bl = airPanelService.deleteByIds(ids);
        return ResultDTO.ok();
    }

    @Override
    @GetMapping(produces = {"application/json"})
    public ResultDTO<Pager<AirPanelResDto>> getAirPanelList(@ApiIgnore @RequestParam Map<String, Object> params) {
        Pager<AirPanelResDto> resDtoPager = airPanelService.doPager(params);
        return ResultDTO.ok(resDtoPager);
    }

    @Override
    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<AirPanelResDto> getOneAirPanel(@ApiParam(value = "要查询的对象主键", required = true) @PathVariable("id") Long id) {
        AirPanelResDto resDto = airPanelService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @GetMapping(value = "/one", produces = {"application/json"})
    public ResultDTO<AirPanelResDto> getOneAirPanel(@ApiIgnore @RequestParam Map<String, Object> params) {
        AirPanelResDto resDto = airPanelService.selectOne(params);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/map/{id}", produces = {"application/json"})
    public ResultDTO<AirPanelResDto> updateAirPanel(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
    @ApiIgnore @RequestParam Map<String, Object> params) {
        airPanelService.updateProps(id, params);
        AirPanelResDto resDto = airPanelService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<AirPanelResDto> patchUpdateAirPanel(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象，对象属性有值的才更新,即null值不更新", required = true) @Valid @RequestBody AirPanelReqDto reqDto) {
        airPanelService.updateProps(id, reqDto);
        AirPanelResDto resDto = airPanelService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PutMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<AirPanelResDto> putUpdateAirPanel(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象,对象属性全部更新", required = true) @Valid @RequestBody AirPanelReqDto reqDto) {
        airPanelService.updateAllProps(id, reqDto);
        AirPanelResDto resDto = airPanelService.selectOne(id);
        return ResultDTO.ok(resDto);
    }
}
