package com.flightScheduling;
import java.util.UUID;
//Passenger class

class Passenger{
 private String id;
 private String name;
 private String email;

 public Passenger(String name, String email) {
     this.id = UUID.randomUUID().toString();
     this.name = name;
     this.email = email;
 }

 public String getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public String getEmail() {
     return email;
 }

 @Override
 public String toString() {
     return "Passenger{" +
             "id='" + id + '\'' +
             ", name='" + name + '\'' +
             ", email='" + email + '\'' +
             '}';
 }
}

