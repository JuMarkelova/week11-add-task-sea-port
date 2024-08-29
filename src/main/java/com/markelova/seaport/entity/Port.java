package com.markelova.seaport.entity;

public class Port {
    private String name;

    public Port() {
    }

    public Port(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Port | name: %s", this.name);
    }
}