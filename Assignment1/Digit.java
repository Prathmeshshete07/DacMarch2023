import java.util.Scanner;

class Digit{
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter The 4 Digit Number Here = ");
 int num = sc.nextInt();
 
 int digit1 = num / 1000 % 10;
 int digit2 = num / 100 % 10;
 int digit3 = num / 10 % 10;
 int digit4 = num % 10; 

 System.out.println(digit1 + " " + digit2 + " " + digit3 + " " +digit4);
 }
}