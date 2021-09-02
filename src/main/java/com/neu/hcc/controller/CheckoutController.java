package com.neu.hcc.controller;

import com.neu.hcc.model.Checkout;
import com.neu.hcc.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 退住
 */


@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    @Autowired
    private CheckoutService checkoutService;

    @RequestMapping("insert")
    @ResponseBody
    public Map<String, Object> insert(@RequestBody Checkout checkout){
        System.out.println(checkout.toString());
        Map<String, Object> res = new HashMap<>();
        int rows = checkoutService.insert(checkout);
        if (rows == 0) {
            res.put("state", "false");
            return res;
        }
        res.put("state", "true");
        return res;
    }

    @RequestMapping("record")
    @ResponseBody
    public Map<String, Object> record(@RequestParam(value = "id", defaultValue = "1", required = true)Integer id) {
        Map<String, Object> res = new HashMap<>();
        res.put("record", checkoutService.selByIdRecent(id));
        return res;
    }

    @RequestMapping("delete")
    @ResponseBody
    public Map<String, Object> delete(@RequestParam(value = "id", required = true) Integer id) {
        Map<String, Object> res = new HashMap<>();
        int rows = checkoutService.delete(id);
        if (rows == 0) {
            res.put("state", "false");
            return res;
        }
        res.put("state", "true");
        return res;
    }

    @RequestMapping("update")
    @ResponseBody
    public Map<String, Object> update(@RequestBody Checkout checkout) {
        System.out.println(checkout.toString());
        Map<String, Object> res = new HashMap<>();
        int rows = checkoutService.update(checkout);
        if (rows == 0) {
            res.put("state", "false");
            return res;
        }
        res.put("state", "true");
        return res;
    }
}
