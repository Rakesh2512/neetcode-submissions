class Solution {

    public int solve(int[] cost,int n,int[] dp){
        if(n == 0){
            return cost[0];
        }
        if(n == 1){
            return cost[1];
        }


        if(dp[n] != -1){
            return dp[n];
        }

        int first = solve(cost,n-1,dp);
        int second = solve(cost,n-2,dp);

        return dp[n] = cost[n] + Math.min(first,second);
    }
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        
        int ans = Math.min(solve(cost,cost.length-1,dp),solve(cost,cost.length-2,dp));
        return ans;
    }
}
