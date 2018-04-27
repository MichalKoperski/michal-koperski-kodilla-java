package com.kodilla.exception.test;

import java.util.*;
public class FlightSearch {
    int counter=0;
    String destination="";

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Berlin", true);
        flights.put("LA", false);
        flights.put("Paris", false);

        if(flights.get(flight.getArrivalAirport())==null) {
            throw new RouteNotFoundException("No flight");
        }
        if(flights.get(flight.getArrivalAirport())==false) {
            System.out.println("No flight available");
        }
    }
}

