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

    public void setPort(Port port) {
        this.port = port;
    }

    @Override
    public String toString() {
        if (this.port == null) {
            return String.format("Dock | id: %d | port: undefined", this.id);
        } else {
            return String.format("Dock | id: %d | port: %s", this.id, this.port.getName());
        }
    }
}