class Solution {
    public int maxProfit(int k, int[] ps) {
        int n = ps.length;
        if (n < 2) return 0;
        if (k >= n>>1) return accumu(ps); // if allowed transactions more than half of operational day solve greedily
        
        int[][][] dp = new int[k+1][n][2];  // tx, day, stock holds
        
        for (int i = 1 ; i <= k; i++){
            dp[i][0][1] = - ps[0];
            for (int j = 1; j < n; j++) {
                dp[i][j][0] = Math.max(dp[i][j-1][0], dp[i][j - 1][1] + ps[j]);
                dp[i][j][1] = Math.max(dp[i][j-1][1], dp[i - 1][j - 1][0] - ps[j]);
            }
        }
        
        return dp[k][n-1][0];
    }
    
    private int accumu(int[] ps){
        int res = 0;
        for (int i = 1; i < ps.length; i++) {
            res += Math.max(0, ps[i] - ps[i - 1]);
        }
        return res;
    }
}
