package com.kodilla.sudoku;

public class SudokuSolver {

    public final static int MAX_INDEX = 9;
    public final static int MIN_INDEX = 0;
    public final static int EMPTY = -1;


    public SudokuDto solve(SudokuBoard board){
        boolean result;
        boolean isSolution;
        int count;
        InsertedNumbersFinder insertedNumbersFinder = new InsertedNumbersFinder(board);
        SinglePossibleNumberFinder singlePossibleNumberFinder = new SinglePossibleNumberFinder(board);

        do {
            isSolution = true;
            result = false;
            count = 0;
            for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
                for (int col = MIN_INDEX; col < MAX_INDEX; col++) {
                    if (board.getBoard().get(row).getElement(col).getNumber() == EMPTY) {
                        for (Integer number : insertedNumbersFinder.findNumbers(row, col)) {
                            if (board.getBoard().get(row).getElement(col).getNumbers().contains(number)) {
                                board.getBoard().get(row).getElement(col).removeNumber(number);
                                result = true;
                            }
                        }
                        if(board.getBoard().get(row).getElement(col).getNumbers().size() == 0) {
                            isSolution = false;
                        }

                        if (board.getBoard().get(row).getElement(col).getNumbers().size() == 1) {
                            board.getBoard().get(row).getElement(col).setNumber(board.getBoard().get(row).getElement(col).getNumbers().get(0));
                            result = true;
                        }

                        if (singlePossibleNumberFinder.findSinglePossible(row, col) != 0) {
                            board.getBoard().get(row).getElement(col).setNumber(singlePossibleNumberFinder.findSinglePossible(row, col));
                            result = true;
                        }
                    } else {
                        count++;
                    }
                }
            }
        }
        while(result);

        return new SudokuDto(board, count, isSolution);
    }
}
