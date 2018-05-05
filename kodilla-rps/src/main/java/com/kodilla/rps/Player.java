package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements GameInterface {
    private String name;
    private List prepareAvailableMoves() {
        List<String> availableMoves = new ArrayList<>();
        availableMoves.add("1");
        availableMoves.add("2");
        availableMoves.add("3");
        availableMoves.add("4");
        availableMoves.add("5");
        availableMoves.add("x");
        availableMoves.add("n");
        return availableMoves;
    }

    public Player(String name) {

        this.name = name;
        prepareAvailableMoves();
    }

    @Override
    public String getName() {

        return name;
    }
    public String makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your move?");
        String playerMove = scanner.nextLine();
        while (!(prepareAvailableMoves().contains(playerMove))){

            System.out.println("Wrong number. You have to type 1, 2, 3, 4 or 5.");

            playerMove = scanner.nextLine();
        }

        return playerMove;

    }
}