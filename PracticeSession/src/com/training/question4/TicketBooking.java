package com.training.question4;

public class TicketBooking {

	void bookingDetails(String busName, String destination, String Source, String... passengerNames) {
		System.out.println("BusName: " + busName);
		System.out.println("Destination: " + destination);
		System.out.println("Source: " + Source);
		System.out.println("Passengers: ");
		for (String passenger : passengerNames) {
			System.out.println(passenger);
		}
	}
}
