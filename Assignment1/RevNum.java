import java.util.Scanner;

class RevNum{
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 
 System.out.print("Enter 6 digit Number Here = ");
 int num = sc.nextInt();
 
 int digit1 = num / 100000 % 10;
 int digit2 = num / 10000 % 10;
 int digit3 = num / 1000 % 10;
 int digit4 = num / 100 % 10;
 int digit5 = num / 10 % 10;
 int digit6 = num / 1 % 10;
 
 
 System.out.print("Reversed Number Is : "+digit6 +"" + digit5 + "" + digit4 + "" + digit3 + "" + digit2 + "" + digit1);
 }
}