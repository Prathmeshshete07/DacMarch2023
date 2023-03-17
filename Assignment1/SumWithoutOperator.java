import java.util.Scanner;

class SumWithoutOperator{
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 
 System.out.print("Enter The First Number Here : ");
 int num1 = sc.nextInt();
 
 System.out.print("Enter The Second Number Here : ");
 int num2 = sc.nextInt();
   
   while(num2 != 0){
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry << 1;
        }
        System.out.print("Sum: "+num1); 
		System.out.print("\n");   
	   
}
}