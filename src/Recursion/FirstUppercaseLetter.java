package Recursion;

public class FirstUppercaseLetter {
    public static void main(String[] args) {
        String str = "geeksforgeeKs";
        char upper = firstUpper(str);
        System.out.println(upper);
    }
    public static char firstUpper(String str){
        if(str.isEmpty()) return 0;
        char ch = str.charAt(0);
        if(Character.isUpperCase(ch)) return ch;
        else{
            return firstUpper(str.substring(1));
        }
    }
}
