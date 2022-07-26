package com.bizcenter.freight.api.rest;

import com.bizcenter.freight.application.VehicleService;
import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.VehicleReqDto;
import com.bizcenter.freight.dto.res.VehicleResDto;
import com.bizcenter.freight.api.VehicleApi;
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
 * 车辆表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Slf4j
@SuppressWarnings("unchecked")
@RestController
@RequestMapping("/vehicle")
public class VehicleApiController implements VehicleApi {


    @Autowired
    private VehicleService vehicleService;

    @Override
    @PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public ResultDTO<VehicleResDto> addVehicle(
        @ApiParam(value = "要保存的对象", required = true) @Valid @RequestBody VehicleReqDto reqDto) {
        VehicleResDto resDto = vehicleService.save(reqDto);
        return ResultDTO.ok(resDto);
    }

    @Override
    @DeleteMapping(value = "/{ids}", produces = {"application/json"})
    public ResultDTO<Void> deleteVehicle(
        @ApiParam(value = "要删除的对象主键，多个对象主键可以用英文逗号隔开", required = true) @PathVariable("ids") String ids) {
        boolean bl = vehicleService.deleteByIds(ids);
        return ResultDTO.ok();
    }

    @Override
    @GetMapping(produces = {"application/json"})
    public ResultDTO<Pager<VehicleResDto>> getVehicleList(@ApiIgnore @RequestParam Map<String, Object> params) {
        Pager<VehicleResDto> resDtoPager = vehicleService.doPager(params);
        return ResultDTO.ok(resDtoPager);
    }

    @Override
    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<VehicleResDto> getOneVehicle(@ApiParam(value = "要查询的对象主键", required = true) @PathVariable("id") Long id) {
        VehicleResDto resDto = vehicleService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @GetMapping(value = "/one", produces = {"application/json"})
    public ResultDTO<VehicleResDto> getOneVehicle(@ApiIgnore @RequestParam Map<String, Object> params) {
        VehicleResDto resDto = vehicleService.selectOne(params);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/map/{id}", produces = {"application/json"})
    public ResultDTO<VehicleResDto> updateVehicle(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
    @ApiIgnore @RequestParam Map<String, Object> params) {
        vehicleService.updateProps(id, params);
        VehicleResDto resDto = vehicleService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PatchMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<VehicleResDto> patchUpdateVehicle(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象，对象属性有值的才更新,即null值不更新", required = true) @Valid @RequestBody VehicleReqDto reqDto) {
        vehicleService.updateProps(id, reqDto);
        VehicleResDto resDto = vehicleService.selectOne(id);
        return ResultDTO.ok(resDto);
    }

    @Override
    @PutMapping(value = "/{id}", produces = {"application/json"})
    public ResultDTO<VehicleResDto> putUpdateVehicle(@ApiParam(value = "对象ID", required = true) @PathVariable("id") Long id,
        @ApiParam(value = "要修改的对象,对象属性全部更新", required = true) @Valid @RequestBody VehicleReqDto reqDto) {
        vehicleService.updateAllProps(id, reqDto);
        VehicleResDto resDto = vehicleService.selectOne(id);
        return ResultDTO.ok(resDto);
    }
}
