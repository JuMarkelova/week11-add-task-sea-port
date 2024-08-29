package com.markelova.seaport.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GeneratorNumberTests {
    @Test
    public void testGenerator() {
        GeneratorInt generator = new GeneratorInt();
        int randomInt = generator.generateRandomInt(1000, 1200);
        System.out.println(randomInt);
        Assert.assertTrue(randomInt >= 1000);
        Assert.assertTrue(randomInt <= 1200);
    }
}