package com.neu.hcc.controller;

import com.neu.hcc.model.BedManage;
import com.neu.hcc.model.Checkin;
import com.neu.hcc.model.MealCalendar;
import com.neu.hcc.service.CustomerService;
import com.neu.hcc.service.MealService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customerManage")
public class CustomerController {
    @Resource
    private CustomerService customerService;

    @RequestMapping("selectAllCustomer")
    public List<Checkin> selectAll(){
        return customerService.selectAll();
    }

    @RequestMapping("queryUser")
    public List<Checkin> queryUser(@RequestBody Checkin checkin){
        return customerService.queryUser(checkin);
    }

    @RequestMapping("updateRoomId")
    public void updateRoomId(@RequestBody BedManage bedManage){
        System.out.println(bedManage.getRoomNumber());
        customerService.updateRoomId(bedManage);
    }
}
