package com.bizcenter.freight.api.order;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.OrderReqDto;
import com.bizcenter.freight.dto.res.OrderResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 订单
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "order", description = "订单接口", tags = {"order"})
public interface OrderApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"order"}, nickname = "addOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<OrderResDto> addOrder(OrderReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"order",}, nickname = "deleteOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteOrder(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "order",}, nickname = "getOrderList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-orderNo-eq", value = "订单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-tradeType-eq", value = "交易类型(1-航空订单，5-地面操作订单)", paramType = "query"),
        @ApiImplicitParam(name = "qp-customerCode-eq", value = "客户编码", paramType = "query"),
        @ApiImplicitParam(name = "qp-clientName-eq", value = "委托方联系人", paramType = "query"),
        @ApiImplicitParam(name = "qp-clinetPhone-eq", value = "委托方联系人电话", paramType = "query"),
        @ApiImplicitParam(name = "qp-outOrderNo-eq", value = "父单单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-orderType-eq", value = "单据类型(1-主订单，2-子订单)", paramType = "query"),
        @ApiImplicitParam(name = "qp-tradeStatus-eq", value = "交易状态", paramType = "query"),
        @ApiImplicitParam(name = "qp-supllierCode-eq", value = "供应商编码", paramType = "query"),
        @ApiImplicitParam(name = "qp-startPointCode-eq", value = "始发地编码", paramType = "query"),
        @ApiImplicitParam(name = "qp-endPointCode-eq", value = "目的地编码", paramType = "query"),
        @ApiImplicitParam(name = "qp-remark-eq", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建者id", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建者姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "修改人id", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "修改时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-extData-eq", value = "扩展信息", paramType = "query"),
        @ApiImplicitParam(name = "qp-businessType-eq", value = "业务类型", paramType = "query"),
        @ApiImplicitParam(name = "qp-completionTime-eq", value = "订单完成时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-salesClerkCode-eq", value = "业务员", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<OrderResDto>> getOrderList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"order"}, nickname = "getOneOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<OrderResDto> getOneOrder(Long id);


    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"order"}, nickname = "patchUpdateOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<OrderResDto> patchUpdateOrder(Long id, OrderReqDto reqDto);

    /**
     * 取消订单处理
     *
     * @return 返回boolean
     */
    @ApiOperation(value = "只进行取消状态设置处理", tags = {"order"}, nickname = "patchUpdateOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Boolean> cancelOrder(Long id);


//    /**
//     * 查询一个资源对象
//     *
//     * @param params 能确定唯一对象的条件
//     * @return 返回单独的资源对象
//     */
//    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"order"}, nickname = "getOneOrderByMap")
//    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
//    @ApiImplicitParams({
//        @ApiImplicitParam(name = "orderNo", value = "订单号", paramType = "query"),
//        @ApiImplicitParam(name = "tradeType", value = "交易类型(1-航空订单，5-地面操作订单)", paramType = "query"),
//        @ApiImplicitParam(name = "customerCode", value = "客户编码", paramType = "query"),
//        @ApiImplicitParam(name = "clientName", value = "委托方联系人", paramType = "query"),
//        @ApiImplicitParam(name = "clinetPhone", value = "委托方联系人电话", paramType = "query"),
//        @ApiImplicitParam(name = "outOrderNo", value = "父单单号", paramType = "query"),
//        @ApiImplicitParam(name = "orderType", value = "单据类型(1-主订单，2-子订单)", paramType = "query"),
//        @ApiImplicitParam(name = "tradeStatus", value = "交易状态", paramType = "query"),
//        @ApiImplicitParam(name = "supllierCode", value = "供应商编码", paramType = "query"),
//        @ApiImplicitParam(name = "startPointCode", value = "始发地编码", paramType = "query"),
//        @ApiImplicitParam(name = "endPointCode", value = "目的地编码", paramType = "query"),
//        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
//        @ApiImplicitParam(name = "createUserId", value = "创建者id", paramType = "query"),
//        @ApiImplicitParam(name = "createUserName", value = "创建者姓名", paramType = "query"),
//        @ApiImplicitParam(name = "modifyUserId", value = "修改人id", paramType = "query"),
//        @ApiImplicitParam(name = "modifyUserName", value = "修改人名称", paramType = "query"),
//        @ApiImplicitParam(name = "extData", value = "扩展信息", paramType = "query"),
//        @ApiImplicitParam(name = "businessType", value = "业务类型", paramType = "query"),
//        @ApiImplicitParam(name = "completionTime", value = "订单完成时间", paramType = "query"),
//        @ApiImplicitParam(name = "salesClerkCode", value = "业务员", paramType = "query"),
//
//    })
//    ResultDTO<OrderResDto> getOneOrder(Map<String, Object> params);

//    /**
//     * 更新一个资源对象(部分更新)
//     *
//     * @return 返回完整的资源对象
//     */
//    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"order"}, nickname = "updateOrderByMap")
//    @ApiImplicitParams({
//        @ApiImplicitParam(name = "orderNo", value = "订单号", paramType = "query"),
//        @ApiImplicitParam(name = "tradeType", value = "交易类型(1-航空订单，5-地面操作订单)", paramType = "query"),
//        @ApiImplicitParam(name = "customerCode", value = "客户编码", paramType = "query"),
//        @ApiImplicitParam(name = "clientName", value = "委托方联系人", paramType = "query"),
//        @ApiImplicitParam(name = "clinetPhone", value = "委托方联系人电话", paramType = "query"),
//        @ApiImplicitParam(name = "outOrderNo", value = "父单单号", paramType = "query"),
//        @ApiImplicitParam(name = "orderType", value = "单据类型(1-主订单，2-子订单)", paramType = "query"),
//        @ApiImplicitParam(name = "tradeStatus", value = "交易状态", paramType = "query"),
//        @ApiImplicitParam(name = "supllierCode", value = "供应商编码", paramType = "query"),
//        @ApiImplicitParam(name = "startPointCode", value = "始发地编码", paramType = "query"),
//        @ApiImplicitParam(name = "endPointCode", value = "目的地编码", paramType = "query"),
//        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
//        @ApiImplicitParam(name = "createUserId", value = "创建者id", paramType = "query"),
//        @ApiImplicitParam(name = "createUserName", value = "创建者姓名", paramType = "query"),
//        @ApiImplicitParam(name = "modifyUserId", value = "修改人id", paramType = "query"),
//        @ApiImplicitParam(name = "modifyUserName", value = "修改人名称", paramType = "query"),
//        @ApiImplicitParam(name = "extData", value = "扩展信息", paramType = "query"),
//        @ApiImplicitParam(name = "businessType", value = "业务类型", paramType = "query"),
//        @ApiImplicitParam(name = "completionTime", value = "订单完成时间", paramType = "query"),
//        @ApiImplicitParam(name = "salesClerkCode", value = "业务员", paramType = "query"),
//        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
//    })
//    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
//    ResultDTO<OrderResDto> updateOrder(Long id, Map<String, Object> params);

//    /**
//     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
//     *
//     * @return 返回完整的资源对象
//     */
//    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"order"}, nickname = "putUpdateOrder")
//    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
//    ResultDTO<OrderResDto> putUpdateOrder(Long id, OrderReqDto reqDto);

}
