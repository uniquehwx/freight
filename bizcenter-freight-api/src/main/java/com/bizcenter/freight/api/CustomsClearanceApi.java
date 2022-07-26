package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.CustomsClearanceReqDto;
import com.bizcenter.freight.dto.res.CustomsClearanceResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 报关表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "customsClearance", description = "报关表接口", tags = {"customsClearance"})
public interface CustomsClearanceApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"customsClearance"}, nickname = "addCustomsClearance")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<CustomsClearanceResDto> addCustomsClearance(CustomsClearanceReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"customsClearance",}, nickname = "deleteCustomsClearance")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteCustomsClearance(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "customsClearance",}, nickname = "getCustomsClearanceList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-status-eq", value = "10 创建服务  20 完成服务  30服务取消", paramType = "query"),
        @ApiImplicitParam(name = "qp-orderNo-eq", value = "报关服务单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-customerNo-eq", value = "客户订单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-flightNumber-eq", value = "航班号", paramType = "query"),
        @ApiImplicitParam(name = "qp-customerCode-eq", value = "客户编码", paramType = "query"),
        @ApiImplicitParam(name = "qp-customerName-eq", value = "客户名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-financialOrgCode-eq", value = "财务组织编码", paramType = "query"),
        @ApiImplicitParam(name = "qp-departCode-eq", value = "行政组织编码", paramType = "query"),
        @ApiImplicitParam(name = "qp-addedServiceNo-eq", value = "增值服务单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-busType-eq", value = "业务类型", paramType = "query"),
        @ApiImplicitParam(name = "qp-orderSource-eq", value = "订单来源", paramType = "query"),
        @ApiImplicitParam(name = "qp-billlandingNo-eq", value = "提单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-remark-eq", value = "备注信息", paramType = "query"),
        @ApiImplicitParam(name = "qp-serviceCompletionTime-eq", value = "服务完成时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-userDef2-eq", value = "用户自定义2", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-isvId-eq", value = "", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-type-eq", value = "类型: 10自建 20空运订单", paramType = "query"),
        @ApiImplicitParam(name = "qp-orderSourceFinancial-eq", value = "客户财务部门", paramType = "query"),
        @ApiImplicitParam(name = "qp-initCreatDepart-eq", value = "创建人行政部门", paramType = "query"),
        @ApiImplicitParam(name = "qp-mainOrderNo-eq", value = "空运主单号", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<CustomsClearanceResDto>> getCustomsClearanceList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"customsClearance"}, nickname = "getOneCustomsClearance")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<CustomsClearanceResDto> getOneCustomsClearance(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"customsClearance"}, nickname = "getOneCustomsClearanceByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "status", value = "10 创建服务  20 完成服务  30服务取消", paramType = "query"),
        @ApiImplicitParam(name = "orderNo", value = "报关服务单号", paramType = "query"),
        @ApiImplicitParam(name = "customerNo", value = "客户订单号", paramType = "query"),
        @ApiImplicitParam(name = "flightNumber", value = "航班号", paramType = "query"),
        @ApiImplicitParam(name = "customerCode", value = "客户编码", paramType = "query"),
        @ApiImplicitParam(name = "customerName", value = "客户名称", paramType = "query"),
        @ApiImplicitParam(name = "financialOrgCode", value = "财务组织编码", paramType = "query"),
        @ApiImplicitParam(name = "departCode", value = "行政组织编码", paramType = "query"),
        @ApiImplicitParam(name = "addedServiceNo", value = "增值服务单号", paramType = "query"),
        @ApiImplicitParam(name = "busType", value = "业务类型", paramType = "query"),
        @ApiImplicitParam(name = "orderSource", value = "订单来源", paramType = "query"),
        @ApiImplicitParam(name = "billlandingNo", value = "提单号", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注信息", paramType = "query"),
        @ApiImplicitParam(name = "serviceCompletionTime", value = "服务完成时间", paramType = "query"),
        @ApiImplicitParam(name = "userDef2", value = "用户自定义2", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "type", value = "类型: 10自建 20空运订单", paramType = "query"),
        @ApiImplicitParam(name = "orderSourceFinancial", value = "客户财务部门", paramType = "query"),
        @ApiImplicitParam(name = "initCreatDepart", value = "创建人行政部门", paramType = "query"),
        @ApiImplicitParam(name = "mainOrderNo", value = "空运主单号", paramType = "query"),

    })
    ResultDTO<CustomsClearanceResDto> getOneCustomsClearance(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"customsClearance"}, nickname = "updateCustomsClearanceByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "status", value = "10 创建服务  20 完成服务  30服务取消", paramType = "query"),
        @ApiImplicitParam(name = "orderNo", value = "报关服务单号", paramType = "query"),
        @ApiImplicitParam(name = "customerNo", value = "客户订单号", paramType = "query"),
        @ApiImplicitParam(name = "flightNumber", value = "航班号", paramType = "query"),
        @ApiImplicitParam(name = "customerCode", value = "客户编码", paramType = "query"),
        @ApiImplicitParam(name = "customerName", value = "客户名称", paramType = "query"),
        @ApiImplicitParam(name = "financialOrgCode", value = "财务组织编码", paramType = "query"),
        @ApiImplicitParam(name = "departCode", value = "行政组织编码", paramType = "query"),
        @ApiImplicitParam(name = "addedServiceNo", value = "增值服务单号", paramType = "query"),
        @ApiImplicitParam(name = "busType", value = "业务类型", paramType = "query"),
        @ApiImplicitParam(name = "orderSource", value = "订单来源", paramType = "query"),
        @ApiImplicitParam(name = "billlandingNo", value = "提单号", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注信息", paramType = "query"),
        @ApiImplicitParam(name = "serviceCompletionTime", value = "服务完成时间", paramType = "query"),
        @ApiImplicitParam(name = "userDef2", value = "用户自定义2", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "type", value = "类型: 10自建 20空运订单", paramType = "query"),
        @ApiImplicitParam(name = "orderSourceFinancial", value = "客户财务部门", paramType = "query"),
        @ApiImplicitParam(name = "initCreatDepart", value = "创建人行政部门", paramType = "query"),
        @ApiImplicitParam(name = "mainOrderNo", value = "空运主单号", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<CustomsClearanceResDto> updateCustomsClearance(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"customsClearance"}, nickname = "patchUpdateCustomsClearance")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<CustomsClearanceResDto> patchUpdateCustomsClearance(Long id, CustomsClearanceReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"customsClearance"}, nickname = "putUpdateCustomsClearance")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<CustomsClearanceResDto> putUpdateCustomsClearance(Long id, CustomsClearanceReqDto reqDto);

}
