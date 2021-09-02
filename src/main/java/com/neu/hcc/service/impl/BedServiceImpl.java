package com.neu.hcc.service.impl;

import com.google.gson.Gson;
import com.neu.hcc.mapper.BedManageMapper;
import com.neu.hcc.mapper.MealCalendarMapper;
import com.neu.hcc.mapper.RoomManageMapper;
import com.neu.hcc.model.BedManage;
import com.neu.hcc.model.RoomManage;
import com.neu.hcc.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BedServiceImpl implements BedService {
    @Autowired
    private RoomManageMapper roomManageMapper;

    @Autowired
    private BedManageMapper bedManageMapper;


    @Override
    public List<RoomManage> searchRooms() {

        for(int i = 0;i < roomManageMapper.searchRooms().size();i++){
            BedManage bedManage = new BedManage();
            RoomManage roomManage = new RoomManage();
            bedManage.setRoomNumber(roomManageMapper.searchRooms().get(i).getId());
            roomManage.setId(roomManageMapper.searchRooms().get(i).getId());
            roomManage.setTotalBeds(bedManageMapper.searchBeds(bedManage).size());
            int m=0,n=0;
            for(int j=0;j<bedManageMapper.searchBeds(bedManage).size();j++){
                if(bedManageMapper.searchBeds(bedManage).get(j).getBedStatus().equals("空闲")){
                    m++;
                }
                else{
                    n++;
                }
            }
            roomManage.setRemainBeds(m);
            roomManage.setOccupiedBeds(n);
            roomManageMapper.insertRoom(roomManage);
        }
        return roomManageMapper.searchRooms();
    }

    @Override
    public List<BedManage> searchBeds(BedManage bedManage) {
        return bedManageMapper.searchBeds(bedManage);
    }

    @Override
    public String addCustomerBed(BedManage bedManage) {
        bedManageMapper.addCustomerBed(bedManage);
        bedManageMapper.updateStatus("入住",bedManage.getParentId());
        Map<String,Object> result = new HashMap<>();
        result.put("state", "success");
        return new Gson().toJson(result);
    }

    @Override
    public List<BedManage> searchCustomerId() {
        return bedManageMapper.searchCustomerId("入住");
    }

}
