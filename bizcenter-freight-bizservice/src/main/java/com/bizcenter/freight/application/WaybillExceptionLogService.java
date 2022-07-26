package com.bizcenter.freight.application;

import com.bitsun.core.framwork.application.IApplicationService;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.WaybillExceptionLogReqDto;
import com.bizcenter.freight.dto.res.WaybillExceptionLogResDto;

import java.util.Map;
import javax.validation.Valid;

/**
 * 运单异常信息记录表 service 接口
 * @author: hwx
 * @email: 745011692@qq.com
 */
public interface WaybillExceptionLogService extends IApplicationService{

    /**
     * 保存一个对象
     * @param reqDto
     * @return
     */
    WaybillExceptionLogResDto save(WaybillExceptionLogReqDto reqDto);

    /**
     * 删除（支持批量）
     * @param ids
     * @return
     */
    boolean deleteByIds(String ids);

    /**
     * 分页查询
     * @param params
     * @return
     */
    Pager<WaybillExceptionLogResDto> doPager(Map<String, Object> params);

    /**
     * 根据id查询一个对象
     * @param id
     * @return
     */
    WaybillExceptionLogResDto selectOne(Long id);

    /**
     * 根据其它参数查询一个对象
     * @param params 查询参数
     */
    WaybillExceptionLogResDto selectOne(Map<String, Object> params);

    /**
     * 更新一个资源对象(更新参数的全部属性)
     * @param id
     * @param params
     * @return
     */
    boolean updateProps(Long id, Map<String, Object> params);

    /**
     * 更新一个资源对象(部分更新)
     * @param id
     * @param reqDto
     * @return
     */
    boolean updateProps(Long id, WaybillExceptionLogReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换）
     * @param id
     * @param reqDto
     * @return
     */
    boolean updateAllProps(Long id, WaybillExceptionLogReqDto reqDto);

}