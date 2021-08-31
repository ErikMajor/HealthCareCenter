package com.neu.hcc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.hcc.mapper.CheckinMapper;
import com.neu.hcc.model.Checkin;
import com.neu.hcc.service.CheckinService;
import com.neu.hcc.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 入住service实现类
 */
@Service
public class CheckinServiceImpl implements CheckinService {

    @Autowired
    private CheckinMapper checkinMapper;


    @Override
    public PageInfo<Checkin> selByName(String name, Integer currentPage) {
        if (currentPage == null) {
            currentPage = 1;
        }
        PageHelper.startPage(currentPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<Checkin> res = new PageInfo<Checkin>(checkinMapper.selectByName(name));
        return res;
    }

    @Override
    public PageInfo<Checkin> selAll(Integer currentPage) {
        if (currentPage == null) {
            currentPage = 1;
        }
        PageHelper.startPage(currentPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<Checkin> res = new PageInfo<Checkin>(checkinMapper.selectAll());
        return res;
    }

    @Override
    public int addCustomer(Checkin checkin) {
        return checkinMapper.insert(checkin);
    }
}
