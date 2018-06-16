package com.kodilla.sudoku;

public class SudokuDto {
    private SudokuBoard board;
    private int count;
    private boolean isSolution;

    public SudokuDto(SudokuBoard board, int count, boolean isSolution) {
        this.board = board;
        this.count = count;
        this.isSolution = isSolution;
    }

    public SudokuBoard getBoard() {
        return board;
    }

    public int getCount() {
        return count;
    }

    public boolean isSolution() {
        return isSolution;
    }
}
