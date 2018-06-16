package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {

    public static final int EMPTY = -1;
    private int number;
    private List<Integer> numbers;

    public SudokuElement() {
        this.number = EMPTY;
        numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }

    public void removeNumber(Integer i){
        numbers.remove(i);
    }

    public int getNumber() {
        return number;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumber(int i) {
        this.number = i;
    }

    public void setNumbers (List<Integer> numbers) {
        this.numbers = numbers;
    }
}
