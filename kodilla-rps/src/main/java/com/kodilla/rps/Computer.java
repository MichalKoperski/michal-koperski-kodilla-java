package com.kodilla.rps;

import java.util.Random;

public class Computer implements Contestor {

    Random randomGenerator = new Random();
    public int makeMove() {
        return randomGenerator.nextInt(100);
    }

}
