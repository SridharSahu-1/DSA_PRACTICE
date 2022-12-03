package DynamicProgramming;

import java.util.Arrays;

public class FibonacciUsingDP {
    public static void main(String[] args) {
        int n=5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fiboUsingDP(n,dp));
    }

    public static int fiboUsingDP(int n,int[] dp){
        if(n<2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fiboUsingDP(n-1,dp)+fiboUsingDP(n-2,dp);

    }

}
