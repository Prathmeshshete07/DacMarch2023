import java.util.Scanner;

class HalfPyramid{
 public static void main(String args[]){
 
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter The Number Of Terms Here = ");
 int n = sc.nextInt();
 
   for(int i = 1 ; i <= n ; i++)
   {
	   for(int k = 1 ; k<= i ; k++)
	   {
		   System.out.print("* ");
	   }
	   System.out.println();
   }
 }
}