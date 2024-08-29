package com.markelova.seaport.entity;

import com.markelova.seaport.util.GeneratorInt;

public class Warehouse {
    private static final int MIN_CAPACITY = 4000;
    private static final int MAX_CAPACITY = 10000;
    private Dock dock;
    private int capacity;
    private int occupancy;

    public Warehouse(Dock dock) {
        this.dock = dock;
        dock.setWarehouse(this);
        this.capacity = GeneratorInt.generateRandomInt(MIN_CAPACITY, MAX_CAPACITY);
        this.occupancy = 0;
    }

    public Warehouse(Dock dock, int capacityWarehouse) {
        this.dock = dock;
        if (capacityWarehouse >= 4000 && capacityWarehouse <= 10000) {
            this.capacity = capacityWarehouse;
        }
        this.occupancy = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public Dock getDock() {
        return dock;
    }

    public void setDock(Dock dock) {
        this.dock = dock;
    }

    @Override
    public String toString() {
        return String.format("Warehouse | capacity: %4d | occupancy: %4d | dock: %d",
                this.capacity, this.occupancy, this.dock.getId());
    }
}
