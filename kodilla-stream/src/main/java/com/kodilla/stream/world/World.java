package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class World {
    List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPopulation() {
        return continents.stream()
                .flatMap(c -> c.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum =sum.add(current));
    }
}