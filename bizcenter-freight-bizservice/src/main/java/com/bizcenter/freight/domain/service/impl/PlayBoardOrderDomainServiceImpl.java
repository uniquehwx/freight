//package com.bizcenter.freight.domain.service.impl;
//
//import com.bizcenter.freight.convertor.PlayBoardOrderReqDtoConvertor;
//import com.bizcenter.freight.convertor.PlayBoardOrderResDtoConvertor;
//import com.bitsun.core.common.persistence.BasePService;
//import com.bitsun.core.common.persistence.IPService;
//import com.bizcenter.freight.infrastructure.persistence.dao.PlayBoardOrderMapper;
//import com.bizcenter.freight.infrastructure.persistence.po.PlayBoardOrderPo;
//import com.bizcenter.freight.domain.service.PlayBoardOrderDomainService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * @Author: Felix Woo （junfengwstar@gmail.com）
// * @Date: 2019-09-20 19:40
// * @Version: 1.0
// * @Description:
// */
//@Slf4j
//@Service("playBoardOrderDomainService")
//public class PlayBoardOrderDomainServiceImpl implements PlayBoardOrderDomainService{
//
//    @Autowired
//    private PlayBoardOrderReqDtoConvertor playBoardOrderReqDtoConvertor;
//
//    @Autowired
//    private PlayBoardOrderResDtoConvertor playBoardOrderResDtoConvertor;
//
//    private IPService<PlayBoardOrderPo> playBoardOrderPoService;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    public PlayBoardOrderDomainServiceImpl(PlayBoardOrderMapper playBoardOrderMapper) {
//        this.playBoardOrderPoService = new BasePService(playBoardOrderMapper);
//    }
//}