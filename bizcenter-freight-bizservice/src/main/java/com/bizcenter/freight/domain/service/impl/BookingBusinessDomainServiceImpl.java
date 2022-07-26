package com.bizcenter.freight.domain.service.impl;

import com.bizcenter.freight.convertor.BookingBusinessReqDtoConvertor;
import com.bizcenter.freight.convertor.BookingBusinessResDtoConvertor;
import com.bitsun.core.common.persistence.BasePService;
import com.bitsun.core.common.persistence.IPService;
import com.bizcenter.freight.infrastructure.persistence.dao.BookingBusinessMapper;
import com.bizcenter.freight.infrastructure.persistence.po.BookingBusinessPo;
import com.bizcenter.freight.domain.service.BookingBusinessDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Felix Woo （junfengwstar@gmail.com）
 * @Date: 2019-09-20 19:40
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@Service("bookingBusinessDomainService")
public class BookingBusinessDomainServiceImpl implements BookingBusinessDomainService{

    @Autowired
    private BookingBusinessReqDtoConvertor bookingBusinessReqDtoConvertor;

    @Autowired
    private BookingBusinessResDtoConvertor bookingBusinessResDtoConvertor;

    private IPService<BookingBusinessPo> bookingBusinessPoService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    public BookingBusinessDomainServiceImpl(BookingBusinessMapper bookingBusinessMapper) {
        this.bookingBusinessPoService = new BasePService(bookingBusinessMapper);
    }
}