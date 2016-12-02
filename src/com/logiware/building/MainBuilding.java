package com.logiware.building;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author omi
 */
public class MainBuilding {
      
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);  
       Building building=new Building("Casino Royale");
     
      //create new object of Flat
       Floor floor1 =new Floor();
       floor1.setName("GFloor");
       Floor floor2 =new Floor();
       floor2.setName("FFloor");
       Floor floor3 =new Floor();
       floor3.setName("SFloor");
       Floor floor4 =new Floor();
       floor4.setName("FFFloor");
       building.addFloor(floor1);
       building.addFloor(floor2);
       building.addFloor(floor3);
       building.addFloor(floor4);
       
       Flat flat1=new Flat();
       flat1.setName("1BHK");
       Flat flat2=new Flat();
       flat2.setName("2BHK");
       Flat flat3=new Flat();
       flat3.setName("3BHK");
       //GFloor have 3 different type of Flats
        floor1.addFlat(flat1);
        floor1.addFlat(flat2);
        floor1.addFlat(flat3);
        
      //FFloor have 2 different type of Flats          
        floor2.addFlat(flat2);
        floor2.addFlat(flat3);
      //SFloor have 2 different type of Flats     
        floor3.addFlat(flat2);
        floor3.addFlat(flat3);
      
        
       //Room Name and Type  
        Room room1=new Room();
        room1.setName("2Room");
        room1.setType("Deluxe");
        
        Room room2=new Room();
        room2.setName("3Room");
        room2.setType("Deluxe");
        
        
        //Add in list 
        flat1.addRoom(room1);
        flat2.addRoom(room2);
        flat3.addRoom(room2);
        
        //Item Name and Type  
        Item item1=new Item();
        item1.setName("Fan");
        item1.setType("Electronic");
        
        Item item2=new Item();
        item2.setName("AC");
        item2.setType("Electronic");
        
         //Add in list 
        room1.addItem(item1);
        room2.addItem(item2);
         
        //calling the Method
        MainBuilding mainBuilding=new MainBuilding();
        mainBuilding.printAll(building,sc);
        
        
      }
    
    
    public void printAll(Building building,Scanner sc){
        while(true){            
        System.out.println("Building Name :- " + building.getName());
        System.out.println("Enter Floor Name : -");  
        String name=sc.next(); 
         
        for(Floor floorF:building.getFloorList()){
            if(floorF.getName().equals(name)){
             for(Flat flatF:floorF.getFlatList()){  
             System.out.println("Flat Name : "+flatF.getName());
             for(Room roomR:flatF.getRoomList()){
                 System.out.println("Room Name : "+roomR.getName()); 
                 System.out.println("Room Type : "+roomR.getType());
                for(Item itemI:roomR.getItemList()){  
                 System.out.println("Item Name : "+itemI.getName()); 
                 System.out.println("Item Type : "+itemI.getType());
                 System.out.println("**************************");
                 System.out.println("____________________________");
                }
              }//Room close
            }//Flat close
          }//IF close
        }//Floor
      }//while close
    }
     
}