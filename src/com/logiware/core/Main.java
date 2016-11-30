package com.logiware.core;

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
        
        
        
        
         //create new object of Chair
        Chair chair = new Chair();
        chair.setColor("Red");
        chair.setHeight(10);
        chair.setWidth(20);
        
        //add window to window list
        office.getChairList().add(chair);
       
        office.addChair(chair);
        
        //Print company name
        System.out.println("Windows " + office.getWindowList());
         System.out.println("Chair " + office.getChairList());
       
    }
    
}
