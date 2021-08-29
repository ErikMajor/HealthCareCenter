package com.neu.hcc.service;

import com.neu.hcc.model.MealCalendar;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface MealService {
    List<MealCalendar> selectAll();
    String insert(MealCalendar mealCalendar) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException;
    int getFoodNum();
}
