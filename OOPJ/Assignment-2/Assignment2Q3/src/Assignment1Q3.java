import java.util.*;
class Book{
String title;
String author; 
String publisher; 
String isbn ;     
int year;
Double price;
int quantity;

Book(){
 //TODO   
}

public void setTitle(String title){
    this.title = title;
}

public String getTitle(){
    return title;
}

public void setAuthor(String author){
    this.author = author;
}

public String getAuthor(){
    return author;
}

public void setPublisher(String publisher){
    this.publisher = publisher;
}

public String getPublisher(){
    return publisher;
}

public void setIsbn(String isbn){
    this.isbn = isbn;
}

public String getIsbn(){
    return isbn;
}

public void setYear(int year){
    this.year = year;
}

public int getYear(){
    return year;
}

public void setPrice(double price){
    this.price = price;
}

public double getPrice(){
    return price;
}

public void setQuantity(int quantity){
    this.quantity = quantity;
}

public int getQuantity(){
    return quantity;
}

public void increaseQuantity(int incQuant){
   this.quantity = quantity + incQuant;
}

public void decreaseQuantity(int decQuant){
    this.quantity = quantity - decQuant;
}

public void getInventoryValue(){
    System.out.println("Total Value Of The Inventory Of The Book : "+price*quantity);
}

}
public class Assignment1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book(); 
       
        System.out.println(" BOOK INVENTORY ");
        System.out.println("_______________________________________________________________");
        
        System.out.print("Enter Book Title : ");
        book.setTitle(sc.nextLine());
        book.getTitle();
       
        System.out.print("Author Of Book : ");
        book.setAuthor(sc.nextLine());
        book.getAuthor();
       
        System.out.print("Publisher Of Book : ");
        book.setPublisher(sc.nextLine());
        book.getPublisher();
       
        System.out.println("ISBN Number Of The Book : ");
        book.setIsbn(sc.nextLine());
        book.getIsbn();
       
        System.out.println("Year in Which Book Was Published : ");
        book.setYear(sc.nextInt());
        book.getYear();
        
        System.out.println("Prize Of the Book : ");
        book.setPrice(sc.nextDouble());
        book.getPrice();
       
        System.out.println("Quantity of the Book : ");
        book.setQuantity(sc.nextInt());
        book.getQuantity();
       
        System.out.println("_____________________________________________________________");
        System.out.println();

        System.out.println("Enter the Increase Quantity of The Book : ");
        int incQuant = sc.nextInt();
        book.increaseQuantity(incQuant);
        
        System.out.println("Enter the Decrease Quantity of The Book : ");
        int decQuant = sc.nextInt();
        book.decreaseQuantity(decQuant);

        System.out.println("Total Value : "+book.getQuantity());
        book.getInventoryValue();
        
        sc.close();
    }
}
