package domain;

import java.util.Scanner;

public class Flights {
	private int flightId;
	private String flightDesc;
	private int seats;
	private int availableSeats;
	private User[] reserveUsers;

	static Scanner sc = new Scanner(System.in);

	public Flights() {
		this(0, "", 0);
	}

	public Flights(int flightId, String flightDesc, int seats) {
		super();
		this.flightId = flightId;
		this.flightDesc = flightDesc;
		this.seats = seats;
		this.availableSeats = this.seats;
		this.reserveUsers = new User[this.seats];
	}

	public User[] getReserveUsers() {
		return reserveUsers;
	}

	public void setReserveUsers(User[] reserveUsers) {
		this.reserveUsers = reserveUsers;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightDesc() {
		return flightDesc;
	}

	public void setFlightDesc(String flightDesc) {
		this.flightDesc = flightDesc;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String toString() {
		return "Flights [flightId=" + flightId + ", flightDesc=" + flightDesc + ", availableseats=" + availableSeats
				+ "]";
	}

	public void reservedSeat(User user) {

		for (int i = 0; i < reserveUsers.length; i++) {
			if (reserveUsers[i] == null) {
				reserveUsers[i] = user;
				availableSeats -= 1;
				return;
			}

		}
		System.out.println("You Have To Book Another Flight....");
	}

	public void cancelFlight(User user) {
		for (int i = 0; i < reserveUsers.length; i++) {
			if (reserveUsers[i] != null) {
				reserveUsers[i] = null;
				availableSeats += 1;
				return;
			}

		}
		System.out.println("You Have To Book Another Flight....");
	}

}
