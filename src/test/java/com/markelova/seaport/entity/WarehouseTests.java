package com.markelova.seaport.entity;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WarehouseTests {
    @Test
    public void createWarehouse() {
        Dock dock = new Dock();
        Warehouse warehouse = new Warehouse(dock);
        Warehouse warehouse1 = new Warehouse(dock, 2000);
        System.out.println(dock);
        System.out.println(warehouse1);
        System.out.println(warehouse);
        Assert.assertTrue(warehouse.getCapacity() >= 4000 && warehouse.getCapacity() <= 10000,
                "Wrong capacity");
        Assert.assertEquals(warehouse1.getCapacity(), 0, "Wrong capacity");
    }
}