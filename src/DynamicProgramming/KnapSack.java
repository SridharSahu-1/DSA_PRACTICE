package DynamicProgramming;

public class KnapSack {
    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n=val.length;
        System.out.println(knapsack(val,wt,W,n));
        int[][] dp = new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans = KnapSackRecursionWithDp(val,wt,W,n,dp);
        System.out.println(ans);
    }

    public static int knapsack(int[] val,int[] wt,int W,int n){
        if(W==0 || n==0) return 0;
        if(wt[n-1]<=W){
            int ans1= val[n-1]+knapsack(val,wt,W-wt[n-1],n-1);
            int ans2= knapsack(val,wt,W,n-1);
           return Math.max(ans1,ans2);
        }
        else{
           return knapsack(val,wt,W,n);
        }
    }
    public static int KnapSackRecursionWithDp(int[] val,int[] wt,int W,int n,int[][] dp){
        if(n==0 || W==0) return 0;
        if(dp[n][W]!=-1) return dp[n][W];
        if(wt[n-1]<=W){
            int ans1 = val[n-1]+ KnapSackRecursionWithDp(val,wt,W-wt[n-1],n-1,dp);
            int ans2 = KnapSackRecursionWithDp(val,wt,W,n-1,dp);
            return dp[n][W]=Math.max(ans1,ans2);
        }
        else{
            return dp[n][W]= KnapSackRecursionWithDp(val,wt,W,n-1,dp);
        }
    }

}
