package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Pizza {
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }
    public String getIngredients() {
        return "tomato sauce, cheese";
    }
}
