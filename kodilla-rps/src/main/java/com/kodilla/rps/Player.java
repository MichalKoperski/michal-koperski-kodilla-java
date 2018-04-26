package com.kodilla.rps;

import java.util.Scanner;

public class Player implements Contestor {
    int userChoice=0;
    Scanner scan = new Scanner(System.in);

    public int makeMove() {
        System.out.println("Please enter number: 1 - rock; 2 - paper; 3 - scissors; 4 - spock; 5 - lizard");
        userChoice = scan.nextInt();
        while(userChoice>5||userChoice==0) {
            System.out.println("Error!!! Please enter number: 1 - rock; 2 - paper; 3 - scissors; 4 - spock; 5 - lizard");
            userChoice = scan.nextInt();
        }
        return userChoice;
    }

}
