package com.neu.hcc.service.impl;

import com.neu.hcc.mapper.CheckoutMapper;
import com.neu.hcc.model.Checkout;
import com.neu.hcc.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 退住service实现类
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private CheckoutMapper mapper;

    @Override
    public int insert(Checkout checkout) {
        return mapper.insert(checkout);
    }

    @Override
    public Checkout selByIdRecent(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Checkout checkout) {
        return mapper.updateByPrimaryKey(checkout);
    }

    @Override
    public int delete(Integer id) {
        return mapper.updateDel_flag(id);
    }

}
