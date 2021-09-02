package com.neu.hcc.service;

import com.neu.hcc.model.BedManage;
import com.neu.hcc.model.Checkin;

import java.util.List;

public interface CustomerService {
    List<Checkin> selectAll();

    List<Checkin> queryUser(Checkin checkin);

    void updateRoomId(BedManage bedManage);
}
