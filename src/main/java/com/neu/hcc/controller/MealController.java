package com.neu.hcc.controller;

import com.neu.hcc.model.MealCalendar;
import com.neu.hcc.model.MealSetting;
import com.neu.hcc.service.MealService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
@RequestMapping("/mealManage")
public class MealController {

    @Resource
    private MealService mealService;
    private MealCalendar mealCalendar;

    @RequestMapping("selectAll")
    public List<MealCalendar> selectAll(){
        return mealService.selectAll();
    }

    @RequestMapping("insert")
    public String insert(@RequestBody MealCalendar mealCalendar) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        return mealService.insert(mealCalendar);
    }

    @RequestMapping("getFoodNum")
    public int getFoodNum(){
        return mealService.getFoodNum();
    }

    @RequestMapping("insertMealSetting")
    public String insertMealSetting(@RequestBody MealSetting mealSetting){
        return mealService.insertMealSetting(mealSetting);
    }

    @RequestMapping("selectMealMessage")
    public List<MealCalendar> selectMealMessage(@RequestBody MealSetting mealSetting){
        return mealService.selectMealMessage(mealSetting);
    }

    @RequestMapping("getMealNum")
    public int getMealNum(@RequestBody MealSetting mealSetting){
        return mealService.getMealNum(mealSetting);
    }

    @RequestMapping("search")
    public List<MealCalendar> search(@RequestBody MealCalendar mealCalendar){
        System.out.println(mealService.search(mealCalendar).get(0).getFoodName()+"测试原");
        return mealService.search(mealCalendar);
    }

    @RequestMapping("getSearchNum")
    public int getSearchNum(@RequestBody MealCalendar mealCalendar){

        return mealService.getSearchNum(mealCalendar);
    }
}

