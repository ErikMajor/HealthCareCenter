package com.neu.hcc.mapper;

import com.neu.hcc.model.ServiceConcern;
import java.util.List;

public interface ServiceConcernMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceConcern record);

    ServiceConcern selectByPrimaryKey(Integer id);

    List<ServiceConcern> selectAll();

    int updateByPrimaryKey(ServiceConcern record);
}