package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    FlightDatabase database = new FlightDatabase();

    public List<Flight> findFlightFrom(String choice) throws RouteNotFoundException {
        List<Flight> listFlightFrom = database.getListOfFlights().stream()
                .filter(t -> t.getDepartureAirport().equals(choice))
                .collect(Collectors.toList());

        if(listFlightFrom.size()==0){
            throw new RouteNotFoundException("No flight in database");
        }
        return listFlightFrom;
    }
    public List<Flight> findFlightTo(String choice) throws RouteNotFoundException {
        List<Flight> listFlightTo = database.getListOfFlights().stream()
                .filter(t -> t.getArrivalAirport().equals(choice))
                .collect(Collectors.toList());
        if(listFlightTo.size()==0){
            throw new RouteNotFoundException("No flight in database");
        }
        return listFlightTo;
    }
    public void findFlightThrough(String choice, String choice2) throws RouteNotFoundException {

        List<String> fromDestination = findFlightFrom(choice).stream()
                .map(t -> t.getArrivalAirport())
                .collect(Collectors.toList());

        List<String> toDestination = findFlightTo(choice2).stream()
                .map(t -> t.getDepartureAirport())
                .collect(Collectors.toList());

             for(int i=0; i<toDestination.size(); i++) {
                 String temp = toDestination.get(i);
                 List<String> flightViaOtherCity = fromDestination.stream()
                         .filter(t -> t.equals(temp))
                         .collect(Collectors.toList());

                 for(int a=0; a<flightViaOtherCity.size(); a++) {
                     System.out.println("Available flight from: " + choice + " to: " + choice2 + " via: " + flightViaOtherCity);
                 }
                 if(flightViaOtherCity.size()==0){
                     throw new RouteNotFoundException("No flight in database");
                 }
             }
    }
}