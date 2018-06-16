package com.kodilla.sudoku;

import java.util.List;
import java.util.stream.Collectors;

public class SinglePossibleNumberFinder {

    private final SudokuBoard sudokuBoard;
    private PossibleNumbersFinder possibleNumbersFinder;

    public SinglePossibleNumberFinder(SudokuBoard sudokuBoard) {
        this.possibleNumbersFinder = new PossibleNumbersFinder(sudokuBoard);
        this.sudokuBoard = sudokuBoard;
    }

    public List<Integer> findSinglePossibleInARow(int row, int col) {
        return sudokuBoard.getBoard().get(row).getElement(col).getNumbers().stream()
                .filter(n -> !possibleNumbersFinder.findPossibleInARow(row, col).contains(n))
                .collect(Collectors.toList());
    }

    public List<Integer> findSinglePossibleInAColumn(int col, int row) {
        return sudokuBoard.getBoard().get(row).getElement(col).getNumbers().stream()
                .filter(n -> !possibleNumbersFinder.findPossibleInAColumn(col, row).contains(n))
                .collect(Collectors.toList());
    }

    public List<Integer> findSinglePossibleInABlock(int row, int col) {
        return sudokuBoard.getBoard().get(row).getElement(col).getNumbers().stream()
                .filter(n -> !possibleNumbersFinder.findPossibleInABlock(row, col).contains(n))
                .collect(Collectors.toList());
    }

    public int findSinglePossible(int row, int col) {
        if ((findSinglePossibleInARow(row, col).size() == 1 && findSinglePossibleInAColumn(col, row).size() == 0
                && findSinglePossibleInABlock(row, col).size() == 0)) {
            return findSinglePossibleInARow(row, col).get(0);
        }

        if ((findSinglePossibleInARow(row, col).size() == 0 && findSinglePossibleInAColumn(col, row).size() == 1
                && findSinglePossibleInABlock(row, col).size() == 0)) {
            return findSinglePossibleInAColumn(col, row).get(0);
        }

        if ((findSinglePossibleInARow(row, col).size() == 0 && findSinglePossibleInAColumn(col, row).size() == 0
                && findSinglePossibleInABlock(row, col).size() == 1)) {
            return findSinglePossibleInABlock(row, col).get(0);
        }

        if ((findSinglePossibleInARow(row, col).size() == 1 && findSinglePossibleInAColumn(col, row).size() == 1
                && findSinglePossibleInARow(row, col).get(0).equals(findSinglePossibleInAColumn(col, row).get(0)))
                || (findSinglePossibleInARow(row, col).size() == 1 && findSinglePossibleInABlock(row, col).size() == 1
                && findSinglePossibleInARow(row, col).get(0).equals(findSinglePossibleInABlock(row, col).get(0)))) {

            return findSinglePossibleInARow(row, col).get(0);

        }

        if (findSinglePossibleInABlock(row, col).size() == 1 && findSinglePossibleInAColumn(col, row).size() == 1
                && findSinglePossibleInABlock(row, col).get(0).equals(findSinglePossibleInAColumn(col, row).get(0))) {
            return findSinglePossibleInABlock(row, col).get(0);

        }
        return 0;
    }
}
