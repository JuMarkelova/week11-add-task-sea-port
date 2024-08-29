package com.markelova.seaport.entity;

import java.util.ArrayList;
import java.util.List;

public class Port {
    private String name;
    private List<Dock> docks = new ArrayList<>();

    public Port() {
    }

    public Port(String name) {
        this.name = name;
    }

    public Port(String name, List<Dock> docks) {
        this.name = name;
        this.docks = docks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dock> getDocks() {
        return this.docks;
    }

    public void setDocks(List<Dock> docks) {
        this.docks = docks;
    }

    public void addDock(Dock dock) {
        this.docks.add(dock);
    }

    @Override
    public String toString() {
        return String.format("Port | name: %s | docks: %s", this.name, this.docks);
    }
}