package com.kodilla.patterns2.decorator.pizza;

public class OrderProcessor implements PizzaOrder {
    public void orderedPizza(Pizza pizza) {
        System.out.println("You have ordered pizza with: "+ pizza.getIngredients() + "\n" +
        "Price: " + pizza.getCost());
    }

}
