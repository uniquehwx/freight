package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.DriverReqDto;
import com.bizcenter.freight.dto.res.DriverResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 司机表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "driver", description = "司机表接口", tags = {"driver"})
public interface DriverApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"driver"}, nickname = "addDriver")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<DriverResDto> addDriver(DriverReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"driver",}, nickname = "deleteDriver")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteDriver(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "driver",}, nickname = "getDriverList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-driverName-eq", value = "司机姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-driverMobileNo-eq", value = "手机号", paramType = "query"),
        @ApiImplicitParam(name = "qp-remark-eq", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "qp-supplierNo-eq", value = "供应商no", paramType = "query"),
        @ApiImplicitParam(name = "qp-licenseNumber-eq", value = "身份证/驾驶证号", paramType = "query"),
        @ApiImplicitParam(name = "qp-idFrontImgUrl-eq", value = "身份证正面照", paramType = "query"),
        @ApiImplicitParam(name = "qp-idBackImgUrl-eq", value = "身份证背面照", paramType = "query"),
        @ApiImplicitParam(name = "qp-driveFrontImgUrl-eq", value = "驾驶证正面照url", paramType = "query"),
        @ApiImplicitParam(name = "qp-driveBackImgUrl-eq", value = "驾驶证背面照url", paramType = "query"),
        @ApiImplicitParam(name = "qp-driverType-eq", value = "准驾车型", paramType = "query"),
        @ApiImplicitParam(name = "qp-driverDeadline-eq", value = "驾驶证期限", paramType = "query"),
        @ApiImplicitParam(name = "qp-qualificationsNo-eq", value = "从业资格号", paramType = "query"),
        @ApiImplicitParam(name = "qp-qualificationType-eq", value = "从业类别(10：危险品运输，20 ：货物运输，30 ：客车运输)", paramType = "query"),
        @ApiImplicitParam(name = "qp-qualificationUrl-eq", value = "资格证照片", paramType = "query"),
        @ApiImplicitParam(name = "qp-driveGrade-eq", value = "当前驾驶分数", paramType = "query"),
        @ApiImplicitParam(name = "qp-driverNo-eq", value = "驾驶员no", paramType = "query"),
        @ApiImplicitParam(name = "qp-isInternalDriver-eq", value = " 是否是内部员工 1是 0否", paramType = "query"),
        @ApiImplicitParam(name = "qp-workingState-eq", value = "10:正常 20 休假 30 已离职", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-isvId-eq", value = "", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-sex-eq", value = "10男,20女", paramType = "query"),
        @ApiImplicitParam(name = "qp-qualificationDeadline-eq", value = "资质证有效期", paramType = "query"),
        @ApiImplicitParam(name = "qp-entryTime-eq", value = "入职日期", paramType = "query"),
        @ApiImplicitParam(name = "qp-vehicleMessage-eq", value = "默认车辆信息（车辆id,车辆车牌号）", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<DriverResDto>> getDriverList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"driver"}, nickname = "getOneDriver")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<DriverResDto> getOneDriver(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"driver"}, nickname = "getOneDriverByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "driverName", value = "司机姓名", paramType = "query"),
        @ApiImplicitParam(name = "driverMobileNo", value = "手机号", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "supplierNo", value = "供应商no", paramType = "query"),
        @ApiImplicitParam(name = "licenseNumber", value = "身份证/驾驶证号", paramType = "query"),
        @ApiImplicitParam(name = "idFrontImgUrl", value = "身份证正面照", paramType = "query"),
        @ApiImplicitParam(name = "idBackImgUrl", value = "身份证背面照", paramType = "query"),
        @ApiImplicitParam(name = "driveFrontImgUrl", value = "驾驶证正面照url", paramType = "query"),
        @ApiImplicitParam(name = "driveBackImgUrl", value = "驾驶证背面照url", paramType = "query"),
        @ApiImplicitParam(name = "driverType", value = "准驾车型", paramType = "query"),
        @ApiImplicitParam(name = "driverDeadline", value = "驾驶证期限", paramType = "query"),
        @ApiImplicitParam(name = "qualificationsNo", value = "从业资格号", paramType = "query"),
        @ApiImplicitParam(name = "qualificationType", value = "从业类别(10：危险品运输，20 ：货物运输，30 ：客车运输)", paramType = "query"),
        @ApiImplicitParam(name = "qualificationUrl", value = "资格证照片", paramType = "query"),
        @ApiImplicitParam(name = "driveGrade", value = "当前驾驶分数", paramType = "query"),
        @ApiImplicitParam(name = "driverNo", value = "驾驶员no", paramType = "query"),
        @ApiImplicitParam(name = "isInternalDriver", value = " 是否是内部员工 1是 0否", paramType = "query"),
        @ApiImplicitParam(name = "workingState", value = "10:正常 20 休假 30 已离职", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "sex", value = "10男,20女", paramType = "query"),
        @ApiImplicitParam(name = "qualificationDeadline", value = "资质证有效期", paramType = "query"),
        @ApiImplicitParam(name = "entryTime", value = "入职日期", paramType = "query"),
        @ApiImplicitParam(name = "vehicleMessage", value = "默认车辆信息（车辆id,车辆车牌号）", paramType = "query"),

    })
    ResultDTO<DriverResDto> getOneDriver(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"driver"}, nickname = "updateDriverByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "driverName", value = "司机姓名", paramType = "query"),
        @ApiImplicitParam(name = "driverMobileNo", value = "手机号", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "supplierNo", value = "供应商no", paramType = "query"),
        @ApiImplicitParam(name = "licenseNumber", value = "身份证/驾驶证号", paramType = "query"),
        @ApiImplicitParam(name = "idFrontImgUrl", value = "身份证正面照", paramType = "query"),
        @ApiImplicitParam(name = "idBackImgUrl", value = "身份证背面照", paramType = "query"),
        @ApiImplicitParam(name = "driveFrontImgUrl", value = "驾驶证正面照url", paramType = "query"),
        @ApiImplicitParam(name = "driveBackImgUrl", value = "驾驶证背面照url", paramType = "query"),
        @ApiImplicitParam(name = "driverType", value = "准驾车型", paramType = "query"),
        @ApiImplicitParam(name = "driverDeadline", value = "驾驶证期限", paramType = "query"),
        @ApiImplicitParam(name = "qualificationsNo", value = "从业资格号", paramType = "query"),
        @ApiImplicitParam(name = "qualificationType", value = "从业类别(10：危险品运输，20 ：货物运输，30 ：客车运输)", paramType = "query"),
        @ApiImplicitParam(name = "qualificationUrl", value = "资格证照片", paramType = "query"),
        @ApiImplicitParam(name = "driveGrade", value = "当前驾驶分数", paramType = "query"),
        @ApiImplicitParam(name = "driverNo", value = "驾驶员no", paramType = "query"),
        @ApiImplicitParam(name = "isInternalDriver", value = " 是否是内部员工 1是 0否", paramType = "query"),
        @ApiImplicitParam(name = "workingState", value = "10:正常 20 休假 30 已离职", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "sex", value = "10男,20女", paramType = "query"),
        @ApiImplicitParam(name = "qualificationDeadline", value = "资质证有效期", paramType = "query"),
        @ApiImplicitParam(name = "entryTime", value = "入职日期", paramType = "query"),
        @ApiImplicitParam(name = "vehicleMessage", value = "默认车辆信息（车辆id,车辆车牌号）", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<DriverResDto> updateDriver(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"driver"}, nickname = "patchUpdateDriver")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<DriverResDto> patchUpdateDriver(Long id, DriverReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"driver"}, nickname = "putUpdateDriver")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<DriverResDto> putUpdateDriver(Long id, DriverReqDto reqDto);

}
