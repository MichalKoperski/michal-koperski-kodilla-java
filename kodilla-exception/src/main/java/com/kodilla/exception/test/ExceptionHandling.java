package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2, 2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Bad arguments");
        } finally {
            System.out.println("End of calculation");
        }
    }
}
