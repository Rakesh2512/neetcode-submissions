class Solution {

    public int jumpMin(int index,int[] nums,int n,int[] dp){

        if(index >= n-1){
            return 0;
        }

        if(dp[index] != -1){
            return dp[index];
        }

        int ans = Integer.MAX_VALUE;
        for(int j = index+1;j<=index+nums[index];j++){

            int val = jumpMin(j,nums,n,dp);

            if(val != Integer.MAX_VALUE){
                ans = Math.min(ans , val+1);
            }
        }
        return dp[index] = ans;

    }
    public int jump(int[] nums) {
        
        int n = nums.length;

        int[] dp = new int[n];

        Arrays.fill(dp,-1);

        int minimum_jump = jumpMin(0,nums,n,dp);

        return minimum_jump == Integer.MAX_VALUE ? -1 : minimum_jump;
    }
}
