package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.WaybillReqDto;
import com.bizcenter.freight.dto.res.WaybillResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 派车表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "waybill", description = "派车表接口", tags = {"waybill"})
public interface WaybillApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"waybill"}, nickname = "addWaybill")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<WaybillResDto> addWaybill(WaybillReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"waybill",}, nickname = "deleteWaybill")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteWaybill(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "waybill",}, nickname = "getWaybillList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-orderNo-eq", value = "订单no ", paramType = "query"),
        @ApiImplicitParam(name = "qp-supplierNo-eq", value = "供应商no", paramType = "query"),
        @ApiImplicitParam(name = "qp-driverId-eq", value = "司机信息，多个司机，分割", paramType = "query"),
        @ApiImplicitParam(name = "qp-specificGoodsNumber-eq", value = "特定提取件数", paramType = "query"),
        @ApiImplicitParam(name = "qp-specificGoodsVolume-eq", value = "特定待提取方数", paramType = "query"),
        @ApiImplicitParam(name = "qp-licensePlateNumber-eq", value = "车牌号", paramType = "query"),
        @ApiImplicitParam(name = "qp-specificGoodsWeight-eq", value = "特定提货重量", paramType = "query"),
        @ApiImplicitParam(name = "qp-statusKey-eq", value = "状态值（0:已取消 10 :待提货; 20:提货中; 30:已到达提货点;  40:已提货 50：到达卸货点；60：已卸货 ；）", paramType = "query"),
        @ApiImplicitParam(name = "qp-size-eq", value = "尺寸长度cm*高度cm*宽度cm", paramType = "query"),
        @ApiImplicitParam(name = "qp-alongCargoData-eq", value = "是否有随货资料(1有 0 无)", paramType = "query"),
        @ApiImplicitParam(name = "qp-delegateNo-eq", value = "委托方", paramType = "query"),
        @ApiImplicitParam(name = "qp-exceptionStatus-eq", value = "异常信息（10：正常 20：异常）", paramType = "query"),
        @ApiImplicitParam(name = "qp-remark-eq", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "qp-externalOrder-eq", value = "外部订单号", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-specialVehicleType-eq", value = "特种车类型（10 危险品 20：冷藏车 30 ：气垫车 40:平板车）", paramType = "query"),
        @ApiImplicitParam(name = "qp-vehicleType-eq", value = "车型（10:1.5T/0.6，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60:5T ,70: 8T,80 :10T,90:  12T,100 :20 尺柜,110:40尺柜 ,120 :40/50尺柜,130:13T ）", paramType = "query"),
        @ApiImplicitParam(name = "qp-takeDeliveryTime-eq", value = "期望提货时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-driverMessage-eq", value = "司机信息展示", paramType = "query"),
        @ApiImplicitParam(name = "qp-latestLocation-eq", value = "当前最新位置", paramType = "query"),
        @ApiImplicitParam(name = "qp-serviceType-eq", value = "服务单类型状态（10：运输单  20:中转单服务单）", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<WaybillResDto>> getWaybillList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"waybill"}, nickname = "getOneWaybill")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WaybillResDto> getOneWaybill(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"waybill"}, nickname = "getOneWaybillByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "orderNo", value = "订单no ", paramType = "query"),
        @ApiImplicitParam(name = "supplierNo", value = "供应商no", paramType = "query"),
        @ApiImplicitParam(name = "driverId", value = "司机信息，多个司机，分割", paramType = "query"),
        @ApiImplicitParam(name = "specificGoodsNumber", value = "特定提取件数", paramType = "query"),
        @ApiImplicitParam(name = "specificGoodsVolume", value = "特定待提取方数", paramType = "query"),
        @ApiImplicitParam(name = "licensePlateNumber", value = "车牌号", paramType = "query"),
        @ApiImplicitParam(name = "specificGoodsWeight", value = "特定提货重量", paramType = "query"),
        @ApiImplicitParam(name = "statusKey", value = "状态值（0:已取消 10 :待提货; 20:提货中; 30:已到达提货点;  40:已提货 50：到达卸货点；60：已卸货 ；）", paramType = "query"),
        @ApiImplicitParam(name = "size", value = "尺寸长度cm*高度cm*宽度cm", paramType = "query"),
        @ApiImplicitParam(name = "alongCargoData", value = "是否有随货资料(1有 0 无)", paramType = "query"),
        @ApiImplicitParam(name = "delegateNo", value = "委托方", paramType = "query"),
        @ApiImplicitParam(name = "exceptionStatus", value = "异常信息（10：正常 20：异常）", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "externalOrder", value = "外部订单号", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "specialVehicleType", value = "特种车类型（10 危险品 20：冷藏车 30 ：气垫车 40:平板车）", paramType = "query"),
        @ApiImplicitParam(name = "vehicleType", value = "车型（10:1.5T/0.6，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60:5T ,70: 8T,80 :10T,90:  12T,100 :20 尺柜,110:40尺柜 ,120 :40/50尺柜,130:13T ）", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryTime", value = "期望提货时间", paramType = "query"),
        @ApiImplicitParam(name = "driverMessage", value = "司机信息展示", paramType = "query"),
        @ApiImplicitParam(name = "latestLocation", value = "当前最新位置", paramType = "query"),
        @ApiImplicitParam(name = "serviceType", value = "服务单类型状态（10：运输单  20:中转单服务单）", paramType = "query"),

    })
    ResultDTO<WaybillResDto> getOneWaybill(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"waybill"}, nickname = "updateWaybillByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "orderNo", value = "订单no ", paramType = "query"),
        @ApiImplicitParam(name = "supplierNo", value = "供应商no", paramType = "query"),
        @ApiImplicitParam(name = "driverId", value = "司机信息，多个司机，分割", paramType = "query"),
        @ApiImplicitParam(name = "specificGoodsNumber", value = "特定提取件数", paramType = "query"),
        @ApiImplicitParam(name = "specificGoodsVolume", value = "特定待提取方数", paramType = "query"),
        @ApiImplicitParam(name = "licensePlateNumber", value = "车牌号", paramType = "query"),
        @ApiImplicitParam(name = "specificGoodsWeight", value = "特定提货重量", paramType = "query"),
        @ApiImplicitParam(name = "statusKey", value = "状态值（0:已取消 10 :待提货; 20:提货中; 30:已到达提货点;  40:已提货 50：到达卸货点；60：已卸货 ；）", paramType = "query"),
        @ApiImplicitParam(name = "size", value = "尺寸长度cm*高度cm*宽度cm", paramType = "query"),
        @ApiImplicitParam(name = "alongCargoData", value = "是否有随货资料(1有 0 无)", paramType = "query"),
        @ApiImplicitParam(name = "delegateNo", value = "委托方", paramType = "query"),
        @ApiImplicitParam(name = "exceptionStatus", value = "异常信息（10：正常 20：异常）", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query"),
        @ApiImplicitParam(name = "externalOrder", value = "外部订单号", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "specialVehicleType", value = "特种车类型（10 危险品 20：冷藏车 30 ：气垫车 40:平板车）", paramType = "query"),
        @ApiImplicitParam(name = "vehicleType", value = "车型（10:1.5T/0.6，20:4.2T, 30: 6.8T ,40 : 7.6T, 50: 3T ,60:5T ,70: 8T,80 :10T,90:  12T,100 :20 尺柜,110:40尺柜 ,120 :40/50尺柜,130:13T ）", paramType = "query"),
        @ApiImplicitParam(name = "takeDeliveryTime", value = "期望提货时间", paramType = "query"),
        @ApiImplicitParam(name = "driverMessage", value = "司机信息展示", paramType = "query"),
        @ApiImplicitParam(name = "latestLocation", value = "当前最新位置", paramType = "query"),
        @ApiImplicitParam(name = "serviceType", value = "服务单类型状态（10：运输单  20:中转单服务单）", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WaybillResDto> updateWaybill(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"waybill"}, nickname = "patchUpdateWaybill")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WaybillResDto> patchUpdateWaybill(Long id, WaybillReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"waybill"}, nickname = "putUpdateWaybill")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<WaybillResDto> putUpdateWaybill(Long id, WaybillReqDto reqDto);

}
