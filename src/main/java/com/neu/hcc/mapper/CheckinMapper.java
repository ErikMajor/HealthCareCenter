package com.neu.hcc.mapper;

import com.neu.hcc.model.Checkin;
import com.neu.hcc.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CheckinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Checkin record);

    Checkin selectByPrimaryKey(Integer id);

    List<Checkin> selectAll();

    List<Checkin> selectAll1();

    List<Checkin> selectByName(String name);

    int updateByPrimaryKey(Checkin record);

    List<Checkin> queryUser(Checkin record);

    void updateRoomId(int roomId,int roomNumber);

    List<Customer> selectListByName(String name);
}
