package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithHam  extends AbstractPizzaDecorator {
        public PizzaWithHam(Pizza pizza) {
            super(pizza);
        }
        public BigDecimal getCost() {
            return super.getCost().add(new BigDecimal(7));
        }
        public String getIngredients() {
            return super.getIngredients() + ", ham";
        }
}
