package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.AirHarbourReqDto;
import com.bizcenter.freight.dto.res.AirHarbourResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 港口表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "airHarbour", description = "港口表接口", tags = {"airHarbour"})
public interface AirHarbourApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"airHarbour"}, nickname = "addAirHarbour")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<AirHarbourResDto> addAirHarbour(AirHarbourReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"airHarbour",}, nickname = "deleteAirHarbour")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteAirHarbour(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "airHarbour",}, nickname = "getAirHarbourList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-harbourNo-eq", value = "港口编码(用于关联他表)", paramType = "query"),
        @ApiImplicitParam(name = "qp-harbourCode-eq", value = "三字代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-harbourCnName-eq", value = "机场名(中文)", paramType = "query"),
        @ApiImplicitParam(name = "qp-harbourUsName-eq", value = "机场名(英文)", paramType = "query"),
        @ApiImplicitParam(name = "qp-country-eq", value = "国家(英文)", paramType = "query"),
        @ApiImplicitParam(name = "qp-countryCode-eq", value = "国家代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-city-eq", value = "城市(英文)", paramType = "query"),
        @ApiImplicitParam(name = "qp-cityCode-eq", value = "城市代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-state-eq", value = "洲", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "更新人中文姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人中文命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-province-eq", value = "省", paramType = "query"),
        @ApiImplicitParam(name = "qp-provinceCode-eq", value = "省代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-longitude-eq", value = "经度", paramType = "query"),
        @ApiImplicitParam(name = "qp-latitude-eq", value = "纬度", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<AirHarbourResDto>> getAirHarbourList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"airHarbour"}, nickname = "getOneAirHarbour")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirHarbourResDto> getOneAirHarbour(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"airHarbour"}, nickname = "getOneAirHarbourByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "harbourNo", value = "港口编码(用于关联他表)", paramType = "query"),
        @ApiImplicitParam(name = "harbourCode", value = "三字代码", paramType = "query"),
        @ApiImplicitParam(name = "harbourCnName", value = "机场名(中文)", paramType = "query"),
        @ApiImplicitParam(name = "harbourUsName", value = "机场名(英文)", paramType = "query"),
        @ApiImplicitParam(name = "country", value = "国家(英文)", paramType = "query"),
        @ApiImplicitParam(name = "countryCode", value = "国家代码", paramType = "query"),
        @ApiImplicitParam(name = "city", value = "城市(英文)", paramType = "query"),
        @ApiImplicitParam(name = "cityCode", value = "城市代码", paramType = "query"),
        @ApiImplicitParam(name = "state", value = "洲", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "更新人中文姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人中文命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "province", value = "省", paramType = "query"),
        @ApiImplicitParam(name = "provinceCode", value = "省代码", paramType = "query"),
        @ApiImplicitParam(name = "longitude", value = "经度", paramType = "query"),
        @ApiImplicitParam(name = "latitude", value = "纬度", paramType = "query"),

    })
    ResultDTO<AirHarbourResDto> getOneAirHarbour(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"airHarbour"}, nickname = "updateAirHarbourByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "harbourNo", value = "港口编码(用于关联他表)", paramType = "query"),
        @ApiImplicitParam(name = "harbourCode", value = "三字代码", paramType = "query"),
        @ApiImplicitParam(name = "harbourCnName", value = "机场名(中文)", paramType = "query"),
        @ApiImplicitParam(name = "harbourUsName", value = "机场名(英文)", paramType = "query"),
        @ApiImplicitParam(name = "country", value = "国家(英文)", paramType = "query"),
        @ApiImplicitParam(name = "countryCode", value = "国家代码", paramType = "query"),
        @ApiImplicitParam(name = "city", value = "城市(英文)", paramType = "query"),
        @ApiImplicitParam(name = "cityCode", value = "城市代码", paramType = "query"),
        @ApiImplicitParam(name = "state", value = "洲", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "更新人中文姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人中文命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "province", value = "省", paramType = "query"),
        @ApiImplicitParam(name = "provinceCode", value = "省代码", paramType = "query"),
        @ApiImplicitParam(name = "longitude", value = "经度", paramType = "query"),
        @ApiImplicitParam(name = "latitude", value = "纬度", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirHarbourResDto> updateAirHarbour(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"airHarbour"}, nickname = "patchUpdateAirHarbour")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirHarbourResDto> patchUpdateAirHarbour(Long id, AirHarbourReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"airHarbour"}, nickname = "putUpdateAirHarbour")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirHarbourResDto> putUpdateAirHarbour(Long id, AirHarbourReqDto reqDto);

}
