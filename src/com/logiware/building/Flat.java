package com.logiware.building;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Flat {

    private Integer flatNumber;

    private List<Room> roomList;

    public Flat() {
        this.flatNumber = flatNumber;
        this.roomList = new ArrayList<>();
    }

    public Integer getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(Integer flatNumber) {
        this.flatNumber = flatNumber;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public void addRoomList(Room room) {
        this.roomList.add(room);
    }

}
