package com.neu.hcc.service;

import com.neu.hcc.model.MealCalendar;
import com.neu.hcc.model.MealSetting;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface MealService {
    List<MealCalendar> selectAll();
    String insert(MealCalendar mealCalendar) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException;
    int getFoodNum();
    String insertMealSetting(MealSetting mealSetting);
    List<MealCalendar> selectMealMessage(MealSetting mealSetting);
    int getMealNum(MealSetting mealSetting);
    List<MealCalendar> search(MealCalendar mealCalendar);
    int getSearchNum(MealCalendar mealCalendar);
}
