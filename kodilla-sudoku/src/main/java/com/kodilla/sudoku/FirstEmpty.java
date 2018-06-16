package com.kodilla.sudoku;

public class FirstEmpty {
    private final static int MAX_INDEX = 9;
    private final static int MIN_INDEX = 0;
    private final static int EMPTY = -1;


    public int findRow(SudokuBoard board) {
        for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
            for (int col = MIN_INDEX; col < MAX_INDEX; col++) {
                if (board.getBoard().get(row).getElement(col).getNumber() == EMPTY){
                    return row;
                }
            }
        }
        return EMPTY;
    }

    public int findColumn(SudokuBoard board) {
        for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
            for (int col = MIN_INDEX; col < MAX_INDEX; col++) {
                if (board.getBoard().get(row).getElement(col).getNumber() == EMPTY){
                    return col;
                }
            }
        }
        return EMPTY;
    }
}

