package com.neu.hcc.controller;

import com.neu.hcc.model.BedManage;
import com.neu.hcc.model.MealCalendar;
import com.neu.hcc.model.RoomManage;
import com.neu.hcc.service.BedService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bedManage")
public class BedController {
    @Resource
    private BedService bedService;

    @RequestMapping("searchRooms")
    public List<RoomManage> searchRooms(){
        return bedService.searchRooms();
    }

    @RequestMapping("searchBeds")
    public List<BedManage> searchBeds(@RequestBody BedManage bedManage){
        return bedService.searchBeds(bedManage);
    }

    @RequestMapping("addCustomerBed")
    public String addCustomerBed(@RequestBody BedManage bedManage){
        return bedService.addCustomerBed(bedManage);
    }


    @RequestMapping("searchCustomerId")
    public List<BedManage> searchCustomerId(){
        return bedService.searchCustomerId();
    }
}
