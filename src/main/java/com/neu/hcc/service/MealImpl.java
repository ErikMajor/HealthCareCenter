package com.neu.hcc.service;

import com.google.gson.Gson;
import com.neu.hcc.Tool.Encode;
import com.neu.hcc.mapper.MealCalendarMapper;
import com.neu.hcc.model.MealCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MealImpl implements MealService {

    @Autowired
    private MealCalendarMapper mealCalendarMapper;
    @Override
    public List<MealCalendar> selectAll() {

        return mealCalendarMapper.selectAll();
    }

    @Override
    public String insert(MealCalendar mealCalendar) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

//        Encode encode = new Encode();
//        String path=encode.base65Decode(mealCalendar.getFoodPicture(),"");
//
//        Runtime.getRuntime().exec("cmd /c start /b C:\\图片\\自动提交.bat");
//        mealCalendar.setFoodPicture(path);
        mealCalendarMapper.insert(mealCalendar);
        Map<String,Object> result = new HashMap<>();
        result.put("state", "success");
        return new Gson().toJson(result);
    }

    @Override
    public int getFoodNum() {
        return mealCalendarMapper.getFoodNum();
    }
}
