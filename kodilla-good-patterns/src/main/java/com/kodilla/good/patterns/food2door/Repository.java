package com.kodilla.good.patterns.food2door;

import java.util.*;

public class Repository {
    public Map<String, List<Product>> getMapOfProducts() {

        List<Product> ExtraFoodShopProductList = new ArrayList<>();
        ExtraFoodShopProductList.add(new Product("jaja",2));
        ExtraFoodShopProductList.add(new Product("jablka",5));

        List<Product> HealthyShopProductList = new ArrayList<>();
        HealthyShopProductList.add(new Product("kompot",6));
        HealthyShopProductList.add(new Product("gruszka",7));

        List<Product> GlutenFreeShopProductList = new ArrayList<>();
        GlutenFreeShopProductList.add(new Product("pietruszka",4));
        GlutenFreeShopProductList.add(new Product("maliny",9));

        Map<String, List<Product>> productRepository = new HashMap<>();
        productRepository.put("ExtraFoodShop", ExtraFoodShopProductList);
        productRepository.put("HealthyShop", HealthyShopProductList);
        productRepository.put("GlutenFreeShop", GlutenFreeShopProductList);

        return productRepository;
    }
    public Map<String, List<Product>> addProducer(String producerName, List<Product> products) {
        Map<String, List<Product>> addedNewProducer = getMapOfProducts();
        addedNewProducer.put(producerName, products);
        return addedNewProducer;
    }
}
