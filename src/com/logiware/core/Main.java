package com.logiware.core;
import java.util.*;

/**
 *
 * @author user
 */
public class Main {
    
    public static void main(String[] args) {
        Office office = new Office("Logisoftware");
        System.out.println("Office Name : " + office.getName());
        //create new object of Window
        Window window = new Window();
        window.setColor("Red");
        window.setHeight(10);
        window.setWidth(20);
        
        //add window to window list
        office.getWindowList().add(window);
        office.getWindowList().add(window);
        office.addWindow(window);
        
        //Print company name
        System.out.println("Windows " + office.getWindowList());
        
        //====== Creating new Fan boject
        
        Fan fanOne = new Fan();
        fanOne.setBrand("Usha");
        fanOne.setType("Wall Fan");
        fanOne.setNumber(200);
        
       // Creating Second Fan Object
         Fan fanTwo = new Fan();
         
         fanTwo.setBrand("Philips");
         fanTwo.setType("Table Fan");
         fanTwo.setNumber(2040);
         
        // Adding Fan in Office 
        
        office.addFan(fanOne);
        office.addFan(fanTwo);
        
        // Print Fans List 
        // System.out.println("Fans "+ office.getFanList());
        
         for(Fan obj:office.getFanList()) { 
            System.out.println(obj.getBrand());
            System.out.println(obj.getType());
            System.out.println(obj.getNumber());
         }
         
        
        
       
    }
    
}
