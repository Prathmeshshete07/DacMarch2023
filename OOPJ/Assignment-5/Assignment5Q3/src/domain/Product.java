package domain;

import java.util.Scanner;
public class Product {
	
	static Scanner sc = new Scanner(System.in);
	private String name;
	private double price;
	private String category;
	

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public static Product addProduct() {
		Product product = new Product();
		System.out.println("Enter The Product Name : ");
		product.setName(sc.nextLine());
		System.out.println("Enter The Product Price : ");
	    product.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter The Product Category : ");
        product.setCategory(sc.nextLine());

		return product;
		
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-5.2f ",name,category,price);
	}
	
	
}
