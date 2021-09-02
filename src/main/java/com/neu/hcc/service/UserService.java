package com.neu.hcc.service;

import com.github.pagehelper.PageInfo;
import com.neu.hcc.model.ServiceConcern;
import com.neu.hcc.model.UserManage;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    String register(UserManage userManage);

    String login(UserManage userManage);

    List<ServiceConcern> selectAllByCondition(ServiceConcern serviceConcern);

    PageInfo<UserManage> queryAll(UserManage userManage,Integer currPage);

    List<UserManage> selectAll();

    void del(Integer id);

    void update(UserManage userManage);


}
