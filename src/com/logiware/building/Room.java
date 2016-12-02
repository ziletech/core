package com.logiware.building;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omi
 */
public class Room {
    
    private String name;
    private String type;
    private List<Item> itemList;
    
    public Room() {       
        this.itemList= new ArrayList<>();       
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
