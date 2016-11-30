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

    public Office(String name) {
        this.name = name;
        this.windowList = new ArrayList<>();
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
    
    public void addWindow(Window window){
        this.windowList.add(window);
    }

}
