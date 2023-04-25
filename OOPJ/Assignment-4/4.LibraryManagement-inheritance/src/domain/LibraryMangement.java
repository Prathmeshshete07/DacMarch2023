package domain;

public class LibraryMangement {
	
	

	public LibraryMangement() {
		adjustPrice();
		printRecord();
		printcalPrice();
	}

	Book[] arr = new Book[] { new ReferenceBook("Let Us C", "Yashwant Kanitkar", "BPB", 399.00, 508, 18),
			new FictionBook("Let us follow Him", "Henryk Sienkiewicz", "Outlook Verlag", 3233.70, 32, "history"),
			new ReferenceBook("Object Oriented Programming C++", "Lafore", "Pearson Education", 529.00, 1040, 4),
			new FictionBook("Billboard in Concert", "CHRISTIAN C. NWOBI ", "AuthorHouse", 1708.00, 344,
					"romance"),
			new NonFictionBook("Samsara", "Saksham Garg", "Lafore", 145.00, 298, "Mythological"),
			new ReferenceBook("Programming with Java", "E Balagurusamy", "McGraw-Hill", 602.00, 600, 6),
			new FictionBook("The Secrets She Keeps", "Michael Robotham", "Scribner", 2132.00, 384, "Novel"),
			new NonFictionBook("The Hidden Hindu", "Akshat Gupta", "Penguin eBury Press", 250.94, 256, "history") };

	public void adjustPrice() {
		for (int i = 0; i < arr.length; i++) {
			double price = 0;
			if (arr[i] instanceof ReferenceBook) {
				ReferenceBook book = (ReferenceBook) arr[i];
				book.setPrice(book.getEdition() < 5 ? book.getPrice() - book.getPrice() * 20 / 100 : book.getPrice());
			}
			if (arr[i] instanceof FictionBook) {
				FictionBook book = (FictionBook) arr[i];
				book.setPrice(book.getGenre().equals("romance") ? book.getPrice()- book.getPrice() * 10/100 : book.getPrice());

			}
			if(arr[i] instanceof NonFictionBook) {
				NonFictionBook book = (NonFictionBook) arr[i];
				book.setPrice(book.getSubject().equals("history") ? book.getPrice() - book.getPrice()* 10/100 : book.getPrice());
			}
		}

	}
	
	public void printcalPrice() {

		double total = 0;
		for (Book book : arr) {
			total += book.calculatePrice();
		}
		System.out.println("==========================================");
		System.out.println();
		System.out.format("%s %.2f","Total Price of all the Books  ",total);
		System.out.println();
		System.out.println("==========================================");
	}
	
	public void printRecord() {
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("Book Price (Book wise)");
		System.out.println();
		System.out.println("--------------------------------------");

		System.out.println(String.format("%-35s%-25s%-13s%-25s", "Title", "Author","Price","Book-Type"));

		for (Book book : arr) {

			System.out.println("");
			System.out.println(String.format("%-35s%-25s%-12.2f%-25s",book.getTitle(),book.getAuthor(),book.getPrice(),
					(book instanceof ReferenceBook) ? "ReferenceBook" : (book instanceof NonFictionBook) ? "NonFictionBook":"FictionBook"));
		} 
	}

}


