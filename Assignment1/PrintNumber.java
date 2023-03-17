class PrintNumber {

public static void main(String[] args) {

printNumberWithRecursion(1);

}

public static void printNumberWithRecursion(int n){

if (n <= 10) {
System.out.println(" Number Is = "+ n);
printNumberWithRecursion(n+1);
}

}

} 