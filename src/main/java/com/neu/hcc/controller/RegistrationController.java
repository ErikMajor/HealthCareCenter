package com.neu.hcc.controller;

import com.neu.hcc.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
