package com.kodilla.sudoku;

public class SudokuGame {

    private static SudokuApproval sudokuApproval = new SudokuApproval();
    private static SudokuRunner sudokuRunner = new SudokuRunner();
    private static GameResults gameResults = new GameResults();
    private static NextOrFinish nextOrFinish = new NextOrFinish();

    public static void main(String[] args) {
        boolean gameFinished = false;
        while(!gameFinished) {
            gameResults.showSudokuResults(sudokuRunner.run(sudokuApproval.acceptOrReEnter()));
            gameFinished = nextOrFinish.finishGame();
        }
    }
}
