package com.kodilla.good.patterns.f2d;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Producer extra = new ExtraFoodShop("ExtraFoodShop", new ArrayList<String>());
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(extra);
    }
}
