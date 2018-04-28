package com.kodilla.rps;

public class GameState {
    int computerPoints;
    int userPoints;
    int counterOfRounds;
    //int numberOfWins;

    GameField game = new GameField();
    public GameState(int computerPoints, int userPoints, int counterOfRounds) {
        this.computerPoints = computerPoints;
        this.userPoints = userPoints;
        this.counterOfRounds = counterOfRounds;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public int getUserPoints() {
        return userPoints;
    }

    public int getCounterOfRounds() {
        return counterOfRounds;
    }
//public void intro() {
 //   Scanner scan = new Scanner(System.in);
 //   System.out.println("Welcome to the Game: Rock, Scissors, Paper. Please enter how many rounds it is necessary to win the game? :");
 //   int numberOfWins = scan.nextInt();
//}
//public int getNumberOfWins(){
 //   return numberOfWins;
//}
    public void printResult() {
        System.out.println("You have scored: "+game.Play().getUserPoints()+" points. Computer has scored: "+game.Play().getComputerPoints()+" points. You have played: "+game.Play().getCounterOfRounds()+" times.");
    }
}
