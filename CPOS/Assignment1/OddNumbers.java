import java.util.Scanner;

class OddNumbers {
    
	public static void main(String[] args){
     
	 Scanner sc = new Scanner (System.in);
	 System.out.print("Enter The No. Of Terms Here : ");
     int n = sc.nextInt();
        
     for (int i = 1; i <= n; i = i+2)
        {
            System.out.println(i);
        }
    }
}