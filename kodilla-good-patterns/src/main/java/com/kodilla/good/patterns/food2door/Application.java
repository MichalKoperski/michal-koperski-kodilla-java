package com.kodilla.good.patterns.food2door;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        String newProducer = "NowaFirma";
        List<Product> newProducts = new ArrayList<Product>();
        newProducts.add(new Product("zupa", 6));
        newProducts.add(new Product("ser", 8));

        Repository repository = new Repository();
        repository.addProducer(newProducer, newProducts);

        MakingOrder makingOrder = new MakingOrder();
        makingOrder.makeOrder("ExtraFoodShop", "jaja", 4);

    }
}
