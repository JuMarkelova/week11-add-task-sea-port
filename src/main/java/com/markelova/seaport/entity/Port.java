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
        setDocksPort(docks);
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
        setDocksPort(docks);
    }

    public void addDock(Dock dock) {
        this.docks.add(dock);
        dock.setPort(this);
    }

    private void setDocksPort(List<Dock> docks) {
        docks.stream()
                .filter(it -> it.getPort() == null)
                .forEach(it -> it.setPort(this));
    }

    @Override
    public String toString() {
        return String.format("Port | name: %s | docks: %s", this.name, this.docks);
    }
}