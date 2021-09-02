package com.neu.hcc.service;

import com.neu.hcc.model.BedManage;
import com.neu.hcc.model.RoomManage;

import java.util.List;

public interface BedService {
    List<RoomManage> searchRooms();

    List<BedManage> searchBeds(BedManage bedManage);

    String addCustomerBed(BedManage bedManage);

    List<BedManage> searchCustomerId();

}
