package main;

import java.util.Arrays;

import domain.Book;

public class Library {

 public static Book[] getArray() {
		
	 Book arr[] = new Book[5];
	 arr[0] = new Book("Let Us C ","Yashavant Kanetkar",2016);
	 arr[1] = new Book("Object-Oriented Analysis and Design ","Grady booch",2007);
	 arr[2] = new Book("Atomic Habits","James Clear",2018);
	 arr[3] = new Book("Challenging Destiny","Medha Deshmukh Bhaskaran",2016);
	 arr[4] = new Book("Shivaji Maharaj : Chhatrapati Shivaji Maharaj","Ranjit Desai",2012);
	return arr;
	}


public static void printRecord(Book[] arr) {
	for(Book book : arr) {
		System.out.println(book);
	}
}

public static void main(String[] args) {
	Book[] book = Library.getArray();
	Library.printRecord(book);
	System.out.println();
	
	Arrays.sort(book);
	Library.printRecord(book);

}
}
