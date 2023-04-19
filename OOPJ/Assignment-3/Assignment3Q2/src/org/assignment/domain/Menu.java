package org.assignment.domain;

public class Menu {
	private String dish;
	private double price;

	public Menu() {

	}

	public Menu(String dish, double price) {

		this.dish = dish;
		this.price = price;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "[dish=" + dish + ", price=" + price + "]";
	}

}