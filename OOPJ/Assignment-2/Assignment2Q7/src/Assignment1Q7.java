import java.util.*;

class TollBoothBillGenerator{
     String vehicleType;
     int numberOfAxles;
     double distanceTravelled;
     double tollFee;
     double totalAmountDue;

     public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
     }
     public void setNumberOfAxles(int numberOfAxles){
        this.numberOfAxles = numberOfAxles;
     }
     public void setDistanceTravelled(double distanceTravelled){
        this.distanceTravelled = distanceTravelled;
     }

     public String getVehicleType(){
        return this.vehicleType;
     }
     public int getNumberOfAxles(){
        return this.numberOfAxles;
     }
     public double getDistanceTravelled(){
        return this.distanceTravelled;
     }
     public double getTollFee(){
        return this.tollFee;
     }
     public double getTotalAmountDue(){
        return this.totalAmountDue;
     }
     
     public void calculateTollFee(){
        
        double rate = 0;

        if(this.vehicleType.equals("truck")){
            rate = distanceTravelled * 0.50;
        }
        else if(this.vehicleType.equals("car") || this.vehicleType.equals("van") || this.vehicleType.equals("bus")){
            rate = distanceTravelled * 0.25;
        }
        else{ 
         System.out.println("Invalid Input...!!!");
         return;
        }
        this.tollFee = rate;
        this.totalAmountDue = this.tollFee + 2.00;
     }

     public void generateBill(){
        System.out.println("Vehicle Type : "+this.getVehicleType());
        System.out.println("Number Of Axles : "+this.getNumberOfAxles());
        System.out.println("Distnace Travelled : "+this.getDistanceTravelled());
        System.out.println("Toll Fee : "+this.getTollFee());
        System.out.println("Total Amount Due : "+this.getTotalAmountDue());
     }

     public boolean checkIfEmpty(){
        if(this.distanceTravelled > 0 && this.numberOfAxles > 0 && !(this.vehicleType == (null)))
        return false;
        return true;
        
     }

      public static int showMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Enter vehicle type (car, van, bus, or truck)");
        System.out.println("2.Enter number of axles");
        System.out.println("3.Enter distance travelled");
        System.out.println("4.Calculate toll fee");
        System.out.println("5.Generate bill");
        System.out.println("6.Exit");
        System.out.println("Enter The Choice Here : ");
        
        return (sc.nextInt());

     }
}

public class Assignment1Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TollBoothBillGenerator  tbbg = new TollBoothBillGenerator();
        int choice;
        while((choice = TollBoothBillGenerator.showMenu()) != 6)
          switch(choice){
                
               case 1 :  System.out.println("Enter The Vehicle Type : ");
                         tbbg.setVehicleType(sc.nextLine());
                        
                         break;

               case 2 : 
                         System.out.println("Enter The Number Of Axles : ");
                        tbbg.setNumberOfAxles(sc.nextInt());
                        break;

               case 3 : 
                        System.out.println("Enter A Distance Travelled : ");
                        tbbg.setDistanceTravelled(sc.nextInt());
                        break;

               case 4 : if(tbbg.checkIfEmpty()){
                        System.out.println("Make Sure You Have To Enter Vehicle Type,Number of Axles , Distance Travelled ");
                        continue;
                        }
                        System.out.println("Calculating.....");
                        tbbg.calculateTollFee();
                        break;

               case 5 : if(tbbg.checkIfEmpty()){
                        System.out.println("Make Sure You Have To Enter Vehicle Type,Number of Axles , Distance Travelled ");
                        continue;
                        }
                        System.out.println("Generating Bill....");
                        tbbg.generateBill();
                        break;

               default : System.out.println("Invalid Input...!!!");
                        
               }             
        }    
}
