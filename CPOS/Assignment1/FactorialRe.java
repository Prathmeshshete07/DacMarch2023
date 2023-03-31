import java.util.Scanner;

class FactorialRe{
 public static void main(String[] args){
 
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter Number Here : ");
  int num = sc.nextInt();
  System.out.println("Factorial of "+ num + " is " + factorial(num));
 }
 
 static int factorial(int n)
 {
  if (n == 0)
  return 1;
   
  return n*factorial(n-1);
 }
 }