package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    int counter=0;
    String destination="";

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Berlin", true);
        flights.put("LA", false);
        flights.put("Paris", false);
        for (Map.Entry<String, Boolean> fly : flights.entrySet()) {
            if (flight.getArrivalAirport().equals(fly.getKey())) {
                destination=flight.getArrivalAirport();
                if (fly.getValue() == true) {
                    System.out.println("There is a flight to "+destination);
                }
                if(counter==flights.entrySet().size()-1) {
                    System.out.println("No flight available");
                }
            }
            counter++;
            if(counter==flights.entrySet().size()&&destination.equals("")) {
                throw new RouteNotFoundException("No flight");
            }
        }
    }
}

