package LeetCodeDailyChallenges;

class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
         int n = matrix.length;
        // initialize dp table
        Integer[] memo = new Integer[n];
        for (int col = 0; col < n; col++) {
            memo[col] = matrix[0][col];
        }
        
        // bottom-up dp
        for (int row = 1; row < n; row++) {
            Integer[] prevMemo = memo;
            memo = new Integer[n];
            
            for (int col = 0; col < n; col++) {
                // default value
                int res = Integer.MAX_VALUE;

                // path from top left
                if (col > 0) {
                    res = Math.min(res, prevMemo[col - 1]);
                }

                // path from top
                res = Math.min(res, prevMemo[col]);

                // path from top right
                if (col < n - 1) {
                    res = Math.min(res, prevMemo[col + 1]);
                }

                // update dp table
                memo[col] = res + matrix[row][col];
            }
        }
        
        // try all possible goals
        int minPath = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            minPath = Math.min(minPath, memo[col]);
        }
        
        return minPath;
    }
}