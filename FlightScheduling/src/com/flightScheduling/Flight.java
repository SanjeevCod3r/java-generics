package com.flightScheduling;

//Generic Flight class
class Flight<T extends Passenger> {
 private String flightNumber;
 private String destination;
 private int capacity;
 private T passenger;

 public Flight(String flightNumber, String destination, int capacity) {
     this.flightNumber = flightNumber;
     this.destination = destination;
     this.capacity = capacity;
 }

 public String getFlightNumber() {
     return flightNumber;
 }

 public String getDestination() {
     return destination;
 }

 public int getCapacity() {
     return capacity;
 }

 public void assignPassenger(T passenger) {
     this.passenger = passenger;
 }

 public T getPassenger() {
     return passenger;
 }

 @Override
 public String toString() {
     return "Flight{" +
             "flightNumber='" + flightNumber + '\'' +
             ", destination='" + destination + '\'' +
             ", capacity=" + capacity +
             ", passenger=" + (passenger != null ? passenger.getName() : "None") +
             '}';
 }
}
