package com.kodilla.good.patterns.f2d;

import java.util.List;

public interface Producer {
    void process();
    String getProducerName();
    List<String> getProducts();
}
