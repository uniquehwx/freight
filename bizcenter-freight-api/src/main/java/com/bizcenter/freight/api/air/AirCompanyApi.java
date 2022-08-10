package com.bizcenter.freight.api.air;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.util.ValidableList;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.AirCompanyReqDto;
import com.bizcenter.freight.dto.res.AirCompanyResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;
import java.util.Map;

/**
 * 航司表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "airCompany", description = "航司表接口", tags = {"airCompany"})
public interface AirCompanyApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"airCompany"}, nickname = "addAirCompany")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<AirCompanyResDto> addAirCompany(AirCompanyReqDto reqDto);

    /**
     * 创建多个资源对象
     *
     * @return 返回新创建的资源对象列表
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"airCompany"}, nickname = "addList")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<List<AirCompanyResDto>> addList(ValidableList<AirCompanyReqDto> reqDtoList);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"airCompany",}, nickname = "deleteAirCompany")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteAirCompany(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "airCompany",}, nickname = "getAirCompanyList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-companyNo-eq", value = "公司编码(用于关联他表)", paramType = "query"),
        @ApiImplicitParam(name = "qp-airCompanyCode-eq", value = "航司代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-companyName-eq", value = "公司名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-companyCode-eq", value = "提单前缀", paramType = "query"),
        @ApiImplicitParam(name = "qp-landingBillInvoiceTitle-eq", value = "提单打印抬头", paramType = "query"),
        @ApiImplicitParam(name = "qp-issuingCar-eq", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "qp-iataCode-eq", value = "IATAcode", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "更新人中文姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人中文命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-supplierCode-eq", value = "供应商编码", paramType = "query"),
        @ApiImplicitParam(name = "qp-supplierName-eq", value = "供应商名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-accountNo-eq", value = "AccountNo", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<AirCompanyResDto>> getAirCompanyList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"airCompany"}, nickname = "getOneAirCompany")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirCompanyResDto> getOneAirCompany(Long id);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"airCompany"}, nickname = "patchUpdateAirCompany")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirCompanyResDto> patchUpdateAirCompany(Long id, AirCompanyReqDto reqDto);
//    /**
//     * 查询一个资源对象
//     *
//     * @param params 能确定唯一对象的条件
//     * @return 返回单独的资源对象
//     */
//    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"airCompany"}, nickname = "getOneAirCompanyByMap")
//    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
//    @ApiImplicitParams({
//        @ApiImplicitParam(name = "companyNo", value = "公司编码(用于关联他表)", paramType = "query"),
//        @ApiImplicitParam(name = "airCompanyCode", value = "航司代码", paramType = "query"),
//        @ApiImplicitParam(name = "companyName", value = "公司名称", paramType = "query"),
//        @ApiImplicitParam(name = "companyCode", value = "提单前缀", paramType = "query"),
//        @ApiImplicitParam(name = "landingBillInvoiceTitle", value = "提单打印抬头", paramType = "query"),
//        @ApiImplicitParam(name = "issuingCar", value = "备注", paramType = "query"),
//        @ApiImplicitParam(name = "iataCode", value = "IATAcode", paramType = "query"),
//        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
//        @ApiImplicitParam(name = "modifyRealName", value = "更新人中文姓名", paramType = "query"),
//        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
//        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
//        @ApiImplicitParam(name = "createRealName", value = "创建人中文命名", paramType = "query"),
//        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
//        @ApiImplicitParam(name = "supplierCode", value = "供应商编码", paramType = "query"),
//        @ApiImplicitParam(name = "supplierName", value = "供应商名称", paramType = "query"),
//        @ApiImplicitParam(name = "accountNo", value = "AccountNo", paramType = "query"),
//
//    })
//    ResultDTO<AirCompanyResDto> getOneAirCompany(Map<String, Object> params);

//    /**
//     * 更新一个资源对象(部分更新)
//     *
//     * @return 返回完整的资源对象
//     */
//    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"airCompany"}, nickname = "updateAirCompanyByMap")
//    @ApiImplicitParams({
//        @ApiImplicitParam(name = "companyNo", value = "公司编码(用于关联他表)", paramType = "query"),
//        @ApiImplicitParam(name = "airCompanyCode", value = "航司代码", paramType = "query"),
//        @ApiImplicitParam(name = "companyName", value = "公司名称", paramType = "query"),
//        @ApiImplicitParam(name = "companyCode", value = "提单前缀", paramType = "query"),
//        @ApiImplicitParam(name = "landingBillInvoiceTitle", value = "提单打印抬头", paramType = "query"),
//        @ApiImplicitParam(name = "issuingCar", value = "备注", paramType = "query"),
//        @ApiImplicitParam(name = "iataCode", value = "IATAcode", paramType = "query"),
//        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
//        @ApiImplicitParam(name = "modifyRealName", value = "更新人中文姓名", paramType = "query"),
//        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
//        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
//        @ApiImplicitParam(name = "createRealName", value = "创建人中文命名", paramType = "query"),
//        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
//        @ApiImplicitParam(name = "supplierCode", value = "供应商编码", paramType = "query"),
//        @ApiImplicitParam(name = "supplierName", value = "供应商名称", paramType = "query"),
//        @ApiImplicitParam(name = "accountNo", value = "AccountNo", paramType = "query"),
//        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
//    })
//    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
//    ResultDTO<AirCompanyResDto> updateAirCompany(Long id, Map<String, Object> params);


//    /**
//     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
//     *
//     * @return 返回完整的资源对象
//     */
//    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"airCompany"}, nickname = "putUpdateAirCompany")
//    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
//    ResultDTO<AirCompanyResDto> putUpdateAirCompany(Long id, AirCompanyReqDto reqDto);

}
