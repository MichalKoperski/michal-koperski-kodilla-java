package com.kodilla.rps;

import java.util.*;

public class GameState {
    int numberOfWins=0;
    Scanner scan = new Scanner(System.in);

    public int Intro() {
        System.out.println("Welcome to the Game: Rock, Scissors, Paper. Please enter how many rounds it is necessary to win the game? :");
        numberOfWins = scan.nextInt();
        return numberOfWins;
    }

}
