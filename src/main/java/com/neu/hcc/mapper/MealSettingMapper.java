package com.neu.hcc.mapper;

import com.neu.hcc.model.MealCalendar;
import com.neu.hcc.model.MealSetting;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealSettingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MealSetting mealSetting);

    MealSetting selectByPrimaryKey(Integer id);

    List<MealSetting> selectAll();

    int updateByPrimaryKey(MealSetting record);


}
