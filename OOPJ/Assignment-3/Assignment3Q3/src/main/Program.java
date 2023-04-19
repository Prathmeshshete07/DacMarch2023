package main;

import java.util.Scanner;
import domain.*;

public class Program {
	static User user = new User();
	static Reservation reserve = new Reservation();
	static Scanner sc = new Scanner(System.in);

	public User userRegisteration(User user) {
		sc.nextLine();
		System.out.println("Enter Your Name -> ");
		user.setName(sc.nextLine());
		System.out.println("Enter Your Phone NO. -> ");
		user.setPhoneNo(sc.nextLine());
		System.out.println("Enter Your Email ID -> ");
		user.setEmailId(sc.nextLine());
		return user;
	}

	public static int menuList() {
		System.out.println("================================================");
		System.out.println();
		System.out.println("\"Welcome To CDAC Airline Reservation System\"");
		System.out.println("1.User registration");
		System.out.println("2.Flight availability");
		System.out.println("3.Seat reservationn");
		System.out.println("4.View reservations");
		System.out.println("5.Cancel reservations");
		System.out.println("0.Exit");
		System.out.println();
		System.out.println("================================================");
		System.out.println("Enter Your Choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		Program program = new Program();
		int choice;
		while ((choice = menuList()) != 0) {
			switch (choice) {

			case 1:
				program.userRegisteration(user);
				break;

			case 2:
				reserve.showAvailableFlight();
				break;
			case 3:
				System.out.println("Enter Flight Id Here :- ");
				reserve.findFlights(sc.nextInt(), user);
				break;

			case 4:
				reserve.viewReservation(user);
				break;

			case 5:
				reserve.viewReservation(user);
				System.out.println("Enter Flight ID Form Above Flight To cancel Your Seat ");
				reserve.cancelFlights(sc.nextInt(), user);

			}
		}
	}
}
