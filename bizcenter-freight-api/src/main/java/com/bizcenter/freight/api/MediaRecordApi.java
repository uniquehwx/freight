package com.bizcenter.freight.api;

import com.bitsun.core.common.persistence.Pager;
import com.bitsun.core.common.web.ResultDTO;
import com.bizcenter.freight.dto.req.MediaRecordReqDto;
import com.bizcenter.freight.dto.res.MediaRecordResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Map;

/**
 * 媒体信息表
 * @Author: hwx
 * @Email: 745011692@qq.com
 */
@Api(value = "mediaRecord", description = "媒体信息表接口", tags = {"mediaRecord"})
public interface MediaRecordApi {

    /**
     * 创建一个资源对象
     *
     * @return 返回新创建的资源对象
     */
    @ApiOperation(value = "创建一个资源对象（返回新创建的资源对象）", tags = {"mediaRecord"}, nickname = "addMediaRecord")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "000000:成功，否则失败")})
    ResultDTO<MediaRecordResDto> addMediaRecord(MediaRecordReqDto reqDto);

    /**
     * 删除单个或一系列资源对象
     *
     * @param ids 用英文逗号隔开
     * @return 返回一个空文档
     */
    @ApiOperation(value = "删除单个或一系列资源对象", tags = {"mediaRecord",}, nickname = "deleteMediaRecord")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Void> deleteMediaRecord(String ids);

    /**
     * 查询一系列资源对象，也就是列表
     *
     * @param params 参数params
     * @return 返回一系列资源对象
     */
    @ApiOperation(value = "查询一系列资源对象，也就是列表(qp-参数支持的操作符号有: eq(=),ne(!=),gt(>),lt(<),ge(>=),le(<=),in,like,notLike,likeleft(左边LIKE '%xxx'),likeright(右边LIKE 'xx%'))", tags = {
        "mediaRecord",}, nickname = "getMediaRecordList")
    @ApiImplicitParams({@ApiImplicitParam(name = "currentPage", value = "当前页数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "pageSize", value = "每页记录数", paramType = "query", dataType = "long"),
        @ApiImplicitParam(name = "sorter", value = "排序条件 desc-字段名或者asc-字段名", paramType = "query"),
        @ApiImplicitParam(name = "qp-imgUrl-eq", value = "图片地址", paramType = "query"),
        @ApiImplicitParam(name = "qp-refId-eq", value = "关联id", paramType = "query"),
        @ApiImplicitParam(name = "qp-remark-eq", value = "备注信息", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyTime-eq", value = "更新时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserName-eq", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyUserId-eq", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-createTime-eq", value = "创建时间", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserName-eq", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "qp-createUserId-eq", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "qp-isvId-eq", value = "", paramType = "query"),
        @ApiImplicitParam(name = "qp-modifyRealName-eq", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-createRealName-eq", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-fileName-eq", value = "文件名称", paramType = "query"),
        @ApiImplicitParam(name = "qp-type-eq", value = "类型", paramType = "query"),
        @ApiImplicitParam(name = "qp-status-eq", value = "状态", paramType = "query"),
        @ApiImplicitParam(name = "qp-extData1-eq", value = "扩展字段1", paramType = "query"),
        @ApiImplicitParam(name = "qp-extData2-eq", value = "扩展字段2", paramType = "query"),

    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<Pager<MediaRecordResDto>> getMediaRecordList(Map<String, Object> params);

    /**
     * 查询一个资源对象
     *
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象", tags = {"mediaRecord"}, nickname = "getOneMediaRecord")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<MediaRecordResDto> getOneMediaRecord(Long id);

    /**
     * 查询一个资源对象
     *
     * @param params 能确定唯一对象的条件
     * @return 返回单独的资源对象
     */
    @ApiOperation(value = "查询一个资源对象(若不唯一则随机返回符合条件的一个)", tags = {"mediaRecord"}, nickname = "getOneMediaRecordByMap")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    @ApiImplicitParams({
        @ApiImplicitParam(name = "imgUrl", value = "图片地址", paramType = "query"),
        @ApiImplicitParam(name = "refId", value = "关联id", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注信息", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "fileName", value = "文件名称", paramType = "query"),
        @ApiImplicitParam(name = "type", value = "类型", paramType = "query"),
        @ApiImplicitParam(name = "status", value = "状态", paramType = "query"),
        @ApiImplicitParam(name = "extData1", value = "扩展字段1", paramType = "query"),
        @ApiImplicitParam(name = "extData2", value = "扩展字段2", paramType = "query"),

    })
    ResultDTO<MediaRecordResDto> getOneMediaRecord(Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(更新参数的全部属性)", tags = {"mediaRecord"}, nickname = "updateMediaRecordByMap")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "imgUrl", value = "图片地址", paramType = "query"),
        @ApiImplicitParam(name = "refId", value = "关联id", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注信息", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserName", value = "更新人姓名", paramType = "query"),
        @ApiImplicitParam(name = "modifyUserId", value = "更新人ID", paramType = "query"),
        @ApiImplicitParam(name = "createUserName", value = "创建人命名", paramType = "query"),
        @ApiImplicitParam(name = "createUserId", value = "创建人ID", paramType = "query"),
        @ApiImplicitParam(name = "isvId", value = "", paramType = "query"),
        @ApiImplicitParam(name = "modifyRealName", value = "修改人名称", paramType = "query"),
        @ApiImplicitParam(name = "createRealName", value = "创建人名称", paramType = "query"),
        @ApiImplicitParam(name = "fileName", value = "文件名称", paramType = "query"),
        @ApiImplicitParam(name = "type", value = "类型", paramType = "query"),
        @ApiImplicitParam(name = "status", value = "状态", paramType = "query"),
        @ApiImplicitParam(name = "extData1", value = "扩展字段1", paramType = "query"),
        @ApiImplicitParam(name = "extData2", value = "扩展字段2", paramType = "query"),
        @ApiImplicitParam(name = "remark", value = "备注", paramType = "query")
    })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<MediaRecordResDto> updateMediaRecord(Long id, Map<String, Object> params);
    /**
     * 更新一个资源对象(部分更新)
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象(部分更新,更新对象里有值的属性,空值不更新)", tags = {"mediaRecord"}, nickname = "patchUpdateMediaRecord")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<MediaRecordResDto> patchUpdateMediaRecord(Long id, MediaRecordReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换，属性的null值也会更新进去）
     *
     * @return 返回完整的资源对象
     */
    @ApiOperation(value = "更新一个资源对象（更新对象里全部属性，即整个对象替换）", tags = {"mediaRecord"}, nickname = "putUpdateMediaRecord")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "操作是否成功,000000:成功，否则失败")})
    ResultDTO<MediaRecordResDto> putUpdateMediaRecord(Long id, MediaRecordReqDto reqDto);

}
