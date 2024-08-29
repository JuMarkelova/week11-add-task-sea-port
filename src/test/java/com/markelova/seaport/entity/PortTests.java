package com.markelova.seaport.entity;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PortTests {
    @Test
    public void createPort() {
        Port port = new Port("The Best");
        Assert.assertEquals(port.getName(), "The Best", "Wrong name");
    }
}
