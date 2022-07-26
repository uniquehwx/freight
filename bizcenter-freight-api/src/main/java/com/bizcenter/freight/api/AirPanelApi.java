package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.AirPanelReqDto;
import com.bizcenter.freight.dto.res.AirPanelResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 板型表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "airPanel", description = "板型表接口", tags = {"airPanel"})
public interface AirPanelApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"airPanel"}, nickname = "addAirPanel")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<AirPanelResDto> addAirPanel(AirPanelReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"airPanel",}, nickname = "deleteAirPanel")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteAirPanel(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "airPanel",}, nickname = "getAirPanelList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-airCompanyCode-eq", value = "航司代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-model-eq", value = "机型", paramType = "query"),
        @ApiImplicitParam(name = "qp-panelTypeCode-eq", value = "板型代码", paramType = "query"),
        @ApiImplicitParam(name = "qp-altName-eq", value = "别称", paramType = "query"),
        @ApiImplicitParam(name = "qp-cubicMeter-eq", value = "体积", paramType = "query"),
        @ApiImplicitParam(name = "qp-panelLong-eq", value = "长", paramType = "query"),
        @ApiImplicitParam(name = "qp-panelWide-eq", value = "宽", paramType = "query"),
        @ApiImplicitParam(name = "qp-panelHigh-eq", value = "高", paramType = "query"),
        @ApiImplicitParam(name = "qp-panelSize-eq", value = "板型尺寸", paramType = "query"),
        @ApiImplicitParam(name = "qp-weightLimit-eq", value = "限重", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "更新人中文姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<AirPanelResDto>> getAirPanelList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"airPanel"}, nickname = "getOneAirPanel")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirPanelResDto> getOneAirPanel(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"airPanel"}, nickname = "getOneAirPanelByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "airCompanyCode", value = "航司代码", paramType = "query"),
        @ApiImplicitParam(name = "model", value = "机型", paramType = "query"),
        @ApiImplicitParam(name = "panelTypeCode", value = "板型代码", paramType = "query"),
        @ApiImplicitParam(name = "altName", value = "别称", paramType = "query"),
        @ApiImplicitParam(name = "cubicMeter", value = "体积", paramType = "query"),
        @ApiImplicitParam(name = "panelLong", value = "长", paramType = "query"),
        @ApiImplicitParam(name = "panelWide", value = "宽", paramType = "query"),
        @ApiImplicitParam(name = "panelHigh", value = "高", paramType = "query"),
        @ApiImplicitParam(name = "panelSize", value = "板型尺寸", paramType = "query"),
        @ApiImplicitParam(name = "weightLimit", value = "限重", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "更新人中文姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),

    })
    ResultDTO<AirPanelResDto> getOneAirPanel(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"airPanel"}, nickname = "updateAirPanelByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "airCompanyCode", value = "航司代码", paramType = "query"),
        @ApiImplicitParam(name = "model", value = "机型", paramType = "query"),
        @ApiImplicitParam(name = "panelTypeCode", value = "板型代码", paramType = "query"),
        @ApiImplicitParam(name = "altName", value = "别称", paramType = "query"),
        @ApiImplicitParam(name = "cubicMeter", value = "体积", paramType = "query"),
        @ApiImplicitParam(name = "panelLong", value = "长", paramType = "query"),
        @ApiImplicitParam(name = "panelWide", value = "宽", paramType = "query"),
        @ApiImplicitParam(name = "panelHigh", value = "高", paramType = "query"),
        @ApiImplicitParam(name = "panelSize", value = "板型尺寸", paramType = "query"),
        @ApiImplicitParam(name = "weightLimit", value = "限重", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "更新人中文姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirPanelResDto> updateAirPanel(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"airPanel"}, nickname = "patchUpdateAirPanel")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirPanelResDto> patchUpdateAirPanel(Long id, AirPanelReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"airPanel"}, nickname = "putUpdateAirPanel")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<AirPanelResDto> putUpdateAirPanel(Long id, AirPanelReqDto reqDto);

}
