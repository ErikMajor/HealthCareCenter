package com.neu.hcc.mapper;

import com.neu.hcc.model.NursingContent;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NursingContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NursingContent record);

    NursingContent selectByPrimaryKey(Integer id);

    List<NursingContent> selectAll();

    int updateByPrimaryKey(NursingContent record);
}