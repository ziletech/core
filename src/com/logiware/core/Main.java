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
        Main main = new Main();
        main.windowProperty(office);
        main.fanProperty(office);

    }

    public void windowProperty(Office office) {
//        Office office = new Office("Logisoftware");

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
        System.out.println("ToString Method " + office);


    }

    public void fanProperty(Office office) {
//        Office office = new Office("Logisoftware");        
        Fan fanOne = new Fan();
        fanOne.setBrand("Usha");
        fanOne.setType("Wall Fan");
        fanOne.setNumber(200);

        Fan fanTwo = new Fan();
        fanTwo.setBrand("Philips");
        fanTwo.setType("Table Fan");
        fanTwo.setNumber(2040);

        office.addFan(fanOne);
        office.addFan(fanTwo);
        for (Fan fan : office.getFanList()) {
            System.out.println(fan.getBrand());
            System.out.println(fan.getType());
            System.out.println(fan.getNumber());
        }
    }
}
