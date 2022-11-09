package Recursion;

public class Numbers {
    public static void main(String[] args) {
        printNumbers(5);
    }
    public static void printNumbers(int n){
        if(n<=0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
}
