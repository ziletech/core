package com.logiware.building;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author omi
 */
public class Building {

    private String name;
    private List<Floor> floorList;
    private List<Item> itemList;
    
    public Building(String name) {
        this.name = name;
        this.floorList = new ArrayList<>();
        
        this.itemList= new ArrayList<>();
       
    }   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    } 
   
     public void addFloor(Floor floor){
        this.floorList.add(floor);
    }   
  }
