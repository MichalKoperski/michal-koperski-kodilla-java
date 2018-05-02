package com.kodilla.good.patterns.challenges;

public class PurchaseApplication {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(new User("John"), new Product("but"));
        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new SportItemsPurchaseService(), new SmallItemsPurchaseRepository());

        productOrderService.process(purchaseRequest);
    }
}






