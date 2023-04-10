import java.util.Scanner;

class CreditScoreCalci{
    int creditHistory;
    double creditUtilization;
    boolean paymentHistory;
    double creditScore;

    CreditScoreCalci(){
        /*this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymentHistory = paymentHistory;*/
    }

    public void setCreditHistory(int creditHistory){
        this.creditHistory = creditHistory;
    }
    public void setCreditUtilization(double creditUtilization){
        this.creditUtilization = creditUtilization;
    }
    public void setPaymentHistory(boolean paymentHistory){
        this.paymentHistory = paymentHistory;
    }
    public void setCreditScore(double creditScore){
       this.creditScore = creditScore;
     }
    public int getCreditHistory(){
        return this.creditHistory;
    }
    public double getCreditUtilization(){
       return this.creditUtilization;
    }
    public boolean getPaymentHistory(){
       return this.paymentHistory;
    }
    
    public double calculateCreditScore(){
        if(this.paymentHistory == true){
         this.creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 55;
           return this.creditScore; 
        }
     
          this.creditScore = (this.creditHistory * 15) + (int)(creditUtilization * 30) + 35;
           return this.creditScore; 
        
     }

     public static int menuList(){
        Scanner sc = new Scanner(System.in);
         System.out.println("1.credit History");
         System.out.println("2.credit Utilization");
         System.out.println("3.payment History");
         System.out.println("4.credit Score");
         System.out.println("5.Exit");
         System.out.println("Enter Your Choice : ");
         return sc.nextInt();
         
     }

     public boolean isEmpty(){
        if(this.creditUtilization > 0 && creditHistory > 0 ){
            return false;
        }
        return true;
     }
    
}


public class Assignment1Q10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CreditScoreCalci credit = new CreditScoreCalci(); 
        int choice;
        while ((choice = CreditScoreCalci.menuList()) != 5){
          switch (choice){

             case 1 :  System.out.println("Credit History :");
                       credit.setCreditHistory(sc.nextInt());
                       break;

             case 2 :   System.out.println("Credit Utilization :");
                       credit.setCreditUtilization(sc.nextDouble());  
                       break;
                       
             case 3 : System.out.println("Credit PaymentHistory :");
                      credit.setPaymentHistory(sc.nextBoolean());
                      break;
                       
             case 4 :  if(credit.isEmpty()){
                      System.out.println("You have to enter Credit history and Credit utilization and Credit Payment History");
                      continue;
                      }
                      double creditScore = credit.calculateCreditScore();
                      System.out.println("Credit Score : "+creditScore);
                      break;
          
                    }
        
                }
    
            }    

        }       

      
    
