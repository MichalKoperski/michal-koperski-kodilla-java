package com.kodilla.good.patterns.flights;

public class AirportMain {
    public static void main(String[] args) {
        String choice = "Warsaw";
        String choice2 = "Paris";
        int choiceTypeOfSearch = 2;
        FlightSearch search = new FlightSearch();

        try {
            if(choiceTypeOfSearch==1) {
                search.findFlightFrom(choice).stream()
                        .forEach(t -> System.out.println("Available flight from: "+t.getDepartureAirport()+" to "+t.getArrivalAirport()));
            }
            if(choiceTypeOfSearch==2) {
                search.findFlightTo(choice).stream()
                        .forEach(t -> System.out.println("Available flight from: "+t.getDepartureAirport()+" to "+t.getArrivalAirport()));
            }
            if(choiceTypeOfSearch==3) {
                search.findFlightThrough(choice, choice2);
            }
        } catch (RouteNotFoundException e) {
            System.out.println("No airport in database");
        } finally {
            System.out.println("End of search");
        }
    }
}
