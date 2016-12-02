package com.logiware.building;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {

        Building building = new Building("Ratan Palace");
        System.out.println("Building Namne :" + building.getName());

        Floor floor = new Floor();
        Main main = new Main();
        Flat flat = new Flat();
        main.print(building, floor, main, flat);

    }

    public void print(Building building, Floor floor, Main main, Flat flat) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter flor 3,4 or 5");
            int number = input.nextInt();

            if (number == 3) {
                main.thirdfloor();                
            }

            if (number == 4) {
                main.fourthFloor();
            }
            
            if(number == 5){
            main.fifthFloor();
            }
        }
    }

    public void thirdfloor() {
        Floor floorOfThird =new Floor();
        Flat flatOne = new Flat();
        flatOne.setFlatNumber(301);

        Flat flatTwo = new Flat();
        flatTwo.setFlatNumber(302);

        Flat flatThree = new Flat();
        flatThree.setFlatNumber(303);
        
        
        floorOfThird.addFlatList(flatOne);
        floorOfThird.addFlatList(flatTwo);
        floorOfThird.addFlatList(flatThree);
        
           for (Flat flat : floorOfThird.getFlatList()) {
            System.out.println("Flat List :" + flat.getFlatNumber());
        }

    }

    public void fourthFloor() {
        Floor floorOffourth=new Floor();
        Flat flatFour = new Flat();
        flatFour.setFlatNumber(401);

        Flat flatSix = new Flat();
        flatSix.setFlatNumber(402);

        Flat flatSeven = new Flat();
        flatSeven.setFlatNumber(403);

        floorOffourth.addFlatList(flatFour);
        floorOffourth.addFlatList(flatSix);
        floorOffourth.addFlatList(flatSeven);

        for (Flat flat : floorOffourth.getFlatList()) {
            System.out.println("Flat List :" + flat.getFlatNumber());
        }
    }
    
    public void fifthFloor(){
        Floor floorofFifth = new Floor();
        Flat flatEight = new Flat();
        flatEight.setFlatNumber(501);

        Flat flatNine = new Flat();
        flatNine.setFlatNumber(502);

        Flat flatTen = new Flat();
        flatTen.setFlatNumber(503);

        floorofFifth.addFlatList(flatEight);
        floorofFifth.addFlatList(flatNine);
        floorofFifth.addFlatList(flatTen);
        
         for (Flat flat : floorofFifth.getFlatList()) {
            System.out.println("Flat List :" + flat.getFlatNumber());
        }
    }

}
