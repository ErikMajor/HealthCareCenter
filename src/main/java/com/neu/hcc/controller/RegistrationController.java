package com.neu.hcc.controller;

import com.neu.hcc.model.OutRegistration;
import com.neu.hcc.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: YuCong
 * @date: 2021.8.29
 * @description: 外出
 */


@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping("selById")
    @ResponseBody
    public Map<String, Object> selById(@RequestParam(value = "id", defaultValue = "1", required = true)Integer id) {
        System.out.println(id);
        Map<String, Object> res = new HashMap<>();
        res.put("registration", registrationService.selByIdRecent(id));
        return res;
    }

    @RequestMapping("out")
    @ResponseBody
    public Map<String, Object> out(@RequestBody OutRegistration outRegistration) {
        System.out.println(outRegistration.toString());
        Map<String, Object> res = new HashMap<>();
        int rows = registrationService.insert(outRegistration);
        System.out.println("last_insert_id:" + outRegistration.getId());
        res.put("id", outRegistration.getId());
        res.put("state", "true");
        return res;
    }

    @RequestMapping("back")
    @ResponseBody
    public Map<String, Object> back(@RequestBody OutRegistration outRegistration) {
        System.out.println(outRegistration.toString());
        Map<String, Object> res = new HashMap<>();
        int rows = registrationService.update(outRegistration);
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
        Map<String, Object> res = new HashMap<>();
        int rows = registrationService.delete(id);
        if (rows == 0) {
            res.put("state", "false");
            return res;
        }
        res.put("state", "true");
        return res;
    }
}
