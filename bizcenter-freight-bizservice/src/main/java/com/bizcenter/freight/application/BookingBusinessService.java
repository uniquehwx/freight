package com.bizcenter.freight.application;

import com.bitsun.core.framwork.application.IApplicationService;
import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.dto.req.BookingBusinessReqDto;
import com.bizcenter.freight.dto.res.BookingBusinessResDto;

import java.util.Map;
import javax.validation.Valid;

/**
 * 订舱服务表  service 接口
 * @author: hwx
 * @email: 745011692@qq.com
 */
public interface BookingBusinessService extends IApplicationService{

    /**
     * 保存一个对象
     * @param reqDto
     * @return
     */
    BookingBusinessResDto save(BookingBusinessReqDto reqDto);

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
    Pager<BookingBusinessResDto> doPager(Map<String, Object> params);

    /**
     * 根据id查询一个对象
     * @param id
     * @return
     */
    BookingBusinessResDto selectOne(Long id);

    /**
     * 根据其它参数查询一个对象
     * @param params 查询参数
     */
    BookingBusinessResDto selectOne(Map<String, Object> params);

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
    boolean updateProps(Long id, BookingBusinessReqDto reqDto);

    /**
     * 更新一个资源对象（整个对象替换）
     * @param id
     * @param reqDto
     * @return
     */
    boolean updateAllProps(Long id, BookingBusinessReqDto reqDto);

}