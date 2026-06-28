class Solution {

    public boolean solve(int index,int[] nums,int target,int[][] dp){
        if(target == 0){
            return true;
        }

        if(index == nums.length-1){
            return target == nums[index];
        }

        if(dp[index][target] != -1){
            return (dp[index][target] == 1) ? true : false;
        }

        boolean Notpick = solve(index+1,nums,target,dp);
        boolean pick = false;
        if(target - nums[index] >= 0){
            pick = solve(index+1,nums,target - nums[index],dp);
        } 

        dp[index][target] = ((pick || Notpick) == true) ? 1 : 0;

        return Notpick||pick;
    }
    public boolean canPartition(int[] nums) {
        
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        if(sum%2 !=0){
            return false;
        }

        int target = sum/2;

        int[][] dp = new int[nums.length][target+1];

        for(int[] r:dp){
            Arrays.fill(r,-1);
        }

        boolean ans = solve(0,nums,target,dp);
        return ans;
    }
}
