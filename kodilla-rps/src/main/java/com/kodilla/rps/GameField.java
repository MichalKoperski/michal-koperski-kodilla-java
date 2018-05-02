package com.kodilla.rps;

import java.util.Scanner;

public class GameField {

    int computerPoints=0;
    int userPoints=0;
    int counterOfRounds=0;


    GameState gamestate;
    public GameField() {

        this.gamestate=getGameState();
    }
    public GameState getGameState() {
        return gamestate;
    }

    Scanner scan = new Scanner(System.in);

    Contestor player = new Player();
    Contestor computer = new Computer();

    public GameState play() {
        counterOfRounds++;
        int a = player.makeMove();
        int b = computer.makeMove();
        if (a == 1) {
            if (b >= 50 && b < 75) {
                System.out.println("Computer has chosen rock. It's a tie");
            }
            if (b >= 0 && b < 25) {
                computerPoints++;
                System.out.println("Computer has chosen paper. You lose");
            }
            if (b >= 88 && b < 100) {
                userPoints++;
                System.out.println("Computer has chosen scissors. You win");
            }
            if (b >= 25 && b < 50) {
                computerPoints++;
                System.out.println("Computer has chosen spock. You lose");
            }
            if (b >= 75 && b < 88) {
                userPoints++;
                System.out.println("Computer has chosen lizard. You win");
            }
        }
        if (a == 2) {
            if (b >= 75 && b < 88) {
                userPoints++;
                System.out.println("Computer has chosen rock. You win");
            }
            if (b >= 50 && b < 75) {
                System.out.println("Computer has chosen paper. It's a tie");
            }
            if (b >= 0 && b < 25) {
                computerPoints++;
                System.out.println("Computer has chosen scissors. You lose");
            }
            if (b >= 88 && b < 100) {
                userPoints++;
                System.out.println("Computer has chosen spock. You win");
            }
            if (b >= 25 && b < 50) {
                computerPoints++;
                System.out.println("Computer has chosen lizard. You lose");
            }
        }
        if (a == 3) {
            if (b >= 25 && b < 50) {
                computerPoints++;
                System.out.println("Computer has chosen rock. You lose");
            }
            if (b >= 88 && b < 100) {
                userPoints++;
                System.out.println("Computer has chosen paper. You win");
            }
            if (b >= 50 && b < 75) {
                System.out.println("Computer has chosen scissors. It's a tie");
            }
            if (b >= 0 && b < 25) {
                computerPoints++;
                System.out.println("Computer has chosen spock. You lose");
            }
            if (b >= 75 && b < 88) {
                userPoints++;
                System.out.println("Computer has chosen lizard. You win");
            }
        }
        if (a == 4) {
            if (b >= 75 && b < 88) {
                userPoints++;
                System.out.println("Computer has chosen rock. You win");
            }
            if (b >= 0 && b < 25) {
                computerPoints++;
                System.out.println("Computer has chosen paper. You lose");
            }
            if (b >= 88 && b < 100) {
                userPoints++;
                System.out.println("Computer has chosen scissors. You win");
            }
            if (b >= 50 && b < 75) {
                System.out.println("Computer has chosen spock. It's a tie");
            }
            if (b >= 25 && b < 50) {
                computerPoints++;
                System.out.println("Computer has chosen lizard. You lose");
            }
        }
        if (a == 5) {
            if (b >= 0 && b < 25) {
                computerPoints++;
                System.out.println("Computer has chosen rock. You lose");
            }
            if (b >= 75 && b < 88) {
                userPoints++;
                System.out.println("Computer has chosen paper. You win");
            }
            if (b >= 25 && b < 50) {
                computerPoints++;
                System.out.println("Computer has chosen scissors. You lose");
            }
            if (b >= 88 && b < 100) {
                userPoints++;
                System.out.println("Computer has chosen spock. You win");
            }
            if (b >= 50 && b < 75) {
                System.out.println("Computer has chosen lizard. It's a tie");
            }
        }
        return gamestate;
    }
        public void choice(){
            System.out.println("You have played: " + counterOfRounds + " times. You have won: " + userPoints + " rounds. Computer has won: " + computerPoints + " rounds.");
            System.out.println("Please enter X - exit game; N - reset the game");
            String userChoice2 = scan.next();
                if (userChoice2.equals("x")) {
                    System.out.println("Do you really want to quit? Please enter y or n");
                    userChoice2 = scan.next();
                    if (userChoice2.equals("y")) {
                            System.out.println("You have played: " + counterOfRounds + " times. You have won: " + userPoints + " rounds. Computer has won: " + computerPoints + " rounds.");
                            if (userPoints > computerPoints) {
                                System.out.println("Congratulations! You have won the game!");
                            } else if (userPoints == computerPoints) {
                                System.out.println("It's a tie");
                            } else {
                                System.out.println("You have lost the game.");
                            }
                    }
                }
                if (userChoice2.equals("n")) {
                    System.out.println("Do you really want to reset the game? Please enter y or n");
                    userChoice2 = scan.next();
                        if (userChoice2.equals("y")) {
                            new GameState();
                            play();
                        }
                }
    }
}

