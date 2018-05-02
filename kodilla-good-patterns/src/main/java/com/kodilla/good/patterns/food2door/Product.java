package com.kodilla.good.patterns.food2door;

public class Product {
    String product;
    int price;

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

}
