package com.kodilla.rps;

import java.util.Random;

public class Computer implements GameInterface {
    @Override
    public String getName() {
        return "I'm your God.";

    }
    public String makeMove() {
        Random random = new Random();
        Integer computerMove = random.nextInt(5) + 1;
        return computerMove.toString();

    }
}