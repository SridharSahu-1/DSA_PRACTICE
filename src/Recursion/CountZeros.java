package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZero(100010,0));
    }
    public static int countZero(int n, int count){

        if(n==0){
            return count;
        }
        if(n%10==0){
            return countZero(n/10,count+=1);
        }
        else {
            return countZero(n / 10, count);
        }
    }
    public static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return helper(n/10,count+=1);
        }
        else {
            return helper(n / 10, count);
        }
    }
}
