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
        
        //add chair to chair list
        office.getChairList().add(chair);       
        office.addChair(chair);
        
        
         //create new object of LapTop
        Laptop laptop = new Laptop();
        laptop.setName("ASUS");
        laptop.setSize(16.5);  
        laptop.setHardDisk("500GB");
        laptop.setProcessor("CORE i3");
        laptop.setRam("4GB");
        laptop.setDvdWriter("ASUSDVDWriter");      
   
        
        //add Laptop to Laptop list
        office.getLaptopList().add(laptop);
        office.addLaptop(laptop);       
        
            
        //Print company name
         System.out.println("Windows " + office.getWindowList());
         System.out.println("Chair " + office.getChairList());
         System.out.println("Laptop " + office.getLaptopList());
         System.out.println("ToString Method "+ office);
         
//         
//           for(Laptop laoptop1:office.getLaptopList()){
//               System.out.println("Laptop Name"+laoptop1.getName());
//               System.out.println("Laptop DVD Writer"+laoptop1.getDvdWriter());
//               System.out.println("Laptop Processor"+laoptop1.getProcessor());
//               System.out.println("Laptop Ram"+laoptop1.getRam());
//               System.out.println("Laptop Size"+laoptop1.getSize());
//               System.out.println("Laptop HardDisk"+laoptop1.getHardDisk());
//            }
         
         
         
         
    }
    
}
