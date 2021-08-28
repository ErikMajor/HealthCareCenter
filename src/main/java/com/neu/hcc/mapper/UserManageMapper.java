package com.neu.hcc.mapper;

import com.neu.hcc.model.UserManage;
import java.util.List;

public interface UserManageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserManage record);

    UserManage selectByPrimaryKey(Integer id);

    List<UserManage> selectAll();

    int updateByPrimaryKey(UserManage record);
}