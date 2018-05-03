package com.kodilla.good.patterns.f2d;

import java.util.*;

public class ExtraFoodShop implements Producer {
    private String producerName;
    private List<String> products;

    public ExtraFoodShop(String producerName, List<String> products) {
        this.producerName = producerName;
        this.products = products;
    }
    public String getProducerName() {
        return producerName;
    }
    public List<String> getProducts() {
        products.add("egg");
        return products;
    }
    public void process() {
        System.out.println("Sending items from Opole");
    }
}
