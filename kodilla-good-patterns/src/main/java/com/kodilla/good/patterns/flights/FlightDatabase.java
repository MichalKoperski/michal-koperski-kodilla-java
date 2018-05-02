package com.kodilla.good.patterns.flights;

import java.util.*;

public class FlightDatabase {
    public List<Flight> getListOfFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Berlin", "Paris"));
        flights.add(new Flight("Madrid", "London"));
        flights.add(new Flight("Oslo", "Helsinki"));
        flights.add(new Flight("Warsaw", "Sydney"));
        flights.add(new Flight("Opole", "Warsaw"));
        flights.add(new Flight("Warsaw", "Rome"));
        flights.add(new Flight("Rome", "Paris"));

        return new ArrayList<>(flights);
    }
}
