class Solution {


    public int solve(int[] coins,int index,int amount){
        if(amount == 0){
            return 0;
        }
        
        if(index < 0){
            return (int)(1e9);
        }

        int notPick = solve(coins,index-1,amount);
        int pick = Integer.MAX_VALUE;
        if(coins[index] <= amount){
            pick = 1+solve(coins,index,amount-coins[index]);
        }
        return Math.min(pick,notPick);
    }
    public int coinChange(int[] coins, int amount) {
        
        
        int ways = solve(coins,coins.length-1,amount);
        return ways == (int)(1e9) ? -1 : ways;
    }
}
