package com.logiware.building;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omi
 */
public class Floor {
   
    private String name;
    private List<Flat> flatList;

     public Floor() {       
        this.flatList = new ArrayList<>();
    }   
    public List<Flat> getFlatList() {
        return flatList;
    }

    public void setFlatList(List<Flat> flatList) {
        this.flatList = flatList;
    }
    
    
       
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
      public void addFlat(Flat flat){
        this.flatList.add(flat);
    }   
      
     
    
}
