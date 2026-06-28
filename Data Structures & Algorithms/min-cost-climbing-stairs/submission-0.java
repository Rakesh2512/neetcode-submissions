class Solution {

    public int dfs(int[] cost,int index,int dp[]){

        if(index >= cost.length){
            return 0;
        }

        if(dp[index] != -1){
            return dp[index];
        }

        return dp[index] = cost[index] + Math.min(dfs(cost,index+1,dp),dfs(cost,index+2,dp));

    }
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        
        return  Math.min(dfs(cost,0,dp),dfs(cost,1,dp));
    }
}
