package com.neu.hcc.mapper;

import com.neu.hcc.model.CustomerBeds;
import java.util.List;

public interface CustomerBedsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerBeds record);

    CustomerBeds selectByPrimaryKey(Integer id);

    List<CustomerBeds> selectAll();

    int updateByPrimaryKey(CustomerBeds record);
}