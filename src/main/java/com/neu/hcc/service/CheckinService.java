package com.neu.hcc.service;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.Checkin;
import com.neu.hcc.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

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
    PageInfo<Checkin> selByNameWithPage(String name, Integer currentPage);

    /**
     * 根据name模糊查找，只有客户名称作为value
     *
     * @param name
     * @return
     */
    List<Customer> selListByName(String name);

    /**
     * 返回所有的入住客户信息
     *
     * @param currentPage 分页查找参数
     * @return 返回入住客户信息
     */
    PageInfo<Checkin> selAllWithPage(Integer currentPage);

    /**
     * 直接查询全部入住客户
     *
     * @return 返回客户信息列表
     */
    List<Checkin> selAll();

    /**
     * 更新客户信息
     *
     * @param checkin
     * @return
     */
    int updateCustomer(Checkin checkin);

    /**
     * 添加入住记录
     *
     * @param checkin 入住信息
     * @return
     */
    int addCustomer(Checkin checkin);

    /**
     * 逻辑删除入住记录
     *
     * @param id
     * @return
     */
    int deleteCheckin(Integer id);
}
