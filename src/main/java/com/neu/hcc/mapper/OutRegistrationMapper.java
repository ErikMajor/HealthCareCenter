package com.neu.hcc.mapper;

import com.neu.hcc.model.OutRegistration;
import java.util.List;

public interface OutRegistrationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OutRegistration record);

    OutRegistration selectByPrimaryKey(Integer id);

    List<OutRegistration> selectAll();

    int updateByPrimaryKey(OutRegistration record);
}