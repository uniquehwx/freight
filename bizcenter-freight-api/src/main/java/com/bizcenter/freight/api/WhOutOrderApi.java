package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.WhOutOrderReqDto;
import com.bizcenter.freight.dto.res.WhOutOrderResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 出库表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "whOutOrder", description = "出库表接口", tags = {"whOutOrder"})
public interface WhOutOrderApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"whOutOrder"}, nickname = "addWhOutOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<WhOutOrderResDto> addWhOutOrder(WhOutOrderReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"whOutOrder",}, nickname = "deleteWhOutOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteWhOutOrder(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "whOutOrder",}, nickname = "getWhOutOrderList")
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
        @ApiImplicitParam(name = "qp-customerCode-eq", value = "客户编码", paramType = "query"),
        @ApiImplicitParam(name = "qp-warehouseName-eq", value = "仓库名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-outStorageTime-eq", value = "出库时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-status-eq", value = "状态30待出库40部分出库50已出库60已取消", paramType = "query"),
        @ApiImplicitParam(name = "qp-syncStatus-eq", value = "同步状态(10未同步，20已下发，30已回传)", paramType = "query"),
        @ApiImplicitParam(name = "qp-remark-eq", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "qp-userDef1-eq", value = "用户自定义1", paramType = "query"),
        @ApiImplicitParam(name = "qp-userDef2-eq", value = "用户自定义2", paramType = "query"),
        @ApiImplicitParam(name = "qp-quantity-eq", value = "数量", paramType = "query"),
        @ApiImplicitParam(name = "qp-actualQuantity-eq", value = "实际数量", paramType = "query"),
        @ApiImplicitParam(name = "qp-actualWeight-eq", value = "实际重量", paramType = "query"),
        @ApiImplicitParam(name = "qp-actualVolume-eq", value = "实际体积", paramType = "query"),
        @ApiImplicitParam(name = "qp-partOrderNo-eq", value = "分单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-customerName-eq", value = "客户名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-orderSource-eq", value = "订单流转", paramType = "query"),
        @ApiImplicitParam(name = "qp-warehouseCode-eq", value = "仓库编码", paramType = "query"),
        @ApiImplicitParam(name = "qp-outOrderNo-eq", value = "出库单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-type-eq", value = "出库单类型，10出库，20锁定", paramType = "query"),
        @ApiImplicitParam(name = "qp-customerNo-eq", value = "客户订单号", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<WhOutOrderResDto>> getWhOutOrderList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"whOutOrder"}, nickname = "getOneWhOutOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WhOutOrderResDto> getOneWhOutOrder(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"whOutOrder"}, nickname = "getOneWhOutOrderByMap")
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
        @ApiImplicitParam(name = "customerCode", value = "客户编码", paramType = "query"),
        @ApiImplicitParam(name = "warehouseName", value = "仓库名称", paramType = "query"),
        @ApiImplicitParam(name = "outStorageTime", value = "出库时间", paramType = "query"),
        @ApiImplicitParam(name = "status", value = "状态30待出库40部分出库50已出库60已取消", paramType = "query"),
        @ApiImplicitParam(name = "syncStatus", value = "同步状态(10未同步，20已下发，30已回传)", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "userDef1", value = "用户自定义1", paramType = "query"),
        @ApiImplicitParam(name = "userDef2", value = "用户自定义2", paramType = "query"),
        @ApiImplicitParam(name = "quantity", value = "数量", paramType = "query"),
        @ApiImplicitParam(name = "actualQuantity", value = "实际数量", paramType = "query"),
        @ApiImplicitParam(name = "actualWeight", value = "实际重量", paramType = "query"),
        @ApiImplicitParam(name = "actualVolume", value = "实际体积", paramType = "query"),
        @ApiImplicitParam(name = "partOrderNo", value = "分单号", paramType = "query"),
        @ApiImplicitParam(name = "customerName", value = "客户名称", paramType = "query"),
        @ApiImplicitParam(name = "orderSource", value = "订单流转", paramType = "query"),
        @ApiImplicitParam(name = "warehouseCode", value = "仓库编码", paramType = "query"),
        @ApiImplicitParam(name = "outOrderNo", value = "出库单号", paramType = "query"),
        @ApiImplicitParam(name = "type", value = "出库单类型，10出库，20锁定", paramType = "query"),
        @ApiImplicitParam(name = "customerNo", value = "客户订单号", paramType = "query"),

    })
    ResultDTO<WhOutOrderResDto> getOneWhOutOrder(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"whOutOrder"}, nickname = "updateWhOutOrderByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "inStorageNo", value = "入仓号", paramType = "query"),
        @ApiImplicitParam(name = "customerCode", value = "客户编码", paramType = "query"),
        @ApiImplicitParam(name = "warehouseName", value = "仓库名称", paramType = "query"),
        @ApiImplicitParam(name = "outStorageTime", value = "出库时间", paramType = "query"),
        @ApiImplicitParam(name = "status", value = "状态30待出库40部分出库50已出库60已取消", paramType = "query"),
        @ApiImplicitParam(name = "syncStatus", value = "同步状态(10未同步，20已下发，30已回传)", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "userDef1", value = "用户自定义1", paramType = "query"),
        @ApiImplicitParam(name = "userDef2", value = "用户自定义2", paramType = "query"),
        @ApiImplicitParam(name = "quantity", value = "数量", paramType = "query"),
        @ApiImplicitParam(name = "actualQuantity", value = "实际数量", paramType = "query"),
        @ApiImplicitParam(name = "actualWeight", value = "实际重量", paramType = "query"),
        @ApiImplicitParam(name = "actualVolume", value = "实际体积", paramType = "query"),
        @ApiImplicitParam(name = "partOrderNo", value = "分单号", paramType = "query"),
        @ApiImplicitParam(name = "customerName", value = "客户名称", paramType = "query"),
        @ApiImplicitParam(name = "orderSource", value = "订单流转", paramType = "query"),
        @ApiImplicitParam(name = "warehouseCode", value = "仓库编码", paramType = "query"),
        @ApiImplicitParam(name = "outOrderNo", value = "出库单号", paramType = "query"),
        @ApiImplicitParam(name = "type", value = "出库单类型，10出库，20锁定", paramType = "query"),
        @ApiImplicitParam(name = "customerNo", value = "客户订单号", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WhOutOrderResDto> updateWhOutOrder(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"whOutOrder"}, nickname = "patchUpdateWhOutOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WhOutOrderResDto> patchUpdateWhOutOrder(Long id, WhOutOrderReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"whOutOrder"}, nickname = "putUpdateWhOutOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WhOutOrderResDto> putUpdateWhOutOrder(Long id, WhOutOrderReqDto reqDto);

}
