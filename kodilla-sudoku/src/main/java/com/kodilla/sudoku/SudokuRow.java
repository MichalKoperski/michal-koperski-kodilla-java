package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private final static int MAX_INDEX = 9;
    private final static int MIN_INDEX = 0;
    List<SudokuElement> row = new ArrayList<>();

    public SudokuRow(){
        for (int col = MIN_INDEX; col < MAX_INDEX; col++) {
            row.add(new SudokuElement());
        }
    }
    public SudokuElement getElement(int col) {
        return row.get(col);
    }

    public List<SudokuElement> getRow() {
        return row;
    }
}
