package main;

import java.util.Scanner;

import domain.*;

public class Reservation {

	private Flights[] arr;

	static Scanner sc = new Scanner(System.in);

	public Reservation() {

		this.arr = new Flights[] { new Flights(1, "Mumbai-To-Goa", 250), new Flights(2, "Mumbai-To-Bangalore", 300),
				new Flights(3, "Mumbai-To-Dubai", 150), new Flights(4, "Mumbai-To-PhiliPines", 180),
				new Flights(5, "Mumbai-To-Pune", 120), new Flights(6, "Mumbai-To-Hyderabad", 210),
				new Flights(11, "Goa-To-Mumbai", 300), new Flights(12, "Dubai-To-Mumbai", 220),
				new Flights(13, "Bangalore-To-Mumbai", 200), new Flights(14, "Pune-To-Mumbai", 150),
				new Flights(15, "PhiliPines-To-Mumbai", 200) };
	}

	public void showAvailableFlight() {
		for (Flights flight : this.arr) {
			System.out.println(flight);
		}
	}

	public void findFlights(int flightId, User user) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getFlightId() == flightId) {
				if (arr[i].getAvailableSeats() > 0) {
					arr[i].reservedSeat(user);
					return;
				} else {
					System.out.println("All Seats Are Already Booked...");
					return;
				}
			}
		}
		System.out.println("Flight With These Id Is Not Available...");
	}

	public void viewReservation(User user) {
		for (Flights f1 : this.arr) {
			for (User u1 : f1.getReserveUsers()) {
				if (u1 == user) {
					System.out.println(f1);
				}
			}
		}
	}

	public void cancelFlights(int flightId, User user) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getFlightId() == flightId) {
				arr[i].cancelFlight(user);
				return;
			}

		}
		System.out.println("Flight With These Id Is Not Available...");
	}

}
