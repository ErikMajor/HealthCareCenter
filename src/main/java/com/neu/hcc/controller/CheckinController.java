package com.neu.hcc.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.Checkin;
import com.neu.hcc.service.CheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public PageInfo<Checkin> selAll(@PathVariable(value = "currentPage") Integer currentPage) {
        return checkinService.selAll(currentPage);
    }

    @RequestMapping("queryByName/{currentPage}")
    public PageInfo<Checkin> queryByName(@RequestParam(value = "name", defaultValue = "", required = true) String name, @PathVariable(value = "currentPage") Integer currentPage) {
        return checkinService.selByName(name, currentPage);
    }

}
