package com.kodilla.sudoku;

import java.util.Deque;

public class GameResults {

    public void showSudokuResults (BoardStack boardStack) {
        Deque<SudokuBoard> result = boardStack.getBoardStack();

        if(result.size() ==1001){
            System.out.println("Liczba możliwych rozwiązań Twojego Sudoku jest większa niż 1000.");
        } else {
            System.out.println("Liczba możliwych rozwiązań Twojego Sudoku: " + result.size());
        }

        if(result.size() > 1){
            System.out.println("Jedno z możliwych rozwiązań:\n" + result.pop() + "\n");
        } else {
            System.out.println("Rozwiązanie:\n" + result.pop() + "\n");
        }
    }
}
