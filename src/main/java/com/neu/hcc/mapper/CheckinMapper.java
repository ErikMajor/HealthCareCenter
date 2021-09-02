package com.neu.hcc.mapper;

import com.neu.hcc.model.BedManage;
import com.neu.hcc.model.Checkin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Checkin record);

    Checkin selectByPrimaryKey(Integer id);

    List<Checkin> selectAll();

    List<Checkin> selectByName(String name);

    int updateByPrimaryKey(Checkin record);

    List<Checkin> queryUser(Checkin record);

    void updateRoomId(int roomId,int roomNumber);
}
