package com.flightScheduling;

import java.util.ArrayList;
import java.util.List;

// Generic Flight Manager
class FlightManager<T extends Passenger> {
    private List<Flight<T>> flights = new ArrayList<>();
    private List<Booking<T>> bookings = new ArrayList<>();

    // Create a new flight
    public void addFlight(String flightNumber, String destination, int capacity) {
        Flight<T> flight = new Flight<>(flightNumber, destination, capacity);
        flights.add(flight);
        System.out.println("Flight added: " + flight);
    }

    // Get all flights
    public void listFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
            return;
        }
        System.out.println("Available Flights:");
        for (Flight<T> flight : flights) {
            System.out.println(flight);
        }
    }

    // Book a flight
    public void bookFlight(String flightNumber, T passenger) {
        for (Flight<T> flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                Booking<T> booking = new Booking<>(flight, passenger);
                bookings.add(booking);
                flight.assignPassenger(passenger);
                System.out.println("Booking successful: " + booking);
                return;
            }
        }
        System.out.println("Flight not found.");
    }

    // Remove a flight
    public void removeFlight(String flightNumber) {
        flights.removeIf(flight -> flight.getFlightNumber().equals(flightNumber));
        System.out.println("Flight " + flightNumber + " removed.");
    }

    // List all bookings
    public void listBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }
        System.out.println("Current Bookings:");
        for (Booking<T> booking : bookings) {
            System.out.println(booking);
        }
    }
}

