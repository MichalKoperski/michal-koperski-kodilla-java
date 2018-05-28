package com.kodilla.sudoku;

public class SudokuMechanism {
    int[][] board = new int[9][9];

    public int[][] getBoard() {
        return board;
    }
    public void resolve(int x, int y) {
        int[] emptyCell = findEmptyCell(x, y);
        if(emptyCell == null) return;
        int xPos = emptyCell[0];
        int yPos = emptyCell[1];

        for(int currentNumber = populateCell(1, xPos, yPos); currentNumber != -1;
            currentNumber = populateCell(currentNumber+1, xPos, yPos)) {
            if(xPos >= 8)
                resolve(0, yPos+1);
            else
                resolve(xPos+1, yPos);
            if(exit()) return;
        }
    }
    public int populateCell(int val, int x, int y) {
        if(val > 9) return -1;
        if(checkRow(val, x) && checkColumn(val, y) && checkBox(val, x, y)) {
            board[x][y] = val;
            return val;
        }
        return populateCell(val+1, x, y);
    }
    public boolean checkRow(int val, int x) {
        for(int i = 0; i < 9; i++) {
            if(board[x][i] == val) return false;
        }
        return true;
    }
    public boolean checkColumn(int val, int y) {
        for(int i = 0; i < 9; i++) {
            if(board[i][y] == val) return false;
        }
        return true;
    }
    public boolean checkBox(int val, int x, int y) {
        int i = (x / 3) * 3;
        int j = (y / 3) * 3;

        for(int row = i; row < i+3; row++) {
            for(int column = j; column < j+3; column++) {
                if(board[row][column] == val) return false;
            }
        }
        return true;
    }
    public void print() {
        for(int y = 0; y < 9; y++) {
            if(y%3 == 0) System.out.println();
            for(int x = 0; x < 9; x++) {
                if(x%3 == 0) System.out.print("  ");
                if(board[x][y] == 0)
                    System.out.print("_ ");
                else
                    System.out.print(board[x][y] + " ");
            }
            System.out.println();
        }
    }
    public int[] findEmptyCell(int x, int y) {
        for(int column = y; column < 9; column++) {
            for(int row = x; row < 9; row++) {
                if(board[row][column] == 0) {
                    return new int[] {row, column};
                }
            }
        }
        return null;
    }
    public boolean exit() {
        for(int row = 0; row < 9; row++) {
            for(int column = 0; column < 9; column++) {
                if(board[row][column] == 0)
                    return false;
            }
        }
        return true;
    }
}