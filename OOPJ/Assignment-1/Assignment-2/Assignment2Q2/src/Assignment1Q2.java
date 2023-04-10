import java.util.*;
class BmiCalci{
    double height;
    double weight;
    
    BmiCalci(){
        this.height = 0;
        this.weight = 0;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getHeight(){
       return this.height;
    }
    public double  getweight(){
        return this.weight;
    }
    public double getBmi(){
        return (this.weight / (this.height * this.height));
    }


}

public class Assignment1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BmiCalci bc = new BmiCalci();
        System.out.println(" Welcome to BMI calculater ");
        System.out.println("------------------------------------------------------");

        System.out.print("Enter Height : ");
        bc.setHeight(sc.nextDouble());
        System.out.print("Enter Weight : ");
        bc.setWeight(sc.nextDouble());
       
         double height = bc.getHeight();
         double weight = bc.getweight();
         double bmi= bc.getBmi();
         System.out.println("BMI = "+bmi);

         sc.close();
    }
}
