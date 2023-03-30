public class Ass1Q13 {

    public static void main1(String[] args) {
        short a = 25;
        String s = Short.toString(a);
        System.out.println(s);
    }

    public static void main2(String[] args) {
        short a = 25;
        Short s = new Short(a);
        System.out.println(s);

    }

    public static void main(String[] args) {
       
        String s = new String("25");
        System.out.println(Short.valueOf(s));

    }
    
}
