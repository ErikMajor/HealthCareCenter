package com.neu.hcc.service;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.Checkin;
import org.springframework.stereotype.Service;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 入住service接口
 */
@Service
public interface CheckinService {
    /**
     * 根据name模糊查找入住客户信息
     *
     * @param name        模糊查找参数
     * @param currentPage 分页查找参数
     * @return 返回入住客户类
     */
    PageInfo<Checkin> selByName(String name, Integer currentPage);

    /**
     * 返回所有的入住客户信息
     *
     * @param currentPage 分页查找参数
     * @return 返回入住客户信息
     */
    PageInfo<Checkin> selAll(Integer currentPage);

    /**
     * 添加入住记录
     *
     * @param checkin 入住信息
     * @return
     */
    int addCustomer(Checkin checkin);
}
