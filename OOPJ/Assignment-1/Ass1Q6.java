class Ass1Q6{
    public static void main1(String[] args) {
        boolean a = false;
        String s = Boolean.toString(a);
        System.out.println(s);
    }

    public static void main2(String[] args) {
        Boolean b = new Boolean("true");
        System.out.println(b);
    }

    public static void main3(String[] args) {
        String s = "true";
        boolean b = Boolean.parseBoolean(s);
        System.out.println(b);
    }

    public static void main(String[] args) {
        String s = "true";
        boolean b = new Boolean(s);
        System.out.println(b);
    }
 
}