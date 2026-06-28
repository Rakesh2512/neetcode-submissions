class Solution {

    public int solve(int[] coins,int amount,int index){

        if(amount == 0){
            return 0;
        }

        if(index < 0){
            return (int)(1e9);
        }

        int notPick = solve(coins,amount,index-1);
        int pick = (int)(1e9);
        if(coins[index] <= amount){
            pick = 1+solve(coins,amount - coins[index],index);
        }

        return Math.min(pick,notPick);

    }
    public int coinChange(int[] coins, int amount) {

        int ans = solve(coins,amount,coins.length-1);

        return ans == (int)(1e9) ? -1 : ans;
    }
}
