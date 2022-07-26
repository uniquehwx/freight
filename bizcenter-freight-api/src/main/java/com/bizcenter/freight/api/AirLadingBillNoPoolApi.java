package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.AirLadingBillNoPoolReqDto;
import com.bizcenter.freight.dto.res.AirLadingBillNoPoolResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 提单号资源池表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "airLadingBillNoPool", description = "提单号资源池表接口", tags = {"airLadingBillNoPool"})
public interface AirLadingBillNoPoolApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"airLadingBillNoPool"}, nickname = "addAirLadingBillNoPool")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<AirLadingBillNoPoolResDto> addAirLadingBillNoPool(AirLadingBillNoPoolReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"airLadingBillNoPool",}, nickname = "deleteAirLadingBillNoPool")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteAirLadingBillNoPool(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "airLadingBillNoPool",}, nickname = "getAirLadingBillNoPoolList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-airCompanyCode-eq", value = "航司代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-companyCode-eq", value = "公司代码(提单起始号)", paramType = "query"),
        @ApiImplicitParam(name = "qp-ladingBillNo-eq", value = "提单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-ladingBillType-eq", value = "类型", paramType = "query"),
        @ApiImplicitParam(name = "qp-ladingBillNoStatusCode-eq", value = "使用状态: 10 未使用，20 使用中，30 已使用 , 40 已禁用 , 50 已作废", paramType = "query"),
        @ApiImplicitParam(name = "qp-issuedAt-eq", value = "颁发时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-notBefore-eq", value = "不早于", paramType = "query"),
        @ApiImplicitParam(name = "qp-notAfter-eq", value = "不晚于", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "更新人中文姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人中文命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-planningStatusCode-eq", value = "状态码：0 提单号生成、1 绑定订单、2 订单完成、3 解绑订单、4 禁用、5 启用、6 作废", paramType = "query"),
        @ApiImplicitParam(name = "qp-orderNo-eq", value = "订单号", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<AirLadingBillNoPoolResDto>> getAirLadingBillNoPoolList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"airLadingBillNoPool"}, nickname = "getOneAirLadingBillNoPool")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirLadingBillNoPoolResDto> getOneAirLadingBillNoPool(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"airLadingBillNoPool"}, nickname = "getOneAirLadingBillNoPoolByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "airCompanyCode", value = "航司代码", paramType = "query"),
        @ApiImplicitParam(name = "companyCode", value = "公司代码(提单起始号)", paramType = "query"),
        @ApiImplicitParam(name = "ladingBillNo", value = "提单号", paramType = "query"),
        @ApiImplicitParam(name = "ladingBillType", value = "类型", paramType = "query"),
        @ApiImplicitParam(name = "ladingBillNoStatusCode", value = "使用状态: 10 未使用，20 使用中，30 已使用 , 40 已禁用 , 50 已作废", paramType = "query"),
        @ApiImplicitParam(name = "issuedAt", value = "颁发时间", paramType = "query"),
        @ApiImplicitParam(name = "notBefore", value = "不早于", paramType = "query"),
        @ApiImplicitParam(name = "notAfter", value = "不晚于", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "更新人中文姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人中文命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "planningStatusCode", value = "状态码：0 提单号生成、1 绑定订单、2 订单完成、3 解绑订单、4 禁用、5 启用、6 作废", paramType = "query"),
        @ApiImplicitParam(name = "orderNo", value = "订单号", paramType = "query"),

    })
    ResultDTO<AirLadingBillNoPoolResDto> getOneAirLadingBillNoPool(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"airLadingBillNoPool"}, nickname = "updateAirLadingBillNoPoolByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "airCompanyCode", value = "航司代码", paramType = "query"),
        @ApiImplicitParam(name = "companyCode", value = "公司代码(提单起始号)", paramType = "query"),
        @ApiImplicitParam(name = "ladingBillNo", value = "提单号", paramType = "query"),
        @ApiImplicitParam(name = "ladingBillType", value = "类型", paramType = "query"),
        @ApiImplicitParam(name = "ladingBillNoStatusCode", value = "使用状态: 10 未使用，20 使用中，30 已使用 , 40 已禁用 , 50 已作废", paramType = "query"),
        @ApiImplicitParam(name = "issuedAt", value = "颁发时间", paramType = "query"),
        @ApiImplicitParam(name = "notBefore", value = "不早于", paramType = "query"),
        @ApiImplicitParam(name = "notAfter", value = "不晚于", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "更新人中文姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人中文命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "planningStatusCode", value = "状态码：0 提单号生成、1 绑定订单、2 订单完成、3 解绑订单、4 禁用、5 启用、6 作废", paramType = "query"),
        @ApiImplicitParam(name = "orderNo", value = "订单号", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirLadingBillNoPoolResDto> updateAirLadingBillNoPool(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"airLadingBillNoPool"}, nickname = "patchUpdateAirLadingBillNoPool")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirLadingBillNoPoolResDto> patchUpdateAirLadingBillNoPool(Long id, AirLadingBillNoPoolReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"airLadingBillNoPool"}, nickname = "putUpdateAirLadingBillNoPool")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirLadingBillNoPoolResDto> putUpdateAirLadingBillNoPool(Long id, AirLadingBillNoPoolReqDto reqDto);

}
