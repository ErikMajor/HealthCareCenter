package com.neu.hcc.mapper;

import com.neu.hcc.model.MealCalendar;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealCalendarMapper {
    int deleteByPrimaryKey(Integer id);

    void insert(MealCalendar mealCalendar);

    MealCalendar selectByPrimaryKey(Integer id);

    List<MealCalendar> selectAll();

    int updateByPrimaryKey(MealCalendar record);

    int getFoodNum();
}
