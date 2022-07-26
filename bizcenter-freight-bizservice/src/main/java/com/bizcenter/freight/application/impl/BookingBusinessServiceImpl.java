package com.bizcenter.freight.application.impl;

import com.bitsun.core.common.persistence.Pager;
import com.bizcenter.freight.application.BookingBusinessService;
import com.bizcenter.freight.convertor.BookingBusinessReqDtoConvertor;
import com.bizcenter.freight.convertor.BookingBusinessResDtoConvertor;
import com.bizcenter.freight.dto.req.BookingBusinessReqDto;
import com.bizcenter.freight.dto.res.BookingBusinessResDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
/**
 * 示例表，应用（业务编排）层实现
 * @author: hwx
 * @email: 745011692@qq.com
 */
@Slf4j
@Service("bookingBusinessAppService")
@Transactional(rollbackFor = Exception.class)
public class BookingBusinessServiceImpl implements BookingBusinessService {

    @Autowired
    private BookingBusinessReqDtoConvertor bookingBusinessReqDtoConvertor;

    @Autowired
    private BookingBusinessResDtoConvertor bookingBusinessResDtoConvertor;

//    private IPService<BookingBusinessPo> bookingBusinessPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public BookingBusinessServiceImpl(BookingBusinessMapper bookingBusinessMapper) {
//        this.bookingBusinessPoService = new BasePService(bookingBusinessMapper);
//    }



    @Override
    public BookingBusinessResDto save(BookingBusinessReqDto reqDto) {
//        BookingBusinessPo po = bookingBusinessReqDtoConvertor.dto2Po(reqDto);
////        bookingBusinessPoService.save(po);
////        BookingBusinessResDto resDto = bookingBusinessResDtoConvertor.po2Dto(po);
////        return resDto;
        return  null;
    }

    @Override
    public boolean deleteByIds(String ids) {
//        try {
//            List<Long> idLongList =
//            Arrays.asList(ids.split(",")).stream().map(s -> NumberUtils.createLong(s.trim())).collect(Collectors.toList());
//            return bookingBusinessPoService.removeByIds(idLongList);
//        } catch (Exception e) {
//            throw new AppException("参数错误：" + ids, ErrorCode.pc("417"), e);
//        }
        return  true;
     }

    @Override
    public Pager<BookingBusinessResDto> doPager(Map<String, Object> params) {
//        Pager<BookingBusinessPo> poPager = bookingBusinessPoService.queryPage(params, BookingBusinessPo.class);
//        Pager<BookingBusinessResDto> resDtoPager = bookingBusinessResDtoConvertor.convertPoPager2ResDtoPager(poPager);
//        return resDtoPager;
        return  null;
    }

    @Override
    public BookingBusinessResDto selectOne(Long id) {
//        BookingBusinessPo po = bookingBusinessPoService.getById(id);
//        BookingBusinessResDto resDto = bookingBusinessResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public BookingBusinessResDto selectOne(Map<String, Object> params) {
//        QueryWrapper queryWrapper = QueryParamUtils.queryWrapper4eq(BookingBusinessPo::new, params);
//        queryWrapper.last(" limit 1");
//        BookingBusinessPo po = bookingBusinessPoService.getOne(queryWrapper);
//        BookingBusinessResDto resDto = bookingBusinessResDtoConvertor.po2Dto(po);
//        return resDto;
        return  null;
    }

    @Override
    public boolean updateProps(Long id, Map<String, Object> params) {
//        UpdateWrapper<BookingBusinessPo> updateWrapper = QueryParamUtils.updateWrapper4Map(BookingBusinessPo::new, id, params);
//        return bookingBusinessPoService.update(new BookingBusinessPo(), updateWrapper);
        return  true;
        }

    @Override
    public boolean updateProps(Long id, BookingBusinessReqDto reqDto) {
//        BookingBusinessPo po = bookingBusinessReqDtoConvertor.dto2Po(reqDto);
//        po.setId(id);
//        return bookingBusinessPoService.updateById(po);
        return  true;
    }


    @Override
    public boolean updateAllProps(Long id, BookingBusinessReqDto reqDto) {
//        UpdateWrapper<BookingBusinessPo> updateWrapper = Wrappers.update();
////        updateWrapper.eq("id", id);
////        Field[] fields = BookingBusinessReqDto.class.getDeclaredFields();
////        Arrays.stream(fields).filter(f -> !Modifier.isStatic(f.getModifiers())).forEach(field -> {
////        try {
////        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), BookingBusinessReqDto.class);
////        Method getMethod = propertyDescriptor.getReadMethod();
////        String fileNameCamel = getMethod.getName().substring(3);
////        String fileNameUnderline = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fileNameCamel);
////        updateWrapper.set(fileNameUnderline, getMethod.invoke(reqDto));
////        } catch (Exception ex) {
////        log.warn("属性不存在get方法："+field.getName(),ex);
////        }
////        });
////        return bookingBusinessPoService.update(new BookingBusinessPo(), updateWrapper);
        return  true;
    }

}