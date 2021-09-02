package com.neu.hcc.model;

public class RoomManage {

    private int id;
    private String roomStatus;
    private int remainBeds;
    private int occupiedBeds;
    private int totalBeds;

    public int getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(int totalBeds) {
        this.totalBeds = totalBeds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public int getRemainBeds() {
        return remainBeds;
    }

    public void setRemainBeds(int remainBeds) {
        this.remainBeds = remainBeds;
    }

    public int getOccupiedBeds() {
        return occupiedBeds;
    }

    public void setOccupiedBeds(int occupiedBeds) {
        this.occupiedBeds = occupiedBeds;
    }
}
