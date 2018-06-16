package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuApproval {
    private static DataInput dataInput = new DataInput();
    private static Scanner scanner = new Scanner(System.in);
    private static SudokuBoardBuilder sudokuBoardBuilder = new SudokuBoardBuilder();

    public SudokuBoard acceptOrReEnter() {
        String decision;
        SudokuBoard board;
        do {
            board = sudokuBoardBuilder.build(dataInput.inputData());
            System.out.println("\nTablica Sudoku według wprowadzonych przez Ciebie danych:\n" + board + "\n");
            System.out.println("Jeśli chcesz wprowadzić dane ponownie wciśnij ENTER.\n"
                                    + "Jeśli akceptujesz Sudoku i chcesz je rozwiązać wpisz 'SUDOKU' i wciśnij ENTER\n");
            decision = scanner.nextLine();

        }while(!decision.equals("SUDOKU") && !decision.equals("sudoku") && !decision.equals("Sudoku"));

        return board;
    }
}
