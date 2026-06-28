class Solution {

    public int Rob(int[] nums,int index,int n,int dp[]){
        if(index >= n){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }

        int first = 0 + Rob(nums,index+1,n,dp);

        int second = nums[index] + Rob(nums,index+2,n,dp);

        return dp[index] = Math.max(first,second);
    }
    public int rob(int[] nums) {

        int n = nums.length;

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return nums[0];
        }

        if(n == 2){
            return Math.max(nums[0],nums[1]);
        }

        int[] dp = new int[n];

        Arrays.fill(dp,-1);

        return Rob(nums,0,n,dp);
        
    }
}
