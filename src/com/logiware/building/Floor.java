package com.logiware.building;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Floor {
    private String name;
    private List<Flat> flatList;

    public Floor() {
        this.name = name;
        this.flatList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flat> getFlatList() {
        return flatList;
    }

    public void setFlatList(List<Flat> flatList) {
        this.flatList = flatList;
    }

    public void addFlatList(Flat flat) {
        this.flatList.add(flat);
    }

}
