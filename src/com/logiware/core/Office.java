package com.logiware.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Office {

    private String name;
    private List<Window> windowList;
    private ArrayList<Fan> fanList;
    private List<Chair> chairList;
    private List<Laptop> laptopList;

    public Office(String name) {
        this.name = name;
        this.windowList = new ArrayList<>();
        this.fanList = new ArrayList<>();
        this.chairList = new ArrayList<>();
        this.laptopList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Window> getWindowList() {
        return windowList;
    }

    public void setWindowList(List<Window> windowList) {
        this.windowList = windowList;
    }

    public void addWindow(Window window) {
        this.windowList.add(window);
    }

    public List<Chair> getChairList() {
        return chairList;
    }

    public void setChairList(List<Chair> chairList) {
        this.chairList = chairList;
    }

    public void addChair(Chair chair) {
        this.chairList.add(chair);
    }

    public ArrayList<Fan> getFanList() {
        return fanList;
    }

    public void setFanList(ArrayList<Fan> fanList) {
        this.fanList = fanList;
    }

    public void addFan(Fan fan) {
        this.fanList.add(fan);
    }

    public List<Laptop> getLaptopList() {
        return laptopList;
    }

    public void setLaptopList(List<Laptop> laptopList) {
        this.laptopList = laptopList;
    }

    public void addLaptop(Laptop laptop) {
        this.laptopList.add(laptop);
    }

    @Override
    public String toString() {
        return "Office{" + "name=" + name + ", windowList=" + windowList + ", chairList=" + chairList + ", laptopList=" + laptopList + '}';
    }

}
