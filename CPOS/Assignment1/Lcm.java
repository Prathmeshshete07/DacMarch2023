import java.util.Scanner;

class Lcm{
  static int GCD(int u, int v)
    {
        if (u == 0)
            return v;
        return GCD(v % u, u);
    }
	
	  static int LCM(int u, int v)
    {
        return (u / GCD(u, v)) * v;
    }
 
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
	   System.out.print("Enter First Number Here : ");
	   int num1 = sc.nextInt();
	   
	   System.out.print("Enter Second Number Here : ");
	   int num2 = sc.nextInt();
        System.out.println("LCM of " + num1 + " and " + num2
                           + " is " + LCM(num1, num2));
    }
 
}