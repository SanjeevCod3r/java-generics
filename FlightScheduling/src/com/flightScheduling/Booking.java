package com.flightScheduling;

import java.util.UUID;

//Generic Booking Class
class Booking<T extends Passenger> {
 private String bookingId;
 private Flight<T> flight;
 private T passenger;

 public Booking(Flight<T> flight, T passenger) {
     this.bookingId = UUID.randomUUID().toString();
     this.flight = flight;
     this.passenger = passenger;
 }

 public String getBookingId() {
     return bookingId;
 }

 public Flight<T> getFlight() {
     return flight;
 }

 public T getPassenger() {
     return passenger;
 }

 @Override
 public String toString() {
     return "Booking{" +
             "bookingId='" + bookingId + '\'' +
             ", flight=" + flight.getFlightNumber() +
             ", passenger=" + passenger.getName() +
             '}';
 }
}

