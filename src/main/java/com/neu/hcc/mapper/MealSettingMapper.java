package com.neu.hcc.mapper;

import com.neu.hcc.model.MealSetting;
import java.util.List;

public interface MealSettingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MealSetting record);

    MealSetting selectByPrimaryKey(Integer id);

    List<MealSetting> selectAll();

    int updateByPrimaryKey(MealSetting record);
}