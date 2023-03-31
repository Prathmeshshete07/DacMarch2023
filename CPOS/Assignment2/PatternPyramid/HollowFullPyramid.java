import java.util.Scanner;

class HollowFullPyramid{
 public static void main(String args[]){
 
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter The Number Of Terms Here = ");
 int n = sc.nextInt();    

	for(int i = 1 ; i <= n ; i++)
   {
   for(int j = n-i ; j > 0; j--)
   {
    System.out.print(" ");
   }
   for(int k = 1 ; k <=i ; k++)
   {
	   if(k==1 || i==n || i==k )System.out.print("* ");
       else System.out.print("  ");
   }
   System.out.println();
   }
 }
}