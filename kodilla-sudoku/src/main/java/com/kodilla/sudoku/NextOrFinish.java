package com.kodilla.sudoku;

import java.util.Scanner;

public class NextOrFinish {
    private static Scanner scanner = new Scanner(System.in);

    public boolean finishGame() {
        System.out.println("Jeśli chcesz zagrać jeszcze raz wciśnij ENTER.\n"
                + "Jeśli chcesz zakończyć grę wpisz 'fin' i wciśnij ENTER.\n");
        String decision = scanner.nextLine();
        if(decision.equals("fin")){
            return true;
        } else {
            return false;
        }
    }
}
