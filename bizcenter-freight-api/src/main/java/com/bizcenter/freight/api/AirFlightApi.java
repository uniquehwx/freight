package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.AirFlightReqDto;
import com.bizcenter.freight.dto.res.AirFlightResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 航班表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "airFlight", description = "航班表接口", tags = {"airFlight"})
public interface AirFlightApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"airFlight"}, nickname = "addAirFlight")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<AirFlightResDto> addAirFlight(AirFlightReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"airFlight",}, nickname = "deleteAirFlight")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteAirFlight(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "airFlight",}, nickname = "getAirFlightList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-companyNo-eq", value = "公司编码(用于关联他表)", paramType = "query"),
        @ApiImplicitParam(name = "qp-flightNo-eq", value = "航班编码(用于关联他表)", paramType = "query"),
        @ApiImplicitParam(name = "qp-airCompanyCode-eq", value = "航司代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-freightStation-eq", value = "货站", paramType = "query"),
        @ApiImplicitParam(name = "qp-departurePortCode-eq", value = "始发港代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-departurePort-eq", value = "始发港", paramType = "query"),
        @ApiImplicitParam(name = "qp-destinationPortCode-eq", value = "目的港代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-destinationPort-eq", value = "目的港", paramType = "query"),
        @ApiImplicitParam(name = "qp-flightCode-eq", value = "航班号", paramType = "query"),
        @ApiImplicitParam(name = "qp-schedule-eq", value = "班期", paramType = "query"),
        @ApiImplicitParam(name = "qp-departureTime-eq", value = "起飞时刻ETD", paramType = "query"),
        @ApiImplicitParam(name = "qp-arrivalTime-eq", value = "到达时刻ETA", paramType = "query"),
        @ApiImplicitParam(name = "qp-closingTime-eq", value = "截单时刻", paramType = "query"),
        @ApiImplicitParam(name = "qp-closingDays-eq", value = "截单天数", paramType = "query"),
        @ApiImplicitParam(name = "qp-model-eq", value = "机型", paramType = "query"),
        @ApiImplicitParam(name = "qp-planeType-eq", value = "飞机类型", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人中文命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<AirFlightResDto>> getAirFlightList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"airFlight"}, nickname = "getOneAirFlight")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirFlightResDto> getOneAirFlight(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"airFlight"}, nickname = "getOneAirFlightByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "companyNo", value = "公司编码(用于关联他表)", paramType = "query"),
        @ApiImplicitParam(name = "flightNo", value = "航班编码(用于关联他表)", paramType = "query"),
        @ApiImplicitParam(name = "airCompanyCode", value = "航司代码", paramType = "query"),
        @ApiImplicitParam(name = "freightStation", value = "货站", paramType = "query"),
        @ApiImplicitParam(name = "departurePortCode", value = "始发港代码", paramType = "query"),
        @ApiImplicitParam(name = "departurePort", value = "始发港", paramType = "query"),
        @ApiImplicitParam(name = "destinationPortCode", value = "目的港代码", paramType = "query"),
        @ApiImplicitParam(name = "destinationPort", value = "目的港", paramType = "query"),
        @ApiImplicitParam(name = "flightCode", value = "航班号", paramType = "query"),
        @ApiImplicitParam(name = "schedule", value = "班期", paramType = "query"),
        @ApiImplicitParam(name = "departureTime", value = "起飞时刻ETD", paramType = "query"),
        @ApiImplicitParam(name = "arrivalTime", value = "到达时刻ETA", paramType = "query"),
        @ApiImplicitParam(name = "closingTime", value = "截单时刻", paramType = "query"),
        @ApiImplicitParam(name = "closingDays", value = "截单天数", paramType = "query"),
        @ApiImplicitParam(name = "model", value = "机型", paramType = "query"),
        @ApiImplicitParam(name = "planeType", value = "飞机类型", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人中文命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),

    })
    ResultDTO<AirFlightResDto> getOneAirFlight(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"airFlight"}, nickname = "updateAirFlightByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "companyNo", value = "公司编码(用于关联他表)", paramType = "query"),
        @ApiImplicitParam(name = "flightNo", value = "航班编码(用于关联他表)", paramType = "query"),
        @ApiImplicitParam(name = "airCompanyCode", value = "航司代码", paramType = "query"),
        @ApiImplicitParam(name = "freightStation", value = "货站", paramType = "query"),
        @ApiImplicitParam(name = "departurePortCode", value = "始发港代码", paramType = "query"),
        @ApiImplicitParam(name = "departurePort", value = "始发港", paramType = "query"),
        @ApiImplicitParam(name = "destinationPortCode", value = "目的港代码", paramType = "query"),
        @ApiImplicitParam(name = "destinationPort", value = "目的港", paramType = "query"),
        @ApiImplicitParam(name = "flightCode", value = "航班号", paramType = "query"),
        @ApiImplicitParam(name = "schedule", value = "班期", paramType = "query"),
        @ApiImplicitParam(name = "departureTime", value = "起飞时刻ETD", paramType = "query"),
        @ApiImplicitParam(name = "arrivalTime", value = "到达时刻ETA", paramType = "query"),
        @ApiImplicitParam(name = "closingTime", value = "截单时刻", paramType = "query"),
        @ApiImplicitParam(name = "closingDays", value = "截单天数", paramType = "query"),
        @ApiImplicitParam(name = "model", value = "机型", paramType = "query"),
        @ApiImplicitParam(name = "planeType", value = "飞机类型", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人中文命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirFlightResDto> updateAirFlight(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"airFlight"}, nickname = "patchUpdateAirFlight")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirFlightResDto> patchUpdateAirFlight(Long id, AirFlightReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"airFlight"}, nickname = "putUpdateAirFlight")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirFlightResDto> putUpdateAirFlight(Long id, AirFlightReqDto reqDto);

}
