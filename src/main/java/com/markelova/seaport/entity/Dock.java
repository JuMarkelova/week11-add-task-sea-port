package com.markelova.seaport.entity;

public class Dock {
    private static Long count = 0L;
    private final Long id;
    private Port port;

    public Dock() {
        this.id = ++count;
    }

    public Dock(Port port) {
        this.id = ++count;
        this.port = port;
        port.addDock(this);
    }

    public Long getId() {
        return this.id;
    }

    public Port getPort() {
        return this.port;
    }

    @Override
    public String toString() {
        return String.format("Dock | id: %d | port: %s", this.id, this.port.getName());
    }
}