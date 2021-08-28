package com.neu.hcc.mapper;

import com.neu.hcc.model.NursingRecords;
import java.util.List;

public interface NursingRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NursingRecords record);

    NursingRecords selectByPrimaryKey(Integer id);

    List<NursingRecords> selectAll();

    int updateByPrimaryKey(NursingRecords record);
}