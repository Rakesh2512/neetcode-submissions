class Solution {
 
    public boolean solve(int[] nums,int index,int target,int[][] dp){

        if(target == 0){
            return true;
        }
        if(index == 0){
            return target == nums[0];
        }

        if(dp[index][target] != -1){
            return (dp[index][target] == 1) ? true : false;
        }

        boolean notPick = solve(nums,index-1,target,dp);
        boolean pick = false;
        if(target-nums[index] >= 0){
            pick = solve(nums,index-1,target-nums[index],dp);
        }
        dp[index][target] = ((pick || notPick) == true) ? 1 : 0;
        return pick || notPick;

    }
    public boolean canPartition(int[] nums) {
        
        int n = nums.length;

        int sum = 0;
        for(int i =0;i<n;i++){
            sum+= nums[i];
        }

        if(sum % 2 != 0){
            return false;
        }

        int target = sum/2;
        int[][] dp = new int[n][target+1];

        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        boolean ans = solve(nums,n-1,target,dp);
        return ans == true ? true :false;
    }
}
