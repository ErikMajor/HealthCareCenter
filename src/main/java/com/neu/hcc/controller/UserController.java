package com.neu.hcc.controller;

import com.neu.hcc.model.MealSetting;
import com.neu.hcc.model.ServiceConcern;
import com.neu.hcc.model.UserManage;
import com.neu.hcc.service.NursingLevelService;
import com.neu.hcc.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/userManage")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("register")
    public String register(@RequestBody UserManage userManage){
        return userService.register(userManage);
    }

    @RequestMapping("login")
    public String login(@RequestBody UserManage userManage){
        return userService.login(userManage);
    }

    @RequestMapping("searchCustomerService")
    public List<ServiceConcern> searchCustomerService(@RequestBody ServiceConcern serviceConcern){
        return userService.searchCustomerService(serviceConcern);
    }
}
