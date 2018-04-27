package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
       // Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan.next();

        boolean end2 = false;
        GameState gameState = new GameState();
        Contestor player = new Player();
        Contestor computer = new Computer();
        GameField gameField = new GameField();

        MAIN_LOOP:
        while(!end2) {
            gameState.Intro();

            player.makeMove();

            computer.makeMove();
            gameField.Play(player, computer, gameState);
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Please enter X - exit game; N - rerun the game");
            String userChoice2 = scan2.next();
            if (userChoice2.equals("x")) {
                System.out.println("Do you really want to quit? Please enter y or n");
                userChoice2 = scan2.next();
                if (userChoice2.equals("y")) {
                    end2=true;
                    System.out.println("You have played: " + gameField.getCounterOfRounds() + " times. You have won: " + gameField.getUserPoints() + " rounds. Computer has won: " + gameField.getComputerPoints() + " rounds.");
                    if (gameField.getUserPoints() > gameField.getComputerPoints()) {
                        System.out.println("Congratulations! You have won the game!");
                    } else if (gameField.getUserPoints() == gameField.getComputerPoints()) {
                        System.out.println("It's a tie");
                    } else {
                        System.out.println("You have lost the game.");
                    }
                }
            }
            if (userChoice2.equals("n")) {
                System.out.println("Do you really want to rerun game? Please enter y or n");
                userChoice2 = scan2.next();
                if (userChoice2.equals("y")) {

                    end2=false;

                    continue MAIN_LOOP;
                }
            }
        }
        scan.close();
    }
}
//jedna petla while(state.rounds<wantedrounmds)