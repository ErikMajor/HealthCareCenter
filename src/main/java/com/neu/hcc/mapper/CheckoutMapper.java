package com.neu.hcc.mapper;

import com.neu.hcc.model.Checkout;
import java.util.List;

public interface CheckoutMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Checkout record);

    Checkout selectByPrimaryKey(Integer id);

    List<Checkout> selectAll();

    int updateByPrimaryKey(Checkout record);
}