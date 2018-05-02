package com.kodilla.good.patterns.food2door;

public class MakingOrder {
    Repository repository = new Repository();
    PurchaseProcessor purchaseProcessor = new PurchaseProcessor();

    public void makeOrder(String producerName, String productName, int quantity) {
        int price = repository.getMapOfProducts().entrySet().stream()
                .filter(t -> t.getKey().equals(producerName))
                .flatMap(t -> t.getValue().stream())
                .filter(t -> t.getProduct().equals(productName))
                .map(t -> t.getPrice())
                .mapToInt(t -> t)
                .sum();

        if(price!=0) {
            purchaseProcessor.process(producerName);
            System.out.println("You want to buy: "+quantity+" "+productName);
            System.out.println("It will cost: "+(price*quantity)+" PLN");
        } else {
            System.out.println("No product in database");
        }
    }
}
