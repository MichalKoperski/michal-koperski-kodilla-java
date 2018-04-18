package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testCalculatePopulation() {
        //Given

        Country polska = new Country(new BigDecimal("4"));
        Country francja = new Country(new BigDecimal("5"));
        Country chiny = new Country(new BigDecimal("3"));
        Country japonia = new Country(new BigDecimal("4"));

        Continent europa = new Continent();
        Continent azja = new Continent();
        World world = new World();

        //When
        europa.addCountry(polska);
        europa.addCountry(francja);
        azja.addCountry(chiny);
        azja.addCountry(japonia);
        world.addContinent(europa);
        world.addContinent(azja);

        //Then
        Assert.assertEquals(new BigDecimal("16"), world.getPopulation());
    }
}

