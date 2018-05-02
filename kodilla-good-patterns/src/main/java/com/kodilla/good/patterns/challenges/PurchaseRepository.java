package com.kodilla.good.patterns.challenges;

public interface PurchaseRepository {
    boolean createPurchase(User user, Product product);
}
