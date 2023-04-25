package domain;

public class MenuItem implements Comparable<MenuItem> {
	private String name;
	private double price;
	private int calories;
	
	public MenuItem(String name, double price, int calories) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public int compareTo(MenuItem other) {
		return (int) (this.getPrice() - other.getPrice());
	}
	
	@Override
	public String toString() {
		return String.format("%-30s%-10.2f%-10d",name,price,calories);
	}
}
