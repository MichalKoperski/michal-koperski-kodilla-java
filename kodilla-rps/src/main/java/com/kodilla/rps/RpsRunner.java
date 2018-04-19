package com.kodilla.rps;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Game: Rock, Scissors, Paper. Please enter how many rounds would you like to play? :");
        int numberOfRounds = scan.nextInt();
        System.out.println("Please enter number: 1 - rock; 2 - paper; 3 - scissors :");
        int userChoice = scan.nextInt();
        System.out.println("Please enter number: 1 - rock; 2 - paper; 3 - scissors :");
        String userChoice2 = scan.next();

        scan.close();

        Random randomGenerator = new Random();
        int computerChoice = randomGenerator.nextInt(3);
        int userPoints = 0;
        int computerPoints = 0;
        int counterOfRounds = 0;
        boolean end = false;

        while(counterOfRounds<=numberOfRounds) {
            while(!end) {
                if(userChoice==1) {
                    if(computerChoice==1) {
                        System.out.println("Computer has chosen rock. Remis");
                    }
                    if(computerChoice==2) {
                        userPoints++;
                        System.out.println("Computer has chosen paper. You win");
                    }
                    if(computerChoice==3) {
                        computerPoints++;
                        System.out.println("Computer has chosen scissors. You lose");
                    }
                }
                if(userChoice==2) {
                    if(computerChoice==1) {
                        userPoints++;
                        System.out.println("Computer has chosen rock. You win");
                    }
                    if(computerChoice==2) {
                        System.out.println("Computer has chosen paper. Remis");
                    }
                    if(computerChoice==3) {
                        computerPoints++;
                        System.out.println("Computer has chosen scissors. You lose");
                    }
                }
                if(userChoice==3) {
                    if(computerChoice==1) {
                        computerPoints++;
                        System.out.println("Computer has chosen rock. You lose");
                    }
                    if(computerChoice==2) {
                        userPoints++;
                        System.out.println("Computer has chosen paper. You win");
                    }
                    if(computerChoice==3) {
                        System.out.println("Computer has chosen scissors. Remis");
                    }
                }
                if(userChoice2.equals("x")) {
                    System.out.println("Do you really want to quit? Please enter y or n");
                    if(userChoice2.equals("y")) {
                        break;
                    }
                }
                if(userChoice2.equals("n")) {
                    System.out.println("Do you really want to quit current game? Please enter y or n");
                    if(userChoice2.equals("y")) {
                        continue;
                    }

                }
                counterOfRounds++;
            }
        }
        System.out.println("You have played: "+counterOfRounds+". You have scored: "+userPoints+" points. Computer has scored: "+computerPoints+" points.");
        if(userPoints>computerPoints) {
            System.out.println("Congratulations! You have won!");
        } else if(userPoints==computerPoints) {
            System.out.println("Remis");
        } else {
            System.out.println("You have lost.");
        }


    }
}
