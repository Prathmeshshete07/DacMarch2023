package main;

import java.util.Scanner;

import domain.Warehouse;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static int showMenu() {

		System.out.println("==========================================================");
		System.out.println("Welcome to the Warehouse Inventory Management System!");
		System.out.println();
		System.out.println("1.Add item to shelf");
		System.out.println("2.Remove item from shelf");
		System.out.println("3.Display contents of all shelves");
		System.out.println("4.Exit");
		System.out.println("==========================================================");
		System.out.print("Enter Your Option : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Program program = new Program();
		int option;
		while ((option = showMenu()) != 4) {

			switch (option) {

			case 1:
				sc.nextLine();
				System.out.print("Please enter the name of the item : ");
				String s = sc.nextLine();
				System.out.print("Please enter the shelf number (1-10) : ");
				int num = sc.nextInt();
				Warehouse.addItem(s, num);
				break;

			case 2:
				System.out.print("Please enter the shelf number (1-10) : ");
				int num1 = sc.nextInt();
				Warehouse.removeItem(num1);
				break;

			case 3:
				Warehouse.displayContents();
				break;

			default:
				System.out.println("Invalid Option !!!...Enter Correct Option");
				break;
			}
		}
		System.out.println("Thank you for using the Warehouse Inventory Management System!");

	}

}
