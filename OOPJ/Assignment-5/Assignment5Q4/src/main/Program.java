package main;
import java.util.Arrays;

import domain.*;
public class Program {
	
	public static MenuItem[] getArray() {
		
		 MenuItem[] arr = new MenuItem[5];
		 
        arr[0] = new MenuItem("Behrouz Biryani",300.50,105);
        arr[1] = new MenuItem("Chicken Momos",250.00,35);
        arr[2] = new MenuItem("Tandoori Zinger Burger",208.57,250);
        arr[3] = new MenuItem("Chicken Shawarma",80.00,392);
        arr[4] = new MenuItem("Margherita Pizza",245,234);
		
        return arr;
	}
	
	public static void printArray(MenuItem[] arr) {
		for(MenuItem menu : arr ) {
			System.out.println(menu);
		}
	}
	
	public static void main(String[] args) {
	
	MenuItem[] menu =  Program.getArray();
	 Program.printArray(menu);
		
	// using Comparable
	 System.out.println();
	 Arrays.sort(menu);
	 Program.printArray(menu);
	 
	// using Comparator
	 System.out.println();
	 Arrays.sort(menu,new NameComparator());
	 Program.printArray(menu);
	 
	 
	}	
}
