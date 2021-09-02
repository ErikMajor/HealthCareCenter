package com.neu.hcc.service.impl;

import com.neu.hcc.mapper.BedManageMapper;
import com.neu.hcc.mapper.CheckinMapper;
import com.neu.hcc.model.BedManage;
import com.neu.hcc.model.Checkin;
import com.neu.hcc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImpl implements CustomerService {

    @Autowired
    private CheckinMapper checkinMapper;

    @Autowired
    private BedManageMapper bedManageMapper;

    @Override
    public List<Checkin> selectAll() {
        return checkinMapper.selectAll();
    }

    @Override
    public List<Checkin> queryUser(Checkin checkin) {
        return checkinMapper.queryUser(checkin);
    }

    @Override
    public void updateRoomId(BedManage bedManage) {
        int roomId = bedManage.getRoomNumber();
        int roomNumber = bedManage.getRoomNumber();
        System.out.println(roomId+roomNumber);
        checkinMapper.updateRoomId(roomId, roomNumber);
    }
}
