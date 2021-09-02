package com.neu.hcc.service.impl;

import com.google.gson.Gson;
import com.neu.hcc.mapper.MealCalendarMapper;
import com.neu.hcc.mapper.MealSettingMapper;
import com.neu.hcc.model.MealCalendar;
import com.neu.hcc.model.MealSetting;
import com.neu.hcc.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MealServiceImpl implements MealService {

    @Autowired
    private MealCalendarMapper mealCalendarMapper;
    @Autowired
    private MealSettingMapper mealSettingMapper;
    @Override
    public List<MealCalendar> selectAll() {

        return mealCalendarMapper.selectAll();
    }

    @Override
    public String insert(MealCalendar mealCalendar) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        mealCalendarMapper.insert(mealCalendar);
        Map<String,Object> result = new HashMap<>();
        result.put("state", "success");
        return new Gson().toJson(result);
    }

    @Override
    public int getFoodNum() {
        return mealCalendarMapper.getFoodNum();
    }

    @Override
    public String insertMealSetting(MealSetting mealSetting) {
        mealSettingMapper.insert(mealSetting);
        Map<String,Object> result = new HashMap<>();
        result.put("state", "success");
        return new Gson().toJson(result);
    }

    @Override
    public List<MealCalendar> selectMealMessage(MealSetting mealSetting) {
        return mealCalendarMapper.selectMealMessage(mealSetting);
    }

    @Override
    public int getMealNum(MealSetting mealSetting) {
        System.out.println(mealCalendarMapper.getMealNum(mealSetting)+"测试1");
        return mealCalendarMapper.getMealNum(mealSetting);
    }

    @Override
    public List<MealCalendar> search(MealCalendar mealCalendar) {
        return mealCalendarMapper.search(mealCalendar);
    }

    @Override
    public int getSearchNum(MealCalendar mealCalendar) {
        return mealCalendarMapper.getSearchNum(mealCalendar);
    }
}
