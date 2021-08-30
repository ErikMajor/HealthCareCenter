package com.neu.hcc.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.Checkin;
import com.neu.hcc.service.CheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 入住
 */


@RestController
@RequestMapping("/checkin")
public class CheckinController {

    @Autowired
    private CheckinService checkinService;

    @RequestMapping("selAll/{currentPage}")
    @ResponseBody
    public Map<String, Object> selAll(@PathVariable(value = "currentPage") Integer currentPage) {
        Map<String, Object> res = new HashMap<>();
        PageInfo<Checkin> customers = checkinService.selAll(currentPage);
        res.put("customers", customers.getList());
        res.put("pages", customers.getPages());
        return res;
    }

    @RequestMapping("queryByName/{currentPage}")
    @ResponseBody
    public Map<String, Object> queryByName(@RequestParam(value = "name", defaultValue = "", required = true) String name, @PathVariable(value = "currentPage") Integer currentPage) {
        System.out.println(name);
        Map<String, Object> res = new HashMap<>();
        PageInfo<Checkin> customers = checkinService.selByName(name, currentPage);
        res.put("customers", customers.getList());
        res.put("pages", customers.getPages());
        return res;
    }

}
