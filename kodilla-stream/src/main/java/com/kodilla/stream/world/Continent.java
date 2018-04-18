package com.kodilla.stream.world;

import java.util.*;

public final class Continent {
    private final List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }
    public void addCountry(Country country) {
        countries.add(country);
    }
}
