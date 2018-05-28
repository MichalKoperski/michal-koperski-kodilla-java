package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    public static void main(String[] args) {
        SudokuMechanism mech = new SudokuMechanism();
        int[][] board = mech.getBoard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type values separated by spaces, type zero for empty spot");
        for(int y = 0; y < 9; y++) {
            System.out.print("Enter values in row "+(y+1)+": ");
            for(int x = 0; x < 9; x++) {
                board[x][y] = scanner.nextInt();
            }
            scanner.nextLine();
        }
        System.out.println();
        System.out.println("Unsolved sudoku: ");
        mech.print();
        mech.resolve(0, 0);
        System.out.println();
        System.out.println("Solved sudoku: ");
        mech.print();
    }
}
