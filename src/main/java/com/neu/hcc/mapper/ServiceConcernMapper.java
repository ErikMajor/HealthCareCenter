package com.neu.hcc.mapper;

import com.neu.hcc.model.ServiceConcern;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceConcernMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceConcern record);

    ServiceConcern selectByPrimaryKey(Integer id);

    List<ServiceConcern> selectAll();

    int updateByPrimaryKey(ServiceConcern record);

    List<ServiceConcern> searchCustomerService(ServiceConcern record);
}
