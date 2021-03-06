package com.neu.hcc.controller;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.Checkin;
import com.neu.hcc.model.Customer;
import com.neu.hcc.service.CheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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

    @RequestMapping("selAll")
    @ResponseBody
    public Map<String, Object> selAll() {
        Map<String, Object> res = new HashMap<>();
        List<Checkin> customers = checkinService.selAll();
        res.put("customers", customers);
        return res;
    }

    @RequestMapping("selAllWithPage/{currentPage}")
    @ResponseBody
    public Map<String, Object> selAllWithPage(@PathVariable(value = "currentPage") Integer currentPage) {
        Map<String, Object> res = new HashMap<>();
        PageInfo<Checkin> customers = checkinService.selAllWithPage(currentPage);
        res.put("customers", customers.getList());
        res.put("pages", customers.getPages());
        return res;
    }

    @RequestMapping("queryListByName")
    @ResponseBody
    public Map<String, Object> queryByName(@RequestParam(value = "name", defaultValue = "", required = true) String name) {
        Map<String, Object> res = new HashMap<>();
        List<Customer> customers = checkinService.selListByName(name);
        res.put("customers", customers);
        return res;
    }

    @RequestMapping("queryByNameWithPage/{currentPage}")
    @ResponseBody
    public Map<String, Object> queryByNameWithPage(@RequestParam(value = "name", defaultValue = "", required = true) String name, @PathVariable(value = "currentPage") Integer currentPage) {
        System.out.println(name);
        Map<String, Object> res = new HashMap<>();
        PageInfo<Checkin> customers = checkinService.selByNameWithPage(name, currentPage);
        res.put("customers", customers.getList());
        res.put("pages", customers.getPages());
        return res;
    }

    @RequestMapping("updateCustomer")
    @ResponseBody
    public Map<String, Object> updateCustomer(@RequestBody Checkin checkin) {
        System.out.println(checkin.toString());
        Map<String, Object> res = new HashMap<>();
        int rows = checkinService.updateCustomer(checkin);
        if (rows == 0) {
            res.put("state", "false");
            return res;
        }
        res.put("state", "true");
        return res;
    }

    @RequestMapping("delete")
    @ResponseBody
    public Map<String, Object> delete(@RequestParam(value = "id", required = true) Integer id) {
        System.out.println(id);
        Map<String, Object> res = new HashMap<>();
        int rows = checkinService.deleteCheckin(id);
        if (rows == 0) {
            res.put("state", "false");
            return res;
        }
        res.put("state", "true");
        return res;
    }

    @RequestMapping("addCustomer")
    @ResponseBody
    public Map<String, Object> addCustomer(@RequestBody Checkin checkin) {
        System.out.println(checkin);
        Map<String, Object> res = new HashMap<>();
        int rows = checkinService.addCustomer(checkin);
        if (rows == 0) {
            res.put("state", "false");
            return res;
        }
        res.put("state", "true");
        return res;
    }

}
