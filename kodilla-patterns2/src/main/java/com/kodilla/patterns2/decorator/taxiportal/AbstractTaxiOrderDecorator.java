package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public abstract class AbstractTaxiOrderDecorator implements TaxiOrder {
    private final TaxiOrder taxiOrder;

    protected AbstractTaxiOrderDecorator(TaxiOrder taxiOrder) {
        this.taxiOrder=taxiOrder;
    }
    public BigDecimal getCost() {
        return taxiOrder.getCost();
    }
    public String getDescription() {
        return taxiOrder.getDescription();
    }

}
