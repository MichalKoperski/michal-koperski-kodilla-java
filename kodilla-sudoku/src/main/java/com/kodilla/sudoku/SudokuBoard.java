package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype {

    public final static int MAX_INDEX = 9;
    public final static int MIN_INDEX = 0;
    private List<SudokuRow> board = new ArrayList<>();

    public SudokuBoard() {
        for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
            board.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getBoard() {
        return board;
    }

    public void setElement(int number, int row, int col) {
        board.get(row - 1).getElement(col - 1).setNumber(number);
    }

    public String toString() {
        String result = "";
        for (int row = MIN_INDEX; row < MAX_INDEX; row++) {
            result += "  ---   ---   ---   ---   ---   ---   ---   ---   ---\n";
            result += "|";
            for (int col = MIN_INDEX; col < MAX_INDEX; col++) {
                if (board.get(row).getElement(col).getNumber() == -1) {
                    result += "     ";
                } else {
                    result += "  " + board.get(row).getElement(col).getNumber() + "  ";
                }
                result += "|";
            }
            result += "\n";
        }
        result += "  ---   ---   ---   ---   ---   ---   ---   ---   ---";
        return result;
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = (SudokuBoard) super.clone();
        clonedBoard.board = new ArrayList<>();
        for (SudokuRow row : board) {
            SudokuRow clonedRow = new SudokuRow();
            int col = 0;
            for (SudokuElement element : row.getRow()) {
                clonedRow.getRow().get(col).setNumber(element.getNumber());
                List<Integer> clonedNumbers = new ArrayList<>(element.getNumbers());
                clonedRow.getRow().get(col).setNumbers(clonedNumbers);
                col++;
            }
            clonedBoard.getBoard().add(clonedRow);
        }
        return clonedBoard;
    }
}
