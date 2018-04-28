package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan.next();

        GameState gameState = new GameState(0,0,0);
        GameField gameField = new GameField();
        //GameState gameState = gameField.Play();

                System.out.println("Hi "+name+". Welcome to the Game: Rock, Scissors, Paper. Please enter how many rounds it is necessary to win the game? :");
        int numberOfWins = scan.nextInt();
        int c =0;
        int d = 0;
        //gameState.intro();
        while(numberOfWins>=c||numberOfWins>=d) {
            gameField.Play();
            c = gameField.Play().getUserPoints();
            d = gameField.Play().getComputerPoints();
            gameState.printResult();
        }
        gameField.choice();
        scan.close();
    }
}