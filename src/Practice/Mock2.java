package Practice;

import java.util.Arrays;

public class Mock2 {
    public static void main(String[] args) {
    String str="AAAD";
    String str1="DADD";
    int n = str.length();
    int m = str1.length();
    int[][] dp = new int[n][m];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
    int ans = LongestSubsequence(n,m,str,str1,dp);
        System.out.println(ans);
    }
    //abc bac cab cba bca
//    ABABC, BABCA
    public static int LongestSubsequence(int n,int m,String str,String str1,int[][] dp){
        if(n<0 || m<0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(str.charAt(n) == str1.charAt(m))
            return dp[n][m]=1+LongestSubsequence(n-1,m-1,str,str1,dp);
        else{
            return dp[n][m]=Math.max(LongestSubsequence(n-1,m,str,str1,dp),
                    LongestSubsequence(n,m-1,str,str1,dp));
        }

    }
}
