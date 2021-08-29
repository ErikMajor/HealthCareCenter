package com.neu.hcc.mapper;

import com.neu.hcc.model.Checkout;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckoutMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Checkout record);

    Checkout selectByPrimaryKey(Integer id);

    List<Checkout> selectAll();

    int updateByPrimaryKey(Checkout record);
}