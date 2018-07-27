package com.kodilla.hibernate.manytomany.facade;

public class NoEmployeesException extends Exception {
    public NoEmployeesException() {
        super("No employees");
    }
}
