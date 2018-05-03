package com.kodilla.good.patterns.f2d;

import java.util.List;
import java.util.stream.Collectors;

public class OrderProcessor {

    public void processOrder(Producer producer, String choiceOfProduct, int quantity) {
        List<String> chosenProduct = producer.getProducts().stream()
                                        .filter(t -> t.equals(choiceOfProduct))
                                        .collect(Collectors.toList());
        if(chosenProduct.size()!=0) {
            System.out.println("Your order: "+quantity+" "+choiceOfProduct+ " is available from: "+producer.getProducerName());
            producer.process();
        } else {
            System.out.println("Sorry we are sold out");
        }
    }
}
