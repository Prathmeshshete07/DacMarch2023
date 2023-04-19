package org.assignment.main;

import org.assignment.domain.*;
import java.util.Scanner;

public class RestaurantMenuManagement {

	static Scanner sc = new Scanner(System.in);

	private static Menu acceptRecord() {
		Menu dish = new Menu();
		sc.nextLine();
		System.out.print("Dish	:	");
		dish.setDish(sc.nextLine());
		System.out.print("Price	:	");
		dish.setPrice(sc.nextDouble());
		return dish;
	}

	public static int menuList() {
		System.out.println("=======================================================");
		System.out.println("\" Welcome To CDAC Hotel Menu Management \"");
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.View the current menu with prices");
		System.out.println("2.Add a new dish to the menu");
		System.out.println("3.Remove a dish from the menu");
		System.out.println("4.Modify the price of a dish on the menu");
		System.out.println("=======================================================");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		Restaurant restaurant = new Restaurant(10);
		while ((choice = RestaurantMenuManagement.menuList()) != 0) {
			switch (choice) {

			case 1:
				restaurant.printAllMenuWithPrices();
				break;

			case 2:
				restaurant.addNewDish(RestaurantMenuManagement.acceptRecord());
				break;

			case 3:
				sc.nextLine();
				System.out.println("Enter The Dish Name To Remove : ");
				restaurant.removeDish(sc.nextLine());
				break;

			case 4:
				sc.nextLine();
				System.out.println("Enter The Dish Name To Modify Price Of Dish : ");
				restaurant.updateDishPrice(sc.nextLine());
				break;
			}
		}
	}
}
