package com.neu.hcc.service;

import com.neu.hcc.model.UserManage;

import java.util.List;

public interface UserService {
    String register(UserManage userManage);

    String login(UserManage userManage);
}
