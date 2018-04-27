package com.kodilla.exception.test;

public class AirportMain {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Berlin");
        Flight flight2 = new Flight("Madrid", "Paris");
        Flight flight3 = new Flight("LA", "NYC");

        FlightSearch search = new FlightSearch();

        try {
            search.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("No airport in database ");
        } finally {
            System.out.println("End of search");
        }
    }
}
