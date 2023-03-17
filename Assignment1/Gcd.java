import java.util.Scanner;

class Gcd{
	
	 static int gcd(int a, int b)
    {
        int i;
        if (a < b)
            i = a;
        else
            i = b;
 
        for (i = i; i > 1; i--) {
 
         if (a % i == 0 && b % i == 0)
                return i;
        }
 
        return 1;
    }
	
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 
 System.out.print("Enter First Number Here : ");
 int num1 = sc.nextInt();
 
 System.out.print("Enter Second Number Here : ");
 int num2 = sc.nextInt();
  System.out.println("GCD = " + gcd(num2, num1));
  
 
 }
}
