public class Ass1Q28 {
    public static void main1(String[] args) {
    
        double d = 15555.05;
        String c = Double.toString(d); 
        System.out.println(c);
        
    }
    
    public static void main2(String[] args) {
        
        double d = 15555.05;
        Double c = new Double(d); 
        System.out.println(c);
        
    }
    
    public static void main3(String[] args) {
        
        String s = new String("1555.55");
        System.out.println(Double.valueOf(s));
        
    }
    
    public static void main(String[] args) {
        
        Double d = 77777.55;
    
        System.out.println("double value into binary :"+ Long.toBinaryString(Double.doubleToLongBits(d)));
        System.out.println("double value into octal :"+ Long.toOctalString(Double.doubleToLongBits(d)));
        System.out.println("double value into Hexadecimal : "+ Double.toHexString(d));
 
    }
}
   
    
    

