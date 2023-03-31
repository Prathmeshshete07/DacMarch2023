import java.util.Scanner;

class Factorial{
 
 public static void main(String[] args){
	 
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter Number Here : ");
 int num = sc.nextInt();
  System.out.println("Factorial of "+ num + " is " + factorial(num));
 }
 
  static int factorial(int n)
 {
  int res = 1, i;
  for (i=2; i<=n; i++)
   res *= i;
  return res;
 }
  
}
 

