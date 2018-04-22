package com.kodilla.rps;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan.next();

        Random randomGenerator = new Random();
        int userPoints = 0;
        int computerPoints = 0;
        int counterOfRounds = 0;
        int probability;
        boolean end = false;
        boolean end2 = false;
            MAIN_LOOP:
            while(!end2) {
                System.out.println("Welcome "+name+" to the Game: Rock, Scissors, Paper. Please enter how many rounds it is necessary to win the game? :");
                int numberOfWins = scan.nextInt();
                System.out.println("Please enter number: 1 - rock; 2 - paper; 3 - scissors; 4 - spock; 5 - lizard");
                int userChoice = scan.nextInt();
                while(userChoice>5||userChoice==0) {
                    System.out.println("Error!!! Please enter number: 1 - rock; 2 - paper; 3 - scissors; 4 - spock; 5 - lizard");
                    userChoice = scan.nextInt();
                }
                while (!end) {
                    probability = randomGenerator.nextInt(100);
                    if (userChoice == 1) {
                        if (probability>=50&&probability<75) {
                            System.out.println("Computer has chosen rock. It's a tie");
                        }
                        if (probability>=0&&probability<25) {
                            computerPoints++;
                            System.out.println("Computer has chosen paper. You lose");
                        }
                        if (probability>=88&&probability<100) {
                            userPoints++;
                            System.out.println("Computer has chosen scissors. You win");
                        }
                        if (probability>=25&&probability<50) {
                            computerPoints++;
                            System.out.println("Computer has chosen spock. You lose");
                        }
                        if (probability>=75&&probability<88) {
                            userPoints++;
                            System.out.println("Computer has chosen lizard. You win");
                        }
                    }
                    if (userChoice == 2) {
                        if (probability>=75&&probability<88) {
                            userPoints++;
                            System.out.println("Computer has chosen rock. You win");
                        }
                        if (probability>=50&&probability<75) {
                            System.out.println("Computer has chosen paper. It's a tie");
                        }
                        if (probability>=0&&probability<25) {
                            computerPoints++;
                            System.out.println("Computer has chosen scissors. You lose");
                        }
                        if (probability>=88&&probability<100) {
                            userPoints++;
                            System.out.println("Computer has chosen spock. You win");
                        }
                        if (probability>=25&&probability<50) {
                            computerPoints++;
                            System.out.println("Computer has chosen lizard. You lose");
                        }
                    }
                    if (userChoice == 3) {
                        if (probability>=25&&probability<50) {
                            computerPoints++;
                            System.out.println("Computer has chosen rock. You lose");
                        }
                        if (probability>=88&&probability<100) {
                            userPoints++;
                            System.out.println("Computer has chosen paper. You win");
                        }
                        if (probability>=50&&probability<75) {
                            System.out.println("Computer has chosen scissors. It's a tie");
                        }
                        if (probability>=0&&probability<25) {
                            computerPoints++;
                            System.out.println("Computer has chosen spock. You lose");
                        }
                        if (probability>=75&&probability<88) {
                            userPoints++;
                            System.out.println("Computer has chosen lizard. You win");
                        }
                    }
                    if (userChoice == 4) {
                        if (probability>=75&&probability<88) {
                            userPoints++;
                            System.out.println("Computer has chosen rock. You win");
                        }
                        if (probability>=0&&probability<25) {
                            computerPoints++;
                            System.out.println("Computer has chosen paper. You lose");
                        }
                        if (probability>=88&&probability<100) {
                            userPoints++;
                            System.out.println("Computer has chosen scissors. You win");
                        }
                        if (probability>=50&&probability<75) {
                            System.out.println("Computer has chosen spock. It's a tie");
                        }
                        if (probability>=25&&probability<50) {
                            computerPoints++;
                            System.out.println("Computer has chosen lizard. You lose");
                        }
                    }
                    if (userChoice == 5) {
                        if (probability>=0&&probability<25) {
                            computerPoints++;
                            System.out.println("Computer has chosen rock. You lose");
                        }
                        if (probability>=75&&probability<88) {
                            userPoints++;
                            System.out.println("Computer has chosen paper. You win");
                        }
                        if (probability>=25&&probability<50) {
                            computerPoints++;
                            System.out.println("Computer has chosen scissors. You lose");
                        }
                        if (probability>=88&&probability<100) {
                            userPoints++;
                            System.out.println("Computer has chosen spock. You win");
                        }
                        if (probability>=50&&probability<75) {
                            System.out.println("Computer has chosen lizard. It's a tie");
                        }
                    }
                    counterOfRounds++;
                    System.out.println("You have played: " + counterOfRounds + " times. You have won: " + userPoints + " rounds. Computer has won: " + computerPoints + " rounds.");
                    if (computerPoints == numberOfWins || userPoints == numberOfWins) {
                        end = true;
                    }
                }
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Please enter X - exit game; N - rerun the game");
                String userChoice2 = scan2.next();
                if (userChoice2.equals("x")) {
                    System.out.println("Do you really want to quit? Please enter y or n");
                    userChoice2 = scan2.next();
                    if (userChoice2.equals("y")) {
                        end2=true;
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
                    System.out.println("Do you really want to rerun game? Please enter y or n");
                    userChoice2 = scan2.next();
                    if (userChoice2.equals("y")) {
                        end=false;
                        end2=false;
                        userPoints = 0;
                        computerPoints = 0;
                        counterOfRounds = 0;
                        continue MAIN_LOOP;
                    }
                }
            }
    scan.close();
    }
}