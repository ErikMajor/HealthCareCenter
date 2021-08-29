package com.neu.hcc.mapper;

import com.neu.hcc.model.CustomerBeds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerBedsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerBeds record);

    CustomerBeds selectByPrimaryKey(Integer id);

    List<CustomerBeds> selectAll();

    int updateByPrimaryKey(CustomerBeds record);
}