package com.neu.hcc.mapper;

import com.neu.hcc.model.NursingContent;
import java.util.List;

public interface NursingContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NursingContent record);

    NursingContent selectByPrimaryKey(Integer id);

    List<NursingContent> selectAll();

    int updateByPrimaryKey(NursingContent record);
}