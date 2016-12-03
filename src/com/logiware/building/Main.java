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
        main.buidingInfo(building);
        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter Floor Number 3,4, 5 Or Flat Number");
            int number = input.nextInt();

            if (number == 3) {
                main.thirdfloor();
            }

            if (number == 4) {
                main.fourthFloor();
            }

            if (number == 5) {
                main.fifthFloor();
            }
            if (number == 301) {
                main.flat301();
            }

            if (number == 302) {
                main.flat302();
            }
            if (number == 303) {
                main.flat303();
            }

            if (number == 401) {
                main.flat401();
            }
            if (number == 402) {
                main.flat402();
            }
            if (number == 403) {
                main.flat403();
            }
        }
    }

    public void buidingInfo(Building building) {
        Floor thirdFloor = new Floor();
        thirdFloor.setName("3rd Floor");

        Floor fourthFloor = new Floor();
        fourthFloor.setName("4th Floor");

        Floor fifthFloor = new Floor();
        fifthFloor.setName("5th Floor !");
        fifthFloor.setName(" 5th Floor is under construction ");

        building.addFloorList(thirdFloor);
        building.addFloorList(fourthFloor);
        building.addFloorList(fifthFloor);

        for (Floor floor : building.getFloorList()) {
            System.out.println("Floor List : " + floor.getName());            
        }

    }

    public void thirdfloor() {
        Floor floorOfThird = new Floor();
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
        Floor floorOffourth = new Floor();
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

    public void fifthFloor() {
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

    public void flat301() {
        Flat flat = new Flat();

        Room bedRoom = new Room();
        bedRoom.setType("Bed Room");
        bedRoom.setNumber(1);

        Room kitchen = new Room();
        kitchen.setType("Kitchen");
        kitchen.setNumber(1);

        Room bathRoom = new Room();
        bathRoom.setType("Bath Room");
        bathRoom.setNumber(4);

        Room hallRoom = new Room();
        hallRoom.setType("Big Hall");
        hallRoom.setNumber(1);

        flat.addRoomList(bedRoom);
        flat.addRoomList(kitchen);
        flat.addRoomList(bathRoom);
        flat.addRoomList(hallRoom);

        for (Room roomInfo : flat.getRoomList()) {
            System.out.println("Room Type : " + roomInfo.getType());
            System.out.println("Room Number : " + roomInfo.getNumber());
        }

    }

    public void flat302() {
        Flat flat = new Flat();

        Room bedRoom = new Room();
        bedRoom.setType("Bed Room");
        bedRoom.setNumber(1);

        Room kitchen = new Room();
        kitchen.setType("Kitchen");
        kitchen.setNumber(1);

        Room bathRoom = new Room();
        bathRoom.setType("Bath Room");
        bathRoom.setNumber(3);

        Room hallRoom = new Room();
        hallRoom.setType("Big Hall");
        hallRoom.setNumber(1);

        flat.addRoomList(bedRoom);
        flat.addRoomList(kitchen);
        flat.addRoomList(bathRoom);
        flat.addRoomList(hallRoom);

        for (Room roomInfo : flat.getRoomList()) {
            System.out.println("Room Type : " + roomInfo.getType());
            System.out.println("Room Number : " + roomInfo.getNumber());
        }
    }

    public void flat303() {
        Flat flat = new Flat();

        Room bedRoom = new Room();
        bedRoom.setType("Bed Room");
        bedRoom.setNumber(1);

        Room kitchen = new Room();
        kitchen.setType("Kitchen");
        kitchen.setNumber(1);

        Room bathRoom = new Room();
        bathRoom.setType("Bath Room");
        bathRoom.setNumber(3);

        Room hallRoom = new Room();
        hallRoom.setType("Big Hall");
        hallRoom.setNumber(1);

        Room extraRoom = new Room();
        extraRoom.setType("Extra Room");
        extraRoom.setNumber(1);

        flat.addRoomList(bedRoom);
        flat.addRoomList(kitchen);
        flat.addRoomList(bathRoom);
        flat.addRoomList(hallRoom);
        flat.addRoomList(extraRoom);
        for (Room roomInfo : flat.getRoomList()) {
            System.out.println("Room Type : " + roomInfo.getType());
            System.out.println("Room Number : " + roomInfo.getNumber());
        }

    }

    public void flat401() {
        Flat flat = new Flat();

        Room bedRoom = new Room();
        bedRoom.setType("Bed Room");
        bedRoom.setNumber(1);

        Room kitchen = new Room();
        kitchen.setType("Kitchen");
        kitchen.setNumber(1);

        Room bathRoom = new Room();
        bathRoom.setType("Bath Room");
        bathRoom.setNumber(4);

        Room hallRoom = new Room();
        hallRoom.setType("Big Hall");
        hallRoom.setNumber(1);

        flat.addRoomList(bedRoom);
        flat.addRoomList(kitchen);
        flat.addRoomList(bathRoom);
        flat.addRoomList(hallRoom);

        for (Room roomInfo : flat.getRoomList()) {
            System.out.println("Room Type : " + roomInfo.getType());
            System.out.println("Room Number : " + roomInfo.getNumber());
        }
    }

    public void flat402() {
        Flat flat = new Flat();

        Room bedRoom = new Room();
        bedRoom.setType("Bed Room");
        bedRoom.setNumber(1);

        Room kitchen = new Room();
        kitchen.setType("Kitchen");
        kitchen.setNumber(1);

        Room bathRoom = new Room();
        bathRoom.setType("Bath Room");
        bathRoom.setNumber(3);

        Room hallRoom = new Room();
        hallRoom.setType("Big Hall");
        hallRoom.setNumber(1);

        flat.addRoomList(bedRoom);
        flat.addRoomList(kitchen);
        flat.addRoomList(bathRoom);
        flat.addRoomList(hallRoom);

        for (Room roomInfo : flat.getRoomList()) {
            System.out.println("Room Type : " + roomInfo.getType());
            System.out.println("Room Number : " + roomInfo.getNumber());
        }
    }
    
    public void flat403(){
        Flat flat = new Flat();

        Room bedRoom = new Room();
        bedRoom.setType("Bed Room");
        bedRoom.setNumber(1);

        Room kitchen = new Room();
        kitchen.setType("Kitchen");
        kitchen.setNumber(1);

        Room bathRoom = new Room();
        bathRoom.setType("Bath Room");
        bathRoom.setNumber(3);

        Room hallRoom = new Room();
        hallRoom.setType("Big Hall");
        hallRoom.setNumber(1);

        Room extraRoom = new Room();
        extraRoom.setType("Extra Room");
        extraRoom.setNumber(1);

        flat.addRoomList(bedRoom);
        flat.addRoomList(kitchen);
        flat.addRoomList(bathRoom);
        flat.addRoomList(hallRoom);
        flat.addRoomList(extraRoom);
        for (Room roomInfo : flat.getRoomList()) {
            System.out.println("Room Type : " + roomInfo.getType());
            System.out.println("Room Number : " + roomInfo.getNumber());
        }    
    }

}
