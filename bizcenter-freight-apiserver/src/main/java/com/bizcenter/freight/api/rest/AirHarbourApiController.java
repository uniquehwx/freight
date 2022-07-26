package com.bizcenter.freight.api.rest;

import com.bizcenter.freight.application.AirHarbourService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.AirHarbourReqDto;
import com.bizcenter.freight.dto.res.AirHarbourResDto;
import com.bizcenter.freight.api.AirHarbourApi;
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
 * 港口表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Slf4j
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/airHarbour")
public class AirHarbourApiController implements AirHarbourApi {


    @Autowired
    private AirHarbourService airHarbourService;

    @Override
    @PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public ResultDTO<AirHarbourResDto> addAirHarbour(
        @ApiParam(value = "要保存的对象", required = true) @Valid @RequestBody AirHarbourReqDto reqDto) {
        AirHarbourResDto resDto = airHarbourService.save(reqDto);
        return ResultDTO.ok(resDto);
    }

    @Override
    @DeleteMapping(value = "/{ids}", produces = {"application/json"})
    public ResultDTO<Void> deleteAirHarbour(
        @ApiParam(value = "要删除的对象主键，多个对象主键可以用英文逗号隔开", required = true) @PathVariable("ids") String ids) {
        boolean bl = airHarbourService.deleteByIds(ids);
        return ResultDTO.ok();
    }

    @Override
    @GetMapping(produces = {"application/json"})
    public ResultDTO<Pager<AirHarbourResDto>> getAirHarbourList(@ApiIgnore @RequestParam Map<String, Object> params) {
        Pager<AirHarbourResDto> resDtoPager = airHarbourService.doPager(params);
        return ResultDTO.ok(resDtoPager);
    }

    @Override
    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<AirHarbourResDto> getOneAirHarbour(@ApiParam(value = "要查询的对象主键", required = true) @PathVariable("id") Long id) {
        AirHarbourResDto resDto = airHarbourService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @GetMapping(value = "/one", produces = {"application/json"})
    public ResultDTO<AirHarbourResDto> getOneAirHarbour(@ApiIgnore @RequestParam Map<String, Object> params) {
        AirHarbourResDto resDto = airHarbourService.selectOne(params);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/map/{id}", produces = {"application/json"})
    public ResultDTO<AirHarbourResDto> updateAirHarbour(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
    @ApiIgnore @RequestParam Map<String, Object> params) {
        airHarbourService.updateProps(id, params);
        AirHarbourResDto resDto = airHarbourService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<AirHarbourResDto> patchUpdateAirHarbour(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象，对象属性有值的才更新,即null值不更新", required = true) @Valid @RequestBody AirHarbourReqDto reqDto) {
        airHarbourService.updateProps(id, reqDto);
        AirHarbourResDto resDto = airHarbourService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PutMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<AirHarbourResDto> putUpdateAirHarbour(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象,对象属性全部更新", required = true) @Valid @RequestBody AirHarbourReqDto reqDto) {
        airHarbourService.updateAllProps(id, reqDto);
        AirHarbourResDto resDto = airHarbourService.selectOne(id);
        return ResultDTO.ok(resDto);
    }
}
