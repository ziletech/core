package com.logiware.building;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author omi
 */
public class Flat {
    private String name;
    private List<Room> roomList;      
    
    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
    
    public Flat() {       
        this.roomList = new ArrayList<>();
    }   
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      public void addRoom(Room room){
        this.roomList.add(room);
    }   
     
}
