package main;

import java.util.Scanner;
import domain.SalesPerson;

public class Organisation {

	static Scanner sc = new Scanner(System.in);
	private SalesPerson[] salesPersonsarr;

	public Organisation() {

		salesPersonsarr = new SalesPerson[15];
	}

	public SalesPerson[] getSalesPersonsarr() {
		return salesPersonsarr;
	}

	public void setSalesPersonsarr(SalesPerson[] salesPersonsarr) {
		this.salesPersonsarr = salesPersonsarr;
	}

	public void updateSalesFigure(int id) {
		SalesPerson salesPerson = findSalesPerson(id);
		if (salesPerson == null)
			return;

		for (int i = 0; i < salesPerson.getSalesfigure().length; i++) {
			System.out.print("Sales Figures for month " + i + " before :   " + salesPerson.getSalesfigure()[i]);
			System.out.print(" After (enter): ");
			salesPerson.getSalesfigure()[i] = sc.nextDouble();
			System.out.println();
		}
	}

	SalesPerson findSalesPerson(int id) {
		for (int i = 0; i < salesPersonsarr.length; i++) {
			if (salesPersonsarr[i] != null && salesPersonsarr[i].getId() == id) {
				return salesPersonsarr[i];
			}
		}
		System.out.println("Sales Person with Id " + id + "is not Found");
		return null;
	}

	public void addSalesPerson(SalesPerson person) {
		System.out.println(salesPersonsarr.length);
		for (int i = 0; i < salesPersonsarr.length; i++) {
			if (salesPersonsarr[i] == null) {
				person.setId(i + 1);
				salesPersonsarr[i] = person;
				System.out.println("Sales Person added successfully.");
				System.out.println();
				System.out.println("| IMPORTANT |  Please remember your ID  !");
				System.out.println(person);
				return;
			}
		}
		System.out.println("Oraganisation capacity is full !!");
	}

	public void totalSalesOfAllPersons() {
		for (int i = 0; i < salesPersonsarr.length; i++) {
			if (salesPersonsarr[i] != null) {
				System.out.println(salesPersonsarr[i].getName() + "	Total Sales Figure :	"
						+ salesPersonsarr[i].calculateTotalFigs());
			}
		}

	}

}
