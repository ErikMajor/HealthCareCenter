package com.neu.hcc.mapper;

import com.neu.hcc.model.MealCalendar;
import java.util.List;

public interface MealCalendarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MealCalendar record);

    MealCalendar selectByPrimaryKey(Integer id);

    List<MealCalendar> selectAll();

    int updateByPrimaryKey(MealCalendar record);
}