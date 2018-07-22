package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithExtraCheese extends AbstractPizzaDecorator {
    public PizzaWithExtraCheese(Pizza pizza) {
        super(pizza);
    }
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }
    public String getIngredients() {
        return super.getIngredients() + ", extra cheese";
    }
}
