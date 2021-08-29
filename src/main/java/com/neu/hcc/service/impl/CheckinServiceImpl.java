package com.neu.hcc.service.impl;

import com.neu.hcc.mapper.CheckinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 入住service实现类
 */
@Service
public class CheckinServiceImpl {

    @Autowired
    private CheckinMapper checkinMapper;


}
