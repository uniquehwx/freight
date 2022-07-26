package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.WhOrderDetailReqDto;
import com.bizcenter.freight.dto.res.WhOrderDetailResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 入库明细表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "whOrderDetail", description = "入库明细表接口", tags = {"whOrderDetail"})
public interface WhOrderDetailApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"whOrderDetail"}, nickname = "addWhOrderDetail")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<WhOrderDetailResDto> addWhOrderDetail(WhOrderDetailReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"whOrderDetail",}, nickname = "deleteWhOrderDetail")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteWhOrderDetail(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "whOrderDetail",}, nickname = "getWhOrderDetailList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-isvId-eq", value = "", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-inStorageNo-eq", value = "入仓号", paramType = "query"),
        @ApiImplicitParam(name = "qp-trayNo-eq", value = "托盘号", paramType = "query"),
        @ApiImplicitParam(name = "qp-quantity-eq", value = "入库数量(件)", paramType = "query"),
        @ApiImplicitParam(name = "qp-volume-eq", value = "入库体积(立方米)", paramType = "query"),
        @ApiImplicitParam(name = "qp-weight-eq", value = "入库毛重(kg)", paramType = "query"),
        @ApiImplicitParam(name = "qp-images-eq", value = "入库照片,多个照片用逗号隔开", paramType = "query"),
        @ApiImplicitParam(name = "qp-remark-eq", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "qp-userDef1-eq", value = "用户自定义1", paramType = "query"),
        @ApiImplicitParam(name = "qp-userDef2-eq", value = "用户自定义2", paramType = "query"),
        @ApiImplicitParam(name = "qp-status-eq", value = "状态，10正常，20已冻结，30待出库，40已出库", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<WhOrderDetailResDto>> getWhOrderDetailList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"whOrderDetail"}, nickname = "getOneWhOrderDetail")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WhOrderDetailResDto> getOneWhOrderDetail(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"whOrderDetail"}, nickname = "getOneWhOrderDetailByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "inStorageNo", value = "入仓号", paramType = "query"),
        @ApiImplicitParam(name = "trayNo", value = "托盘号", paramType = "query"),
        @ApiImplicitParam(name = "quantity", value = "入库数量(件)", paramType = "query"),
        @ApiImplicitParam(name = "volume", value = "入库体积(立方米)", paramType = "query"),
        @ApiImplicitParam(name = "weight", value = "入库毛重(kg)", paramType = "query"),
        @ApiImplicitParam(name = "images", value = "入库照片,多个照片用逗号隔开", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "userDef1", value = "用户自定义1", paramType = "query"),
        @ApiImplicitParam(name = "userDef2", value = "用户自定义2", paramType = "query"),
        @ApiImplicitParam(name = "status", value = "状态，10正常，20已冻结，30待出库，40已出库", paramType = "query"),

    })
    ResultDTO<WhOrderDetailResDto> getOneWhOrderDetail(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"whOrderDetail"}, nickname = "updateWhOrderDetailByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "inStorageNo", value = "入仓号", paramType = "query"),
        @ApiImplicitParam(name = "trayNo", value = "托盘号", paramType = "query"),
        @ApiImplicitParam(name = "quantity", value = "入库数量(件)", paramType = "query"),
        @ApiImplicitParam(name = "volume", value = "入库体积(立方米)", paramType = "query"),
        @ApiImplicitParam(name = "weight", value = "入库毛重(kg)", paramType = "query"),
        @ApiImplicitParam(name = "images", value = "入库照片,多个照片用逗号隔开", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "userDef1", value = "用户自定义1", paramType = "query"),
        @ApiImplicitParam(name = "userDef2", value = "用户自定义2", paramType = "query"),
        @ApiImplicitParam(name = "status", value = "状态，10正常，20已冻结，30待出库，40已出库", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WhOrderDetailResDto> updateWhOrderDetail(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"whOrderDetail"}, nickname = "patchUpdateWhOrderDetail")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WhOrderDetailResDto> patchUpdateWhOrderDetail(Long id, WhOrderDetailReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"whOrderDetail"}, nickname = "putUpdateWhOrderDetail")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WhOrderDetailResDto> putUpdateWhOrderDetail(Long id, WhOrderDetailReqDto reqDto);

}
