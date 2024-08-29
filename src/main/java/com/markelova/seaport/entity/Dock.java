package com.markelova.seaport.entity;

public class Dock {
    private static Long count = 0L;
    private final Long id;
    private Port port;
    private Warehouse warehouse;

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

    public Warehouse getWarehouse() {
        return this.warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        if (this.port == null) {
            return String.format("\nDock | id: %d | port: undefined | has warehouse: %b",
                    this.id, this.warehouse != null);
        } else {
            return String.format("\nDock | id: %d | port: %s | has warehouse: %b",
                    this.id, this.port.getName(), this.warehouse != null);
        }
    }
}