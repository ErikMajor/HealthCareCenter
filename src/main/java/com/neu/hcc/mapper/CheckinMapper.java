package com.neu.hcc.mapper;

import com.neu.hcc.model.Checkin;
import java.util.List;

public interface CheckinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Checkin record);

    Checkin selectByPrimaryKey(Integer id);

    List<Checkin> selectAll();

    int updateByPrimaryKey(Checkin record);
}