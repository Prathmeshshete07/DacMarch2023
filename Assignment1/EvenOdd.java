import java.util.Scanner;

class EvenOdd{
 public static void main(String args[]){

 Scanner sc = new Scanner (System.in);
 System.out.print("Enter The Number To Check Whether It Is Even Or Odd : ");
 int num = sc.nextInt();

 int  Result = (num % 2 == 0 ) ? 1 : 0;

 if (Result == 1)
 System.out.println("Given Number Is Even... ");
 else if (Result == 0)
 System.out.println("Given Number Is Odd... ");
 else 
	 System.out.println("Given Number Is Invalid!! ");
}
}