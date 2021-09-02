package com.neu.hcc.service.impl;

import com.google.gson.Gson;
import com.neu.hcc.mapper.NursingLevelMapper;
import com.neu.hcc.mapper.ServiceConcernMapper;
import com.neu.hcc.mapper.UserManageMapper;
import com.neu.hcc.model.ServiceConcern;
import com.neu.hcc.model.UserManage;
import com.neu.hcc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserManageMapper userManageMapper;

    @Autowired
    private ServiceConcernMapper serviceConcernMapper;

    @Override
    public String register(UserManage userManage) {
        userManageMapper.insert(userManage);
        Map<String,Object> result = new HashMap<>();
        result.put("state", "success");
        return new Gson().toJson(result);
    }

    @Override
    public String login(UserManage userManage) {
        List<UserManage> list = userManageMapper.login(userManage);
        Map<String,Object> result = new HashMap<>();
        if(list.size()!=0){
            result.put("state", "success");
            return new Gson().toJson(result);
        }else {
            result.put("state", "failed");
            return new Gson().toJson(result);
        }
    }

    @Override
    public List<ServiceConcern> searchCustomerService(ServiceConcern serviceConcern) {
        System.out.println(serviceConcernMapper.searchCustomerService(serviceConcern).get(0).getCustomerName()+"测试");
        return serviceConcernMapper.searchCustomerService(serviceConcern);
    }
}
