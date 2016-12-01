package com.logiware.building;

/**
 *
 * @author omi
 */
public class MainBuilding {
    
    public static void main(String args[]){
        
      Building building=new Building("Casino Royale");
     
      //create new object of Flat
        Flat flat = new Flat();
        flat.setName("GFloor");
        Room room=new Room();
        room.setName("1001");
        room.setType("2 Person");        
        Item item=new Item();
        item.setName("Fan");
        item.setType("simple");
           
        
        //add list to list
        building.getFlatList().add(flat);
        building.getRoomList().add(room); 
        building.getItemList().add(item);
        building.addFlat(flat);   
        building.addRoom(room);       
        building.addItem(item);
       
        
        
        System.out.println("*********************"); 
        System.out.println("Name"+building.getName());
        System.out.println("Flat Name"+flat.getName());
        System.out.println("Room Name"+room.getName());
        System.out.println("Room Type"+room.getType());
        System.out.println("Item Name"+item.getName());
        System.out.println("Item Type"+item.getType());
        
        
        
        
        
        
    }
    
    
}
