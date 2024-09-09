package com.markelova.seaport.entity;

import com.markelova.seaport.util.GeneratorInt;

public class Ship implements Runnable {
    private static Long count = 0L;
    private final Long ID;
    private int capacity;
    private int occupancy;

    Ship() {
        this.ID = ++count;
        this.occupancy = 0;
        this.capacity = GeneratorInt.generateRandomInt(200, 500);
    }

    Ship(int capacity) {
        this.ID = ++count;
        this.occupancy = 0;
        this.capacity = capacity;
    }

    public Long getID() {
        return this.ID;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        if (capacity >= occupancy) {
            this.occupancy = occupancy;
        }
    }

    public Long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("Ship | ID: %d | capacity: %d | occupancy: %d", ID, capacity, occupancy);
    }

    @Override
    public void run() {

    }
}
