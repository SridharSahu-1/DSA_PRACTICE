package DynamicProgramming;

public class KnapSnak01 {
    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n=val.length;
        int[][] dp = new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(KnapSackRecursion(val,wt,W,n));
        System.out.println(KnapSackRecursionWithDp(val,wt,W,n,dp));
        System.out.println(KnapSackTabulationDP(val,wt,W));
    }
    public static int KnapSackRecursion(int[]val,int[] wt,int W,int n){
        if(n==0 || W==0) return 0;
        if(wt[n-1]<=W){
            int ans1 = val[n-1]+ KnapSackRecursion(val,wt,W-wt[n-1],n-1);
            int ans2 = KnapSackRecursion(val,wt,W,n-1);
            return Math.max(ans1,ans2);
        }
        else{
            return KnapSackRecursion(val,wt,W,n-1);
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
    public static int KnapSackTabulationDP(int[] val, int[] wt,int W){
        int n=val.length;
        int[][] dp = new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<dp.length;i++){
            dp[0][i]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v =val[i-1];
                int w = wt[i-1];
                if(w<=j){
                    int include= v+dp[i-1][j-w];
                    int exclude = dp[i-1][j];
                    dp[i][j]=Math.max(include,exclude);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }

}
