package com.neu.hcc.service;

import com.neu.hcc.model.Checkout;
import org.springframework.stereotype.Service;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 退住service接口
 */
@Service
public interface CheckoutService {

    /**
     * 添加推住记录
     *
     * @param checkout
     * @return
     */
    int insert(Checkout checkout);

    /**
     * 查找客户最近的退住记录
     *
     * @param id
     * @return
     */
    Checkout selByIdRecent(Integer id);

    /**
     * 修改退住记录
     *
     * @param checkout
     * @return
     */
    int update(Checkout checkout);

    /**
     * 逻辑删除退住记录
     *
     * @param id
     * @return
     */
    int delete(Integer id);

}
