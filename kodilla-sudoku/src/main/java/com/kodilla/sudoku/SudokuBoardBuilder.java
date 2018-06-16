package com.kodilla.sudoku;

public class SudokuBoardBuilder {

    public SudokuBoard build(String input) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        int numberOfInsertedDigits =  input.length()/3;
        for (int i = 0; i < numberOfInsertedDigits; i++) {
            sudokuBoard.setElement(Character.getNumericValue(input.charAt(0)), Character.getNumericValue(input.charAt(1)), Character.getNumericValue(input.charAt(2)));
            input = input.substring(3);
        }
        return sudokuBoard;
    }
}
