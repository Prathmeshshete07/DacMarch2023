import java.util.Scanner;

class Sum{
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter The Three Digit Number = ");
 int num = sc.nextInt();
 
 int digit1 = num / 100 % 10;
 
 int digit2 = num / 10 % 10;
 
 int digit3 = num / 1 % 10;
 
 int Sum = digit1 + digit2 + digit3 ;
 System.out.println("Sum Of The Digits Of a Given Number is : "+Sum);
 }
}