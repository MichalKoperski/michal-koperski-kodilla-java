package com.kodilla.good.patterns.f2d;

public class OrderProcessor {
    public void processOrder(Producer producer) {

        //System.out.println("Order from: "+producer.getProducerName());
        producer.process();
    }
}
