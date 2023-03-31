import java.io.*;
import java.util.Scanner;
 
class Palindrome {

  static boolean checkPalindrome(int n)
  {
    int reverse = 0;
    int temp = n;
    while (temp != 0) {
      reverse = (reverse * 10) + (temp % 10);
      temp = temp / 10;
    }
    return (reverse == n); 
  }
 
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
	System.out.print("Enter Number To Check whether It Is Palindrome Or Not : ");
	int n = sc.nextInt();
	
    if (checkPalindrome(n) == true) {
      System.out.println("Yes. \"It Is Palindrome Number\"");
    }
    else {
      System.out.println("No. \"It Is NOt Palindrome Number\"");
    }
  }
}