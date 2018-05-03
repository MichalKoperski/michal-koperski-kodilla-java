package com.kodilla.rps;

public class GameOutcome {
    private GameInterface player1;
    private Computer player2;
    private int wantedRounds;
    private GameState gameState;

    public GameOutcome(GameInterface player1, Computer player2, int wantedRounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.wantedRounds = wantedRounds;
        gameState = new GameState();
    }
    boolean playerOneBeatsPlayerTwo(String p1Move, String p2Move) {
        return ((p1Move.equals("2") && p2Move.equals("1")) || (p1Move.equals("3") && p2Move.equals("2")) ||
                (p1Move.equals("1") && p2Move.equals("3")));
    }
    boolean playerTwoBeatsPlayerOne(String p1Move, String p2Move) {
        return ((p1Move.equals("1") && p2Move.equals("2")) || (p1Move.equals("2") && p2Move.equals("3")) ||
                (p1Move.equals("3") && p2Move.equals("1")));
    }
    public GameState play() {

        String p1Move = player1.makeMove();
        String p2Move = player2.makeMove();
        gameState.addRounds();

        if (p1Move.equals(p2Move)) {
            System.out.println("It's a draw.");

        } else if (playerTwoBeatsPlayerOne(p1Move, p2Move)) {
            gameState.addPointPlayer2();
            System.out.println("Computer wins. Not so bright, are we?");


        } else if (playerOneBeatsPlayerTwo(p1Move, p2Move)) {
            gameState.addPointPlayer1();
            System.out.println("Well, you managed to beat the machine. You must be a genius of some sort.");


        } else if (p1Move.equals("n")) {
            gameState.resetGameState();
            System.out.println("Game has been reset.");

        } else if (p1Move.equals("x")) {
            gameState.numberOfRounds = wantedRounds;
            System.out.println("Game has been terminated.");
        }
        return gameState;
    }
    public boolean hasNextRound() {
        return gameState.numberOfRounds < wantedRounds;
    }
}