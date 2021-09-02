package com.neu.hcc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.neu.hcc.mapper.ServiceConcernMapper;
import com.neu.hcc.mapper.UserManageMapper;
import com.neu.hcc.model.ServiceConcern;
import com.neu.hcc.model.UserManage;
import com.neu.hcc.service.UserService;
import com.neu.hcc.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public List<ServiceConcern> selectAllByCondition(ServiceConcern serviceConcern) {
        System.out.println(serviceConcernMapper.searchCustomerService(serviceConcern).get(0).getCustomerName()+"测试");
        return serviceConcernMapper.searchCustomerService(serviceConcern);
    }

    @Override
    public PageInfo<UserManage> queryAll(UserManage userManage, Integer currPage) {
        if (currPage == null)
            currPage = 1;
        PageHelper.startPage(currPage, Define.ADMIN_PAGE_SIZE);
        PageInfo<UserManage> pageInfo = new PageInfo<>(userManageMapper.selectAllByCondition(userManage));
        return pageInfo;
    }

    @Override
    public List<UserManage> selectAll() {
        return userManageMapper.selectAll();
    }

    @Override
    public void del(Integer id) {
        userManageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(UserManage userManage) {
        userManage.setUpdateDate(new Date());
        userManageMapper.updateByPrimaryKey(userManage);
    }
}
