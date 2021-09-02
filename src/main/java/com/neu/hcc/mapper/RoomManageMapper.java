package com.neu.hcc.mapper;

import com.neu.hcc.model.RoomManage;

import java.util.List;

public interface RoomManageMapper {

    List<RoomManage> searchRooms();

    void insertRoom(RoomManage roomManage);
}
