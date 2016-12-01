package com.logiware.building;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author omi
 */
public class Building {

    private String name;
    private List<Flat> flatList;
    private List<Room> roomList;
    private List<Item> itemList;
    
    public Building(String name) {
        this.name = name;
        this.flatList = new ArrayList<>();
        this.roomList = new ArrayList<>();
        this.itemList= new ArrayList<>();
       
    }   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flat> getFlatList() {
        return flatList;
    }

    public void setFlatList(List<Flat> flatList) {
        this.flatList = flatList;
    }
   
     public void addFlat(Flat flat){
        this.flatList.add(flat);
    }
    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
     public void addRoom(Room  room){        
        this.roomList.add(room);
    }  

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
      public void addItem(Item item){        
        this.itemList.add(item);
    }  
    
    
    
}
