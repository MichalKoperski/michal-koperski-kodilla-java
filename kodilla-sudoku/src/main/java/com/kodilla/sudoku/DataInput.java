package com.kodilla.sudoku;

import java.util.Scanner;

public class DataInput {

    private static Scanner scanner = new Scanner(System.in);

    public String inputData() {
        boolean validator = false;
        String input = "";
        while (!validator) {
            System.out.print("Wprowadź dane do Sudoku.\n"
                    + "Każdy wpis musi być w formacie ABC, gdzie:\n"
                    + " A: to cyfra, którą chcesz wprowadzić (od 1 do 9)\n"
                    + " B: to numer rzędu (od 1 do 9)\n"
                    + " C: to numer kolumny (od 1 do 9)\n"
                    + "Wpisy możesz wprowadzać jednym ciągiem.\n"
                    + "Na przykład wpisując 111455876 wprowadzisz cyfrę 1 w komórce [1, 1], cyfrę 4 w komórce [5,5] i cyfrę 8 w komórce [7,6].\n\n"
                    + "Twój wpis: ");

            input = scanner.nextLine();
            InputValidator inputValidator = new InputValidator(input);
            validator = inputValidator.validateInput();
        }
        return input;
    }
}
