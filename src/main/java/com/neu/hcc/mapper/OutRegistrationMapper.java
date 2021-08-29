package com.neu.hcc.mapper;

import com.neu.hcc.model.OutRegistration;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutRegistrationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OutRegistration record);

    OutRegistration selectByPrimaryKey(Integer id);

    List<OutRegistration> selectAll();

    int updateByPrimaryKey(OutRegistration record);
}