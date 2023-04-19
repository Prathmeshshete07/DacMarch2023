public class Ass1Q16 {
    public static void main1(String[] args) {
        int a = 25;
        String s = Integer.toString(a);
        System.out.println(s);
    }

    public static void main2(String[] args) {
        int a = 25;
        Integer s = new Integer(a);
        System.out.println(s);

    }

    public static void main3(String[] args) {
       
        String s = new String("25");
        System.out.println(Integer.valueOf(s));

    }

    public static void main(String[] args) {
       
       int a = 7 ; 
       
       System.out.println("int value into binary : " +Integer.toBinaryString(a));
       System.out.println("int value into octal : "	+Integer.toOctalString(a));
       System.out.println("int value into hexadecimal : " +Integer.toHexString(a));
       
    }    
}
