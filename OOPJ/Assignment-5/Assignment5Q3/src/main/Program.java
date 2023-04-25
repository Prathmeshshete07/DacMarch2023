package main;
import domain.*;
import java.util.Arrays;


import domain.Product;

public class Program {
	private static Product[] arr;

	static {
		arr = new Product[5];
	}

	public static void getArray() {
		

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = Product.addProduct();
			}
		}
		
	}

	public static void printArray() {
		for (Product product : arr) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {
	    Program.getArray();
		Program.printArray();
		
        System.out.println();
		Arrays.sort(arr, new PriceComparator());
		Program.printArray();
	}
}