class Solution1 {
    
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


class Solution2 {

    public int solve(int day, int trade, int canBuy, int prices[], int dp[][][]) {
        if(day >= prices.length || trade <= 0) {
            return 0;
        }
        
        if(dp[day][trade][canBuy] != -1) {
            return dp[day][trade][canBuy];
        }
        
        int ret = solve(day + 1, trade, canBuy, prices, dp);
        
        if(canBuy == 1) {
            ret = Math.max(ret, solve(day + 1, trade, 0, prices, dp) - prices[day]);
        } else {
            ret = Math.max(ret, solve(day + 1, trade - 1, 1, prices, dp) + prices[day]); 
        }
        
        return dp[day][trade][canBuy] = ret;
        
    }
    
    public int maxProfit(int k, int[] prices) {
        
        if( prices.length < 2) {
            return 0;
        }
        
        if(k > prices.length / 2) {
            return greedyMaxProfit(prices);
        }
        
        int dp[][][] = new int[prices.length][k + 1][2];
        
        for(int x = 0; x < prices.length; x++)
            for(int y = 0; y <= k; y++)
                dp[x][y][0] = dp[x][y][1] = -1;
        
        return solve(0, k, 1, prices, dp);
    }
    
    int greedyMaxProfit(int[] prices) {
        int ans = 0;
        for(int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            ans += profit > 0 ? profit : 0;
        }
        return ans;
    }
    
}
