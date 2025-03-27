package com.flightScheduling;
import java.util.Scanner;
public class FlightSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FlightManager<Passenger> flightManager = new FlightManager<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nFlight Scheduling System");
	            System.out.println("1. Add Flight");
	            System.out.println("2. List Flights");
	            System.out.println("3. Book Flight");
	            System.out.println("4. List Bookings");
	            System.out.println("5. Remove Flight");
	            System.out.println("6. Exit");
	            System.out.print("Enter choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Flight Number: ");
	                    String flightNumber = scanner.nextLine();
	                    System.out.print("Enter Destination: ");
	                    String destination = scanner.nextLine();
	                    System.out.print("Enter Capacity: ");
	                    int capacity = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    flightManager.addFlight(flightNumber, destination, capacity);
	                    break;

	                case 2:
	                    flightManager.listFlights();
	                    break;

	                case 3:
	                    System.out.print("Enter Flight Number: ");
	                    String bookFlightNumber = scanner.nextLine();
	                    System.out.print("Enter Passenger Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Passenger Email: ");
	                    String email = scanner.nextLine();
	                    Passenger passenger = new Passenger(name, email);
	                    flightManager.bookFlight(bookFlightNumber, passenger);
	                    break;

	                case 4:
	                    flightManager.listBookings();
	                    break;

	                case 5:
	                    System.out.print("Enter Flight Number to Remove: ");
	                    String removeFlightNumber = scanner.nextLine();
	                    flightManager.removeFlight(removeFlightNumber);
	                    break;

	                case 6:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }

	}

}
