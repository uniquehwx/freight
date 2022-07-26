package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.DriverVehicleReqDto;
import com.bizcenter.freight.dto.res.DriverVehicleResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 司机车辆关联关系表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "driverVehicle", description = "司机车辆关联关系表接口", tags = {"driverVehicle"})
public interface DriverVehicleApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"driverVehicle"}, nickname = "addDriverVehicle")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<DriverVehicleResDto> addDriverVehicle(DriverVehicleReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"driverVehicle",}, nickname = "deleteDriverVehicle")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteDriverVehicle(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "driverVehicle",}, nickname = "getDriverVehicleList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-driverNo-eq", value = "司机no", paramType = "query"),
        @ApiImplicitParam(name = "qp-vehicleNo-eq", value = "车辆no", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-isvId-eq", value = "", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "修改人名称", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<DriverVehicleResDto>> getDriverVehicleList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"driverVehicle"}, nickname = "getOneDriverVehicle")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<DriverVehicleResDto> getOneDriverVehicle(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"driverVehicle"}, nickname = "getOneDriverVehicleByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "driverNo", value = "司机no", paramType = "query"),
        @ApiImplicitParam(name = "vehicleNo", value = "车辆no", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),

    })
    ResultDTO<DriverVehicleResDto> getOneDriverVehicle(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"driverVehicle"}, nickname = "updateDriverVehicleByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "driverNo", value = "司机no", paramType = "query"),
        @ApiImplicitParam(name = "vehicleNo", value = "车辆no", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<DriverVehicleResDto> updateDriverVehicle(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"driverVehicle"}, nickname = "patchUpdateDriverVehicle")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<DriverVehicleResDto> patchUpdateDriverVehicle(Long id, DriverVehicleReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"driverVehicle"}, nickname = "putUpdateDriverVehicle")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<DriverVehicleResDto> putUpdateDriverVehicle(Long id, DriverVehicleReqDto reqDto);

}
