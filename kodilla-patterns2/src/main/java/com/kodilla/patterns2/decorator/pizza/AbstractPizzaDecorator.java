package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements Pizza {
    private final Pizza pizza;

    protected AbstractPizzaDecorator(Pizza pizza) {
        this.pizza=pizza;
    }
    public BigDecimal getCost() {
        return pizza.getCost();
    }
    public String getIngredients() {
        return pizza.getIngredients();
    }
}
