import java.util.Scanner;

class Leap{
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter Year Here = ");
 int Year = sc.nextInt();
 
 if (Year % 4 == 0 && Year %100 !=0 || Year % 400 == 0)
 System.out.println("Given Year Is Leap Year !!! ");
 else
 System.out.println("Given Year Is NOt Leap Year !!! ");
 }
}