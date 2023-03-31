public class Ass1Q20 {
public static void main1(String[] args) {
    
    long l = 12345;
    String c = Long.toString(l); 
    System.out.println(c);
    
}

public static void main2(String[] args) {
    
    long l = 12345;
    Long c = new Long(l); 
    System.out.println(c);
    
}

public static void main3(String[] args) {
    
    String s = new String("12453");
    System.out.println(Long.valueOf(s));
    
}

public static void main(String[] args) {
    
    Long l = 77777L;

    System.out.println("long value into binary :"+Long.toBinaryString(l));
    System.out.println("long value into octal :"+Long.toOctalString(l));
    System.out.println("long value into hexadecimal :"+Long.toHexString(l));
    
}
}

