package Recursion;

public class SubSeq {
    public static void main(String[] args) {
    subseq("","abc");
    }
    public static void subseq(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p,up.substring(1));
        subseq(ch+p,up.substring(1));
    }

}
