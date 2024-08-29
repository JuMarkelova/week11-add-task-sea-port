package com.markelova.seaport.entity;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PortTests {
    @Test
    public void createPortWithName() {
        Port port = new Port("The Best");
        System.out.println(port);
        Assert.assertEquals(port.getName(), "The Best", "Wrong name");
    }

    @Test
    public void createPortWithDocs() {
        Dock dock1 = new Dock();
        Dock dock2 = new Dock();
        List<Dock> docks = new ArrayList<>();
        docks.add(dock1);
        docks.add(dock2);
        Port portWithDocks = new Port("Port With Docks", docks);
        System.out.println(portWithDocks);
        Assert.assertEquals(portWithDocks.getDocks().size(), 2, "Wrong number of docks");
        Assert.assertEquals(dock1.getPort(), portWithDocks, "Wrong port");
    }
}