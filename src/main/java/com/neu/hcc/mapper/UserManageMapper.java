package com.neu.hcc.mapper;

import com.neu.hcc.model.UserManage;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserManageMapper {
    int deleteByPrimaryKey(Integer id);

    void insert(UserManage record);

    UserManage selectByPrimaryKey(Integer id);

    List<UserManage> selectAll();

    int updateByPrimaryKey(UserManage record);

    List<UserManage> login(UserManage record);
}
