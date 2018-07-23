package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaTest {
    @Test
    public void testPizzaWithHamExtraCheeseGetCost() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new PizzaWithExtraCheese(thePizza);
        thePizza = new PizzaWithHam(thePizza);
        OrderProcessor order = new OrderProcessor();
        order.orderedPizza(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then

        assertEquals(new BigDecimal(27), theCost);
    }
    @Test
    public void testPizzaWithHamExtraCheeseGetIngredients() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new PizzaWithExtraCheese(thePizza);
        thePizza = new PizzaWithHam(thePizza);
        OrderProcessor order = new OrderProcessor();
        order.orderedPizza(thePizza);
        //When
        String description = thePizza.getIngredients();
        //Then
        assertEquals("tomato sauce, cheese, extra cheese, ham", description);
    }
}
