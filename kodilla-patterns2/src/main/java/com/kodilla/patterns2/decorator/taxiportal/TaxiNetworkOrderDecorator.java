package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class TaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator{
    public TaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(35));
    }
    public String getDescription() {
        return super.getDescription() + " by Taxi Network";
    }
}
