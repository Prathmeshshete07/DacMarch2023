import java.util.*;

class RationalNumCalci{
    int numerator;
    int denominator;
    int numerator1;
    int denominator1;
    int num;
    int denom;
    
    RationalNumCalci(){
       /*this.numerator = numerator;
       this.denominator = denominator;
       this.numerator1 = numerator1;
       this.denominator1 = denominator1; */
    }
    
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public void setNumerator1(int numerator1){
        this.numerator1 = numerator1;
    }
    public void setDenominator1(int denominator1){
        this.denominator1 = denominator1;
    }

     public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator ;
    }
    public int getNumerator1(){
       return this.numerator1 ;
    }
    public int getDenominator1(){
        return this.denominator1 ;
     }
   
     public int getNum(){
       return this.num;
    }
    public int getDenom(){
        return this.denom;
    }
    

    public void sum(){

        if(denominator  == denominator1 ){
            this.num = numerator + numerator1;
            this.denom = denominator1;
            return;
        }
       else{
        this.num = (denominator*numerator1) + (denominator1*numerator);
        this.denom = (denominator * denominator1);
       }
        this.reduceFrac();
    }

    public void sub(){

        if(denominator  == denominator1 ){
            this.num = numerator - numerator1;
            this.denom = denominator1;
            return;
        }
        else{
        this.num = (denominator1*numerator) - (denominator*numerator1);
        this.denom = (denominator * denominator1);
        }
        this.reduceFrac();
    }

    public void mul(){
        this.num = (numerator * numerator1);
        this.denom = (denominator * denominator1);
        this.reduceFrac();
    }
    
    public void div(){
        this.num = (numerator * denominator1);
        this.denom = (numerator1 * denominator);
       this.reduceFrac();
    }

    public int gcd(int a, int b)
    { 
        int i;
        if (a < b)
            i = a;
        else
            i = b;
 
        for (i = i; i > 1; i--) {
 
         if (a % i == 0 && b % i == 0)
                return i;
        }
 
        return 1;
    }
  
  public void reduceFrac() {
	  int gc= this.gcd(this.num,this.denom);
	  this.num/=gc;
	  this.denom/=gc;
    }
   
  public static char showMenu(){
     Scanner sc = new Scanner(System.in);
     System.out.println("@ Enter Two Rational Numbers");
     System.out.println("+ Addition Of Two Rational Numbers");
     System.out.println("- Subtraction Of Two Rational Numbers");
     System.out.println("* Multiplication Of Two Rational Numbers");
     System.out.println("/ Division Of Two Rational Numbers");
     System.out.println("$ Exit");
     System.out.println("Enter the arithmetic operation (+, -, *, /) : ");
     return sc.next().charAt(0);
     
  }

}

public class Assignment1Q8 {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    RationalNumCalci rnc = new RationalNumCalci();
    char choice;
     while((choice = RationalNumCalci.showMenu()) != '$')
     switch(choice){

        case '@' : System.out.println("Enter the first rational number: ");
                 System.out.print("Numerator: ");
                 rnc.setNumerator(sc.nextInt());
                 System.out.print("Denominator: ");
                 rnc.setDenominator(sc.nextInt());
    
                 System.out.println("Enter the Second rational number: ");
                 System.out.print("Numerator: ");
                 rnc.setNumerator1(sc.nextInt());
                 System.out.print("Denominator: ");
                 rnc.setDenominator1(sc.nextInt());
                 break;

        case '+' : rnc.sum();
                System.out.println("Sum Of Fraction : "+rnc.getNum()+ "/" +rnc.getDenom());      
                break;

        case '-' : rnc.sub();
                 System.out.println("Sub Of Fraction : "+rnc.getNum()+ "/" +rnc.getDenom());
                 break;

        case '*' : rnc.mul();
                 System.out.println("Mul Of Fraction : "+rnc.getNum()+ "/" +rnc.getDenom());
                 break;

        case '/' : rnc.div();
                 System.out.println("Div Of Fraction : "+rnc.getNum()+ "/" +rnc.getDenom());        
                 break;

                }
    }
}
