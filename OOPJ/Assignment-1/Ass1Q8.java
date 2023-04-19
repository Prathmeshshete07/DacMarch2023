public class Ass1Q8 {
    public static void main1(String[] args) {
        byte b = 7;
        String s = Byte.toString(b);
        System.out.println(s);
    
    }

    public static void main2(String[] args) {
        
        byte c = 18;
        Byte b = new Byte(c);
        System.out.println(b);
    }

    public static void main(String[] args) {
        
         String s1 = new String("123");
         System.out.println(Byte.valueOf(s1));
    }
    

}
