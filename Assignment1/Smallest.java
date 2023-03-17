import java.util.Scanner;

class Smallest{
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 
 System.out.print("Enter The First Number Here = ");
 int num1 = sc.nextInt();
 
 System.out.print("Enter The Second Number Here = ");
 int num2 = sc.nextInt();
 
 System.out.print("Enter The Three Number Here = ");
 int num3 = sc.nextInt();
 
 int num = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num1 ? num2 : num3);
 System.out.println("Smallest Number Is : "+num);
}
}