package com.kodilla.good.patterns.f2d;

import java.util.*;

public class HealthyShop implements Producer {
    private String producerName;
    private List<String> products;

    public HealthyShop(String producerName, List<String> products) {
        this.producerName = producerName;
        this.products = products;
    }

    public String getProducerName() {
        return producerName;
    }

    public List<String> getProducts() {
        products.add("potatoe");
        return products;
    }
    public void process() {
        System.out.println("Sending items from Germany");
    }
}
