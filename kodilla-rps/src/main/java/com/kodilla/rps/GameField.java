package com.kodilla.rps;

public class GameField {

    int computerPoints=0;
    int userPoints=0;
    int counterOfRounds=0;
    boolean end = false;

    public int getUserPoints() {return userPoints;}
    public int getComputerPoints() {return computerPoints;}
    public int getCounterOfRounds() { return counterOfRounds; }


    public void Play(Contestor player, Contestor computer, GameState gameState) {
       //zaincjalizoweac playera computer, liczbe rund
        // ruch gracza, ruch komputer, czy jest remis, czy jest x
        //jedna runda
        //GameState Play
        //

       // while (!end) {
            if (player.makeMove() == 1) {
                if (computer.makeMove() >= 50 && computer.makeMove() < 75) {
                    System.out.println("Computer has chosen rock. It's a tie");
                }
                if (computer.makeMove() >= 0 && computer.makeMove() < 25) {
                    computerPoints++;
                    System.out.println("Computer has chosen paper. You lose");
                }
                if (computer.makeMove() >= 88 && computer.makeMove() < 100) {
                    userPoints++;
                    System.out.println("Computer has chosen scissors. You win");
                }
                if (computer.makeMove() >= 25 && computer.makeMove() < 50) {
                    computerPoints++;
                    System.out.println("Computer has chosen spock. You loose");
                }
                if (computer.makeMove() >= 75 && computer.makeMove() < 88) {
                    userPoints++;
                    System.out.println("Computer has chosen lizard. You win");
                }
            }
            if (player.makeMove() == 2) {
                if (computer.makeMove() >= 75 && computer.makeMove() < 88) {
                    userPoints++;
                    System.out.println("Computer has chosen rock. You win");
                }
                if (computer.makeMove() >= 50 && computer.makeMove() < 75) {
                    System.out.println("Computer has chosen paper. It's a tie");
                }
                if (computer.makeMove() >= 0 && computer.makeMove() < 25) {
                    computerPoints++;
                    System.out.println("Computer has chosen scissors. You lose");
                }
                if (computer.makeMove() >= 88 && computer.makeMove() < 100) {
                    userPoints++;
                    System.out.println("Computer has chosen spock. You win");
                }
                if (computer.makeMove() >= 25 && computer.makeMove() < 50) {
                    computerPoints++;
                    System.out.println("Computer has chosen lizard. You lose");
                }
            }
            if (player.makeMove() == 3) {
                if (computer.makeMove() >= 25 && computer.makeMove() < 50) {
                    computerPoints++;
                    System.out.println("Computer has chosen rock. You lose");
                }
                if (computer.makeMove() >= 88 && computer.makeMove() < 100) {
                    userPoints++;
                    System.out.println("Computer has chosen paper. You win");
                }
                if (computer.makeMove() >= 50 && computer.makeMove() < 75) {
                    System.out.println("Computer has chosen scissors. It's a tie");
                }
                if (computer.makeMove() >= 0 && computer.makeMove() < 25) {
                    computerPoints++;
                    System.out.println("Computer has chosen spock. You lose");
                }
                if (computer.makeMove() >= 75 && computer.makeMove() < 88) {
                    userPoints++;
                    System.out.println("Computer has chosen lizard. You win");
                }
            }
            if (player.makeMove() == 4) {
                if (computer.makeMove() >= 75 && computer.makeMove() < 88) {
                    userPoints++;
                    System.out.println("Computer has chosen rock. You win");
                }
                if (computer.makeMove() >= 0 && computer.makeMove() < 25) {
                    computerPoints++;
                    System.out.println("Computer has chosen paper. You lose");
                }
                if (computer.makeMove() >= 88 && computer.makeMove() < 100) {
                    userPoints++;
                    System.out.println("Computer has chosen scissors. You win");
                }
                if (computer.makeMove() >= 50 && computer.makeMove() < 75) {
                    System.out.println("Computer has chosen spock. It's a tie");
                }
                if (computer.makeMove() >= 25 && computer.makeMove() < 50) {
                    computerPoints++;
                    System.out.println("Computer has chosen lizard. You lose");
                }
            }
            if (player.makeMove() == 5) {
                if (computer.makeMove() >= 0 && computer.makeMove() < 25) {
                    computerPoints++;
                    System.out.println("Computer has chosen rock. You lose");
                }
                if (computer.makeMove() >= 75 && computer.makeMove() < 88) {
                    userPoints++;
                    System.out.println("Computer has chosen paper. You win");
                }
                if (computer.makeMove() >= 25 && computer.makeMove() < 50) {
                    computerPoints++;
                    System.out.println("Computer has chosen scissors. You lose");
                }
                if (computer.makeMove() >= 88 && computer.makeMove() < 100) {
                    userPoints++;
                    System.out.println("Computer has chosen spock. You win");
                }
                if (computer.makeMove() >= 50 && computer.makeMove() < 75) {
                    System.out.println("Computer has chosen lizard. It's a tie");
                }
            }
            counterOfRounds++;
            System.out.println("You have played: " + counterOfRounds + " times. You have won: " + userPoints + " rounds. Computer has won: " + computerPoints + " rounds.");
            if (computerPoints == gameState.Intro() || userPoints == gameState.Intro()) {
                end = true;
            }

        }
    }

//}
