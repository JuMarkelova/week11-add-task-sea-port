package com.markelova.seaport.entity;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DockTests {
    @Test
    public void createDock() {
        Port port = new Port("Port");
        Dock dock1 = new Dock(port);
        Dock dock2 = new Dock(port);
        System.out.println(dock1);
        System.out.println(dock2);
        System.out.println(port);
        Assert.assertEquals(dock1.getId(), 1, "Wrong id");
        Assert.assertEquals(dock2.getId(), 2, "Wrong id");
    }
}