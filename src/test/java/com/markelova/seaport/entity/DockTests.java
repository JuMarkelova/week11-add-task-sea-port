package com.markelova.seaport.entity;

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

    }
}
