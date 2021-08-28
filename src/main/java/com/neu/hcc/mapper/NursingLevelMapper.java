package com.neu.hcc.mapper;

import com.neu.hcc.model.NursingLevel;
import java.util.List;

public interface NursingLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NursingLevel record);

    NursingLevel selectByPrimaryKey(Integer id);

    List<NursingLevel> selectAll();

    int updateByPrimaryKey(NursingLevel record);
}