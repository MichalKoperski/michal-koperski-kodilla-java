package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 10);
            if(calculator.add()==15&&calculator.substract()==-5) {
                System.out.print("ok");
            } else {
                System.out.print("zle");
            }
    }
}
