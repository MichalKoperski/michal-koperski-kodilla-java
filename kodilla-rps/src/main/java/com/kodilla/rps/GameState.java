package com.kodilla.rps;

public class GameState {
    private int player1Points;
    private int player2Points;
    int numberOfRounds;

    public int getPlayer1Points() {
        return player1Points;
    }
    public int getPlayer2Points() {
        return player2Points;
    }
    public void resetGameState(){
        numberOfRounds = 0;
        player1Points = 0;
        player2Points = 0;
    }
    public void addPointPlayer1(){
        player1Points++;
    }
    public void addPointPlayer2(){
        player2Points++;
    }
    public void addRounds(){
        numberOfRounds++;
    }
    public void printResult(){
        String result = "You have " + player1Points + " points,\n" +
                " whereas the computer has " + player2Points + " points.";
        System.out.println(result);
    }
}