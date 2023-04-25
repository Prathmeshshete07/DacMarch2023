package domain;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
    private int publicationYear;
    
	public Book(String title, String author, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}
	
	@Override
	public int compareTo(Book other) {
		return this.getPublicationYear() - other.publicationYear;
	}

	@Override
	public String toString() {
		return String.format("%-50s%-50s%-6d",title,author,publicationYear);
				
	}
}
