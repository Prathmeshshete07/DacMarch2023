import java.util.*;
class BankAccountMangementSytem{
    String accountHolderName;
    int accountNumber;
    double accountBalance;
   
    BankAccountMangementSytem(String accountHolderName){
        Random random = new Random();
        accountNumber = random.nextInt();
        this.accountHolderName = accountHolderName;
        this.accountBalance = 0;
    }

    public double addAmount(){
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextInt();
        sc.close();
        return amount;
        
    }

    public void depositMoney(double amount){
        
        this.accountBalance += amount ;
    }

    public void withdrawMoney(double amount){
        
        if(this.accountBalance >= amount){
            this.accountBalance -= amount ; 
            System.out.println("You withdraw : "+amount);
            System.out.println("Your Current Account Balance is : "+this.accountBalance);
           return;
        }
        System.out.println("You Have Insufficient Balance in Your Account...");
        System.out.println("Account Balance = "+accountBalance);
        
    }
    
     public double getBalance(){
         
           return this.accountBalance;
     }
    
     public String toString(){
        return "Your Account Details :- \n "+
               "Account Number : "+this.accountNumber+"\n"+
               "Account Holder's Name : "+this.accountHolderName+"\n"+
               "Account Balance : "+this.accountBalance;
     }
  

    public static int showMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Create a new account");
        System.out.println("2. Deposit money into an account");
        System.out.println("3. Withdraw money from an account");
        System.out.println("4. Display the account balance");
        System.out.println("5. Display the account holder's information");
        System.out.println("6. Exit");
        System.out.println("Enter Your Choice : ");
        return sc.nextInt();
    }
}

public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccountMangementSytem bams = null ;
        System.out.println("\"Welcome To Bank Of CDAC...\"");
        int choice;
        while((choice = BankAccountMangementSytem.showMenu()) != 6){
            switch (choice){
                case 1 : 
                        System.out.println("Enter Your Name Here :");
                        bams = new BankAccountMangementSytem(sc.nextLine()); 
                        break;
                case 2 :
                        if(bams == null){
                            System.out.println("Your Will Have To Create An Account ");
                            continue;
                        }
                        System.out.println("How Much Amount You Want To Deposit : ");
                        bams.depositMoney(sc.nextInt());
                        break;
                case 3 :
                        if(bams == null){
                        System.out.println("Your Will Have To Create An Account ");
                        continue;
                        }
                        System.out.println("How Much Amount You Want To Withdraw : ");
                        bams.withdrawMoney(sc.nextInt());
                        break;
                        
                case 4 : if(bams == null){
                         System.out.println("Your Will Have To Create An Account ");
                         continue;
                         }
                         System.out.println("Your Account Balance is : "+bams.getBalance());
                         break;
                         
                case 5 : if(bams == null){
                          System.out.println("Your Will Have To Create An Account ");
                          continue;
                          }
                         System.out.println(bams);
                         break;
                
                default : System.out.println("Invalid Choice...!!!");         

            }
        }
       
   }
}
