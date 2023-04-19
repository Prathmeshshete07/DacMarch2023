package main;

import java.util.Scanner;

import domain.SalesPerson;

public class Program {
	static Organisation organisation = new Organisation();
	 
	static Scanner sc = new Scanner(System.in);

	public static void addNewSalesPerson() {
		SalesPerson salesPerson = new SalesPerson();
		sc.nextLine();
		System.out.println("Enter Salesperson's Name : ");
		salesPerson.setName(sc.nextLine());
		double[] salesFigures = new double[12];
		for (int i = 0; i < salesFigures.length; i++) {
			System.out.print("Enter the sales figure for month " + (i + 1) + "   : ");
			salesFigures[i] = sc.nextDouble();
		}
		salesPerson.setSalesfigure(salesFigures);
		organisation.addSalesPerson(salesPerson);

	}

	public static void updateSalesFigure() {
		System.out.println("Enter The ID of The Salesperson they wish to update : ");
		organisation.updateSalesFigure(sc.nextInt());
		;
	}

	public static void totalSalesOfPerson() {
		System.out.println("Enter The ID of The Salesperson they wish to update : ");
		SalesPerson salesPerson = organisation.findSalesPerson(sc.nextInt());
		if (salesPerson == null) {
			System.out.println("Invalid ID !!");
			return;
		}
		System.out.println("Sale persons total figures : " + salesPerson.calculateTotalFigs());

	}

	public static void totalSalesOfAllPersons() {
		organisation.totalSalesOfAllPersons();
	}

	public static int showMenu() {
		System.out.println("=====================================");
		System.out.println();
		System.out.println("1. Add a new salesperson");
		System.out.println("2. Update an existing salesperson");
		System.out.println("3. View total sales for a salesperson");
		System.out.println("4. View total sales for all salespersons");
		System.out.println("0. Exit");
		System.out.println();
		System.out.println("=====================================");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		int option;
		while ((option = showMenu()) != 0) {
			switch (option) {
			case 1:
				addNewSalesPerson();
				break;

			case 2:
				updateSalesFigure();
				break;

			case 3:
				totalSalesOfPerson();
				break;

			case 4:
				totalSalesOfAllPersons();
				break;

			default:
				System.out.println("Invalid option ");
			}
		}
	}

}
