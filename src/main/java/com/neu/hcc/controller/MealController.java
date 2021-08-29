package com.neu.hcc.controller;

import com.neu.hcc.model.MealCalendar;
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
//        @PathVariable String foodName,@PathVariable String foodType,@PathVariable String foodTag,@PathVariable Float foodPrice,@PathVariable String foodPicture,@PathVariable boolean momalFlag,@PathVariable String supplyDate,@PathVariable String supplyType
//        System.out.println(foodName);
        return mealService.insert(mealCalendar);
    }

    @RequestMapping("getFoodNum")
    public int getFoodNum(){
        return mealService.getFoodNum();
    }
}
