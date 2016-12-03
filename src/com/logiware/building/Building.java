package com.logiware.building;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Building {

    private String name;

    private List<Floor> floorList;   

    public Building(String name) {
        this.name = name;
        this.floorList = new ArrayList<>();        
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }
    
    public void addFloorList(Floor floor){
    this.floorList.add(floor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   

}
