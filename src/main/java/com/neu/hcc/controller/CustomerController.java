package com.neu.hcc.controller;

import com.neu.hcc.model.Checkin;
import com.neu.hcc.model.MealCalendar;
import com.neu.hcc.service.CustomerService;
import com.neu.hcc.service.MealService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customerManage")
public class CustomerController {
    @Resource
    private CustomerService customerService;

    @RequestMapping("selectAll")
    public List<Checkin> selectAll(){
        return customerService.selectAll();
    }
}
