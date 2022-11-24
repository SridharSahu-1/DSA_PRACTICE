package Practice;

public class Mock {
    public static void main(String[] args) {
        String str = "abc";
        permutation("",str);
    }
    public static void permutation(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        permutation(p+ch,up.substring(1));
        permutation(p,up.substring(1));
    }
}
