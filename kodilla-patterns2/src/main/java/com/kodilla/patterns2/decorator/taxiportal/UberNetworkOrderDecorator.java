package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class UberNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public UberNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }
    public String getDescription() {
        return super.getDescription() + " by Uber Network";
    }
}
