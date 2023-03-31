import java.io.*;
 
class Reverse {
      
    static int rev = 0;
   
    
    static void reverse(int n){
       
      if(n<=0)
        return ;
       
      int rem = n%10; 
       
      rev = (rev*10) + rem;
       
      reverse(n/10);
    }
     
   
    public static void main (String[] args) {
       
        int n = 4526;
      
        reverse(n);
       
        System.out.print("Reversed Number is "+ rev);
    }
}