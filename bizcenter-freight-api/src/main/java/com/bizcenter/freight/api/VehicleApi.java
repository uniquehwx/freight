package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.VehicleReqDto;
import com.bizcenter.freight.dto.res.VehicleResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 车辆表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "vehicle", description = "车辆表接口", tags = {"vehicle"})
public interface VehicleApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"vehicle"}, nickname = "addVehicle")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<VehicleResDto> addVehicle(VehicleReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"vehicle",}, nickname = "deleteVehicle")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteVehicle(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "vehicle",}, nickname = "getVehicleList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-licensePlateNumber-eq", value = "车牌号", paramType = "query"),
        @ApiImplicitParam(name = "qp-vehicleTypeCode-eq", value = "10 重型箱式货车；20中型箱式货车 30轻型箱式货车40小型箱式货车", paramType = "query"),
        @ApiImplicitParam(name = "qp-remark-eq", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "qp-size-eq", value = "外形尺寸", paramType = "query"),
        @ApiImplicitParam(name = "qp-annualVerification-eq", value = "年审时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-identifyUrl-eq", value = "资格证图片", paramType = "query"),
        @ApiImplicitParam(name = "qp-isInternalVehicle-eq", value = "是否是内部车辆(1:是 0否)", paramType = "query"),
        @ApiImplicitParam(name = "qp-regulationCar-eq", value = "监管车(1:是 0否)", paramType = "query"),
        @ApiImplicitParam(name = "qp-insurance-eq", value = "车辆保险信息（保险公司，保险类型，保险期始，保险截至，保险险种）", paramType = "query"),
        @ApiImplicitParam(name = "qp-loadWeight-eq", value = "核载重量", paramType = "query"),
        @ApiImplicitParam(name = "qp-driverMessage-eq", value = "司机信息（包含司机id，司机姓名）", paramType = "query"),
        @ApiImplicitParam(name = "qp-registrationTime-eq", value = "登记时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-isvId-eq", value = "", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-vehicleAge-eq", value = "车龄", paramType = "query"),
        @ApiImplicitParam(name = "qp-recentMileage-eq", value = "当前行驶总里程(万公里)", paramType = "query"),
        @ApiImplicitParam(name = "qp-supplierNo-eq", value = "供应商no", paramType = "query"),
        @ApiImplicitParam(name = "qp-vehicleStatus-eq", value = "车辆状态(10空闲;20运输)", paramType = "query"),
        @ApiImplicitParam(name = "qp-currentLocation-eq", value = "当前位置", paramType = "query"),
        @ApiImplicitParam(name = "qp-models-eq", value = "车型（10:1.5T，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60 5T ,70  8T,80 10T,90  12T,100  20 尺柜,110 40尺柜 ,12040/50尺柜 ）", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<VehicleResDto>> getVehicleList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"vehicle"}, nickname = "getOneVehicle")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<VehicleResDto> getOneVehicle(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"vehicle"}, nickname = "getOneVehicleByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "licensePlateNumber", value = "车牌号", paramType = "query"),
        @ApiImplicitParam(name = "vehicleTypeCode", value = "10 重型箱式货车；20中型箱式货车 30轻型箱式货车40小型箱式货车", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "size", value = "外形尺寸", paramType = "query"),
        @ApiImplicitParam(name = "annualVerification", value = "年审时间", paramType = "query"),
        @ApiImplicitParam(name = "identifyUrl", value = "资格证图片", paramType = "query"),
        @ApiImplicitParam(name = "isInternalVehicle", value = "是否是内部车辆(1:是 0否)", paramType = "query"),
        @ApiImplicitParam(name = "regulationCar", value = "监管车(1:是 0否)", paramType = "query"),
        @ApiImplicitParam(name = "insurance", value = "车辆保险信息（保险公司，保险类型，保险期始，保险截至，保险险种）", paramType = "query"),
        @ApiImplicitParam(name = "loadWeight", value = "核载重量", paramType = "query"),
        @ApiImplicitParam(name = "driverMessage", value = "司机信息（包含司机id，司机姓名）", paramType = "query"),
        @ApiImplicitParam(name = "registrationTime", value = "登记时间", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "vehicleAge", value = "车龄", paramType = "query"),
        @ApiImplicitParam(name = "recentMileage", value = "当前行驶总里程(万公里)", paramType = "query"),
        @ApiImplicitParam(name = "supplierNo", value = "供应商no", paramType = "query"),
        @ApiImplicitParam(name = "vehicleStatus", value = "车辆状态(10空闲;20运输)", paramType = "query"),
        @ApiImplicitParam(name = "currentLocation", value = "当前位置", paramType = "query"),
        @ApiImplicitParam(name = "models", value = "车型（10:1.5T，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60 5T ,70  8T,80 10T,90  12T,100  20 尺柜,110 40尺柜 ,12040/50尺柜 ）", paramType = "query"),

    })
    ResultDTO<VehicleResDto> getOneVehicle(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"vehicle"}, nickname = "updateVehicleByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "licensePlateNumber", value = "车牌号", paramType = "query"),
        @ApiImplicitParam(name = "vehicleTypeCode", value = "10 重型箱式货车；20中型箱式货车 30轻型箱式货车40小型箱式货车", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "size", value = "外形尺寸", paramType = "query"),
        @ApiImplicitParam(name = "annualVerification", value = "年审时间", paramType = "query"),
        @ApiImplicitParam(name = "identifyUrl", value = "资格证图片", paramType = "query"),
        @ApiImplicitParam(name = "isInternalVehicle", value = "是否是内部车辆(1:是 0否)", paramType = "query"),
        @ApiImplicitParam(name = "regulationCar", value = "监管车(1:是 0否)", paramType = "query"),
        @ApiImplicitParam(name = "insurance", value = "车辆保险信息（保险公司，保险类型，保险期始，保险截至，保险险种）", paramType = "query"),
        @ApiImplicitParam(name = "loadWeight", value = "核载重量", paramType = "query"),
        @ApiImplicitParam(name = "driverMessage", value = "司机信息（包含司机id，司机姓名）", paramType = "query"),
        @ApiImplicitParam(name = "registrationTime", value = "登记时间", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "vehicleAge", value = "车龄", paramType = "query"),
        @ApiImplicitParam(name = "recentMileage", value = "当前行驶总里程(万公里)", paramType = "query"),
        @ApiImplicitParam(name = "supplierNo", value = "供应商no", paramType = "query"),
        @ApiImplicitParam(name = "vehicleStatus", value = "车辆状态(10空闲;20运输)", paramType = "query"),
        @ApiImplicitParam(name = "currentLocation", value = "当前位置", paramType = "query"),
        @ApiImplicitParam(name = "models", value = "车型（10:1.5T，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60 5T ,70  8T,80 10T,90  12T,100  20 尺柜,110 40尺柜 ,12040/50尺柜 ）", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<VehicleResDto> updateVehicle(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"vehicle"}, nickname = "patchUpdateVehicle")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<VehicleResDto> patchUpdateVehicle(Long id, VehicleReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"vehicle"}, nickname = "putUpdateVehicle")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<VehicleResDto> putUpdateVehicle(Long id, VehicleReqDto reqDto);

}
