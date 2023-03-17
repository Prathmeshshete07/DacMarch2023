import java.util.Scanner;

class PosNeg{
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter Number To Check Wether It Is Positive or Negative = ");
 int num = sc.nextInt();
 
 if (num > 0)
	 System.out.println("Given Number Is Positive!!! ");
 else if(num < 0)
	 System.out.println("Given Number Is Negative!!! ");
 else
	 System.out.println("Given Number Is Zero ");
 }
}