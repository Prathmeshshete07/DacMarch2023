package org.assignment.main;

import java.util.Scanner;

import org.assignment.domain.Menu;

public class Restaurant {
	private Menu[] arr;
	static Scanner sc = new Scanner(System.in);

	public Restaurant() {
		this(10); // Constructor Chaining
	}

	public Restaurant(int capacity) {
		this.arr = new Menu[capacity];
	}

	public void addNewDish(Menu dish) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = dish;
				return;
			}
		}
		System.out.println("Your Menu Is Full..!!!!");
	}

	public void updateDishPrice(String dish) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getDish().equals(dish)) {
				System.out.println("What New Price Do you want To set For Dish : " + arr[i].getDish());
				arr[i].setPrice(sc.nextDouble());
			}

		}

	}

	public boolean removeDish(String dishName) {
		for (int i = 0; i < arr.length; ++i) {
			if (this.arr[i] != null && this.arr[i].getDish().equals(dishName)) {
				this.arr[i] = null;
				return true;
			}
		}
		return false;
	}

	public void printAllMenuWithPrices() {
		for (Menu dish : arr) {
			if (dish != null)
				System.out.println(dish);
		}
	}

}
