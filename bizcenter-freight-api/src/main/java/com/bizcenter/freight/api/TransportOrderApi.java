package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.TransportOrderReqDto;
import com.bizcenter.freight.dto.res.TransportOrderResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 陆运订单表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "transportOrder", description = "陆运订单表接口", tags = {"transportOrder"})
public interface TransportOrderApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"transportOrder"}, nickname = "addTransportOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<TransportOrderResDto> addTransportOrder(TransportOrderReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"transportOrder",}, nickname = "deleteTransportOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteTransportOrder(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "transportOrder",}, nickname = "getTransportOrderList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-orderNo-eq", value = "订单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-serviceType-eq", value = "服务单类型状态（10：运输单  20:中转单服务单）", paramType = "query"),
        @ApiImplicitParam(name = "qp-cube-eq", value = "体积(m³)", paramType = "query"),
        @ApiImplicitParam(name = "qp-packageNumber-eq", value = "件数", paramType = "query"),
        @ApiImplicitParam(name = "qp-roughWeight-eq", value = "毛重(kg)", paramType = "query"),
        @ApiImplicitParam(name = "qp-size-eq", value = "尺寸(长*宽*高,单位cm)", paramType = "query"),
        @ApiImplicitParam(name = "qp-status-eq", value = "陆运单状态（10：未调度，20已调度，30已取消，40已完成，50异常中）", paramType = "query"),
        @ApiImplicitParam(name = "qp-principalContactPerson-eq", value = "委托方联系人（多个 联系人姓名，联系方式，邮箱地址）", paramType = "query"),
        @ApiImplicitParam(name = "qp-businessTypes-eq", value = "业务类型（10:出口空运20:进口空运30:出口海运40:跨境陆运50:陆运）", paramType = "query"),
        @ApiImplicitParam(name = "qp-delegateNo-eq", value = "委托方no", paramType = "query"),
        @ApiImplicitParam(name = "qp-deliveryTime-eq", value = "期望送货时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-arrivalContactName-eq", value = "到货联系人", paramType = "query"),
        @ApiImplicitParam(name = "qp-arrivalContactPhone-eq", value = "到货联系人电话", paramType = "query"),
        @ApiImplicitParam(name = "qp-deliveryProvince-eq", value = "到货人省份", paramType = "query"),
        @ApiImplicitParam(name = "qp-deliveryCity-eq", value = "到货人城市", paramType = "query"),
        @ApiImplicitParam(name = "qp-deliveryDistrict-eq", value = "到货人省市区", paramType = "query"),
        @ApiImplicitParam(name = "qp-deliveryAddress-eq", value = "到货人具体地址", paramType = "query"),
        @ApiImplicitParam(name = "qp-takeDeliveryTime-eq", value = "期望提货时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-takeDeliveryProvince-eq", value = "提货人省份", paramType = "query"),
        @ApiImplicitParam(name = "qp-takeDeliveryCity-eq", value = "提货人城市", paramType = "query"),
        @ApiImplicitParam(name = "qp-takeDeliveryDistrict-eq", value = "提货人市区", paramType = "query"),
        @ApiImplicitParam(name = "qp-takeDeliveryAddress-eq", value = "提货人具体地址", paramType = "query"),
        @ApiImplicitParam(name = "qp-contactName-eq", value = "提货联系人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-contactPhone-eq", value = "提货联系人电话", paramType = "query"),
        @ApiImplicitParam(name = "qp-cargoInformation-eq", value = "补充货物提货卸货信息", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-externalServiceType-eq", value = "服务类型（0 自营业务   ，10： 空运服务 ）", paramType = "query"),
        @ApiImplicitParam(name = "qp-externalOrder-eq", value = "外部订单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-remark-eq", value = "备注信息", paramType = "query"),
        @ApiImplicitParam(name = "qp-carType-eq", value = "制定车辆类型（10:监管车 20:尾班车 30... ）", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<TransportOrderResDto>> getTransportOrderList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"transportOrder"}, nickname = "getOneTransportOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<TransportOrderResDto> getOneTransportOrder(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"transportOrder"}, nickname = "getOneTransportOrderByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "orderNo", value = "订单号", paramType = "query"),
        @ApiImplicitParam(name = "serviceType", value = "服务单类型状态（10：运输单  20:中转单服务单）", paramType = "query"),
        @ApiImplicitParam(name = "cube", value = "体积(m³)", paramType = "query"),
        @ApiImplicitParam(name = "packageNumber", value = "件数", paramType = "query"),
        @ApiImplicitParam(name = "roughWeight", value = "毛重(kg)", paramType = "query"),
        @ApiImplicitParam(name = "size", value = "尺寸(长*宽*高,单位cm)", paramType = "query"),
        @ApiImplicitParam(name = "status", value = "陆运单状态（10：未调度，20已调度，30已取消，40已完成，50异常中）", paramType = "query"),
        @ApiImplicitParam(name = "principalContactPerson", value = "委托方联系人（多个 联系人姓名，联系方式，邮箱地址）", paramType = "query"),
        @ApiImplicitParam(name = "businessTypes", value = "业务类型（10:出口空运20:进口空运30:出口海运40:跨境陆运50:陆运）", paramType = "query"),
        @ApiImplicitParam(name = "delegateNo", value = "委托方no", paramType = "query"),
        @ApiImplicitParam(name = "deliveryTime", value = "期望送货时间", paramType = "query"),
        @ApiImplicitParam(name = "arrivalContactName", value = "到货联系人", paramType = "query"),
        @ApiImplicitParam(name = "arrivalContactPhone", value = "到货联系人电话", paramType = "query"),
        @ApiImplicitParam(name = "deliveryProvince", value = "到货人省份", paramType = "query"),
        @ApiImplicitParam(name = "deliveryCity", value = "到货人城市", paramType = "query"),
        @ApiImplicitParam(name = "deliveryDistrict", value = "到货人省市区", paramType = "query"),
        @ApiImplicitParam(name = "deliveryAddress", value = "到货人具体地址", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryTime", value = "期望提货时间", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryProvince", value = "提货人省份", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryCity", value = "提货人城市", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryDistrict", value = "提货人市区", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryAddress", value = "提货人具体地址", paramType = "query"),
        @ApiImplicitParam(name = "contactName", value = "提货联系人名称", paramType = "query"),
        @ApiImplicitParam(name = "contactPhone", value = "提货联系人电话", paramType = "query"),
        @ApiImplicitParam(name = "cargoInformation", value = "补充货物提货卸货信息", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "externalServiceType", value = "服务类型（0 自营业务   ，10： 空运服务 ）", paramType = "query"),
        @ApiImplicitParam(name = "externalOrder", value = "外部订单号", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注信息", paramType = "query"),
        @ApiImplicitParam(name = "carType", value = "制定车辆类型（10:监管车 20:尾班车 30... ）", paramType = "query"),

    })
    ResultDTO<TransportOrderResDto> getOneTransportOrder(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"transportOrder"}, nickname = "updateTransportOrderByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "orderNo", value = "订单号", paramType = "query"),
        @ApiImplicitParam(name = "serviceType", value = "服务单类型状态（10：运输单  20:中转单服务单）", paramType = "query"),
        @ApiImplicitParam(name = "cube", value = "体积(m³)", paramType = "query"),
        @ApiImplicitParam(name = "packageNumber", value = "件数", paramType = "query"),
        @ApiImplicitParam(name = "roughWeight", value = "毛重(kg)", paramType = "query"),
        @ApiImplicitParam(name = "size", value = "尺寸(长*宽*高,单位cm)", paramType = "query"),
        @ApiImplicitParam(name = "status", value = "陆运单状态（10：未调度，20已调度，30已取消，40已完成，50异常中）", paramType = "query"),
        @ApiImplicitParam(name = "principalContactPerson", value = "委托方联系人（多个 联系人姓名，联系方式，邮箱地址）", paramType = "query"),
        @ApiImplicitParam(name = "businessTypes", value = "业务类型（10:出口空运20:进口空运30:出口海运40:跨境陆运50:陆运）", paramType = "query"),
        @ApiImplicitParam(name = "delegateNo", value = "委托方no", paramType = "query"),
        @ApiImplicitParam(name = "deliveryTime", value = "期望送货时间", paramType = "query"),
        @ApiImplicitParam(name = "arrivalContactName", value = "到货联系人", paramType = "query"),
        @ApiImplicitParam(name = "arrivalContactPhone", value = "到货联系人电话", paramType = "query"),
        @ApiImplicitParam(name = "deliveryProvince", value = "到货人省份", paramType = "query"),
        @ApiImplicitParam(name = "deliveryCity", value = "到货人城市", paramType = "query"),
        @ApiImplicitParam(name = "deliveryDistrict", value = "到货人省市区", paramType = "query"),
        @ApiImplicitParam(name = "deliveryAddress", value = "到货人具体地址", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryTime", value = "期望提货时间", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryProvince", value = "提货人省份", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryCity", value = "提货人城市", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryDistrict", value = "提货人市区", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryAddress", value = "提货人具体地址", paramType = "query"),
        @ApiImplicitParam(name = "contactName", value = "提货联系人名称", paramType = "query"),
        @ApiImplicitParam(name = "contactPhone", value = "提货联系人电话", paramType = "query"),
        @ApiImplicitParam(name = "cargoInformation", value = "补充货物提货卸货信息", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "externalServiceType", value = "服务类型（0 自营业务   ，10： 空运服务 ）", paramType = "query"),
        @ApiImplicitParam(name = "externalOrder", value = "外部订单号", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注信息", paramType = "query"),
        @ApiImplicitParam(name = "carType", value = "制定车辆类型（10:监管车 20:尾班车 30... ）", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<TransportOrderResDto> updateTransportOrder(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"transportOrder"}, nickname = "patchUpdateTransportOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<TransportOrderResDto> patchUpdateTransportOrder(Long id, TransportOrderReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"transportOrder"}, nickname = "putUpdateTransportOrder")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<TransportOrderResDto> putUpdateTransportOrder(Long id, TransportOrderReqDto reqDto);

}
