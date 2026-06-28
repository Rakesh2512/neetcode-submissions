class Solution {


    public int robb(int[] nums,int index,int n,int dp[]){
        if(index > n){
            return 0;
        }

        if(dp[index] != -1){
            return dp[index];
        }
        int first = robb(nums,index+1,n,dp);
        int second = nums[index] + robb(nums,index+2,n,dp);

        return dp[index] = Math.max(first,second);
    }
    public int rob(int[] nums) {
        
        int n = nums.length;

        if(n == 1){
            return nums[0];
        }

        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        int first = robb(nums,0,n-2,dp);

        Arrays.fill(dp,-1);
        int second = robb(nums,1,n-1,dp);

        return Math.max(first,second);

    }
}
