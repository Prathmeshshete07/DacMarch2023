package domain;

public class NonFictionBook extends Book{

	private String subject;

	public NonFictionBook(String title, String author, String publisher, double price, int numPages, String subject) {
		super(title, author, publisher, price, numPages);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public double calculatePrice() {
		return super.calculatePrice();
	}

	@Override
	public String toString() {
		return "NonFictionBook [subject=" + subject + "]";
	}
	
	
	
	
}
