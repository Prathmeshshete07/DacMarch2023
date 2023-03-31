import java.util.Scanner;

class Pattern5{
 public static void main(String args[]){
 
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter The Number Of Terms Here = ");
 int n = sc.nextInt();
 
   for(int i = n ; i >= 1 ; i--)
   {
	   for(int j = i-1 ; j> 0 ; j--)
	   {
		   System.out.print("  ");
	   }
	   for(int k = i ; k<= n ; k++)
	   {
		   System.out.print(k+" ");
	   }
	  for(int j=n-1; j>=i; j--){
				System.out.print(j+ " ");
				
			}
	   System.out.println();
   }
 }
}