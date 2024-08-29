package com.markelova.seaport.util;

import java.util.concurrent.ThreadLocalRandom;

public class GeneratorInt {
    public int generateRandomInt(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to + 1);
    }
}