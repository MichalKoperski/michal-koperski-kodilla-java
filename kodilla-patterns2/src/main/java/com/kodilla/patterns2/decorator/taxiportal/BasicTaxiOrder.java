package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class BasicTaxiOrder implements TaxiOrder{
    public BigDecimal getCost() {
        return new BigDecimal(5.00);
    }
    public String getDescription() {
        return "Drive a course";
    }
}
